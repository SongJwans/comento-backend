package com.devfun.settingweb_boot.dao;

import java.util.HashMap;

public interface StatisticMapper {
    HashMap<String, Object> selectYearLogin(String year);
    HashMap<String, Object> selectMonthLogin(String month);
}
