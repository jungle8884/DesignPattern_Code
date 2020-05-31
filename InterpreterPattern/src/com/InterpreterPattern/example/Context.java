package com.InterpreterPattern.example;

public class Context {
    private String ExpString;
    private int CurrentPosition=0;
    private Integer ItemValue= null;    //记录当前项值
    private Integer ResultValue= null;  //记录当前表达式值

    public void setExpString( String exp) {
        ExpString=exp;
    }

    public String getExpString() {
        return ExpString.substring(CurrentPosition);
    }

    public void NextPosition(int offset) {
        CurrentPosition+=offset;
    }

    public void setItemValue(Integer intVal) {
        ItemValue=intVal;
    }

    public Integer getItemVale() {
        return ItemValue;
    }

    public void setResultValue(Integer intVal) {
        ResultValue=intVal;
    }

    public Integer getResultValue() {
        return ResultValue;
    }
}
