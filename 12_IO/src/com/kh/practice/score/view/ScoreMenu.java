package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {

	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝");
			System.out.print("메뉴번호 :");
			int menu = parse(sc.nextLine());

			switch (menu) {
			case 1:
				saveScore();
				break;
			case 2:
				readScore();
				break;
			case 9:
				return;

			}
		}

	}

	public int parse(String str) {
		return Integer.parseInt(str);

	}

	public void saveScore() {
		int num = 0;
		
		while(true) {
			System.out.println(++num+"번 쨰 학생 정보 기록");
		    
			System.out.print("이름 : ");
		    String name = sc.nextLine();
		    
		    System.out.print("국어 점수 : ");
		    int kor = parse(sc.nextLine());
		    
		    System.out.print("영어 점수 : ");
		    int eng = parse(sc.nextLine());
		    
		    System.out.print("수학 점수 : ");
            int math = parse(sc.nextLine());
            
            int sum = kor + eng + math;
            double avg = sum / 3.0;
            scr.saveScore(name, kor, eng, math, sum , avg );
            
            System.out.println("그만 하시려면 N, 계속 하시려면 아무 키나 입력하세요 : ");
            char ch = sc.nextLine().toUpperCase().charAt(0);
            if(ch == 'N') break;
		}

	}

	public void readScore() {
		
		int count = 0; // 몇 명의 핛
		int sumAll = 0;
		double avgAll = 0;
		
		try(DataInputStream dis = scr.readScore();) {
			System.out.println("이름\t국어\t영어\t수학\t총점\t평점");
			while(true) {
			String name = dis.readUTF();
			int kor = dis.readInt();
			int eng = dis.readInt();
			int math= dis.readInt();
			int sum = dis.readInt();
			double avg = dis.readDouble();
			
			System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg);
			
			count++;
			sumAll += sum;
			avgAll += avg;
			
			}
		} catch(EOFException e) {
			System.out.println("읽은 횟수 전체 합계 전체 평균");
			System.out.println(count+"\t"+sumAll+"\t"+ (avgAll / count));
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
	    } catch (IOException e1) {
		e1.printStackTrace();
	   }
		
			
		
			
		}
// scr의 readScore()의 반환 값을 DataInputStream에 담고 반복문을 이용하여
// 안에 들어가있는 데이터를 가지고 와서 출력
// 모든 파일이 읽어졌을 때 나오는 EOFException을 이용하여
// EOFException가 일어났을 때 읽은 회수, 전체 합계, 전체 평균 출력

}
