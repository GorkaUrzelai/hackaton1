package com.turismo.springbootapplicationrun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {

    String error;

    @GetMapping({"/"})
    public String index() {
        return "index";
    }

    @GetMapping({"/planificar"})
    public String planificar() {
        return "planificar";
    }

    @GetMapping({"/planificar/1"})
    public String datos1(Model model) {
        model.addAttribute("datos", new Datos());
        return "datos_personales";
    }

    @GetMapping({"/inicio", "/home"})
    public String inicio() {
        return "inicio";
    }


    @GetMapping({"/contacto"})
    public String contacto() {
        return "contacto";
    }

    /*@PostMapping("/hacerBusqueda")
    public RedirectView hacerBusqueda(Model model,
                                      @ModelAttribute("datos") Datos datos,
                                      BindingResult bindingResult) {

        List<Actividad> actividades = new ArrayList<>();
        cargarActividades(actividades);

        model.addAttribute("actividades", actividades);
        //return "/mostrarActividades";
        return new RedirectView("/lista/"+actividades, true);
    }*/

    @GetMapping({"/mostrarActividades"})
    public String mostrarActividades(Model model) {
        model.addAttribute("actividades", cargarActividades());
        return "mostrarActividades";
    }
    @GetMapping({"/categoria/deportes"})
    public String deportes() {
        return "deportes";
    }
    @GetMapping({"/vistaRutaDone"})
    public String vistaRutaDone() {
        return "vistaRutaDone";
    }
    @GetMapping({"/vistaRutaNotDone"})
    public String vistaRutaNotDone() {
        return "vistaRutaNotDone";
    }

    private List<Actividad> cargarActividades() {
        List<Actividad> actividades = new ArrayList<>();
        actividades.add(new Actividad("Flysh de Zumaia", "/images/flish.jpg","Costa", 20, 2, "Zumaia"));
        actividades.add(new Actividad("Carting Olabarria", "/images/karting.jpg","Deporte", 25, 1, "Olabarria"));
        actividades.add(new Actividad("Gaztelugatxe", "/images/gaztelugatxe.jpg","Costa", 5, 1, "Bermeo"));
        actividades.add(new Actividad("Ermita de la Antigua", "/images/ermitaa.jpg","Iglesia", 5, 1, "Bermeo"));
        actividades.add(new Actividad("Santuario de Arantzazu", "/images/arantzazu.jpeg","Edificios", 5, 1, "Bermeo"));
        actividades.add(new Actividad("Santuario de Loiola", "/images/santuariol.jpg","Edificios", 5, 1, "Bermeo"));
        actividades.add(new Actividad("Monte Jaizkibel", "/images/jaizkibel1.jpg","Edificios", 5, 1, "Bermeo"));
        actividades.add(new Actividad("Pueblo Ataun", "/images/ataun.jpeg","Naturaleza", 5, 1, "Bermeo"));

        return actividades;
    }

}
