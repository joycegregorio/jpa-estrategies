package br.edu.ifpb.es.daw.entities.joined_subclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "JS_TB_veiculo_de_transporte")
@DiscriminatorValue("T")
public class VeiculoDeTransporte extends Veiculo {

    private Integer cargaMaximaKg;

    public Integer getCargaMaximaKg() {
        return cargaMaximaKg;
    }

    public void setCargaMaximaKg(Integer cargaMaximaKg) {
        this.cargaMaximaKg = cargaMaximaKg;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        VeiculoDeTransporte that = (VeiculoDeTransporte) obj;
        return Objects.equals(cargaMaximaKg, that.cargaMaximaKg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargaMaximaKg);
    }

    @Override
    public String toString() {
        return "VeiculoDeTransporte{" +
                "cargaMaximaKg=" + cargaMaximaKg +
                '}' + super.toString();
    }
}
