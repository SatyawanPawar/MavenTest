package com.buildframework.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class JunitDemo {

	@Test
	public void test() {
		fail("Not yet implemented");
		System.out.println("fail");
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testpass() {
		String s1="hi";
		Assert.assertEquals("hi", s1);
		System.out.println("pass");
		
	}

}
