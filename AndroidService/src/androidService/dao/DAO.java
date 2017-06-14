package androidService.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import androidService.entity.GirisEntity;
import androidService.entity.Kullanicilar;


public class DAO {

	private static DAO uniqueInstance;

	public static DAO getInstance() {

		if (uniqueInstance == null) {
			uniqueInstance = new DAO();
		}
		return uniqueInstance;
	}

	SessionFactory sessionFactory;

	public DAO() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public Kullanicilar kontrolEt(GirisEntity girisEntity) {
		Kullanicilar kullanici = null;
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Kullanicilar.class);

		criteria.add(Restrictions.eq("name", girisEntity.getName()));

		criteria.add(Restrictions.eq("sifre", girisEntity.getSifre()));

		List<Kullanicilar> list = criteria.list();

		if (list.size() > 0)
			kullanici = list.get(0);
		
		session.close();

		return kullanici;
	}
	
}