package br.edu.ifpb.es.daw.entities.table_per_concrete_class;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "TPCC_TB_EMPREGADO_TEMPO_PARCIAL")
public class EmpregadoTempoParcial extends Empregado{

    private BigDecimal valorHora;

    public BigDecimal getValorHora() {
        return valorHora;
    }

    public void setValorHora(BigDecimal valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        EmpregadoTempoParcial that = (EmpregadoTempoParcial) obj;
        return Objects.equals(valorHora, that.valorHora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), valorHora);
    }

    @Override
    public String toString() {
        return "EmpregadoTempoParcial{" +
                "valorHora=" + valorHora +
                '}' + super.toString();
    }
}
