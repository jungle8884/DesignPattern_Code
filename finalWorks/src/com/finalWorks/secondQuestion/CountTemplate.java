package com.finalWorks.secondQuestion;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

public abstract class CountTemplate {
    //给定数值, 缺省值为3
    private int p = 3;

    //测试文件路径
    private String filePath;

    protected void setP(int p) {
        this.p = p;
    }

    public int getP() {
        return this.p;
    }

    protected void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    protected String getFilePath() {
        return this.filePath;
    }

    public void onHandle() {
        StringBuilder build = readToBuffer();
        Map<String, List<CountDto>> result = doCount(build.toString().toCharArray());//转换为字符数组并计数
        print(result);
        System.out.println("完成");
    }

    //加载到StringBuilder缓存区
    private StringBuilder readToBuffer() {
        StringBuilder build = new StringBuilder();
        try (InputStream is = new FileInputStream(filePath); //键盘输入流
             BufferedReader reader = new BufferedReader(new InputStreamReader(is));//字节流转换为字符流,再把字符流添加到缓冲流
             ) {
            String line;
            while ((line = reader.readLine()) != null) {
                build.append(line);
                build.append("\n");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return build;
    }

    //统计词的词频 段号 段中的偏移量
    protected abstract Map<String, List<CountDto>> doCount(char[] charArray);

    //输出结果到文本
    protected abstract void print(Map<String, List<CountDto>> result);
}
