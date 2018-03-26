package sample.hibernate.business.service;

import sample.hibernate.business.domain.Pet;

import java.util.List;

public interface PetDao {

    Pet findById(int petId);

    List<Pet> findAll();

}
