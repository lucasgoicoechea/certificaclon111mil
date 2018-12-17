package ar.com.agroasistencia.modelo.modeloHibernate;
// Generated 14/12/2018 07:18:12 by Hibernate Tools 4.3.1



/**
 * Lotes generated by hbm2java
 */
public class Lotes  implements java.io.Serializable {


     private Integer id;
     private AgroCampos agroCampos;
     private TiposSuelo tiposSuelo;
     private Integer nroLote;
     private Integer superficie;

    public Lotes() {
    }

    public Lotes(AgroCampos agroCampos, TiposSuelo tiposSuelo, Integer nroLote, Integer superficie) {
       this.agroCampos = agroCampos;
       this.tiposSuelo = tiposSuelo;
       this.nroLote = nroLote;
       this.superficie = superficie;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public AgroCampos getAgroCampos() {
        return this.agroCampos;
    }
    
    public void setAgroCampos(AgroCampos agroCampos) {
        this.agroCampos = agroCampos;
    }
    public TiposSuelo getTiposSuelo() {
        return this.tiposSuelo;
    }
    
    public void setTiposSuelo(TiposSuelo tiposSuelo) {
        this.tiposSuelo = tiposSuelo;
    }
    public Integer getNroLote() {
        return this.nroLote;
    }
    
    public void setNroLote(Integer nroLote) {
        this.nroLote = nroLote;
    }
    public Integer getSuperficie() {
        return this.superficie;
    }
    
    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }




}

