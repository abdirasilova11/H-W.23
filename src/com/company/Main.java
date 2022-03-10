package com.company;


import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        Random rnd = new Random();
        for (int i = 0; i < 50; i++) {
            int counter = rnd.nextInt(100);
            if (counter % 2 == 0){
                arrayList.add(counter);
            }
            if (counter % 2 != 0){
                arrayList1.add(counter);
            }
            System.out.println(counter);
        }

        System.out.println("even numbers: " + arrayList);
        System.out.println("odd numbers: " + arrayList1);


    }
}
