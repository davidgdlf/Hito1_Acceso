package es.dataanalyzer.repositorio;

import es.dataanalyzer.model.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DatosRepository extends JpaRepository<Datos, Long> {
    // Método para encontrar todos los datos
    List<Datos> findAll();

    @Query("SELECT d.sexo, COUNT(*) AS total FROM Datos d GROUP BY d.sexo ORDER BY total DESC")
    List<Object[]> ejecutarConsultaDos();

    // Consulta 3
    @Query("SELECT d.año, COUNT(*) AS total FROM Datos d GROUP BY d.año ORDER BY total DESC")
    List<Object[]> ejecutarConsultaTres();

    // Consulta 4
    @Query("SELECT d.sexo, AVG(d.total) AS valorPromedio FROM Datos d GROUP BY d.sexo")
    List<Object[]> ejecutarConsultaCuatro();

    // Consulta 5
    @Query("SELECT d.año, AVG(d.total) AS valorPromedio FROM Datos d GROUP BY d.año")
    List<Object[]> ejecutarConsultaCinco();

    // Consulta 6
    @Query("SELECT d.sexo, d.año, COUNT(*) AS total FROM Datos d GROUP BY d.sexo, d.año")
    List<Object[]> ejecutarConsultaSeis();

    // Consulta 7
    @Query("SELECT d.sexo, COUNT(*) AS total FROM Datos d GROUP BY d.sexo")
    List<Object[]> ejecutarConsultaSiete();

    // Consulta 8
        @Query("SELECT d.año, COUNT(*) AS total_Hombres FROM Datos d WHERE d.sexo = 'Hombres' GROUP BY d.año ORDER BY total_Hombres ASC LIMIT 1")
    List<Object[]> ejecutarConsultaOcho();

    @Query("SELECT d.año, COUNT(*) AS total_Mujeres FROM Datos d WHERE d.sexo = 'Mujeres' GROUP BY d.año ORDER BY total_Mujeres DESC LIMIT 1")
    List<Object[]> ejecutarConsultaNueve();

    @Query("SELECT d.año, COUNT(*) AS total_Hombres FROM Datos d WHERE d.sexo = 'Hombres' GROUP BY d.año ORDER BY total_Hombres ASC LIMIT 1")
    List<Object[]> ejecutarConsultaDiez();


}
