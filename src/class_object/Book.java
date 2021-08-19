package class_object;

public class Book {

   // properties of book: name ,writer,pages

    String name;   // declaration
    String writer;
    int pages;

    // parameterized constructor (it is used for making multiple object through a class)

    public Book(String name, String writer, int pages) {
        this.name = name;
        this.writer = writer;
        this.pages = pages;

    }


    public static void main(String[] args) {
        // creating an object------// className objectName = new className();

        Book object1 = new Book("Java", "James Gosling", 1200);
        System.out.println(object1.name);    //object.property_name
        System.out.println(object1.writer);
        System.out.println(object1.pages);


        Book object2 = new Book("Spring", "Kethy", 900);
        System.out.println(object2.name);
        System.out.println(object2.writer);
        System.out.println(object2.pages);


        Book object3 = new Book("SpringBoot", "Siera", 900);
        System.out.println(object3.name);
        System.out.println(object3.writer);
        System.out.println(object3.pages);



    }



}
