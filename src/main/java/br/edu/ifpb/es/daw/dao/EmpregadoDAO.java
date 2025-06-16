package br.edu.ifpb.es.daw.dao;

import br.edu.ifpb.es.daw.entities.table_per_concrete_class.Empregado;

import java.util.List;

public interface EmpregadoDAO extends DAO<Empregado, Long> {

    List<Empregado> findByNome(String nome);
}
