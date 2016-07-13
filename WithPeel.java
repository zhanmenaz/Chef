package com.epam.zhanassyl.task.oop.chef;

/**
 * Created by Zhanassyl on 12.07.2016.
 */
public class WithPeel extends Vegetable{
    public WithPeel (String name, int weight){
        super(name, weight);
    }
    public String preparation(){
        return "Give it a clean, Chop up";
    }

}


