package com.endava.training;

import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> listI = new ArrayList<>();
        listI.add(15);
        listI.add(16);
        listI.add(19);
        listI.add(18);
        listI.add(12);

        System.out.println("Sunt " + Algoritm.nrPare(listI) + " numere pare!");
        System.out.println(listI);
        System.out.println(MaxValue.maxim(listI));
       // ChangePosition.chPos(listI,0,1);

        List<Integer> listInt = new ArrayList<>();
        listInt.add(3);
        listInt.add(4);
        listInt.add(6);
        listInt.add(8);
        listInt.add(11);
        listInt.add(15);
        listInt.add(28);
        listInt.add(32);
        Collection<Integer> c = new ArrayList<>();
        c.add(7);
        c.add(18);
        c.add(19);
        c.add(25);

        UnaryPredicate<Integer> p = new RelativelyPrimePredicate(c);

        int i = Algoritm.findFirst(listInt, 0, listInt.size(), p);

        if (i != -1) {
            System.out.print(listInt.get(i) + " is relatively prime to ");
            for (Integer k : c)
                System.out.print(k + " ");
            System.out.println();
        }

    }
}
