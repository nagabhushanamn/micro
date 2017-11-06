package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TxrService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/txr")
public class TxrController {

	@Autowired
	private TxrService txrSrvice;

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/x-www-form-urlencoded" })
	public TxrResponse doTxrWithForm(@ModelAttribute TxrRequest request) {
		boolean b = txrSrvice.txr(request.getAmount(), request.getFrom(), request.getTo());
		TxrResponse response = new TxrResponse();
		response.setStatus(b ? "success" : "Failed");
		return response;
	}

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json", "application/xml" })
	public TxrResponse doTxrWithXMLOrJson(@RequestBody TxrRequest request) {
		boolean b = txrSrvice.txr(request.getAmount(), request.getFrom(), request.getTo());
		TxrResponse response = new TxrResponse();
		response.setStatus(b ? "success" : "Failed");
		return response;
	}

}
