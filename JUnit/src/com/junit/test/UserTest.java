/**
 * @author jihousai
 * @date 2018年4月17日 
 * <p>Description 
 */
package com.junit.test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import com.junit.business.User;

/**
* 
*/
public class UserTest
{

	/**
	 * Test method for {@link com.junit.business.User#getUsername()}.
	 */
	@Test
	public void testGetUsername()
	{
		assertThat(new User().getUsername(), is("aa"));
	}

}
