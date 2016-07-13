package com.epam.zhanassyl.task.oop.chef;

/**
 * Created by Zhanassyl on 12.07.2016.
 */
public abstract class Vegetable {
    private int calorie;
    private int weight;
    private String name;
    private VgtblList list = VgtblList.Vgtbl;
    private enum VgtblList {Vgtbl,Carrot, Onion, Garlic, Pepper, Cabbage, Salad, Tomato, Cucumber, Potato}

    Vegetable(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    abstract String preparation();

    int getCalor() {
        switch (list.valueOf(name)){
            case Carrot:	calorie=33; break;
            case Onion:	    calorie=43; break;
            case Garlic:	calorie=106; break;
            case Pepper:	calorie=25; break;
            case Cabbage:	calorie=30; break;
            case Salad:		calorie=14; break;
            case Tomato:	calorie=19; break;
            case Cucumber:	calorie=15; break;
            case Potato:	calorie=83; break; // for calorie
            default: calorie=0; System.out.println("unknown vegetable");
        }

        return calorie;
    }

    int getWght() {
        return weight;
    }

    String getName() {
        return name;
    }

}


