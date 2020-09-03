package ar.com.neutron.resto.service;

import ar.com.neutron.resto.model.Factura;
import ar.com.neutron.resto.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;

    public List<Factura> findAll(){
        List<Factura> facturaList = facturaRepository.findAll();
        return facturaList;
    }
    public Factura findOne(Integer i){
        Factura factura = facturaRepository.getOne(i);
        return factura;
    }
    public String delete(Factura factura){
        facturaRepository.delete(factura);
        return  "Factura borrada con exito";
    }
    public String save(Factura factura){
        facturaRepository.save(factura);
        return "Factura guardada correctamente";
    }
    public List<Factura> getFacturaById(Iterable<Integer> id){
        return facturaRepository.findAllById(id);
    }
}
