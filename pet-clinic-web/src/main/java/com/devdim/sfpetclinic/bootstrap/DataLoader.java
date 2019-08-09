package com.devdim.sfpetclinic.bootstrap;

import com.devdim.sfpetclinic.model.*;
import com.devdim.sfpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * created by Dima on 7/31/2019.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {

        System.out.println("=========================================== DATA LOADER START ===========================================");

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        System.out.println("Loaded pet types ...");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        specialityService.save(dentistry);

        System.out.println("Loaded Specialities ...");

        Owner owner1 = new Owner();
        owner1.setFirstName("Jhon");
        owner1.setLastName("Snow");
        owner1.setAddress("123 Brik");
        owner1.setCity("Miami");
        owner1.setTelephone("+123-1239321");

        Pet jhonsPet = new Pet();
        jhonsPet.setName("Kaligula");
        jhonsPet.setPetType(saveDogPetType);
        jhonsPet.setOwner(owner1);
        jhonsPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(jhonsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fred");
        owner2.setLastName("Mcruger");
        owner2.setAddress("321 Solid");
        owner2.setCity("Washington");
        owner2.setTelephone("+321-4239321");

        Pet fredsPet = new Pet();
        fredsPet.setName("Mortar");
        fredsPet.setPetType(savedCatPetType);
        fredsPet.setOwner(owner2);
        fredsPet.setBirthDate(LocalDate.now());
        owner2.getPets().add(fredsPet);

        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(fredsPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("cat visit description");

        visitService.save(catVisit);

        System.out.println("Loaded owners ...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Khalisi");
        vet1.setLastName("Drakus");
        vet1.getSpecialities().add(radiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Khal");
        vet2.setLastName("Drogo");
        vet2.getSpecialities().add(surgery);
        vetService.save(vet2);

        System.out.println("Loaded visits ...");

        System.out.println("Loaded vets ...");

        System.out.println("============================================  DATA LOADER END ============================================");
    }
}
