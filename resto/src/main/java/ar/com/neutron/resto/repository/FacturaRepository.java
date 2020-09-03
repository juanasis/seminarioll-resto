package ar.com.neutron.resto.repository;
import ar.com.neutron.resto.model.Factura;

import org.springframework.data.jpa.repository.JpaRepository;



public interface FacturaRepository extends JpaRepository<Factura, Integer> {
}