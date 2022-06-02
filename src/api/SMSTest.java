package api;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SMSTest {
	public static void main(String[] args) {
		String api_key = "#ENTER_YOUR_OWN#";
	    String api_secret = "#ENTER_YOUR_OWN#";
	    Message coolsms = new Message(api_key, api_secret);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", "01000000000");
	    params.put("from", "01000000000");
	    params.put("type", "SMS");
//	    params.put("text", "보낼 메세지 작성");
	    params.put("app_version", "test app 1.2"); // application name and version

	    Random r = new Random();
	    Scanner scan = new Scanner(System.in);
	    
	    String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	    int len = source.length(); //위 문자열의 전체 길이
	    String result = "";
	    for (int i = 0; i < 5; i++) {
			int  idx = r.nextInt(len);//0~길이-1
			result += source.charAt(idx);
		}
	    
//	    System.out.println("완성된 문자열 : " + result);
	    params.put("text", "아래 코드를 입력하세요\n" + result);
	    
//	    try {
//	      JSONObject obj = (JSONObject) coolsms.send(params);
//	    } catch (CoolsmsException e) {
//	      System.out.println(e.getMessage());
//	      System.out.println(e.getCode());
//	    }
	    
	    System.out.print("발송코드 : ");
	    String answer = scan.next();
	    
	    if(answer.contentEquals(result)) {
	    	System.out.println("가입 성공 !");
	    }else {
	    	System.out.println("가입 실패 !");
	    }
	}
}
