package cn.com.busi.service;


import java.util.Map;


public interface HomePageService {


    Map queryAll();
    Map syxzByAll();
    Map jcjlByAll();

    Map queryAllNow();
    Map syxzByAllNow();
    Map jcjlByAllNow();
}