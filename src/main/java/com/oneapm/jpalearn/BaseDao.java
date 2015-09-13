package com.oneapm.jpalearn;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseDao {

	private EntityManagerFactory emf;
	private EntityManager em;

	public BaseDao() {
		this.emf = Persistence.createEntityManagerFactory("pu1");
		em = emf.createEntityManager();
		List<Region> resultList = em.createQuery("select r from Region r").getResultList();
		for (int i = 0; i < resultList.size(); i++) {
			System.out.println(resultList.get(i));
		}

	}

	public static void main(String[] args) {
		new BaseDao();
	}

}
