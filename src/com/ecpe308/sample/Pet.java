package com.ecpe308.sample;

public class Pet {
    public String name, breed; //persian, labrador, golden retriever
    public String pet_type;  //cat/dog
}
public String getname(){
        return name;
    }
    public String getbreed(){
        return breed;
    }
    public String getpet_type(){
        return pet_type;
    }
    public void setname(String newname){
        this.name = newname;
    }
    public void setbreed(String newbreed){
        this.breed = newbreed;
    }  
    public void setpet_type(String newpet_type){
        this.pet_type = newpet_type;  
    }   
     
}
