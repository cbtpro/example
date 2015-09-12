package com.lieqihezi.example.controller.cometd;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lieqihezi.example.domain.Message;

@RestController
@RequestMapping(value="/cometd")
public class CometdController {

	@RequestMapping(value="message", method=RequestMethod.GET)
	public Map<String, ?> message(){
		Map<String, Object> map = new HashMap<String, Object>();
		Message message = new Message();
		message.setMessage("测试");
		map.put("msg", message);
		return map;
	}
}
