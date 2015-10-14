package rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value="/registration", method={RequestMethod.POST,RequestMethod.GET})
	public Registration greeting(@RequestParam(value = "name", defaultValue = "World") String name,
			@RequestParam(value = "email", defaultValue = "Ozz") String email,
			@RequestParam(value = "password", defaultValue = "password") String password,
			@RequestParam(value = "city", defaultValue = "city") String city) {
		return new Registration(counter.incrementAndGet(), String.format(template, name), email, password, city);
	}
}