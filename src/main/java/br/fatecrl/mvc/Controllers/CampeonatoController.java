package br.fatecrl.mvc.Controllers;

import br.fatecrl.mvc.Models.Campeonato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/campeonato")
public class CampeonatoController {

    private static final List<Campeonato> campeonato = new ArrayList<Campeonato>();

    public CampeonatoController(){

        campeonato.add(new Campeonato("Santos", 67, 93));
        campeonato.add(new Campeonato("Atlético", 63, 90));
        campeonato.add(new Campeonato("Grêmio", 63, 84));
        campeonato.add(new Campeonato("Vasco", 60, 80));
        campeonato.add(new Campeonato("Cruzeiro", 55, 77));
    }

    @GetMapping
    public String getCampeonato(Model model){

        model.addAttribute("campeonato",campeonato);
        return "campeonato";
    }

}