package cl.awakelab.buscandopega.repository;

import cl.awakelab.buscandopega.entity.Postulacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostulacionRepository extends JpaRepository<Postulacion, Integer> {
}
