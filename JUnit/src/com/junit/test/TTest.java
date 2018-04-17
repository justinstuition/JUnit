/**
 * @author jihousai
 * @date 2018年4月17日 
 * <p>Description 
 */
package com.junit.test;

import static org.hamcrest.Matchers.*;
// Assert is a class, "*" represents the methods of class Assert --> 静态引入
import static org.junit.Assert.*;

import org.junit.*;

import com.junit.business.T;

/**
* 
*/
public class TTest
{

	@BeforeClass
	public static void beforeClass()
	{
		// TODO get Connection 
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public static void afterClass()
	{
		// TODO close Connection
		System.out.println("afterClass");
	}
	
	@Before
	public void before()
	{
		System.out.println("before");
	}
	
	/**
	 * Test method for {@link com.junit.business.T#add(int, int)}.
	 */
	@Test
	public void testAdd()
	{
		int z = new T().add(2, 3);
//		assertEquals(5, z);
//		assertTrue("z is too big", z < 3);
		assertThat(z, is(5));
		assertThat(z, allOf(greaterThan(1), lessThan(6)));
		assertThat(z, anyOf(greaterThanOrEqualTo(5), is(6)));
	}
	
//	@Ignore
	@Test (expected=java.lang.ArithmeticException.class, timeout=10)
	public void testDivide()
	{
		int z = new T().divide(8, 0);
		assertThat(z, is(2));
	}

	@After
	public void after()
	{
		System.out.println("after");
	}
}
