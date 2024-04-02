package com.tienda_L.service;

import com.tienda_L.domain.Item;
import java.util.ArrayList;
import java.util.List;

public interface ItemService {
    
    List<Item> listaItems = new ArrayList<>();
    
    public List<Item> gets();
    
    public Item get(Item item);
    
    public void delete(Item item);
    
    public void save(Item item);
    
    public void update(Item item);
    
    public void facturar();
}
