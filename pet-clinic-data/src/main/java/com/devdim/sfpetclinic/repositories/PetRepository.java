package com.devdim.sfpetclinic.repositories;

import com.devdim.sfpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * created by Dima on 8/8/2019.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
