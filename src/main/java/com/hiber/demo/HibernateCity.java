package com.hiber.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateCity {
	
	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		
		Transaction trsc = session.beginTransaction();
		
		
		CityInfo ci1 = new CityInfo("Pune", "IND", 6987077);
		CityInfo ci2 = new CityInfo("Shanghai", "Chaina", 28516904);
		CityInfo ci3 = new CityInfo("Tokoyo", "Japan", 37274000);
		CityInfo ci4 = new CityInfo("Tornto", "Canada", 6312974);
		
		
		int c1 = (Integer) session.save(ci1);
		int c2 = (Integer) session.save(ci2);
		int c3 = (Integer) session.save(ci3);
		int c4 = (Integer) session.save(ci4);

		trsc.commit();
		System.out.println("");
		
		Transaction trsc2 = session.beginTransaction();
		
		List<CityInfo> cityList = session.createQuery("from CityInfo").list();
		

		trsc2.commit();
		
		
		for(CityInfo city : cityList)
		{
			System.out.println(city.getCityId()+" "+city.getCityName()+" "+city.getCountry()+" "+city.getPopulation());
		}
		
	}

}
