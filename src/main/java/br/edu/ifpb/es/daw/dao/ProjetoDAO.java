package br.edu.ifpb.es.daw.dao;

import br.edu.ifpb.es.daw.entities.single_table_per_class.Projeto;

import java.util.List;

public interface ProjetoDAO extends DAO<Projeto , Long> {

    List<Projeto> findByNome(String nome);
}
