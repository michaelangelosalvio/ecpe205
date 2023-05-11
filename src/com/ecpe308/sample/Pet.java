package com.ecpe308.sample;

public class Pet {
    public String name, breed, size; //persian, labrador, golden retriever
    public String pet_type;  //cat/dog

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public String getPet_type(){
        return pet_type;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setBreed (String breed){
        this.breed = breed; 
    }
    
    public void setPet_type (String pet_type){
        this.pet_type= pet_type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

