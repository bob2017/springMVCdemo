//package com.baibhav.chicago;

/*import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

Tutorial-1 @Controller
public class AdmissionController {

	@RequestMapping(value="/admission", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("Admission");

		return model;
	}
	
	@RequestMapping("/submitAdmissionForm")
	public ModelAndView submitAdmissionForm(@RequestParam("username") String name, @RequestParam("address") String address) {

		ModelAndView model = new ModelAndView("AdmSuccess");
	model.addObject("msg","hey yo Mr" +"." +name +"," + "address is" +"::" +address);

	return model;
	}
}

	//@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	//public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar) {

		//String name = reqPar.get("studentName");
		//String hobby = reqPar.get("hobby");

		//ModelAndView model = new ModelAndView("AdmissionSuccess");
		//model.addObject("msg","Details submitted by you:: Name: "+name+ ", Hobby: " + hobby);

		//return model;
	//}
//}
*/

package com.baibhav.chicago;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdmissionController {

	@RequestMapping(value="/admission", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("Admission");

		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1) {

		ModelAndView model = new ModelAndView("AdmSuccess");
	    //model.addObject("student",student1);

	return model;
	}
}













































