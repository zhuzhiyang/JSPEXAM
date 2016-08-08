package com.hand.Dao;

import java.util.List;

public interface InventoryDao {
	public void deletetoInventory (int id);
	public List<Integer> getInventoryidById(int id);
}
