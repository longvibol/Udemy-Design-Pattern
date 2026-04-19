package com.bharath.patterns.builder;

import com.bharath.patterns.builder.HttpClient.HttpClientBuilder;

public class Test {
	
	public static void main(String[] args) {
		HttpClient client = new HttpClient.HttpClientBuilder()
				.method("POST").url("testurl").body("{}").secure("user", "pass").build();
		System.out.println(client);
	}

}
