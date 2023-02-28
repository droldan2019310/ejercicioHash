package models;


public class Person {
    private int cui;
    private String name;
    
    
    public Person(int cui, String name){
        this.cui = cui;
        this.name = name;
    }

    public int getCui(){
        return cui;
    }

    public String getName(){
        return name;
    }
}
