package com.tienda_L.service;

import com.tienda_L.dao.ProductoDao;
import com.tienda_L.domain.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public interface ProductoService { //SEMANA 6

    //Se obtiene un arraylist de objetos tipo Producto
    public List<Producto>getProductos(boolean activos);
           
    //Se obtiene un objeto categoria a partir del
    //idProducto que nos pasan
    public Producto getProducto(Producto categoria);
    
    //Se obtiene un objeto de la tabla categoria 
    //a partir del idProducto que nos pasan
    public  void delete(Producto categoria);
    
    //Si idProducto tiene un valor se actualiza 
    //Si idProducto NO tiene un valor no se actualiza
    public void save(Producto categoria);
    
    
}
