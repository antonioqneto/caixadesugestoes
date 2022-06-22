package br.com.fatecararas.caixadesugestoes.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecararas.caixadesugestoes.model.Curso;
import br.com.fatecararas.caixadesugestoes.repositories.CursoRepository;

@Service
public class CursoService {
    
    @Autowired
    private CursoRepository repository;

    public List<Curso> buscarTodos() {
        List<Curso> cursos = new ArrayList<>();
        cursos = repository.findAll();
        return cursos;
    }

    public Curso salvar(Curso curso) {
        return repository.save(curso);
    }    

    public void salvarTodos(Iterable<Curso> cursos) {
        repository.saveAll(cursos);
    }

}
