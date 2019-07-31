package com.devdim.sfpetclinic.services.map;

import com.devdim.sfpetclinic.model.Vet;
import com.devdim.sfpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by Dima on 7/29/2019.
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
