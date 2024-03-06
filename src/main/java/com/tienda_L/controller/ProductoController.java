package com.tienda_L.controller;

import com.tienda_L.domain.Producto;
import com.tienda_L.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/listado")
    public String listado(Model model){
        var productos=productoService.getProductos(true);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        return "/producto/listado";
    }
    
    @GetMapping("/eliminar/{idProducto}")
    public String elimina(Producto producto){
        productoService.delete(producto);
        return "redirect:/producto/listado";
    }
        
    @GetMapping("/modificar/{idProducto}")
    public String modifica(Producto producto, Model model){
        producto = productoService.getProducto(producto);
        model.addAttribute("producto", producto);
        return "/Producto/modifica";
    }
}
