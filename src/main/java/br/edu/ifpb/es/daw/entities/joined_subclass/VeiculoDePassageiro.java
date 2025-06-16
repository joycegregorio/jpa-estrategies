package br.edu.ifpb.es.daw.entities.joined_subclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity(name = "Veiculo_JS")
@Table(name = "JS_TB_veiculo_de_passageiros")
@PrimaryKeyJoinColumn(name = "veiculo_id")
public class VeiculoDePassageiro extends Veiculo {

    private Integer numeroMaximoPassageiros;

    public Integer getNumeroMaximoPassageiros() {
        return numeroMaximoPassageiros;
    }

    public void setNumeroMaximoPassageiros(Integer numeroMaximoPassageiros) {
        this.numeroMaximoPassageiros = numeroMaximoPassageiros;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        VeiculoDePassageiro that = (VeiculoDePassageiro) obj;
        return Objects.equals(numeroMaximoPassageiros, that.numeroMaximoPassageiros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroMaximoPassageiros);
    }

    @Override
    public String toString() {
        return "VeiculoDePassageiro{" +
                "numeroMaximoPassageiros=" + numeroMaximoPassageiros +
                '}' + super.toString();
    }
}
