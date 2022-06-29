package com.practica.Practica01.controller;

import com.practica.Practica01.domain.Estado;
import com.practica.Practica01.service.EstadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping ("/")
    public String inicio(Model model){
        var estados=estadoService.getEstados();
        model.addAttribute("estados", estados);
        return "index";
    }
    
    @GetMapping("/nuevoEstado") 
    public String nuevoEstado(Estado estado) {
        return "actualizarEstado";
    }
    
    @PostMapping("/guardarEstado")
    public String guardarEstado(Estado estado){
        estadoService.save(estado);
        return "redirect:/";
    }
    
      @GetMapping("/actualizarEstado/{idEstado}")
      public String actualizarEstado(Estado estado, Model model) {
          estado = estadoService.getEstado(estado);
          model.addAttribute("estado", estado);
          return "actualizarEstado";
      }
      
       @GetMapping("/eliminarEstado/{idEstado}")
       public String eliminarEstado(Estado estado) {
           estadoService.delete(estado);
           return "redirect:/";  
          
      }
      
}

        