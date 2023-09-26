package cl.awakelab.buscandopega.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Postulacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int idPostulacion;

    @Column(name = "Fecha_Postulacion", length = 30)
    private LocalDate fechaPostulacion;

    @Column(name = "Plataforma", length = 100)
    private String plataformaPostulacion;

    @Column(name = "Empresa", length = 100)
    private String empresaPostulacion;

    @Column(name = "Cargo", length = 50)
    private String cargoPostulacion;

    @Column(name = "Link", length = 254)
    private String linkPostulacion;

    @Column(name = "Estado", length = 254)
    public Enum estadoPostulacion;

    @Column(name = "Estado", length = 254)
    private String comentariosPostulacion;

}

