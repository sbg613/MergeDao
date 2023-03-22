package com.sbg613.main;
import java.util.ArrayList;

public class AutoDAO<T> {

    
    public T selectOne(String keyName) throws Exception {
        System.out.println(keyName + " , selectOne :: " + this.getClass());
        
        Object o = new Object();
 
        System.out.println(keyName + " , selectOne :2: " + this.getClass());
        
        return (T) o;
    }
    
    public ArrayList<T> selectList(String keyName) throws Exception {
        System.out.println(keyName + " , selectList :: " + this.getClass());
        
        ArrayList<Object> rs = new ArrayList<Object>();

        return (ArrayList<T>) rs;
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
