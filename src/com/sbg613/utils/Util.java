package com.sbg613.utils;

public class Util {

    public static int getStToMin(String sMin) {
        
       String[] spMin = sMin.split(":");

       int iRs = 0;

       if(spMin.length > 1) {
          String scHour = spMin[0];
          String scMin  = spMin[1];
          
          iRs = (Integer.parseInt(scHour) * 60) + Integer.parseInt(scMin);
       }

       return iRs;
    }
    
    public static int getSpTerm(int iSSt, int iESt, int iSSp, int iESp) {
        
        if((iESt - iSSt) > 0) {
            int[] arrTime;
            for(int i = iSSt; i <= iESt; i++) {
               
            }
            
        }
        
        return 0;
    }
}
