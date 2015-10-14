package rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public Login greeting(@RequestParam(value = "name", defaultValue = "World") String name,			
			@RequestParam(value = "password", defaultValue = "password") String password) {
		return new Login(counter.incrementAndGet(), String.format(template, name), password);
	}
}