package br.edu.ifpb.es.daw.entities.joined_subclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity(name = "Veiculo_JS")
@Table(name = "JS_TB_veiculo_de_transporte")
@PrimaryKeyJoinColumn(name = "veiculo_id")
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
