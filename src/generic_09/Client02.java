package generic_09;

public class Client02 {
    public static void main(String[] args) {

        Book book = new Book("우재님", "이것이 자바다");

        Bag<Book, String> bag = new Bag<>(book, "아무거나 들어갈 수 있다");

        // v1 내부적으로 bag.getOne.toString 호출
        System.out.println(bag.getOne());
        System.out.println(bag.getTwo());

        System.out.println();
        // v2
        System.out.println("Book Author : " + bag.getOne().getAuthor());
        System.out.println("Book Title : " + bag.getOne().getTitle());
    }
}
