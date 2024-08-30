package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
   
   private Scanner sc = new Scanner(System.in);
   private MusicController mc = new MusicController();
   
         public void mainMenu() {
            
//            ******* 메인 메뉴 *******
//            1. 마지막 위치에 곡 추가 // addList() 실행
//            2. 첫 위치에 곡 추가 // addAtZero()
//            3. 전체 곡 목록 출력 // printAll()
//            4. 특정 곡 검색 // searchMusic()
//            5. 특정 곡 삭제 // removeMusic()
//            6. 특정 곡 정보 수정 // setMusic()
//            7. 곡명 오름차순 정렬 // ascTitle()
//            8. 가수명 내림차순 정렬 // descSinger()
//            9. 종료 // “종료” 출력 후 main()으로 리턴
//            메뉴 번호 선택 : >> 입력 받음
//            // 메뉴 화면 반복 실행 처리
            
            
            System.out.println("******* 메인 메뉴 *******");
            System.out.println("1. 마지막 위치에 곡 추가");
            System.out.println("2. 첫 위치에 곡 추가");
            System.out.println("3. 전체 곡 목록 출력");
            System.out.println("4. 특정 곡 검색");
            System.out.println("5. 특정 곡 삭제");
            System.out.println("6. 특정 곡 정보 수정");
            System.out.println("7. 곡명 오름차순 정렬");
            System.out.println("8. 가수명 내림차순 정렬");
            System.out.println("9. 종료");
            
            
            while(true) {
               System.out.print("메뉴 번호 입력 :");
               int menu =Integer.parseInt(sc.nextLine());
               
               switch(menu) {
               case 1:addList(); break;
               case 2:addAtZero(); break;
               case 3:printAll(); break;
               case 4: searchMusic(); break;
               case 5:removeMusic(); break;
               case 6:setMusic(); break;
               case 7: ascTitle(); break;
               case 8:descSinger(); break;
               case 9: System.out.println("종료"); return;
               }
            }
            
            
            

            
         }
         public void addList() {
//            ****** 마지막 위치에 곡 추가 ******
//            // 곡 명과 가수 명을 사용자에게 입력 받는다.
//            // MusicController에 addList()를 이용해서 입력한 정보를 넘기고
//            // 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
            
            System.out.println("****** 마지막 위치에 곡 추가 ******");
            System.out.print("곡 명 : ");
            String title =sc.nextLine();
            System.out.print("가수 명 : ");
            String singer =sc.nextLine();
            
            
            Music m =new Music(title, singer);
            int result =mc.addList(m);
            
            
            if (result ==1) {
               System.out.println("추가 성공");
            }else{
               System.out.println("추가 실패");
            }
            
            
         }
         public void addAtZero() {
//            ****** 첫 위치에 곡 추가 ******
//            // 곡 명과 가수 명을 사용자에게 입력 받는다.
//            // MusicController에 addAtZero()를 이용해서 입력한 정보를 넘기고
//            // 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔 창에 출력
            
            System.out.println("****** 첫 위치에 곡 추가 ******");
            System.out.print("곡 명 : ");
            String title =sc.nextLine();
            System.out.print("가수 명 : ");
            String singer =sc.nextLine();
         
            int result =mc.addAtZero(new Music(title, singer));
            
            if (result ==1) {
               System.out.println("추가 성공");
            }else{
               System.out.println("추가 실패");
            }
            
            
         }
         public void printAll() {
            //****** 전체 곡 목록 출력 ******
            // MusicController에 printAll() 반환 값을 출력한다.
            System.out.println("****** 전체 곡 목록 출력 ******");
            System.out.println(mc.printAll());
             
         }
         public void searchMusic() {
         //   ****** 특정 곡 검색 ******
            // 사용자에게 곡 이름을 받고 MusicController에 있는 searchMusic으로 값을 넘긴다.
            System.out.println("곡 명 : ");
            String title =sc.nextLine();
            
            Music m =mc.searchMusic(title);
            if(m ==null) {
               System.out.println("없음");
               return;
               
            }
            
            System.out.println("검색한 곡은 "+ title + m +"입니다.");
            
            
            // searchMusic()의 반환 값에 따라 반환 값이 없으면 “검색한 곡이 없습니다.”
            // 반환 값이 있으면 “검색한 곡은 000(곡 명, 가수 명) 입니다.” 콘솔 창에 출력
            
         }
         public void removeMusic() {
        	// ****** 특정 곡 삭제 ******
        	// 사용자에게 삭제할 곡의 이름을 직접 받고 MusicController에 removeMusic으로
        	// 값을 넘긴다. removeMusic()의 반환 값에 따라 반환 값이 없으면 “ 삭제할 곡이 없습니다.”
        	// 반환 값이 있으면 “000(곡 명, 가수 명)을 삭제 했습니다” 콘솔 창에 출력
        	 System.out.println("곡 명 : ");
             String title =sc.nextLine();
             
             Music m =mc.removeMusic(title);
             if(m ==null) {
                System.out.println("없음");
                return;
                
             }
             
             System.out.println("검색한 곡은 "+ title + m +"입니다.");

            
         }
         public void setMusic() {
        	 System.out.print("곡 명 : ");
        	 String title = sc.nextLine();
        	 
        	 System.out.print("수정할 곡 명 : ");
        	 String eSinger = sc.nextLine();
        	 System.out.print("수정할 가수 명 : ");
        	 
        	 Music m = mc.setMusic(title, new Music(title, eSinger));
        	 
        	 if(m == null) {
        		 System.out.println("수정할 곡이 없습니다.");
        		 return;
        	 }
        	 System.out.println(title + m + "의 값이 변경되었습니다.");
        	 
         }
         public void ascTitle() {
        	// ****** 곡 명 오름차순 정렬 ******
        	// MusicController에 ascTitle()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패”
        	 int result = mc.ascTitle();
        	 System.out.println("정렬 성공");
        	 
         }
         public void descSinger() {
        	// ****** 가수 명 내림차순 정렬 ******
        	// musicController에 descSinger()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패
        	 int result = mc.descSinger();
        	 System.out.println("정렬 성공");
         }

}