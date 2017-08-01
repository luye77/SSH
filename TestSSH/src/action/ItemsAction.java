package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.Items;

import service.ItemsService;

public class ItemsAction extends ActionSupport implements ModelDriven<Items>{
	private Items items=new Items();
	
	@Override
	public Items getModel() {
		return items;
	}
	
	private ItemsService itemsService;

	public void setItemsService(ItemsService itemsService) {
		this.itemsService = itemsService;
	}
	
	public String save(){
		System.out.println("action");
		itemsService.save(items);
		return NONE;
	}
}
