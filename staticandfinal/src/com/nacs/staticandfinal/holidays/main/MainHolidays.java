package com.nacs.staticandfinal.holidays.main;

import com.nacs.staticandfinal.holidays.Holidays;
import com.nacs.staticandfinal.holidays.main.staticdemo.StaticDemo;

public class MainHolidays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holidays independenceday = new Holidays(1, " Independence day", "15-08-1947", true, false);
		Holidays republicDay = new Holidays(2,"Republic Day", "26-1-1949", true, false);
		System.out.println(independenceday.toString());
		System.out.println();
		System.out.println(republicDay.toString());
		

	}
}
