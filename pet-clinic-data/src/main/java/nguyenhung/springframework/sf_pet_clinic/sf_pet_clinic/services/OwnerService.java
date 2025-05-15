package nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services;

import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);

}
