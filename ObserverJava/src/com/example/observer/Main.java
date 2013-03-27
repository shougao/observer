package com.example.observer;

public class Main{


    public static void main(String arg[]){
    	WeatherData currentWeatherData;
    	Observer tempObserver;
    	
        //先注册,这是观察者
        tempObserver = new DisplayTemp();//DisplayTemp里头有实现
        
        
        //再调用，这是主题
        currentWeatherData = new WeatherData();//这里头有调用
        
        
        //这个是设置，
        currentWeatherData.registerObserver(tempObserver);
        
        
        for(int temp = 80; temp < 120; temp++){
        	currentWeatherData.setTemp(temp);
        }
    }
}
