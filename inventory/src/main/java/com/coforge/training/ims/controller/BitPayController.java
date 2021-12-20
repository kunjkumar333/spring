package com.coforge.training.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BitPayController {

	//Method to Display bit-pay.jsp file which consumes public Rest API data
	@RequestMapping("/bitpay")
	public String viewBitPayPage() {
		return "bit-pay";
	}
}
