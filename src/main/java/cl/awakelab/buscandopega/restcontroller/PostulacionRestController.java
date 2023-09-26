package cl.awakelab.buscandopega.restcontroller;

import cl.awakelab.buscandopega.entity.Postulacion;
import cl.awakelab.buscandopega.service.IPostulacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class PostulacionRestController {
    @Autowired
    IPostulacionService objClienteService;

    @GetMapping
    public List<Postulacion> listarClientes(){
        return objClienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public Postulacion listarClienteId(@PathVariable int id){
        return objClienteService.listarClienteId(id);
    }

    @PostMapping
    public Postulacion crearCliente(@RequestBody Postulacion postulacionNuevo){
        return objClienteService.crearCliente(postulacionNuevo);
    }

    @PutMapping("{id}")
    public Postulacion actualizarCliente(@PathVariable int id, @RequestBody Postulacion postulacion){
        return objClienteService.actualizarCliente(id, postulacion);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable int id){
        objClienteService.eliminarCliente(id);
    }
}
