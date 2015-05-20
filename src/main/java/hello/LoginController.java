package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping(value = "/login/{name}/{password}", method = RequestMethod.GET)
	public User isLoginValid(@PathVariable String name, @PathVariable String password) {

		if (name.equals("user") && password.equals("123")) {
			return new User("user", "123");
		}

		return new User("Guilherme", "123456");

	}
}
