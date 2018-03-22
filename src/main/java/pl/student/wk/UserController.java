package pl.student.wk;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


import pl.student.wk.User;
import pl.student.wk.service.UserService;




@Controller
@SessionAttributes
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	 @RequestMapping("/Registrations")
	 public String registration(Map<String, Object> map) {
		 map.put("user", new User());
		   
		 return "Registration";
	   }
	

   @RequestMapping(value = "/addUsr", method = RequestMethod.POST)
   public String addContact(@ModelAttribute("user")
                           User user, BindingResult result) {
        
	   userService.addUser(user);
	   
       System.out.println("First Name: " + user.getFrstname() +
                   " Last Name: " + user.getLstname() + " Tel.: " + 
    		   user.getTelno() + " Email: " + user.getEmail());
       
               
       return "redirect:home.html";
   }
       
 
   

   
   
}

