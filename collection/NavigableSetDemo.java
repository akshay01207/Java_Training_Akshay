package com.dataStructure.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
   public static void main(String[] args) {
        NavigableSet<String> ns = new TreeSet<String>();
        
        ns.add("Ram");
        ns.add("Jam");
        ns.add("Sam");
        ns.add("Bam");
        ns.add("Tam");
        
        ns.remove("Bam");
        ns.pollFirst();
        ns.pollLast();
        
        System.out.println(ns);
        
        for (String value : ns)
            System.out.println(value);
        
        String check = "Ram";
        
        
        System.out.println(ns.contains(check));
        System.out.println("First Value " + ns.first());
        System.out.println("Last Value " + ns.last());
        ns.remove("Bam");
        ns.pollFirst();
        ns.pollLast();
    }



}