package com.revature.test;

import org.junit.jupiter.api.Test;

import com.revature.dao.TodoDaoImpl;

import src.main.java.com.revature.dao.TodoDao;
import com.revature.dao.TodoDaoImpl;




public class TodoDaoTest {
	private final TodoDao dao = new TodoDaoImpl();
	
	@Test
	public void getAllTodos_ShouldReturn1Record() {
		assertEquals(1, dao.getAllTodos().size());
	}
}
