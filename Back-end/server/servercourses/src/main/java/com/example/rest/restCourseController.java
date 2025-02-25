package com.example.rest;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.courseDto;
import com.example.responsitory.courseRespository;
import com.example.service.courseService;


@RestController
@RequestMapping("/api/course")
public class restCourseController {

	@Autowired EntityManager entity;
	
	@Autowired
	courseRespository service;
	
	@GetMapping(value = "/test")
	public String test()
	{
		return "hello world";
	}
	
	@GetMapping(value = "/")
	public List<courseDto> getAllCertificate()
	{
		List<courseDto> l = service.findAll();
		return l;
	}
}
