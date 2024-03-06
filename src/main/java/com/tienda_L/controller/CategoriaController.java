package com.tienda_L.controller;

import com.tienda_L.domain.Categoria;
import com.tienda_L.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model){
        var categorias=categoriaService.getCategorias(true);
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalCategorias", categorias.size());
        return "/categoria/listado";
    }
    
    @GetMapping("/eliminar/{idCategoria}")
    public String elimina(Categoria categoria){
        categoriaService.delete(categoria);
        return "redirect:/categoria/listado";
    }
        
    @GetMapping("/modificar/{idCategoria}")
    public String modifica(Categoria categoria, Model model){
        categoria = categoriaService.getCategoria(categoria);
        model.addAttribute("categoria", categoria);
        return "/Categoria/modifica";
    }
}
