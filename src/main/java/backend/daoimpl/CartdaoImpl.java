package backend.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import backend.dao.CartDao;
import backend.model.Cart;

@Repository("cartDao")
@Transactional
@EnableTransactionManagement
public class CartdaoImpl implements CartDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void add(Cart cart) {
     sessionFactory.getCurrentSession().saveOrUpdate(cart);
	}

	public void update(Cart cart) {
	sessionFactory.getCurrentSession().update(cart);
	}

	public Cart getById(int cartId) {
		String hql = "from Cart where cartId=" + cartId;
		Cart cart = (Cart) sessionFactory.getCurrentSession().createQuery(hql).getSingleResult();
		return cart;
	}

	public Cart getByUserId(int userId) {
		String hql = "from Cart where userId=" + userId;
		Cart cart = (Cart) sessionFactory.getCurrentSession().createQuery(hql).getSingleResult();
		return cart;
	}

	public Cart getbyId(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}

}

