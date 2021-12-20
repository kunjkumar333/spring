package com.coforge.training.ims;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.coforge.training.ims.model.BitPay;
import com.coforge.training.ims.model.Product;

class ConsumeRestJson {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestTemplate restTemplate=new RestTemplate();
		
		Product p=restTemplate.getForObject("http://localhost:8085/ims/api/products/{id}", Product.class,2);
		System.out.println("Product Id"+ p.getId());
		System.out.println("Product Id"+ p.getName());
		System.out.println("Product Id"+ p.getMadein());
		System.out.println("Product Id"+ p.getPrice());
		
		System.out.println("****************************************");

		
		
		BitPay[] bp = restTemplate.getForObject("https://bitpay.com/api/rates", BitPay[].class);

		for(int i = 0; i<bp.length;i++) {
		System.out.println("Name:"+bp[i].getName()+"    "+"Code:"+bp[i].getCode()+"    "+"Rate:"+bp[i].getRate());
		
		}		
	}

}
