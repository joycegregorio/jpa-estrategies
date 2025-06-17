package br.edu.ifpb.es.daw.entities.single_table_per_class;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@DiscriminatorValue("PEQUENO")
public class ProjetoPequeno extends Projeto{

    private LocalDate prazoMazimoConclusao;

    public LocalDate getPrazoMazimoConclusao() {
        return prazoMazimoConclusao;
    }

    public void setPrazoMazimoConclusao(LocalDate prazoMazimoConclusao) {
        this.prazoMazimoConclusao = prazoMazimoConclusao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ProjetoPequeno that = (ProjetoPequeno) obj;
        return Objects.equals(prazoMazimoConclusao, that.prazoMazimoConclusao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), prazoMazimoConclusao);
    }

    @Override
    public String toString() {
        return "ProjetoPequeno{" +
                "prazoMazimoConclusao=" + prazoMazimoConclusao +
                '}' + super.toString();
    }
}
