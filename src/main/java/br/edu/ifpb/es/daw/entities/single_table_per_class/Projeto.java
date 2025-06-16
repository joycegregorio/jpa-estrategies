package br.edu.ifpb.es.daw.entities.single_table_per_class;

import jakarta.persistence.*;

import java.util.Objects;

@Entity(name = "Projeto_STPCH")
@Table(name = "STPCH_TB_VEICULO")
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
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Projeto projeto = (Projeto) obj;
        return Objects.equals(id, projeto.id) && Objects.equals(nome, projeto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
