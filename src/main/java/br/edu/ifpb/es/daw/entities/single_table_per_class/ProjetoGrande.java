package br.edu.ifpb.es.daw.entities.single_table_per_class;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.util.Objects;

@Entity(name = "ProjetoGrande_STPCH")
@DiscriminatorValue("PG")
public class ProjetoGrande extends Projeto{

    private BigDecimal orcamento;

    public BigDecimal getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(BigDecimal orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ProjetoGrande that = (ProjetoGrande) obj;
        return Objects.equals(orcamento, that.orcamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orcamento);
    }

    @Override
    public String toString() {
        return "ProjetoGrande{" +
                "orcamento=" + orcamento +
                '}' + super.toString();
    }
}
