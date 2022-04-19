package com.ecpe308.sample;

public class Pet {
    public String name, breed; //persian, labrador, golden retriever
    public String pet_type;  //cat/dog

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public String getPet_Type(){
        return pet_type;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setBreed(String newBreed){
        this.breed = newBreed;
    }  
    public void setPet_Type(String newPet_Type){
        this.pet_type = newPet_Type;  
    }    
}