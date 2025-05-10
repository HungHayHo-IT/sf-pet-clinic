package nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.map;

import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.model.Vet;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.CrudService;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
}
