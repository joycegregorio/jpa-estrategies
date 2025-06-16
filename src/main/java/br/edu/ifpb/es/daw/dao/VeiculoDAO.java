package br.edu.ifpb.es.daw.dao;

import br.edu.ifpb.es.daw.entities.joined_subclass.Veiculo;
import java.util.List;

public interface VeiculoDAO extends DAO<Veiculo, Long> {

    List<Veiculo> findByConstrutora(String construtora);
}