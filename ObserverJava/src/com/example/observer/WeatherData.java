package com.example.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private int temp;//当数据变化， 通知观察者。
	
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i=0; i<observers.size(); i++){
			observers.get(i).update(temp);
		}
	}
	
	public void setTemp(int temp){
		if(temp > 100){
			this.temp = temp;
			notifyObserver();
		}
	}

}
