package com.cn;

import org.testng.annotations.Test;

public class TestHello {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("abc:  " +Testadd(9, 9));
	}
    @Test
    public static int Testadd(int a, int b){

    	int c = 0;
    	c=a+b;
    	System.out.println("执行这个方法   "+c);
    	return c;
    }
    
    @Test
    public void Testdel(){
    	
    	System.out.println("Good !!!!");
    	Testadd(23, 34);
    }
}
