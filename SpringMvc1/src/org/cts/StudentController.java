package org.cts;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/showForm")
	public String showStudentForm()
	{
		return "student";
	}
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest req,Model model)
	{
		int sno=Integer.parseInt(req.getParameter("sno"));
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String msg=sno+"\t"+name+"\t"+address;
		model.addAttribute("msg", msg);
		return "student-confirm";
		
		
		
	}
}
