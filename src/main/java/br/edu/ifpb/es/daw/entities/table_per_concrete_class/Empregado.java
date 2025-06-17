package br.edu.ifpb.es.daw.entities.table_per_concrete_class;

import jakarta.persistence.*;

@Entity(name = "Empregado_TPCC")
@Table(name = "TPCC_TB_EMPREGADO")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Empregado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "EMPREGADO_SEQ", sequenceName = "EMPREGADO_SEQ", allocationSize = 1)
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
        if (!(obj instanceof Empregado)) return false;
        Empregado empregado = (Empregado) obj;
        return id != null && id.equals(empregado.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
