package com.epam.zhanassyl.task.oop.chef;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhanassyl on 12.07.2016.
 */
public class Chef {
    public static void main(String[] args) {
        Salad salad1 =new Salad("Tasty", new Solid("Carrot", 100), new WithPeel("Onion", 2), new Soft("Salad", 100), new Soft("Tomato", 50)
                ,new Soft("Pepper", 50),new Solid("Potato", 200));

        System.out.println(salad1);
        System.out.println();
        System.out.println();


        List<Salad> salad2 = new ArrayList<>();
        salad2.add(new Salad()
                .setName("Summer")
                .setComponent(new Solid("Tomato", 100))
                .setComponent(new Soft("Garlic", 1))
        );
        System.out.println(salad2);
    }

}
