package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.EmpregadoDAO;
import br.edu.ifpb.es.daw.dao.impl.EmpregadoDAOImpl;
import br.edu.ifpb.es.daw.entities.table_per_concrete_class.EmpregadoTempoIntegral;
import br.edu.ifpb.es.daw.entities.table_per_concrete_class.EmpregadoTempoParcial;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.math.BigDecimal;

public class MainEmpregadoSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {

			EmpregadoDAO empregadoDAO = new EmpregadoDAOImpl(emf);

			EmpregadoTempoIntegral empIntegral = new EmpregadoTempoIntegral();
			empIntegral.setNome("Carlos Oliveira");
			empIntegral.setSalario(new BigDecimal("7500.00"));

			EmpregadoTempoParcial empParcial = new EmpregadoTempoParcial();
			empParcial.setNome("Ana Santos");
			empParcial.setValorHora(new BigDecimal("45.50"));

			empregadoDAO.save(empIntegral);
			empregadoDAO.save(empParcial);

			System.out.println("Empregados salvos com sucesso!");
		}
	}
}