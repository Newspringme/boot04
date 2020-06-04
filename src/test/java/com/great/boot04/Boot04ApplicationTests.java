package com.great.boot04;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class Boot04ApplicationTests
{
	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() throws SQLException
	{
		System.out.println("dataSource.getClass() = " + dataSource.getClass());
		System.out.println("dataSource.getClass() = " + dataSource.getConnection());
	}

}
