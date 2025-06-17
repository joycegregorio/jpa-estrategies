package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.EmpregadoDAO;
import br.edu.ifpb.es.daw.entities.table_per_concrete_class.Empregado;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class EmpregadoDAOImpl extends AbstractDAOImpl<Empregado, Long> implements EmpregadoDAO {

    public EmpregadoDAOImpl(EntityManagerFactory emf) {
        super(Empregado.class, emf);
    }

    @Override
    public List<Empregado> findByNome(String nome) {
        try (var em = getEntityManager()) {
            TypedQuery<Empregado> query = em.createQuery(
                    "SELECT e FROM Empregado_TPCC e WHERE e.nome LIKE :nome",
                    Empregado.class
            );
            query.setParameter("nome", "%" + nome + "%");
            return query.getResultList();
        }
    }
}