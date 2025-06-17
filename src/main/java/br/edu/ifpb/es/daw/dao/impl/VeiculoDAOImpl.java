package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.VeiculoDAO;
import br.edu.ifpb.es.daw.entities.joined_subclass.Veiculo;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class VeiculoDAOImpl extends AbstractDAOImpl<Veiculo, Long> implements VeiculoDAO {

    public VeiculoDAOImpl(EntityManagerFactory emf) {
        super(Veiculo.class, emf);
    }

    @Override
    public List<Veiculo> findByConstrutora(String construtora) {
        try (var em = getEntityManager()) {
            TypedQuery<Veiculo> query = em.createQuery(
                    "SELECT v FROM Veiculo_JS v WHERE v.construtora LIKE :construtora",
                    Veiculo.class
            );
            query.setParameter("construtora", "%" + construtora + "%");
            return query.getResultList();
        }
    }
}