package br.edu.ifpb.es.daw.entities.table_per_concrete_class;


import jakarta.persistence.*;

import java.util.Objects;

@Entity(name = "Empregado_TPCC")
@Table(name = "TPCC_TB_EMPREGADO")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Empregado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Empregado empregado = (Empregado) obj;
        return Objects.equals(id, empregado.id) && Objects.equals(nome, empregado.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
