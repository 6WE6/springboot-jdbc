package com.briup.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.briup.dao.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests{
	@Autowired
	private UserDao userDao;

	@Before
	public void setUp() {
		// 测试前删除表中数据
		userDao.deleteAllUsers();
	}

	@Test
	public void test() throws Exception {
		// 插入5个用户
		userDao.save(1,"briup1");
		userDao.save(2,"briup2");
		userDao.save(3,"briup3");
		userDao.save(4,"briup4");
		userDao.save(5,"briup5");
		
		
		// 查数据库，这时应该有5个用户
		Assert.assertEquals(5, userDao.getAllUsers());

		// 删除两个用户
		userDao.deleteByName("briup1");
		userDao.deleteByName("briup3");

		// 查数据库，这时应该有3个用户
		Assert.assertEquals(3, userDao.getAllUsers());

	}

}
