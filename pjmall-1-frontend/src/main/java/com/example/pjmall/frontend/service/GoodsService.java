package com.example.pjmall.frontend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Service;

import com.example.pjmall.frontend.dto.Goods;
import com.example.pjmall.frontend.dto.JSONResult;

@Service
public class GoodsService {
	
	@Autowired
	private OAuth2RestTemplate restTemplate;

	
	public List<Goods> getList(){
		
		String endpoint = "http://localhost:8888/v1/hello";
		JSONResult jsonResult = restTemplate.getForObject(endpoint, JSONResult.class);

		System.out.println( jsonResult );
		
		return null;
	}
}
