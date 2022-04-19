package com.ecpe308.sample;

public class Pet {
    public String name, breed; //persian, labrador, golden retriever
    public String pet_type;  //cat/dog

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getPetType() {
        return pet_type;
    }

    public void setPetType(String pet_type) {
        this.pet_type = pet_type;
    }

    
}
