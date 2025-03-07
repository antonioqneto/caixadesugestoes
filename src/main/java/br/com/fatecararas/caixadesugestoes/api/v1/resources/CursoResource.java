package br.com.fatecararas.caixadesugestoes.api.v1.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.fatecararas.caixadesugestoes.model.Curso;
import br.com.fatecararas.caixadesugestoes.repositories.CursoRepository;
import br.com.fatecararas.caixadesugestoes.services.CursoService;

@RestController
@RequestMapping("/api/v1/cursos")
public class CursoResource {

    @Autowired
    private CursoService service;

    @GetMapping("/todos")
    public ResponseEntity<List<Curso>> getAll() {
        List<Curso> cursos = service.buscarTodos();
        return ResponseEntity.ok().body(cursos);        
    }

    @PostMapping("/curso")
    public ResponseEntity<Curso> criar(@RequestBody Curso curso) {
        Curso c = service.salvar(curso);

        URI uri = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(c.getId())
        .toUri();

        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/curso/{id}")
    public ResponseEntity<Void> remover(@PathVariable(name = "id") Integer id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }
    
}
