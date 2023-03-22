package com.sbg613.main;
import java.util.ArrayList;
import com.sbg613.sqlId.SqlId;
import com.sbg613.vo.FlowerVO;
import com.sbg613.vo.WeekVO;

/*
 * DAO를 VO에 따라 여러개 안만들고 사용하기 위해 형태를 만들어봄  
 * */
public class TestMain {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
    	
    	//1. AutoDAO를 WeekVO 형으로 사용
        AutoDAO<WeekVO> autoDAO = new AutoDAO<WeekVO>();
        WeekVO rs = new WeekVO();
        rs = autoDAO.selectOne(SqlId.SELECT_WEEK_ONE.toString(), rs);

        ArrayList<WeekVO> rsList = new ArrayList<WeekVO>();
        rsList = autoDAO.selectList(SqlId.SELECT_WEEK_LIST.toString(), rsList);

        
        //2. AutoDAO를 FlowerVO 형으로 사용
        AutoDAO<FlowerVO> autoDAO2 = new AutoDAO<FlowerVO>();
        FlowerVO rs2 = new FlowerVO();
        rs2 = autoDAO2.selectOne(SqlId.SELECT_FLOWER_ONE.toString(), rs2);
        
        ArrayList<FlowerVO> rsList2 = new ArrayList<FlowerVO>();
        rsList2 = autoDAO2.selectList(SqlId.SELECT_FLOWER_LIST.toString(), rsList2);
        
    }
    
}
