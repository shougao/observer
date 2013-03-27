package com.example.observer;

public class DisplayTemp implements Observer {

	@Override
	public void update(int temp) {
		// TODO Auto-generated method stub
		System.out.println("====current temp = "+temp);
	}
}
