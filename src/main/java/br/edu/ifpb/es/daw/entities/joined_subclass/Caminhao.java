package br.edu.ifpb.es.daw.entities.joined_subclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Objects;

@Entity
@PrimaryKeyJoinColumn(name = "veiculo_transporte_id")
@DiscriminatorValue("A")
public class Caminhao extends VeiculoDeTransporte {

    private Integer numeroDeVagoes;

    public Integer getNumeroDeVagoes() {
        return numeroDeVagoes;
    }

    public void setNumeroDeVagoes(Integer numeroDeVagoes) {
        this.numeroDeVagoes = numeroDeVagoes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Caminhao caminhao = (Caminhao) obj;
        return Objects.equals(numeroDeVagoes, caminhao.numeroDeVagoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroDeVagoes);
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "numeroDeVagoes=" + numeroDeVagoes +
                '}' + super.toString();
    }
}
