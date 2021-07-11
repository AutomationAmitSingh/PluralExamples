package com.company;

import java.util.HashMap;
import java.util.Map;

public class Get_Sum_Unique_Integer {

    public int get_Sum_Unique_Integer(int [] random)
    {
        int [] num_Array = random;
        int total = 0;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int r : num_Array)
        {
         if(hm.containsKey(r))
         {
          hm.put(r, hm.get(r)+1);
         }else
         {
             hm.put(r, 1);
         }
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
         if(entry.getValue() > 1)
         {

         } else
         {
             total = total + entry.getKey();
         }
        }
        return total;
    }
}
