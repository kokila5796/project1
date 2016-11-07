package jewelryFrontend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homecontroller {
	
		@RequestMapping("/")
		public String gotoindex(Model model)
		{
			model.addAttribute("home","true");
			return "index";
	    }
		@RequestMapping("/category")
		public String category(Model model)
		{
			model.addAttribute("userClickedcategory","true");
			return "index";
	    }
		
		@RequestMapping("/login")
		public String login(Model model)
		{
			model.addAttribute("login","true");
			model.addAttribute("userClickedlogin","true");
		   return "index";
	    }
		@RequestMapping("/register")
		public String register(Model model)
		{
			model.addAttribute("register","true");
			model.addAttribute("userClickedregister","true");
		   return "index";
	    }
		
		@RequestMapping("/register1")
		
		public String register1(Model m)
		{
			m.addAttribute("login","true");
		m.addAttribute("requestMessage","you r successfully registered");
		
		return "index";
	}
		@RequestMapping("/hiding")
		public String hiding(Model model)
		{
			model.addAttribute("userClicklogin",true);
			return "index";
			
		}
		
		@RequestMapping("/validate")
		public String gotovalidate(@RequestParam(name="user id")String userID,@RequestParam(name="password")String password, Model model )
	 {
			if(userID.equals("kokila")&& password.equals("1234"))
		{
				
			model.addAttribute("home","true");
			model.addAttribute("success","your successfully loggedin");
			return "index";
		}
		   else
		{
			 model.addAttribute("unscuccesful","invalid creditential.please try again");
		}
			
	       return "index";
	 }
		
	}

