package nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.map;

import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.model.Speciality;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.model.Vet;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.CrudService;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.SpecialtyService;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
    public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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

        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = specialtyService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
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
