package com.FinalHomework.firstQuestion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Counter {
    //加载文件
    public static void loadFile(String filename) throws IOException {
        File f = new File(filename);
        byte[] buffer = new byte[1000];
        try(FileInputStream input = new FileInputStream(f)){
            while (input.available() > 0) { // 利用while同时读取并判断
                char c = (char) input.read(buffer);
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //统计汉字
    public static int countChineseCharacters(){
        return 0;
    }

    //统计英文字
    public static int countEnglishCharacters(){
        return 0;
    }

    //输出结果到文件
    public static void outputFile(String filename){}
}
