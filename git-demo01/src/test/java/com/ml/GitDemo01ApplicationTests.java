package com.ml;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitDemo01ApplicationTests {
	@Autowired
	private JdbcTemplate temp;
	@Test
	public void contextLoads() {
		DataSource ds=temp.getDataSource();
		System.out.println("DataSource来自于："+ds.getClass());
		try {
			Connection conn=ds.getConnection();
			System.out.println("conn链接："+conn);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
