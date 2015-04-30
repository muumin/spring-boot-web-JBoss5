package example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.domain.User;
import example.service.UserService;

@RestController
public class RestSampleController {

	@Autowired
	private UserService userService;

	@RequestMapping("/rest")
	List<User> home() {
		return userService.getUser();
	}
}
