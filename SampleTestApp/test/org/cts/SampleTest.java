package org.cts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SampleTest {
	static Sample sa=null;
	@BeforeClass
	public static void initTest()
	{
		sa=new Sample();
	}
	@Test
	public void test1()
	{
		assertEquals(sa.sum(10, 20), 30);
	}
	@Test
	public void test2()
	{
		assertEquals(sa.sum(10, 20), 30);
	}
	@Test
	public void getAll_Returns_Object()
	{
		assertNotNull(sa.getIntegers());
	}
	@Test
	@Ignore
	public void getAll_Retrurn_Null()
	{
		assertNull(sa.getIntegers());
	}
	@Test
	public void getArray_Return_An_Array()
	{
		assertArrayEquals(sa.getArray(), new int[]{10,20,30});
	}
	@AfterClass
	public static void cleanUp()
	{
		sa=null;
	}
}
