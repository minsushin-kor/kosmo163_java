package com.google.lang.ex2;

public class WeatherMaker {
	
	private String info;
	
	public WeatherMaker() {
		this.info = "서울-대전- 대구-부산-인천-제주";
	}
	
	public WeatherDTO [] init() {
		// info의 데이터를 파싱(여러개의 문자열 데이터를 나누는 작업)하여 결과물을 리턴하려는 메서드
		
		String [] ar = this.info.split("-");
		WeatherDTO [] weathers = new WeatherDTO[6];
		
		for (int i = 0;i<ar.length;i++) {
			weathers[i] = new WeatherDTO();
			weathers[i].setCityName(ar[i]);
		}
		return weathers;
		
	}
}
