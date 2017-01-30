package backend.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import backend.model.ShippingAdress;
import backend.dao.ShippingAdressDao;

@Repository
@EnableTransactionManagement
@Transactional
public class ShippingAdressDaoImpl implements ShippingAdressDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void add(ShippingAdress shippingAdress) {
		sessionFactory.getCurrentSession().saveOrUpdate(shippingAdress);
	}

	@Transactional
	public void update(ShippingAdress shippingAdress) {
		sessionFactory.getCurrentSession().update(shippingAdress);
	}

}
