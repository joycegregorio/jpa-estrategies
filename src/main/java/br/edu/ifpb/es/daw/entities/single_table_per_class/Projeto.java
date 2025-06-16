package br.edu.ifpb.es.daw.entities.single_table_per_class;

import jakarta.persistence.*;

import java.util.Objects;

@Entity(name = "Projeto_STPCH")
@Table(name = "STPCH_TB_PROJETO")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Projeto", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue("P")
public class Projeto {
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
        if (!(obj instanceof Projeto)) return false;
        Projeto projeto = (Projeto) obj;
        return id != null && id.equals(projeto.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
