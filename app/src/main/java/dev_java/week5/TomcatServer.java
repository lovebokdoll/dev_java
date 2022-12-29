package dev_java.week5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TomcatServer {
  public static void main(String[] args) {
    String url = "http://192.168.10.47:9000/index.html";
    try {
      URL myURL = new URL(url);
      HttpURLConnection con = (HttpURLConnection) myURL.openConnection();
      int responseCode = con.getResponseCode();// 200,404,500이러한 값을 볼 수 있음
      // System.out.println(responseCode);
      // System.out.println(5/0);//java.lang.ArithmeticException: / by zero
      BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
      StringBuilder sb = new StringBuilder();
      String line = "";
      while ((line = br.readLine()) != null) {
        sb.append(line);
      }
      System.out.println(sb.toString());
    } catch (Exception e) {
      System.out.println(e.toString());
    }

  }
}
