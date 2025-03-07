package br.com.fatecararas.caixadesugestoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    
    public Disciplina(String nome) {
        this.nome = nome;
    }


    public Disciplina() {
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


    @Override
    public String toString() {
        return "Disciplina [id=" + id + ", nome=" + nome + "]";
    }
    
}
