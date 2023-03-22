package com.sbg613.main;
import java.util.ArrayList;

import com.sbg613.code.Week;
import com.sbg613.vo.FlowerVO;
import com.sbg613.vo.WeekVO;

public class TestMain {
    
    final static String SELECT_KEY_01 = "selectKey01";
    final static String SELECT_KEY_02 = "selectKey02";

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        for(Week t : Week.values()) { 
            System.out.println(t + " , "+t.getName());
        }
        
        /*
        for(Flower t : Flower.values()) {
            System.out.println(t + " , "+t.getName());
        }*/
        
        System.out.println("=======1======");
        AutoDAO<WeekVO> autoDAO = new AutoDAO<WeekVO>();
        WeekVO rs = new WeekVO();
        rs = autoDAO.selectOne(SELECT_KEY_01, rs);
        
        System.out.println("rs=>>" + rs.getWeekCode() +" , "+rs.getWeekName());
        
        ArrayList<WeekVO> rsList = new ArrayList<WeekVO>();
        rsList = autoDAO.selectList(SELECT_KEY_02, rsList);
        
        for (WeekVO o : rsList) {
        	System.out.println("rs=>>" + o.getWeekCode() +" , "+o.getWeekName());
		}
        
        
        

        System.out.println("========2=====");
        AutoDAO<FlowerVO> autoDAO2 = new AutoDAO<FlowerVO>();
        FlowerVO rs2 = new FlowerVO();
        rs2 = autoDAO2.selectOne(SELECT_KEY_01, rs2);
        
        ArrayList<FlowerVO> rsList2 = new ArrayList<FlowerVO>();
        rsList2 = autoDAO2.selectList(SELECT_KEY_02, rsList2);
        
    }
    
}
