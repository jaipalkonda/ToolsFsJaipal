package com.nst.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.nst.main.AirthmeticOperation;
/**
 * Unit test for simple App.
 */
public class AppTest {

	private  static AirthmeticOperation aop;
   
	@BeforeAll
	public static void beforeTest()
	{
		//before code test
		aop = new AirthmeticOperation();
	}
	
	@BeforeEach
	public  void beforeEach()
	{
		//before each
	}
    @Test
    public void shouldAnswerWithPositive() {
    	
    	//int a = 10 ;
    	// b = 40 ;
    	int expected = 50 ;
    	int actual = aop.sum(30, 20);
    	assertEquals(expected, actual);
    }
    

    @Test
    public void shouldAnswerWithNegative() {
    	
    	//int a = -10 ;
    	//int b = -40 ;
    	int expected = -50 ;
    	int actual = aop.sum(-10, -40);
    	assertEquals(expected, actual);
    }
    

    @Test
    public void shouldAnswerWithMixed() {
    	
    	//int a = 10 ;
    	//int b = -40 ;
    	int expected = -30 ;
    	int actual = aop.sum(10, -40);
    	assertEquals(expected, actual);
    }
    
    @AfterEach
    public  void afterEach()
    {
    	//after each life cycle
    }
    
    @AfterAll
    public static void afterAll()
    {
    	//after all 
    	aop = null ;
    }
    
}
