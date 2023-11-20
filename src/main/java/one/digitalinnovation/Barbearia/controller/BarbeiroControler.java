package one.digitalinnovation.Barbearia.controller;

import one.digitalinnovation.Barbearia.model.Barbeiro;
import one.digitalinnovation.Barbearia.service.BarbeiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/barbeiro")
public class BarbeiroControler {
@Autowired
BarbeiroService barbeiroService;

@PostMapping
public void salvarBarbeiro(@RequestBody Barbeiro barbeiro){
    barbeiroService.salvarBarbeiro(barbeiro);}


@GetMapping("/{id}")
public Optional<Barbeiro> buscarBarbeiro(@PathVariable Long id ){
    return barbeiroService.buscarBarbeiros(id);
    }


@GetMapping
public List<Barbeiro> buscarTodosBarbeiros(){
    return barbeiroService.todosBarbeiros();
}

@DeleteMapping("/{id}")
public void deletarBarbeiro(@PathVariable Long id ){
    barbeiroService.deletarBarbeiro(id);

    }

}







