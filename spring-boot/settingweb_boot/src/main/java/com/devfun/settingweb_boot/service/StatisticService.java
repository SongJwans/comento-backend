package com.devfun.settingweb_boot.service;
 
import java.util.HashMap;
 
public interface StatisticService {
	
	public HashMap<String, Object> All();
    public HashMap<String, Object> yearloginNum (String year);
    public HashMap<String, Object> monthloginNum(String yearMonth);
    public HashMap<String, Object> dayloginNum(String yearMonthDay);
}