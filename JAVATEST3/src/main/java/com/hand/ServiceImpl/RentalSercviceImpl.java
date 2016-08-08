package com.hand.ServiceImpl;

import java.util.List;

import com.hand.Dao.RentalDao;
import com.hand.DaoImpl.RentalDaoImpl;
import com.hand.Service.RentalSercvice;

public class RentalSercviceImpl implements RentalSercvice {
	RentalDao rd=new RentalDaoImpl();
	public void deletetoRental(List<Integer> ids)
	{
		rd.deletetoRental(ids);
	}
}
