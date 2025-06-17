package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.ProjetoDAO;
import br.edu.ifpb.es.daw.entities.single_table_per_class.Projeto;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class ProjetoDAOImpl extends AbstractDAOImpl<Projeto, Long> implements ProjetoDAO {

    public ProjetoDAOImpl(EntityManagerFactory emf) {
        super(Projeto.class, emf);
    }

    @Override
    public List<Projeto> findByNome(String nome) {
        try (var em = getEntityManager()) {
            TypedQuery<Projeto> query = em.createQuery(
                    "SELECT p FROM Projeto_STPCH p WHERE p.nome LIKE :nome",
                    Projeto.class
            );
            query.setParameter("nome", "%" + nome + "%");
            return query.getResultList();
        }
    }
}