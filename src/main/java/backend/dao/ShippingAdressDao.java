package backend.dao;

import backend.model.ShippingAdress;
public interface ShippingAdressDao {
void add(ShippingAdress shippingAdress);
	
	void update(ShippingAdress shippingAdress);
	
	//ShippingAdress getByUserId(int userId);

}
