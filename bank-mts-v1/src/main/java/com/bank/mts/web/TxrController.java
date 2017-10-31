package com.bank.mts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bank.mts.service.TxrService;

@Controller
@RequestMapping(value = "/txr")
public class TxrController {
	
	@Autowired
	private TxrService txrService;

	@RequestMapping(method = RequestMethod.GET)
	public String showTxrForm() {
		return "txr-form";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView doTxr(
			@RequestParam double amount,
			@RequestParam String fromAccNum,
			@RequestParam String toAccNum) {
		boolean b=txrService.txr(amount, fromAccNum, toAccNum);
		ModelAndView mav=new ModelAndView();
		mav.addObject("status", b?"success":"failed");
		mav.setViewName("txr-status");
		return mav;
	}

}
