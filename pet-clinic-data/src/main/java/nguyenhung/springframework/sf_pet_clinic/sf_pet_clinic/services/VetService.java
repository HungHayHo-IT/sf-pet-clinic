package nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services;

import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById (long id);
    Vet save (Vet vet);
    Set<Vet> findAll();
}
