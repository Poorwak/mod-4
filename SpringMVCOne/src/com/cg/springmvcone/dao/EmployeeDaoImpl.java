package com.cg.springmvcone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvcone.dto.Employee;

@Repository("employeedao")
public class EmployeeDaoImpl implements IEmployeeDao
{
	@PersistenceContext
	EntityManager entitymanager;
	@Override
	public int addEmployeeData(Employee emp) 
	{
		entitymanager.persist(emp);
		entitymanager.flush();
		return emp.getEmpId();
	}

	@Override
	public List<Employee> showAllEmployee() 
	{
		Query queryOne=entitymanager.createQuery("FROM Employee");
		List<Employee> myList= queryOne.getResultList();
		return myList;
	}

	@Override
	public void deleteEmployee(int empId) 
	{
		Query queryTwo=entitymanager.createQuery("DELETE FROM Employee WHERE empId=:eid");
		queryTwo.setParameter("eid", empId);
		queryTwo.executeUpdate();
	}

	@Override
	public void updateEmployee(Employee emp) 
	{
		Query queryThree=entitymanager.createQuery("UPDATE Employee set empName=:ename,"
				+"empDesignation=:edeg,"
				+"empSalary=:esal,empGender=:egen  WHERE empId=:eid");
		queryThree.setParameter("eid", emp.getEmpId());
		queryThree.setParameter("ename", emp.getEmpName());
		queryThree.setParameter("edeg", emp.getEmpDesignation());
		queryThree.setParameter("esal", emp.getEmpSalary());
		queryThree.setParameter("egen", emp.getEmpGender());
		queryThree.executeUpdate();
		
	}

	@Override
	public List<Employee> searchEmployee(int id) 
	{
		Query queryFour=entitymanager.createQuery("FROM Employee");
		return queryFour.getResultList();
	}

}
