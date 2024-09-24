package org.jsp.THExamen.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        // Hardcoded default credentials
        String defaultUsername = "marco";
        String defaultPassword = "1234";

        // Validate the provided credentials against the default ones
        if (username.equals(defaultUsername) && password.equals(defaultPassword)) {
            // Successful login, redirect to the student list page or any other page you want
            return "redirect:/users/list";
        } else {
            // Invalid credentials, redirect back to the login page with an error parameter
            return "redirect:/login?error";
        }
    }
}
