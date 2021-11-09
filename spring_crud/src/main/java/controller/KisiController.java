package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import service.KisiService;

@RestController
public class KisiController {

	public KisiService kisiService;
//her run edildiginde calistirma
	@Autowired
	public KisiController(KisiService kisiService) {
		
		this.kisiService = kisiService;
	}
	
	
}
