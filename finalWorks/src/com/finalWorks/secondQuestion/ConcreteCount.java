package com.finalWorks.secondQuestion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ConcreteCount extends CountTemplate {
    public ConcreteCount(String filePath, int p) {
        super.setFilePath(filePath);
        super.setP(p);
    }

    @Override
    protected Map<String, List<CountDto>> doCount(char[] charArray) {
        Map<String, List<CountDto>> cache = new HashMap<>(1024);
        StringBuilder word = new StringBuilder();
        int part = 1;//段号
        int location = 0;//在段中的偏移量
        int split = 0;//统计多少个'\n'分隔符
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == '\n') {
                split++;
            } else if (split > 2) {//超过2个分隔符就算下一段了
                ++part;
                location = 0;
                split = 0;
            }
            //一个字符一个字符地进行判断
            ++location;
            if (fit(String.valueOf(c))) {
                word.append(c);
            } else if (String.valueOf(word) != null) {
                String wordStr = String.valueOf(word);
                List<CountDto> list = cache.get(wordStr);//获得相同的单词列表
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(new CountDto().setWord(wordStr).setPart(part).setLocation(location - wordStr.length()));
                cache.put(wordStr, list);
                word.setLength(0);
            }
        }
        return cache;
    }

    @Override
    protected void print(Map<String, List<CountDto>> result) {
        String printPath = super.getFilePath().substring(0, super.getFilePath().lastIndexOf("/")) + "/output.txt";
        StringBuilder content = new StringBuilder();
        for (Map.Entry<String, List<CountDto>> entry : result.entrySet()) {
            List<CountDto> list = entry.getValue();
            if (!entry.getKey().equals("") && list.size() > super.getP()) {
                list.forEach(c->content.append(String.format("单词: %s, 词频:%s, 段号: %s, 段偏移: %s\n", c.getWord(),
                        list.size(), c.getPart(), c.getLocation())));
            }
        }
        try {
            Files.write(Paths.get(printPath), content.toString().getBytes());//写入到输出文件
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    //正则匹配单词
    public static boolean fit(String str) {
        return Pattern.matches("[\u4e00-\u9fa5｜a-z|A-Z]", str);
    }
}
