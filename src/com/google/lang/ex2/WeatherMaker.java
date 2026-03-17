package com.google.lang.ex2;

public class WeatherMaker {
	
	private String info;
	
	public WeatherMaker() {
		this.info = "서울,12,25.2,대전,3,65.2,대구#56&85.9";	// 다른 데이터 형식(기호)가 섞여 있어 전처리 과정이 필요함
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
