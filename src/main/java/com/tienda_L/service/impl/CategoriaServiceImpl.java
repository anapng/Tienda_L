package com.tienda_L.service.impl;

import com.tienda_L.dao.CategoriaDao;
import com.tienda_L.domain.Categoria;
import com.tienda_L.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategorias(boolean activos){
    return categoriaDao.findAll();
    }

    
}
