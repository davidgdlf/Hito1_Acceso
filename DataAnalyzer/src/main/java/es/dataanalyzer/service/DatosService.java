package es.dataanalyzer.service;

import es.dataanalyzer.model.Datos;
import es.dataanalyzer.repositorio.DatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DatosService {

    private final DatosRepository datosRepository;

    @Autowired
    public DatosService(DatosRepository datosRepository) {
        this.datosRepository = datosRepository;
    }

    // Método para obtener todos los profesionales sanitarios
    public List<Datos> obtenerTodosLosDatos() {
        return datosRepository.findAll();
    }

    // Método para ejecutar la consulta 2
    public List<Object[]> ejecutarConsultaDos() {
        return datosRepository.ejecutarConsultaDos();
    }

    // Método para ejecutar la consulta 3
    public List<Object[]> ejecutarConsultaTres() {
        return datosRepository.ejecutarConsultaTres();
    }

    // Método para ejecutar la consulta 4
    public List<Object[]> ejecutarConsultaCuatro() {
        return datosRepository.ejecutarConsultaCuatro();
    }

    // Método para ejecutar la consulta 5
    public List<Object[]> ejecutarConsultaCinco() {
        return datosRepository.ejecutarConsultaCinco();
    }

    // Método para ejecutar la consulta 6
    public List<Object[]> ejecutarConsultaSeis() {
        return datosRepository.ejecutarConsultaSeis();
    }

    // Método para ejecutar la consulta 7
    public List<Object[]> ejecutarConsultaSiete() {
        return datosRepository.ejecutarConsultaSiete();
    }

    // Método para ejecutar la consulta 8
    public List<Object[]> ejecutarConsultaOcho() {
        return datosRepository.ejecutarConsultaOcho();
    }

    // Método para ejecutar la consulta 9
    public List<Object[]> ejecutarConsultaNueve() {
        return datosRepository.ejecutarConsultaNueve();
    }

    // Método para ejecutar la consulta 10
    public List<Object[]> ejecutarConsultaDiez() {
        return datosRepository.ejecutarConsultaDiez();
    }
}
