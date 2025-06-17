package br.edu.ifpb.es.daw.entities.joined_subclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "JS_TB_carro")
@DiscriminatorValue("R")
public class Carro extends VeiculoDePassageiro
{
    private Integer numeroDePortas;

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Carro carro = (Carro) obj;
        return Objects.equals(numeroDePortas, carro.numeroDePortas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroDePortas);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroDePortas=" + numeroDePortas+
                "} " + super.toString();
    }

}
