package com.solmit.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.solmit.bean.Writer;
@Controller
public class BlogController {
	@Autowired
	private Writer writer;
	@RequestMapping(value = "/blog")
	 public ModelAndView getBlog(ModelAndView mv) {
		System.out.println("entro a blog");
		mv.addObject("currentDate", new Date());
		mv.addObject("writers", writer.getWriters());
	    mv.setViewName("myblog");
	    return mv;
	}
}