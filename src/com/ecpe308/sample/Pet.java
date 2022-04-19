package com.ecpe308.sample;

public class Pet {
    private String name, breed; //persian, labrador, golden retriever
    private String pet_type;  //cat/dog
    public String getName(){
        return this.name
    }
    public String getBreed(){
        return this.breed
    }
    public String getPet_type(){
        return this.pet_type
    }
    public void set Name(String name){
        this.name=name
    }
    public void set breed(String breed){
        this.breed=breed
    }
    public void set pet_type(String pet_type){
        this.pet_type=pet_type
    }
}
