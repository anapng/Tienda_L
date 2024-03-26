package com.tienda_L.service;

import com.tienda_L.domain.Categoria;
import java.util.List;
import jakarta.mail.MessagingException;

public interface CorreoService {

    public void enviarCorreoHtml(
            String para, 
            String asunto, 
            String contenidoHtml) 
            throws MessagingException;
}