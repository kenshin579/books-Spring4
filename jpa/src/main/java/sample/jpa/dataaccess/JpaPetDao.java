package sample.jpa.dataaccess;

import org.springframework.stereotype.Repository;
import sample.jpa.business.domain.Pet;
import sample.jpa.business.service.PetDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class JpaPetDao implements PetDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Pet findById(int petId) {
        return em.find(Pet.class, petId);
    }

    @Override
    public List<Pet> findAll() {
        return em.createQuery("from Pet").getResultList();
    }

}
