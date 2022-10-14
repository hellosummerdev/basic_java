package generic_09;

public class Client01 {

    public static void main(String[] args) {
        Book book = new Book("우재님", "이것이 자바다");
        Card card = new Card("현대카드", "신용카드");

        // 가방에 담기
        Bag<Book, Card> bag = new Bag<>(book, card);

        // v1
        System.out.println("bag.getOne"); // 내부적으로 bag.getOne.toString 호출
        System.out.println("bag.getTwo"); // 내부적으로 bag.getTwo.toString 호출
        System.out.println();
        // v2
        System.out.println("Book Author: " + bag.getOne().getAuthor());
        System.out.println("Book Title: " + bag.getOne().getTitle());
        System.out.println();
        System.out.println("Card Name: " + bag.getTwo().getName());
        System.out.println("Card Type: " + bag.getTwo().getType());
    }

}
