package cse.capstonedesign.Capstone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cse.capstonedesign.Capstone.service.CalculatorService;

@RestController("/calculator")
public class CalculatorController {
	private final CalculatorService calculatorService;
	
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	@GetMapping("/sum")
	public int sum(@RequestParam int num1, @RequestParam int num2) {
		return this.calculatorService.sum(num1, num2);
	}
	@GetMapping("/sub")
	public int sub(@RequestParam int num1, @RequestParam int num2) {
		return this.calculatorService.sub(num1, num2);
	}
	@GetMapping("/mul")
	public int mul(@RequestParam int num1, @RequestParam int num2) {
		return this.calculatorService.mul(num1, num2);
	}
	@GetMapping("/div")
	public int div(@RequestParam int num1, @RequestParam int num2) {
		return this.calculatorService.div(num1, num2);
	}
}
