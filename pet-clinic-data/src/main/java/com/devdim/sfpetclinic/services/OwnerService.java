package com.devdim.sfpetclinic.services;

import com.devdim.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
