/**
 * 
 */
package com.buildframework.testcases;

import org.testng.annotations.Test;

import com.buildframework.pages.HomePage;

/**
 * @author Lenovo
 *
 */
public class demoTest {
	@Test
	public void test1() {
		HomePage homePage = new HomePage();
		homePage.testMethod();
	}
}
