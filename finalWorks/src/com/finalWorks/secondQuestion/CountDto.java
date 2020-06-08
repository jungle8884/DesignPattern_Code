package com.finalWorks.secondQuestion;

//计数结果存储类
public class CountDto {
    //单词
    private String word;
    //段号
    private Integer part;
    //段偏移
    private Integer location;

    public String getWord() {
        return word;
    }

    public CountDto setWord(String word) {
        this.word = word;
        return this;
    }

    public Integer getPart() {
        return part;
    }

    public CountDto setPart(Integer part) {
        this.part = part;
        return this;
    }

    public Integer getLocation() {
        return location;
    }

    public CountDto setLocation(Integer location) {
        this.location = location;
        return this;
    }
}
