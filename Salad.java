package com.epam.zhanassyl.task.oop.chef;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Zhanassyl on 12.07.2016.
 */


public class Salad {
    String name;
    List<Vegetable> salad;

    Salad(){
        salad = new ArrayList<Vegetable>();
    };
    Salad(String name, Vegetable... components) {
        this.name = name;
        salad = new ArrayList<Vegetable>();
        for (Vegetable v : components) {
            this.salad.add(v);
        }
    }

    private String getName() {
        return name;
    }

    public Salad setName(String name) {
        this.name = name;
        return this;
    }

    public Salad setComponent(Vegetable v) {
        this.salad.add(v);
        return this;
    }

    private int foodValue() {
        int v = 0;
        for (Vegetable c : salad) {
            v += Math.round((double) c.getWght() * c.getCalor() / 100);
        }
        return v;
    }

    @Override
    public String toString() {
        salad.sort(new TypeComparator());
        String smin = "";
        String smax = "";
        int salcalor = this.foodValue();
        String s = "Салат " + this.getName() + (char) 13+"-------------------"+ (char) 13;
        for (Vegetable v : salad) {
            long c = Math.round((double) v.getWght() * v.getCalor() / 100);
            if(c < .1*salcalor) smin += v.getName() + "  ";
            if(c > .5*salcalor) smax += v.getName() + "  ";
            s = s + v.getName() + "  " + v.getWght() + " г  " + v.preparation() + (char) 13;
        }

        return s + "Калорійність " + salcalor + " Ккал"+ (char) 13
                +"___________________"+ (char) 13
                +"Найбільше калорій дають: "
                + smax + (char) 13
                +"Найменше калорій дають: "+ (char) 13
                + smin;

    }

    private static class TypeComparator implements Comparator<Vegetable> {// Порівняння овочів по типу підготовки/обробки
        @Override
        public int compare(Vegetable one, Vegetable two) {
            if (one.getClass() == two.getClass())
                return 0;
                //hashCode() тому, що якщо не перевірити "<>", то шкандибає сортування
            else if (one.getClass().hashCode() > two.getClass().hashCode())
                return 1;
            else if (one.getClass().hashCode() < two.getClass().hashCode())
                return -1;
            return 0;
        }

    }

}

