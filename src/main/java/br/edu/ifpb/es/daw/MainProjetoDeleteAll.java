package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.ProjetoDAO;
import br.edu.ifpb.es.daw.dao.impl.ProjetoDAOImpl;
import br.edu.ifpb.es.daw.entities.single_table_per_class.Projeto;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class MainProjetoDeleteAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			ProjetoDAO projetoDAO = new ProjetoDAOImpl(emf);

			List<Projeto> projetos = projetoDAO.getAll();

			for (Projeto p : projetos) {
				projetoDAO.delete(p.getId());
				System.out.println("Deletado: " + p);
			}

			System.out.println("Todos os projetos foram removidos!");
		}
	}
}