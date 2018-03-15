package sample.jpa.business.service;

import sample.jpa.business.domain.Pet;

import java.util.List;

public interface PetDao {

    Pet findById(int petId);

    List<Pet> findAll();


}
