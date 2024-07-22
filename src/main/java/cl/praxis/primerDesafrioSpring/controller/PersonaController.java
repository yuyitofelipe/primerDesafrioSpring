package cl.praxis.primerDesafrioSpring.controller;
import cl.praxis.primerDesafrioSpring.model.Persona;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PersonaController {

    @GetMapping("/")
    public String index(Model model) {
        Persona persona = new Persona("Felipe", "Barriga", 30);
        model.addAttribute("persona", persona);
        return "index";
    }

    @GetMapping("/api/persona")
    public Persona getPersona() {
        return new Persona("Felipe", "Barriga", 30);
    }
}

