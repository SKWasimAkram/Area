package com.kanth.area.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/area")
public class AreaController {

	private static final double pi = 3.14;

	@GetMapping(path = "/circle", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getCircleArea(@RequestParam("r") double radius) {
		System.out.println("input is : " + radius);
		double result = pi * radius * radius;
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}

	@GetMapping(path = "/triangle", produces = MediaType.APPLICATION_JSON_VALUE)
	public double getTriangleArea(@RequestParam("h") double height, @RequestParam("b") double base) {
		return (height * base) / 2;
	}

	@GetMapping(path = "/rectangle", produces = MediaType.APPLICATION_JSON_VALUE)
	public double getReactangleArea(@RequestParam("l") double length, @RequestParam("w") double width) {
		return length * width;
	}

	@GetMapping(path = "/square", produces = MediaType.APPLICATION_JSON_VALUE)
	public double getSquareArea(@RequestParam("s") double side) {
		return side * side;
	}
}
