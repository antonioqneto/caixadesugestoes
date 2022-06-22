package br.com.fatecararas.caixadesugestoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nome;

    // private List<Disciplina> disciplinas = new ArrayList<>();
    
    public Curso() {
    }

    public Curso(String nome) {
        this.nome = nome;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // public List<Disciplina> getDisciplinas() {
    //     return disciplinas;
    // }

    // public void setDisciplinas(List<Disciplina> disciplinas) {
    //     this.disciplinas = disciplinas;
    // }
    // @Override
    // public String toString() {
    //     return "Curso [disciplinas=" + disciplinas + ", id=" + id + ", nome=" + nome + "]";
    // }

    
}
