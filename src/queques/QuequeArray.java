package queques;

import interfaces.ICollection;

public class QuequeArray<T> implements ICollection<T>{
    T[] array=(T[]) new Object[100];
    int first=0;
    int last=0;

    @Override
    public void insert(T value) {
        // TODO Auto-generated method stub
        if(last>100){
            throw (new IndexOutOfBoundsException());
        }else{
            array[last]=value;
            last++;
        }
    }

    @Override
    public void insertMany(T[] values) {
        // TODO Auto-generated method stub
        for(int i=0;i<values.length; i++){
            if(last>100){
                throw (new IndexOutOfBoundsException());
            }else{
                array[last]=values[i];
                last++;
            }
        }
    }

    @Override
    public T getNext() {
        // TODO Auto-generated method stub
        return array[first];
    }

    @Override
    public void deleteNext() {
        // TODO Auto-generated method stub
        
        for(int j=array.length; j>0; j--){
            array[j-1]= array[j];
        }        

        first++;


    }

    //cuando está lleno last+1= first
    //el last pasa al inicio en el array.
    // el linkedlist tiene métodos de first y last
    
    
}
