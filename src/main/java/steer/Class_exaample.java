package steer;

public class Class_exaample extends Object{
    public int age;
    public String name;
    public String author;



    Class_exaample(int age, String name, String author){
        this.age = age;
        this.name = name;
        this.author = author;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getAge(){
        return this.age;
    }




    @Override
    public String toString() {
        return "Class_exaample{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
