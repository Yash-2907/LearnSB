package com.learnSpringBoot.learn_jpa_and_hibernate;

import org.apache.logging.log4j.status.StatusConsoleListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class jdbcRepo {
	@Autowired
	private JdbcTemplate template;
	private static final String INSERT_SQL = """
			INSERT INTO course(id, name, author)
			VALUES (?,?,?);
			""";
	
	private static final String FIND_BY_ID = "select * from course where id=?;";

	public void insertVal(Course course) {
		template.update(INSERT_SQL,course.getId(),course.getCoursenameString(),course.getAuthorString());
	}
	
	public void deleteRow(int val) {
		template.update("Delete from course where id=?;",val);
	}
	
	public Course findbyid(int val) {
		return template.queryForObject(FIND_BY_ID,new BeanPropertyRowMapper<>(Course.class),val);
	}
}
