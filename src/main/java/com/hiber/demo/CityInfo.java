package com.hiber.demo;

public class CityInfo {
	
	int cityId;
	String cityName;
	String country;
	int population;
	
	public CityInfo() {
		super();
	}

	public CityInfo(String cityName, String country, int population) {
		super();
		this.cityName = cityName;
		this.country = country;
		this.population = population;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
}
