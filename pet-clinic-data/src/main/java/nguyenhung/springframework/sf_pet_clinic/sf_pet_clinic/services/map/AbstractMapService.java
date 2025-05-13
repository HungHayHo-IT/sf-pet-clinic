package nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.services.map;

import nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.model.BaseEntity;

import java.util.*;

public abstract class  AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return  new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

T save(T object) {
    if(object != null){  // Sửa thành != null
        if(object.getId() == null){
            object.setId(getNextId());
        }
        map.put(object.getId(), object);
        return object;
    } else {
        throw new RuntimeException("Object is null");
    }
}
    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
// tự  động tạo id lên map khi save
    private Long getNextId(){
        Long nextId = null;
        try {
            nextId= Collections.max(map.keySet()) +1;
        }catch (Exception e){
            nextId = 1L;
        }
        return nextId ;
    }
}