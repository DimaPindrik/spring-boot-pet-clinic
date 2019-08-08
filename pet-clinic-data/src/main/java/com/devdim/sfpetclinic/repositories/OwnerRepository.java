package com.devdim.sfpetclinic.repositories;

import com.devdim.sfpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * created by Dima on 8/8/2019.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
