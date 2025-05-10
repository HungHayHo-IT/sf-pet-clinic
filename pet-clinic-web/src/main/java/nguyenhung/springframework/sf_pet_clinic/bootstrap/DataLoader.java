package nguyenhung.springframework.sf_pet_clinic.bootstrap;

import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.model.Owner;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.model.Vet;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.OwnerService;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.VetService;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.map.OwnerServiceMap;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final  VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;

    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("fiona");
        owner1.setLastName("Glenanne");
        ownerService.save(owner1);
        System.out.println("Loaded owner....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded vet....");

    }
}
