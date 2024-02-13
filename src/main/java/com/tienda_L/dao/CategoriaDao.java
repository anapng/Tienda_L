package com.tienda_L.dao;

import com.tienda_L.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria, Long>{
    
}
