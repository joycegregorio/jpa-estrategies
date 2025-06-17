package br.edu.ifpb.es.daw.entities.joined_subclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "JS_TB_Bicicleta")
@DiscriminatorValue("B")
public class Bicicleta extends VeiculoDePassageiro {

    private Integer alturaDoSelimEmCm;

    public Integer getAlturaDoSelimEmCm() {
        return alturaDoSelimEmCm;
    }

    public void setAlturaDoSelimEmCm(Integer alturaDoSelimEmCm) {
        this.alturaDoSelimEmCm = alturaDoSelimEmCm;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Bicicleta bicicleta = (Bicicleta) obj;
        return Objects.equals(alturaDoSelimEmCm, bicicleta.alturaDoSelimEmCm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), alturaDoSelimEmCm);
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "alturaDoSelimEmCm=" + alturaDoSelimEmCm +
                "} " + super.toString();
    }
}
