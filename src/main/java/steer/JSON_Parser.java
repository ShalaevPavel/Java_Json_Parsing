package steer;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
//
//import org.json.JSONArray;
//import org.json.JSONObject;

public class JSON_Parser {
    public static void main(String[] args) throws IOException {

        //FileOutputStream fout  =new FileOutputStream("my_file.json");

        ObjectMapper obj = new ObjectMapper();
        obj.enable(SerializationFeature.INDENT_OUTPUT);

        Class_exaample cl1 = new Class_exaample(2011, "BOOK1", "John");
        Class_exaample cl2 = new Class_exaample(2212, "BOOK2", "bob");
        Class_exaample cl3 = new Class_exaample(1003, "BOOK3", "bob");
        Class_exaample cl4 = new Class_exaample(1003, "BOOK3", "John");
        Shelf shelf = new Shelf();
        shelf.books.add(cl1);
        shelf.books.add(cl2);
        shelf.books.add(cl3);
        shelf.books.add(cl4);
        //String j_son = obj.writeValue(shelf.books.);
        /*
        shelf.books.sort((Class_exaample b1, Class_exaample b2) -> (b2.author.compareTo(b1.author))); //0


        ArrayList<Class_exaample> books_ = new ArrayList<>(shelf.books);
        List<Class_exaample> n_books = shelf.books.stream().
                filter(b -> b.author.equals("bob")).collect(Collectors.toList()); //1


        int count = (int) books_.stream().filter(b -> b.author.equals("bob")).count(); // 2


        Map<String, List<Class_exaample>> bookMap = shelf.books.stream().
                collect(Collectors.groupingBy(Class_exaample::getAuthor)); //3


        System.out.println(books_.size());
        System.out.println(books_);
        System.out.println(n_books);
        System.out.println(count);
        bookMap.forEach((k, v) -> System.out.println(k + " => " + v));
            */
        //obj.writeValue(fout, shelf);
        //fout.write(j_son);
        //fout.close();

        obj.readValue(new File("my_file.json"), ArrayList<T>class);






    }

}
