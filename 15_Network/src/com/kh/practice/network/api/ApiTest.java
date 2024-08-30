package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest{
										
	 public static void main(String args[]) {
		 String requestUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth";
		 String serviceKey = "Kt7ld+B4iE1p/YQmMQg1oE36slrA7kJPGoNMjtWqjncUg6HO6vE4/CjlmIINZArVtWTDikwMOWbEBpsgjRYbfw==";
		 
		 try {
			requestUrl += "?serviceKey="+ URLEncoder.encode(serviceKey, " UTF-8");
			requestUrl += "&stationName="+ URLEncoder.encode("종로구","UTF-8");
			requestUrl += "&dataTerm=DAILY";
			
			URLConnection conn = new URL(requestUrl).openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}