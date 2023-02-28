import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import models.Person;
import queques.QuequeArray;
import queques.QuequeList;
import stacks.stackArrayList;

public class App {

    private  stackArrayList<Person> stack = new stackArrayList<Person>();
    private Person[] array=new Person[100];
    private QuequeList<Person> queue = new QuequeList<Person>();
    HashMap<String, Person> hash = new HashMap<String, Person>();

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.start();
    }

    public void start(){
        generatorPerson();
    }


    public void generatorPerson(){
        Random rand = new Random(); 
        // Setting the upper bound to generate the
        // random numbers in specific range
        int upperbound = 2000;
        // Generating random values from 0 - 24 
        // using nextInt()
        
        for(int x=0; x<100;x++){
            int int_random = rand.nextInt(upperbound); 
            Person person = new Person(int_random, "person "+x);
            
            stack.push(person);
            array[x] = person;
            
            hash.put(String.valueOf(int_random), person);
        }
        queue.insertMany(array);
        print();
    }


    public void print(){
        System.out.println("STACK================");
        for(int x=0; x<100;x++){
            System.out.println("position: "+x+ " value: "+ stack.pop().getName());
        }
        System.out.println("END================");

        System.out.println("ARRAY================");
        for(int x=0; x<100;x++){
            System.out.println("position: "+x+ " value: "+array[x].getName());
        }
        System.out.println("END======================");
        System.out.println("queue================");
        for(int x=0; x<100;x++){
            System.out.println("position: "+queue.getNextById(x).getCui()+ " value: "+queue.getNextById(x).getName());
        }
        System.out.println("END======================");

        System.out.println("hashmap================");
        Iterator<String> it = hash.keySet().iterator();


        while (it.hasNext()) {
            String clave = it.next();
            Person valor = hash.get(clave);
            System.out.println("Clave: " + clave + ", value: " + valor.getName());
        }
        System.out.println("END======================");
    }
}
