package org.cts;



public class Test {

	public static void main(String[] args) {

		EmpDao dao=new EmpDao();
		Emp e=new Emp();
		e.setName("raj");
		e.setAddress("hyd");
		dao.insert(e);
		
	}

}
