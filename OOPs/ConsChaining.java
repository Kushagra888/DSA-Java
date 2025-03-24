class Book {
    Book() {
        this(67);
        System.out.println("cons. of book");
    }
    Book(int a) {
        this("heloi");
        System.out.println(a + " this is the val.");
    }
    Book(String val) {
        System.out.println(val);
    }
}

public class ConsChaining {
    public static void main(String[] args) {
        // Book b = new Book();
    }
}