package ar.com.neutron.resto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"}) //para relaciones de 1  a muchos,ignorar algunas propiedades
public class Factura implements Serializable {
    private Integer id;
    private Integer folio;
    private String descripcion;
    private String observacion;
    private Date fecha;
    private Integer cliente_id = 0;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return id;
    }

    @Basic
    @Column(name = "folio")
    public Integer getFolio(){
        return folio;
    }
    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }
    @Basic
    @Column(name = "observacion")
    public String getObservacion() {
        return observacion;
    }
    @Basic
    @Column(name = "fecha")
    public Date getFecha() {
        return fecha;
    }
    @Basic
    @Column(name = "clienteId")
    public Integer getClienteId() {
        return cliente_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return Objects.equals(id, factura.id) &&
                Objects.equals(folio, factura.folio) &&
                Objects.equals(descripcion, factura.descripcion) &&
                Objects.equals(observacion, factura.observacion) &&
                Objects.equals(fecha, factura.fecha) &&
                Objects.equals(cliente_id, factura.cliente_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, folio, descripcion, observacion, fecha, cliente_id);
    }
}
