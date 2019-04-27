package org.cts;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {
	String getMessage()
	{
		return "hello";
	}
}
