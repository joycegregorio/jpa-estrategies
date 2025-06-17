package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.ProjetoDAO;
import br.edu.ifpb.es.daw.dao.impl.ProjetoDAOImpl;
import br.edu.ifpb.es.daw.entities.single_table_per_class.ProjetoGrande;
import br.edu.ifpb.es.daw.entities.single_table_per_class.ProjetoPequeno;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDate;

public class MainProjetoSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			ProjetoDAO projetoDAO = new ProjetoDAOImpl(emf);

			ProjetoPequeno pequeno = new ProjetoPequeno();
			pequeno.setNome("Sistema de Biblioteca");
			pequeno.setPrazoMazimoConclusao(LocalDate.of(2023, 12, 31));

			ProjetoGrande grande = new ProjetoGrande();
			grande.setNome("Plataforma de E-commerce");
			grande.setOrcamento(new BigDecimal("500000.00"));

			projetoDAO.save(pequeno);
			projetoDAO.save(grande);

			System.out.println("Projetos salvos com sucesso!");
		}
	}
}