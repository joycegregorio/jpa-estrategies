package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.EmpregadoDAO;
import br.edu.ifpb.es.daw.dao.impl.EmpregadoDAOImpl;
import br.edu.ifpb.es.daw.entities.table_per_concrete_class.Empregado;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class MainEmpregadoDeleteAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			EmpregadoDAO empregadoDAO = new EmpregadoDAOImpl(emf);

			List<Empregado> empregados = empregadoDAO.getAll();

			for (Empregado emp : empregados) {
				empregadoDAO.delete(emp.getId());
				System.out.println("Deletado: " + emp);
			}

			System.out.println("Todos os empregados foram removidos!");
		}
	}
}