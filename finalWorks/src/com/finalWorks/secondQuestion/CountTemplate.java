package com.finalWorks.secondQuestion;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

public abstract class CountTemplate {
    private int p = 3;

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
        Map<String, List<CountDto>> result = doCount(build.toString().toCharArray());
        print(result);
        System.out.println("完成");
    }

    private StringBuilder readToBuffer() {
        StringBuilder build = new StringBuilder();
        try (InputStream is = new FileInputStream(filePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is));) {
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

    protected abstract Map<String, List<CountDto>> doCount(char[] charArray);

    protected abstract void print(Map<String, List<CountDto>> result);
}
