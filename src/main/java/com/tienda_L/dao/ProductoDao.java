package com.tienda_L.dao;

import com.tienda_L.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto, Long>{
    
}
