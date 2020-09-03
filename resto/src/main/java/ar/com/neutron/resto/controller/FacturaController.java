package ar.com.neutron.resto.controller;


import ar.com.neutron.resto.dto.Response;
import ar.com.neutron.resto.model.Factura;
import ar.com.neutron.resto.service.FacturaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin( origins = " * " ) // trabajar desde un cliente cualquiera puede enganchar a ese servicio
@RestController//
@RequestMapping( " /facturas") //devolvera la lista de facturas
public class FacturaController {

    private static final Logger LOG = LoggerFactory.getLogger(FacturaController.class); //controlar los logs
    @Autowired
    private FacturaService facturaservice;
    @GetMapping
    public ResponseEntity<Response> list() throws Exception {
            LOG.info("list");
            Response response = (Response) facturaservice.findAll();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
}
