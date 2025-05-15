package nguyenhung.springframework.sf_pet_clinic.sf_pet_clinic.model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;

    // ✅ Constructor mặc định
    public Owner() {
        this.pets = new HashSet<>();
    }

    // Constructor đầy đủ (nếu cần dùng)
    public Owner(String address, String city, String telephone, Set<Pet> pets) {
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
