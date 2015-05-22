package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author viagrawal
 *
 */


@Controller
public class HelloController {

	
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String showHomePage(@PathVariable("name") String name,Map<String, Object> model) {
		
		model.put("name", name);
		return "hello";
		
	}

	
	
}
