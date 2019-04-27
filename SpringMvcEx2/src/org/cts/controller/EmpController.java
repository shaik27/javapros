package org.cts.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.cts.beans.Emp;
import org.cts.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	EmpService service;
	
	
	public void setService(EmpService service) {
		this.service = service;
	}
	@RequestMapping("/showForm")
	public String getEmpForm(Model model)
	{
		model.addAttribute(new Emp());
		return "emp";
	}
	/*@RequestMapping("/processForm")
	public ModelAndView processForm(HttpServletRequest request)
	{
		int eno=Integer.parseInt(request.getParameter("eno"));
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("eno", eno);
		modelAndView.addObject("name", name);
		modelAndView.addObject("address", address);
		modelAndView.setViewName("emp-confirm");
		return modelAndView;
	}*/
	@RequestMapping(value="/processForm",method=RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("emp") Emp e,Model model,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "emp";
		}
		else
		{
		service.register(e);
		model.addAttribute("msg", "successfully Registered");
		}
		return "emp";
		
	}
	@ModelAttribute("countryOptions")
	public Map<String,String> getCountries()
	{
		Map<String,String> countryOptions=new HashMap<String, String>();
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("IN", "India");
		countryOptions.put("US", "UnitedStates");
		countryOptions.put("BR", "Brazil");
		return countryOptions;
	}
	@ModelAttribute("courses")
	public ArrayList<String> getCourses()
	{
		ArrayList<String> courses=new ArrayList<>();
		courses.add("c");
		courses.add("java");
		courses.add(".net");
		return courses;
	}
	@ModelAttribute("hobbies")
	public ArrayList<String> getHobbies()
	{
		ArrayList<String> hobbies=new ArrayList<>();
		hobbies.add("Playing cricket");
		hobbies.add("listening Music");
		hobbies.add("Reading");
		return hobbies;
	}
	
}
