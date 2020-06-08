package com.finalWorks;

import com.finalWorks.secondQuestion.ConcreteCount;
import com.finalWorks.secondQuestion.CountTemplate;

public class Main {

    public static void main(String[] args) {
	    // test secondQuestion code here
        {
            String filePath = "E:/Java_Code/finalWorks/ks.txt";
            int p = 1;
            CountTemplate count = new ConcreteCount(filePath, p);
            count.onHandle();
        }
    }
}
