package com.beadando.beadando.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.beadando.beadando.beteg.Beteg;
import com.beadando.beadando.dao.Betegrepo;


@Controller
public class controller {
	
	@Autowired
	Betegrepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/write")
	public String write()
	{
		return "write.jsp";
	}
	
	
	@GetMapping("/read")
	@ResponseBody
	public List<Beteg> read()
	{
		
		return repo.findAll();
	}
	
	
	
	@RequestMapping("/addBeteg")
	public String addBeteg(Beteg beteg)
	{
		repo.save(beteg);
		return "write.jsp";
	}
}
