package com.sbg613.main;
import java.util.ArrayList;

public class AutoDAO<T> {

    public T selectOne(String keyName, T obj) throws Exception {
    	
        System.out.println(keyName + " , " + obj.getClass());

        /*체크용
        WeekVO rTest =  new WeekVO();
        rTest.setWeekCode(Week.MON.toString());
        rTest.setWeekName(Week.MON.getName());
        
        obj = (T) rTest;
        */
        
        return obj;
    }
    
    public ArrayList<T> selectList(String keyName, ArrayList<T> oList) throws Exception {
    	
        System.out.println(keyName + " , " + oList.getClass());
        
        /*
        ArrayList<WeekVO> rs = new ArrayList<WeekVO>();
        WeekVO rObj = null;
        for(Week o : Week.values()) {
        	rObj = new WeekVO();
        	rObj.setWeekCode(o.toString());
        	rObj.setWeekName(o.getName());
        	rs.add(rObj);
        }
         oList = (ArrayList<T>) rs;
        */
      
        return oList;
    }
    
    public void insert(T iO) {
        
    }
    
    public void update(T iO) {
        
    }
    
    public void delete(T iO) {
        
    }
    
    public void merge(T iO) {
        
    }
}
