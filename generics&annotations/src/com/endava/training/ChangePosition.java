package com.endava.training;

import java.util.List;

/**
 * Created by inastase on 10/28/2016.
 */
public class ChangePosition {
    public static <T> void chPos(List<T> list, int a, int b){
        for(int i = 0; i < list.size(); i++)
        {
            for(int j = 0; j < list.size(); i++)
            {
                if(a != b && i == a && j == b)
                {
                    T aux = list.get(i);
                    list.remove(i);
                    list.add(i, list.get(j));
                    list.remove(j);
                    list.add(j, aux);

                }
            }

        }
    }
}
