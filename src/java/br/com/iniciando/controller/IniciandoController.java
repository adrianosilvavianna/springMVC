/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iniciando.controller;

import br.com.iniciando.form.Contact;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;

@Controller

public class IniciandoController {
    
    @RequestMapping("/")
    public String cadastro(){        
        return "contact";    
    }
    
    @RequestMapping("/iniciando")
    public String iniciando(Model model, Contact contact){        
        
        model.addAttribute("contactName", contact.getFirstname());
        return "iniciando";    
    }
   
    
}
