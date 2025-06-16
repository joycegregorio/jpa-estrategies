package br.edu.ifpb.es.daw.entities.joined_subclass;

import br.edu.ifpb.es.daw.entities.single_table_per_class.Projeto;
import jakarta.persistence.*;

import java.util.Objects;

@Entity(name = "Veiculo_JS")
@Table(name = "JS_TB_VEICULO")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Veiculo", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue("V")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String construtora;

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

    public String getConstrutora() {
        return construtora;
    }

    public void setConstrutora(String construtora) {
        this.construtora = construtora;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Projeto)) return false;
        Veiculo veiculo = (Veiculo) obj;
        return id != null && id.equals(veiculo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, construtora);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", construtora='" + construtora + '\'' +
                '}';
    }
}
