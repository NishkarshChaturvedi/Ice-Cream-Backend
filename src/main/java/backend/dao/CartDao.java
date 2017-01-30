package backend.dao;
import backend.model.Cart;;

public interface CartDao {
  void add(Cart cart);
  
  void update(Cart cart);
   Cart getbyId(int cartId);
   Cart getByUserId(int userId);
}
