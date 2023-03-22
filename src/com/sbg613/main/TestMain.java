package com.sbg613.main;
import java.util.ArrayList;
import java.util.List;
import com.sbg613.code.*;
import com.sbg613.vo.*;

public class TestMain {
    
    final static String SELECT_KEY_01 = "selectKey01";
    final static String SELECT_KEY_02 = "selectKey02";
    
    final static String test01 = "00:00";
    final static String test02 = "01:00";

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        //AutoDAO  , TemplateVO

        for(Week t : Week.values()) {
            System.out.println(t + " , "+t.getName());
        }
        

        for(Flower t : Flower.values()) {
            System.out.println(t + " , "+t.getName());
        }
        
        System.out.println("=======1======");
        AutoDAO<TemplateVO> autoDAO = new AutoDAO<TemplateVO>();
        
        TemplateVO rs = autoDAO.selectOne(SELECT_KEY_01);
        
        
        ArrayList<TemplateVO> arrayListTemplateVO = autoDAO.selectList(SELECT_KEY_02);
        
        

        System.out.println("========2=====");
        AutoDAO<TemplateVO2> autoDAO2 = new AutoDAO<TemplateVO2>();
        
        TemplateVO2 rs2 = autoDAO2.selectOne(SELECT_KEY_01);
        ArrayList<TemplateVO2> arrayListTemplateVO2 = autoDAO2.selectList(SELECT_KEY_02);
        
    
        System.out.println(getStToMin(test01));
        System.out.println(getStToMin(test02));
    }
    
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
