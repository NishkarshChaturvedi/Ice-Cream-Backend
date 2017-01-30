package backend.dao;

import backend.model.UserOrder;

public interface UserOrderDao {
void add(UserOrder userOrder);
	
	UserOrder getUserOrderById(int userOrderId);
}
