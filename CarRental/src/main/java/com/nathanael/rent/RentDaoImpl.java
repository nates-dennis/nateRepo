package com.nathanael.rent;

import java.util.ArrayList;
import java.util.List;

public class RentDaoImpl implements RentDao {

	private List<Rent> rented;
	
	
	public RentDaoImpl() {
		rented = new ArrayList<Rent>();
	}

	@Override
	public void add(Rent r) {
		// TODO Auto-generated method stub
	   rented.add(r);
	}

	@Override
	public void delete(Rent r) {
		// TODO Auto-generated method stub
		rented.remove(r);
	}

	@Override
	public List<Rent> getRented() {
		// TODO Auto-generated method stub
		return rented;
	}

}
