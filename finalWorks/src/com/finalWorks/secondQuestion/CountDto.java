package com.finalWorks.secondQuestion;

public class CountDto {
    private String word;

    private Integer part;

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
