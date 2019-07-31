package com.devdim.sfpetclinic.services.map;

import com.devdim.sfpetclinic.model.Pet;
import com.devdim.sfpetclinic.services.PetService;

import java.util.Set;

/**
 * created by Dima on 7/29/2019.
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return this.save(pet.getId(), pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
