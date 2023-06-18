package com.devfun.settingweb_boot.service;
 
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public HashMap<String, Object> yearloginNum (String year) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.put("year", year);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }

	@Override
	public HashMap<String, Object> monthloginNum(String yearMonth) {
		// TODO Auto-generated method stub
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		String year = yearMonth.substring(0,2);
		String month = yearMonth.substring(2,4);
		
        try {
            retVal = uMapper.selectMonthLogin(yearMonth);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("month", month);
            retVal.put("is_success", false);
        }
        
        return retVal;

	}

	@Override
	public HashMap<String, Object> dayloginNum(String yearMonthDay) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
        try {
            retVal = uMapper.selectDayLogin(yearMonthDay);
            retVal.put("month", yearMonthDay.substring(2,4));
            retVal.put("year", yearMonthDay.substring(0,2));
            retVal.put("day", yearMonthDay.substring(4,6));
            retVal.put("is_success", true);
            
        }catch(Exception e) {
        	
            retVal.put("totCnt", -999);
            retVal.put("month", yearMonthDay.substring(2, 4));
            retVal.put("year", yearMonthDay.substring(0, 2));
            retVal.put("day", yearMonthDay.substring(4, 6));
            retVal.put("is_success", false);
        }
        
        return retVal;
	}

	@Override
	public HashMap<String, Object> All() {
	
		return uMapper.selectAll();
	}
    
    
    
    
    
}