package sample.hibernate.dataaccess;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sample.hibernate.business.domain.Pet;
import sample.hibernate.business.service.PetDao;

import java.util.List;

@Repository
public class HibernatePetDao implements PetDao {

    @Autowired
    private SessionFactory sf;

    @Override
    public Pet findById(int petId) {
        Session s = sf.getCurrentSession();
        return (Pet) s.get(Pet.class, petId);
    }

    @Override
    public List<Pet> findAll() {
        Session s = sf.getCurrentSession();
        return s.createQuery("from Pet").list();
    }

}
