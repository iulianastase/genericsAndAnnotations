package com.endava.training;

import java.util.List;

/**
 * Created by inastase on 10/28/2016.
 */
public class MaxValue {
    public static <T extends Number> int maxim(List<T> list){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).intValue() > max ){
                max = list.get(i).intValue();
            }
        }
        return max;
    }


}
