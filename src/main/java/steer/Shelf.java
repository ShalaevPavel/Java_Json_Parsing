package steer;

import java.util.ArrayList;

public class Shelf extends Object{
     public ArrayList<Class_exaample> books = new ArrayList<>();

//    public ArrayList<Class_exaample> get(){
//        return  books;
//    }
     public void add(Class_exaample book){
          books.add(book);
     }

//    @Override
//    public String toString() {
//        StringBuilder res = new StringBuilder();
//        res.append("{");
//        for (var book: books){
//            res.append(book);
//        }
//        res.append("}");
//        return  res.toString();
//
//
//    }
}
