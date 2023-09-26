package cl.awakelab.buscandopega.service;

import cl.awakelab.buscandopega.entity.Postulacion;

import java.util.List;

public interface IPostulacionService {

    Postulacion crearCliente(Postulacion postulacion);

    List<Postulacion> listarPostulaciones();

    Postulacion listarClienteId(int id);

    Postulacion actualizarCliente(int id, Postulacion postulacionActualizado);

    void eliminarCliente(int id);

}
