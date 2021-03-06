package ar.com.agroasistencia.modelo.modeloHibernate;
// Generated 14/12/2018 07:18:12 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TiposSuelo generated by hbm2java
 */
public class TiposSuelo  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private Set loteses = new HashSet(0);

    public TiposSuelo() {
    }

    public TiposSuelo(String descripcion, Set loteses) {
       this.descripcion = descripcion;
       this.loteses = loteses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getLoteses() {
        return this.loteses;
    }
    
    public void setLoteses(Set loteses) {
        this.loteses = loteses;
    }




}


