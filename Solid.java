package com.epam.zhanassyl.task.oop.chef;

/**
 * Created by Zhanassyl on 12.07.2016.
 */
public class Solid extends Vegetable{
    public Solid (String name, int weight){
        super(name, weight);
    }
    public String preparation(){
        return "Cook, give it a clean, chop up";
    }
}


