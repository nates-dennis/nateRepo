package com.nathanael.customer;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CustomerDaoImplTest {

	private CustomerDaoImpl customerDaoImpl;
	
	@Mock private SessionFactory sessionFactory;
	@Mock private Session session;
	@Before
	public void setUp() throws Exception {
		customerDaoImpl = new CustomerDaoImpl();
		customerDaoImpl.setSessionFactory(sessionFactory);
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAdd() {
		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.doNothing().when(session).saveOrUpdate(Mockito.any(Customer.class));
		
//		customerDaoImpl.add(Mockito.any(Customer.class));
		
		Mockito.verify(session).saveOrUpdate(Mockito.any(Customer.class));
		Mockito.verify(sessionFactory).getCurrentSession();
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomers() {
		fail("Not yet implemented");
	}

}
