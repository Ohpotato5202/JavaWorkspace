package com.kh.practice3.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	   public void inputTest3() {
		   
		   try (Scanner va = new Scanner(System.in)) {
			    System.out.print("가로 : ");
			    float a  = va .nextFloat();
				
				System.out.print("세로 : ");
				 float b = va .nextFloat();
				 
				va .nextLine();
				
				System.out.print("면적 : " + (a  *  b));
				va .nextLine();
				System.out.print("둘레 : " + (a  +  b *2));
				
				/*
				 public void inputTest3() {
				  
				  
				  System.out.print("가로 : ");
				  double width  = va .nextDouble();
				  
				  System.out.print("세로 : ");
				  double height = va .nextDouble();
				  
				  double 면적 = width * height;
				  double 둘레 = (width + height) * 2;
				  
				  System.out.print("면적 : " + ("면적 : "+둘레));
				  System.out.print("둘레 : " + ("면적 : "+둘레));
				  
				 * */
		   }
	}
	}
	  
