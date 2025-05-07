package nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.map;

import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.model.Owner;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.CrudService;
import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.OwnerService;

import java.util.Set;

public class OwnerServieceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
