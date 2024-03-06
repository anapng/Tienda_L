package com.tienda_L.service;

import com.tienda_L.dao.CategoriaDao;
import com.tienda_L.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public interface CategoriaService { //SEMANA 6

    //Se obtiene un arraylist de objetos tipo Categoria
    public List<Categoria>getCategorias(boolean activos);
           
    //Se obtiene un objeto categoria a partir del
    //idCategoria que nos pasan
    public Categoria getCategoria(Categoria categoria);
    
    //Se obtiene un objeto de la tabla categoria 
    //a partir del idCategoria que nos pasan
    public  void delete(Categoria categoria);
    
    //Si idCategoria tiene un valor se actualiza 
    //Si idCategoria NO tiene un valor no se actualiza
    public void save(Categoria categoria);
    
    
}
