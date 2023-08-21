package com.example.day3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIControllerEx1 {
@Value("1")
public int id;
@Value("Priya")
public String name;
@Value("19")
public int age;
@Value("17000")
public long salary;
@RequestMapping("/ex3")
public String day() {
	return id+"-"+name+"-"+age+"-"+salary;
}
}