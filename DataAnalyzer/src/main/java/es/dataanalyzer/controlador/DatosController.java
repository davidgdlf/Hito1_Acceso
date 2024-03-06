package es.dataanalyzer.controlador;

import es.dataanalyzer.model.Datos;
import es.dataanalyzer.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DatosController {

    private final DatosService datosService;

    @Autowired
    public DatosController(DatosService datosService) {
        this.datosService = datosService;
    }

    @GetMapping("/consulta1")
    public String obtenerTodosLosDatos(Model model) {
        List<Datos> datos = datosService.obtenerTodosLosDatos();
        model.addAttribute("datos", datos);
        return "consulta1";
    }

    @GetMapping("/consulta2")
    public String mostrarConsultaDos(Model model) {
        List<Object[]> resultados =
                datosService.ejecutarConsultaDos();
        model.addAttribute("resultados", resultados);
        return "consulta2";
    }

    @GetMapping("/consulta3")

    public String mostrarConsultaTres(Model model) {
        List<Object[]> resultados =
                datosService.ejecutarConsultaTres();
        model.addAttribute("resultados", resultados);
        return "consulta3";
    }

    @GetMapping("/consulta4")
    public String mostrarConsultaCuatro(Model model) {
        List<Object[]> resultados =
                datosService.ejecutarConsultaCuatro();
        model.addAttribute("resultados", resultados);
        return "consulta4";
    }

    // Endpoint para mostrar la consulta 5
    @GetMapping("/consulta5")
    public String mostrarConsultaCinco(Model model) {
// Ejecutar la consulta en la base de datos
        List<Object[]> resultados =
                datosService.ejecutarConsultaCinco();

// Pasar los resultados a la plantilla Thymeleaf
        model.addAttribute("resultados", resultados);

// Renderizar la vista correspondiente
        return "consulta5";
    }

    // Endpoint para mostrar la consulta 6
    @GetMapping("/consulta6")
    public String mostrarConsultaSeis(Model model) {
// Ejecutar la consulta en la base de datos
        List<Object[]> resultados =
                datosService.ejecutarConsultaSeis();

// Pasar los resultados a la plantilla Thymeleaf
        model.addAttribute("resultados", resultados);

// Renderizar la vista correspondiente
        return "consulta6";
    }

    // Endpoint para mostrar la consulta 7
    @GetMapping("/consulta7")
    public String mostrarConsultaSiete(Model model) {
// Ejecutar la consulta en la base de datos
        List<Object[]> resultados =
                datosService.ejecutarConsultaSiete();

// Pasar los resultados a la plantilla Thymeleaf
        model.addAttribute("resultados", resultados);

// Renderizar la vista correspondiente
        return "consulta7";
    }

    // Endpoint para mostrar la consulta 8
    @GetMapping("/consulta8")
    public String mostrarConsultaOcho(Model model) {
// Ejecutar la consulta en la base de datos
        List<Object[]> resultados =
                datosService.ejecutarConsultaOcho();

// Pasar los resultados a la plantilla Thymeleaf
        model.addAttribute("resultados", resultados);

// Renderizar la vista correspondiente
        return "consulta8";
    }

    // Endpoint para mostrar la consulta 9
    @GetMapping("/consulta9")
    public String mostrarConsultaNueve(Model model) {
// Ejecutar la consulta en la base de datos
        List<Object[]> resultados =
                datosService.ejecutarConsultaNueve();

// Pasar los resultados a la plantilla Thymeleaf
        model.addAttribute("resultados", resultados);

// Renderizar la vista correspondiente
        return "consulta9";
    }

    // Endpoint para mostrar la consulta 10
    @GetMapping("/consulta10")
    public String mostrarConsultaDiez(Model model) {

// Ejecutar la consulta en la base de datos
        List<Object[]> resultados =
                datosService.ejecutarConsultaDiez();

// Pasar los resultados a la plantilla Thymeleaf
        model.addAttribute("resultados", resultados);

// Renderizar la vista correspondiente
        return "consulta10";
    }
}