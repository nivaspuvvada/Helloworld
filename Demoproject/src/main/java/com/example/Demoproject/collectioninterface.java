package com.example.Demoproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class collectioninterface {
        public static void main(String[] args)
        {

            Collection<Integer> list = new ArrayList<Integer>(6);
            list.add(15);
            list.add(24);
            list.add(26);
            list.add(35);
            list.add(46);
            list.add(64);

            for (Integer number : list) {
                System.out.println("Number = " + number);
            }
            Collection<Integer> list2 = new ArrayList<Integer>();
            list2.addAll(list);
            System.out.println("The new ArrayList is: " + list2);


            Collection<String> list1 = new LinkedList<String>();

            list1.add("Janaki");
            list1.add("Nivas");
            list1.add("Rao");
            System.out.println("The list is: " + list1);
            list1.add("wassup");
            list1.add("everyone");
            System.out.println("The new List is: " + list1);
        }
    }


