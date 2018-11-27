package ar.com.plantilla.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorIndex {
	
	@RequestMapping("/")
	public ModelAndView irAInicio(){
		return new ModelAndView("index");
	}
	@RequestMapping("index")
	public ModelAndView irAIndex(){
		return new ModelAndView("index");
	}
	@RequestMapping("/cajas")
	public ModelAndView irACajas(){
		return new ModelAndView("cajas");
	}
	
}

	