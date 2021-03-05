package com.sbs.example.derivedResources.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsrImgController {
	@RequestMapping("/img")
	public String showImg() {
		return "안녕";
	}
}
