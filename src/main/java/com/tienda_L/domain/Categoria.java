package com.tienda_L.domain;
import java.io.Serializable;
import lombok.Data;

@Data
/*@Entity
@Table(name= "categoria")*/

public class Categoria implements Serializable{
    private static final long serialVersionUID = 1L;
    
    /*@Id
    @GeneratedValue(Strategy=GenarationType.IDENTITY)
    @Column(name="id_categoria")*/
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
}
