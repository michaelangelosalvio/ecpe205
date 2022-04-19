# ecpe205

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
    public String getType(){
        return pet_type;
    }
    public void getName(String name){
        this.name = name;
    }
    public void getBreed(String breed){
        this.breed = breed;
    }
    public void getType(String pet_type){
        this.pet_type = pet_type;
    }
}


