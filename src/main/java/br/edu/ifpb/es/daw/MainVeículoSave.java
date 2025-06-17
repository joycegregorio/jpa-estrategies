package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.VeiculoDAO;
import br.edu.ifpb.es.daw.dao.impl.VeiculoDAOImpl;
import br.edu.ifpb.es.daw.entities.joined_subclass.Bicicleta;
import br.edu.ifpb.es.daw.entities.joined_subclass.Caminhao;
import br.edu.ifpb.es.daw.entities.joined_subclass.Carro;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainVeículoSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			VeiculoDAO veiculoDAO = new VeiculoDAOImpl(emf);

			Bicicleta bicicleta = new Bicicleta();
			bicicleta.setNome("Bike Mountain");
			bicicleta.setConstrutora("Caloi");
			bicicleta.setNumeroMaximoPassageiros(1);
			bicicleta.setAlturaDoSelimEmCm(90);

			Carro carro = new Carro();
			carro.setNome("Fusca");
			carro.setConstrutora("Volkswagen");
			carro.setNumeroMaximoPassageiros(4);
			carro.setNumeroDePortas(2);

			Caminhao caminhao = new Caminhao();
			caminhao.setNome("Volvo FH");
			caminhao.setConstrutora("Volvo");
			caminhao.setCargaMaximaKg(50000);
			caminhao.setNumeroDeVagoes(3);

			veiculoDAO.save(bicicleta);
			veiculoDAO.save(carro);
			veiculoDAO.save(caminhao);

			System.out.println("Veículos salvos com sucesso!");
		}
	}
}