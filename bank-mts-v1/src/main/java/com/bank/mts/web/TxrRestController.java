package com.bank.mts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.mts.service.TxrService;

@RestController
@RequestMapping("/api/txr")
public class TxrRestController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(method = RequestMethod.POST)
	public TxrResponse doTxr(@RequestBody TxrRequest request) {
		boolean b = txrService.txr(request.getAmount(), request.getFromAccNum(), request.getToAccNum());
		TxrResponse response = new TxrResponse();
		response.setStatus(b ? "success" : "failed");
		return response;
	}

}
