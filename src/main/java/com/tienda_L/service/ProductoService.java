/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda_L.service;

import com.tienda_L.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Laboratorios
 */
public interface ProductoService {
    // Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);
    
    //Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    public List<Producto> metodoNativo (double precioInf, double precioSup) ;
    
    public List<Producto> metodoJPQL (double precioInf, double precioSup);
    
    public List<Producto> obtenerProductosOrdenadosAlfabeticamenteAscendente();
    
    public List<Producto> obtenerProductosOrdenadosAlfabeticamenteDescendente();
}
