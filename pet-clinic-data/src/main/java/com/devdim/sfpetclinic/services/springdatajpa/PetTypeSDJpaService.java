package com.devdim.sfpetclinic.services.springdatajpa;

import com.devdim.sfpetclinic.model.PetType;
import com.devdim.sfpetclinic.repositories.PetTypeRepository;
import com.devdim.sfpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * created by Dima on 8/8/2019.
 */
@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> types = new HashSet<>();
        petTypeRepository.findAll().forEach(types::add);
        return types;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType type) {
        return petTypeRepository.save(type);
    }

    @Override
    public void delete(PetType type) {
        petTypeRepository.delete(type);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
