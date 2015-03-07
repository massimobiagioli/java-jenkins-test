package hello;

import java.io.UnsupportedEncodingException;

public class Hello {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Calculator calculator = new Calculator();
		System.out.println("Hello World - v3.0 - " + calculator.sum(3, 4) + " " + 
				calculator.toB64("pippo"));
	}

}
