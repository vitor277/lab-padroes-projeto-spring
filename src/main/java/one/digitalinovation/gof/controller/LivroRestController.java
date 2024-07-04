package one.digitalinovation.gof.controller;


import one.digitalinovation.gof.model.Livro;
import one.digitalinovation.gof.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;


@RestController
@RequestMapping("livros")
public class LivroRestController {
    @Autowired
    private LivroService livroService;

    @GetMapping
    ResponseEntity<Iterable<Livro>> buscarTodos(){
        return ResponseEntity.ok(livroService.buscarTodos());
    }
    @GetMapping("/{id}")
    ResponseEntity<Livro> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(livroService.buscarPorId(id));
    }

    @PostMapping
    ResponseEntity<Livro> inserir(@RequestBody Livro livro){
        livroService.inserir(livro);
        return ResponseEntity.ok(livro);
    }
    @PutMapping("/{id}")
    ResponseEntity<Livro> atualizar(@PathVariable Long id, @RequestBody Livro livro){
        livroService.atualizar(id, livro);
        return ResponseEntity.ok(livro);
    }
    @DeleteMapping("/{id}")
    ResponseEntity<Livro> deletar(@PathVariable Long id){
        livroService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
