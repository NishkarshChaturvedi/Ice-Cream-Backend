package backend.dao;
import backend.model.Cart;
import backend.model.Item;

public interface ItemDao {
	void add(Item item);
	
	void remove(Item item);
	
	void removeAll(Cart cart);
	
	Item getItemById(int itemId);
}
