package com.keara.code;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TheCodeController {
	
	@RequestMapping("/")
	public String index(){
        return "index.jsp";
    }
	
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@RequestParam(value="passcode") String passcode) {
		String bushido = "bushido";
		if (passcode != bushido) {
			return "redirect:/createError";	
        }
        if (passcode == bushido){
        	return "redirect:/code";
        }
        return passcode;
    }
	
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
    	redirectAttributes.addFlashAttribute("error", "You must train harder!");
    	return "redirect:/";
	}
	
	@RequestMapping("/code")
	public String code(){
        return "code.jsp";
    }

}
