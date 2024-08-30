package com.kh.practice.network.ip;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPSearch {

	public static void main(String args[]) {
		// 키보드로 호스트명 또는 도메인명을 입력받는다.
		Scanner sc = new Scanner(System.in);

		System.out.print("호스트명 : ");
		String hostName = sc.nextLine();

		try {
			InetAddress[] arr = InetAddress.getAllByName(hostName);

			System.out.println(hostName + "는 " + arr.length + "개의 IP주소를 가지고 있습니다.");
			int count = 1;
			for (InetAddress ip : arr) {
				System.out.println(count++ + "번 IP = " + ip.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
