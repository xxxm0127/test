package com.kh.kht.employee;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.kht.domain.Employee;

@Repository("employeeDao")
public class EmployeeDaoMybatis implements EmployeeDao {

	// 리턴메시지
	// insert() 성공->null
	// update() 성공-> 1
	// delete() 성공-> 삭제된 row 수
	
	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public int insert() {
		Employee emp = new Employee();
		emp.setEmp_id("223");
		emp.setEmp_name("김형태5");
		emp.setEmp_email("kht@kht.com");
		emp.setEmp_tel("010-7777-7777");
		return sqlSession.insert("Employee.insertemployee", emp);
	}
}
