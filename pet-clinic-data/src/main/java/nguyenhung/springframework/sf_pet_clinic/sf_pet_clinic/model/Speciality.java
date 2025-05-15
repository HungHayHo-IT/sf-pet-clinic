package nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.model;

public class Speciality extends BaseEntity {
    private String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
