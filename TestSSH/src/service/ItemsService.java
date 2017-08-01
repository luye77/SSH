package service;

import org.springframework.transaction.annotation.Transactional;

import dao.ItemsDAO;
import entity.Items;
@Transactional
public class ItemsService {
	private ItemsDAO itemsDao;

	public void setItemsDao(ItemsDAO itemsDao) {
		this.itemsDao = itemsDao;
	}

	public void save(Items items) {
		System.out.println("service");
		itemsDao.save(items)
;	}
	
}
