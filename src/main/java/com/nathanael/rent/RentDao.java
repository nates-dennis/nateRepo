package com.nathanael.rent;

import java.util.List;

public interface RentDao {
	void add(Rent r);
	void delete(Rent r);
	List<Rent> getRented();

}
