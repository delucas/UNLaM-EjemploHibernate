package edu.unlam.taller.persistencia;

import junit.framework.Assert;

import org.hibernate.Session;
import org.junit.Test;

import edu.unlam.taller.persistence.HibernateUtil;

/**
 * Test de Persistencia de la clase Persona usando Hibernate
 */
public class PersonaTestCases {

	@Test
	public void testConection(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Assert.assertTrue(session.isConnected());
	}
	
	//@Test
	public void testPersonaSimple(){
	}
	
	//@Test
	public void insertPersonaCompleta() {
	}

}
