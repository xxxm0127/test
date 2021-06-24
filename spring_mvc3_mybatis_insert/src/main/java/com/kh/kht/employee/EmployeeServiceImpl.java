package com.kh.kht.employee;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
//	@Autowired UserDao dao;
	
	@Resource(name="employeeDao")
	private EmployeeDao dao;
	
	@Override
	public int insert()
	{
		return dao.insert();
	}
}
