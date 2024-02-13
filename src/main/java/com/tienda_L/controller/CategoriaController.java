package com.tienda_L.controller;

import com.tienda_L.service.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")

public class CategoriaController {
    
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model){
        var categorias=categoriaService.getCategorias(true);
        model.addAttribute("categorias",categorias);
        model.addAttribute("totalCategorias",categorias.size());
            return "/categoria/listado";
    }
}