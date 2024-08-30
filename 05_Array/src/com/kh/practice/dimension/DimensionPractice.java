package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		3행 3열짜리 문자열 배열을 선언 및 할당하고
//		인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		
        String strarr[][] = new String[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++)
				strarr[i][j] = "(" + i + ", " + j + ")";
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++)
				System.out.print(strarr[i][j]);
			System.out.print("\n");
		}

}
	public void practice2() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 1 ~ 16까지 값을 차례대로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요
		
		int[][] arr = new int[4][4]; 
		
		int value = 1;
		for(int row = 0; row < arr.length; row++ ) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				
				arr [row][col] = value++;
				System.out.printf("%3d ", arr[row][col]); 
			}
			System.out.println(); 
		}
	}
	 public void practice3(){
//	 4행 4열짜리 정수형 배열을 선언 및 할당하고
//	 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//	 2) 저장된 값들을 차례대로 출력하세요.
		 
		 int[][] arr = new int[4][4];

		 int value = 16;
		 for (int row = 0; row < arr.length; row++) {
			 for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = value--;
				
			 }
			 
		 }
		 for (int row = 0; row < arr.length; row++) {
			 for(int col = 0; col < arr[row].length; col++) {
			 System.out.printf("%2d ", arr[row][col]);
			
			}
			System.out.println(); 
				
		}
	 }
	 public void practice4(){
//	 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//	 아래의 내용처럼 처리하세요.
	 int[][] arr = new int[4][4];
		
		int Row = arr.length - 1;
		int Col = arr[1].length - 1;
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (row != Row && col != Col) {
					arr[row][col] = (int)(Math.random() * 10 + 1);
					
					arr[row][Col] += arr[row][col];
					arr[Row][col] += arr[row][col];
					arr[Row][Col] += arr[row][col];
				}
				System.out.printf("%4d ", arr[row][col]);
			}
			System.out.println();
		}
}	 
       public void practice5(){
//	 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
//	 “반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
//	 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
//	 (char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄)
    	   
    	   System.out.print("행 크기 : ");
    	   int row = sc.nextInt();
    	   
    	   System.out.print("열 크기 : ");
    	   int col = sc.nextInt();
    	   
    	   if(!(row >= 1 && row <= 10 && col >=1 && col <= 10)) {
    		   System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
    		   practice5();
    		   return;
    	   }
    	   
    	   char[][] arr = new char[row][col];
    	   
    	   for(int i = 0; i<row; i++) {
    		   for(int j = 0; j<col; j++) {
    			   // 'A' == 65 ~ 90
    			   // 'Z' == 90
    			   // 65 66 67 ... 90
    			   arr[i][j] = (char)((int)(Math.random() * 26 + 65));
    			   
    			   System.out.print(arr[i][j]+ " ");
    		   }
    		   System.out.println();
    	   }
       }
    	   
 
      
	  public void practice6(){
//		  String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", 
//			  "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
//			  위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제4 흐름’과 같은 방식으로 출력하세요.
//			  단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요
		  String[][] strArr = new String[][] {
			  {"이", "까", "왔", "앞", "힘"},
			  {"차", "지", "습", "으", "냅"},
			  {"원", "열", "니", "로", "시"},
			  {"배", "심", "다", "좀", "다"},
			  {"열", "히", "! ", "더", "!! "}};
			  
			  for(int i =0; i<strArr[i].length; i++) {
				  for(int j =0; j<strArr[i].length; j++) {
					  System.out.print(strArr[j][i]+ " ");
				  }
				  
			  }
		  
		  
	  }
	  public void practice7(){
//		  사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
//		  문자형 가변 배열을 선언 및 할당하세요.
//		  그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		  System.out.print("행의 크기 : ");
		  int row = sc.nextInt();
		  
		  char[][] arr = new char[row][];
		  for(int i = 0; i < row; i++) {
			  System.out.print(i+"행의 열 크기 : ");
			  int col = sc.nextInt();
			  
//			  char [] cArr = new char[col];
//			  arr[i] = cArr;
//			  arr[i] = new char[col];
			  arr[i] = new char[sc.nextInt()];
		  }
		  char ch = 'a';
		  for(int i =0; i<row; i++) {
		      for(int j =0; j < arr[i].length; j++) {
		    	  if(ch > 'z') {
		    		  ch = 'a';
		    	  
		    	  }
			      arr[i][j] =ch++;
			      System.out.print(arr[i][j]+" ");
		  }
		      System.out.println();
	  }
	  }
	  
	  public void practice8(){
//		  1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
//		  2열 3행으로 2차원 배열 2개를 이용하여 분단을 나눠
//		  1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
		  
		  String[] arr = new String[] {
				  "강건강", "남나나", "도대담","류라라", " 문미미", "박보배", 
				  "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"
		  };
		  String[][] first = new String[3][2];
		  String[][] second= new String[3][2];
		  
		  for(int i=0; i<arr.length; i++) {
			  if(i < 6) {
				  // 행 : i / 2 => 0
				  // 열 : i %/2 => 0.1
				  first[i/2][i%2] = arr[i];
			  }else {
				  int j = i-6;
				  second[j/2][j%2] = arr[i];
			  }
		  }
		  System.out.println("== 1분단 ==");
		  for(int i=0; i<first.length; i++) {
			  for(int j=0; j<first.length; j++) {
				  System.out.print(first[i][j]+" ");
			  }
		  }
			  System.out.println("== 12분단 ==");
			  for(int i=0; i<second.length; i++) {
				  for(int j=0; j<second.length; j++) {
					  System.out.print(second[i][j]+" ");
			  System.out.println();
		  }
			  }
		  }
	  
      public void practice9(){
//    	  위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여
//    	  해당 학생이 어느 자리에 앉았는지 출력하세
    	  String[] arr = new String[] {
				  "강건강", "남나나", "도대담","류라라", " 문미미", "박보배", 
				  "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"
				  
    	  };
    	  String[][] first = new String[3][2];
		  String[][] second= new String[3][2];
		  
		  for(int i=0; i<arr.length; i++) {
			  if(i < 6) {
				  // 행 : i / 2 => 0
				  // 열 : i %/2 => 0.1
				  first[i/2][i%2] = arr[i];
			  }else {
				  int j = i-6;
				  second[j/2][j%2] = arr[i];
			  }
			  }
		  
		  System.out.println("== 1분단 ==");
		  for(int i=0; i<first.length; i++) {
			  for(int j=0; j<first.length; j++) {
				  System.out.print(first[i][j]+" ");
			  }
		  }
			  System.out.println("== 2분단 ==");
			  for(int i=0; i<second.length; i++) {
				  for(int j=0; j<second.length; j++) {
					  System.out.print(second[i][j]+" ");
			  System.out.println();
		  }
			System.out.println("=======================");
			System.out.print("검색할 학생 이름을 입력하세요 : ");
			String student = sc.nextLine();
			String 분단  = " ";
			String[] 줄배열 = {"첫","두","세"};
			String 줄  = " ";
			String 방향  = " ";
			 for(int i =0; i<3; i++) {
				  for(int j=0; j<2; j++) {
					  if(first[i][j].equals(student)) {
						  분단 = "1";
						  줄 = 줄배열[i];
						  방향 = j == 0 ? "왼" : "오른";
				      }else if(second[i][j].equals(student)) {
				    	  분단 = "2";
					      줄 = 줄배열[i];
				    	  방향 = j == 0 ? "왼" : "오른";
				      }
				  }
				  }
					  System.out.println("검색하신 "+ student+ " 학생은 1분단 " +i+" 번째 줄" + 방향 +"쪽에 있습니다.");
					  System.out.println();
				  }
			  }
      
      public void practice10(){
//    	  String 2차원 배열 6행 6열을 만들고 
//    	  행의 맨 위와 열의 맨 앞은 각 인덱스를 저장하세요.
//    	  그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하세요
    	  String[][] arr = new  String[6][6];
    	  
    	  for(int i=0; i< 6; i++) {
    		  for(int j=0; j<6; j++) {
    			  arr[i][j] = " ";
    		  }
    	  }
    	  
    	  for(int i = 1; i<6; i++) { 
    		  arr[0][i] = i-1+"";
    		  arr[i][0] = i-1+"";
    	  }
    	  
    	  System.out.print("행 인덱스 입력 : ");
    	  int row =sc.nextInt();
    	  
    	  System.out.print("열 인덱스 입력 : ");
    	  int col =sc.nextInt();
    	  
    	  arr[row+1][col+1] = "X";
    	  
    	  for(int i =0; i<6; i++) {
    		  for(int j =0; j<6; j++) {
    		  System.out.printf("%2s", arr[i][j]);
    	  }
    		  System.out.println();
    	  }
    			  
      }
    	  public void practice11(){
    		  
    		String[][] arr = new  String[6][6];
    		
    		 for(int i=0; i< 6; i++) {
       		  for(int j=0; j<6; j++) {
       			  arr[i][j] = " ";
       		  }
       	  }
       	  
       	  for(int i = 1; i<6; i++) { 
       		  arr[0][i] = i-1+"";
       		  arr[i][0] = i-1+"";
       	  }
       	  
    		while(true) {
    		  System.out.print("행 인덱스 입력 : ");
        	  int row =sc.nextInt();
        	  if(row == 99) {
        		  System.out.println("프로그램 종료");
        		  break;
        	  }
        	  
        	  System.out.print("열 인덱스 입력 : ");
        	  int col =sc.nextInt();
        		  
        	
        	  arr[row+1][col+1] = "X";
        	  
        	  for(int i =0; i<6; i++) {
        		  for(int j =0; j<6; j++) {
        		  System.out.printf("%2s", arr[i][j]);
        	  }
        		  System.out.println();
        			  
        	  
          
    	  }
    	  }
      
    }
	  
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}

         
		 

		    
	


