package com.devdim.sfpetclinic.bootstrap;

import com.devdim.sfpetclinic.model.Owner;
import com.devdim.sfpetclinic.model.Vet;
import com.devdim.sfpetclinic.services.OwnerService;
import com.devdim.sfpetclinic.services.VetService;
import com.devdim.sfpetclinic.services.map.OwnerServiceMap;
import com.devdim.sfpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * created by Dima on 7/31/2019.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jhon");
        owner1.setLastName("Snow");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fred");
        owner2.setLastName("Mcruger");
        ownerService.save(owner2);

        System.out.println("Loaded owners ...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Khalisi");
        vet1.setLastName("Drakus");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Khal");
        vet2.setLastName("Drogo");
        vetService.save(vet2);

        System.out.println("Loaded vets ...");

    }
}
