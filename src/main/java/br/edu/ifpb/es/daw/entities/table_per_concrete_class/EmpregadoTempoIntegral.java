package br.edu.ifpb.es.daw.entities.table_per_concrete_class;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Objects;

@Entity(name = "EmpregadoTempoIntegral_TPCC")
@Table(name = "TPCC_TB_EMPREGADO_TEMPO_INTEGRAL")
public class EmpregadoTempoIntegral extends Empregado{

    private BigDecimal salario;

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        EmpregadoTempoIntegral that = (EmpregadoTempoIntegral) obj;
        return Objects.equals(salario, that.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salario);
    }

    @Override
    public String toString() {
        return "EmpregadoTempoIntegral{" +
                "salario=" + salario +
                '}' + super.toString();
    }
}
