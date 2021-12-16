package com.coforge.training.crm.dao;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.training.crm.model.User;

/*Spring Repository annotation is a specialization of @Component annotation, so Spring Repository classes
 *  are autodetected by spring framework through classpath scanning.
Spring Repository is very close to DAO pattern where DAO classes are responsible for providing CRUD operations
 on database tables.*/

@Repository // It acts like storage where we can do modification in database
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory; // instance of hibernate sessionFactory configure with data source Configured
											// with Spring Configuration file

	@Override
	public User checkUser(User theUser) {
		User usr = null;
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<User> cq = cb.createQuery(User.class);
			Root<User> root = cq.from(User.class);

			cq.select(root).where(cb.and(cb.equal(root.get("email"), theUser.getEmail()),
					cb.equal(root.get("password"), theUser.getPassword())));

			Query query = session.createQuery(cq);
			query.setMaxResults(1);
			usr = (User) query.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				// session.close();
			}
		}

		return usr;
	}

}
