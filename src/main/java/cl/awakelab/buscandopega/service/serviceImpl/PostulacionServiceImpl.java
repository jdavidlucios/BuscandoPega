package cl.awakelab.buscandopega.service.serviceImpl;

import cl.awakelab.buscandopega.entity.Postulacion;
import cl.awakelab.buscandopega.repository.IPostulacionRepository;
import cl.awakelab.buscandopega.service.IPostulacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("clienteServiceImpl")
public class PostulacionServiceImpl implements IPostulacionService {

    @Autowired
    IPostulacionRepository objClienteRepo;

    @Override
    public Postulacion crearCliente(Postulacion postulacionCreado) {
        Postulacion nuevoPostulacion = new Postulacion();
        nuevoPostulacion = objClienteRepo.save(postulacionCreado);
        return nuevoPostulacion;
    }

    @Override
    public List<Postulacion> listarClientes() {
        List<Postulacion> listarPostulacions = new ArrayList<>();
        listarPostulacions = objClienteRepo.findAll();
        return listarPostulacions;
    }

    @Override
    public Postulacion listarClienteId(int id) {
        return objClienteRepo.findById(id).orElse(null);
    }

    @Override
    public Postulacion actualizarCliente(int id, Postulacion postulacionActualizado) {
        Postulacion postulacionParaActualizar = objClienteRepo.findById(id).orElse(null);
        postulacionParaActualizar.setNombreCliente(postulacionActualizado.getNombreCliente());
        postulacionParaActualizar.setApellidoCliente(postulacionActualizado.getApellidoCliente());
        postulacionParaActualizar.setEmailCliente(postulacionActualizado.getEmailCliente());
        return objClienteRepo.save(postulacionParaActualizar);
    }

    @Override
    public void eliminarCliente(int id) {
        objClienteRepo.deleteById(id);
    }

}
