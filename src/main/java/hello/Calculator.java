package hello;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class Calculator {
	
	public Calculator() {		
	}
	
	public int sum(int a, int b) { 
		return a + b;
	}
	
	public String toB64(String a) throws UnsupportedEncodingException {
		return Base64.encodeBase64String(a.getBytes());
	}
	
}
