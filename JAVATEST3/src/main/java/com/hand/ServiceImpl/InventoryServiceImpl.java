package com.hand.ServiceImpl;

import com.hand.Dao.InventoryDao;
import com.hand.DaoImpl.InventoryDaoImpl;
import com.hand.Service.InventoryService;

public class InventoryServiceImpl implements InventoryService {
	 InventoryDao idd=new  InventoryDaoImpl();
	public void deletetoInventory (int id){
		idd.deletetoInventory(id);
	}
}
