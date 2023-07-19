package com.mcxccl.HotelService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

	@GetMapping("/hotel")
	public String getHotel() {
		return "Crwon Plaza";
	}
}
