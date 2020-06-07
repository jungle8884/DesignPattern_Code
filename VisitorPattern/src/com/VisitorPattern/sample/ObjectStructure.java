package com.VisitorPattern.sample;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Element> elements = new ArrayList<Element>();

    public void Attach(Element element){
        elements.add(element);
    }

    public void Detach(Element element){
        elements.remove(element);
    }

    public void Accept(Visitor visitor){
        for (Element e:elements
             ) {
            e.Accept(visitor);
        }
    }
}
