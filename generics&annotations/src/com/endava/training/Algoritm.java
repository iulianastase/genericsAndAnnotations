package com.endava.training;

import java.util.List;

/**
 * Created by inastase on 10/28/2016.
 */
public class Algoritm {
    public static <T extends Number> int  nrPare (List<T> list){
        int nr = 0;
        for(int i=0; i<list.size();i++){
            if(testPar(list.get(i).intValue())){
                nr++;
            }
        }
        return nr;
    }
    public static boolean testPar(int number){
        if (number % 2 == 0){
            return true;
        }

        else return false;

    }
    public static <T>
    int findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p) {

        for (; begin < end; ++begin)
            if (p.test(list.get(begin)))
                return begin;
        return -1;
    }

    public static int cmmdc(int x, int y) {
        while (x != y){
            if(x > y){
                x = x - y;
            }
            else{
                y = y - x;
            }
        }
        return x;
    }
}

