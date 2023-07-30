package org.jsp.springbootdemo;

import org.jsp.springbootdemo.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {
//	@RequestMapping("/home")
//	@ResponseBody
//public String home() {
//	return "Hello from Home Controller";
//}
//	@RequestMapping("/test")
//	@ResponseBody
//public String test() {
//	return "It is Testing";
//}
//	@PostMapping("/sum")
//public String sum(@RequestParam int n1, @RequestParam int n2) {
//	return "The sum is:"+(n1+n2);
//}
//	@GetMapping("/diff")
//public String diff(@RequestParam int n1, @RequestParam int n2) {
//	return "The sum is:"+(n1-n2);
//}
	@GetMapping("/even/{num}")
public String evenOrodd(@PathVariable(name="num") int num) {
	return num%2==0?num+" is an even number":num+" is an odd number";
}
	@GetMapping("/users")
	public User getuser() {
		return new User(1, "Nitesh",8888, "!@gamil.com");
	}
	@PostMapping("/users")
	public String printuser(@RequestBody User user) {
		System.out.println("Id:"+user.getId());
		System.out.println("Name:"+user.getName());
		System.out.println("Id:"+user.getPhone());
		System.out.println("Id:"+user.getEmail());
		
		return "the data is printed";
		
	}
}

