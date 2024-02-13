package com.tienda_L.service;

import com.tienda_L.dao.CategoriaDao;
import com.tienda_L.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public interface CategoriaService {

    
    public List<Categoria>getCategorias(boolean activos);
           
    
}
