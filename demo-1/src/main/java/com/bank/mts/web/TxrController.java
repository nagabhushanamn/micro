package com.bank.mts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bank.mts.service.TxrService;

@Controller
public class TxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(value = "/txr", method = RequestMethod.GET)
	public String showTxrForm() {
		return "txr-form";
	}

	@RequestMapping(value = "txr-status", method = RequestMethod.GET)
	public String showTxrStatus() {
		return "txr-status";
	}

	@RequestMapping(value = "/txr", method = RequestMethod.POST)
	public ModelAndView doTxr(@RequestParam double amount, @RequestParam String fromAccNum,
			@RequestParam String toAccNum, RedirectAttributes attributes) {
		boolean b = txrService.txr(amount, fromAccNum, toAccNum);
		ModelAndView mav = new ModelAndView();
		// mav.addObject("status", b?"success":"failed");
		attributes.addAttribute("status", b);
		mav.setViewName("redirect:txr-status");
		return mav;
	}

}
