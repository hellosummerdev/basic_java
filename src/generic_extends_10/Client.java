package generic_extends_10;

public class Client {
    public static void main(String[] args) {

        System.out.println();
        JavaBook javaBook = new JavaBook("오정임", "처음하는 자바 프로그래밍", "sout(\"hello world\")");
        Bag<JavaBook> javaBag = new Bag<>(javaBook);
        System.out.println(javaBag.toString());
        System.out.println(javaBag.getOne().getAuthor());
        System.out.println(javaBag.getOne().getTitle());
        System.out.println(javaBag.getOne().getFirstCode());

        System.out.println();

        PythonBook pythonBook = new PythonBook("박응용", "점프 투 파이썬", "print('hello world')");
        Bag<PythonBook> pythonBag = new Bag<>(pythonBook);
        System.out.println(pythonBag.toString());
        System.out.println(pythonBag.getOne().getAuthor());
        System.out.println(pythonBag.getOne().getTitle());
        System.out.println(pythonBag.getOne().getFirstCode());


        Book book = new Book("오렐리앙", "핸즈온 머신러닝");
        Bag<Book> bookBag = new Bag<>(book);
        System.out.println(bookBag.getOne().getAuthor());
        System.out.println(bookBag.getOne().getTitle());

        System.out.println();
        System.out.println("set으로 책 바꾸기");
        book.setAuthor("박해선");
        book.setTitle("혼자 공부하는 머신러닝+딥러닝");

        System.out.println(bookBag.getOne().getAuthor());
        System.out.println(bookBag.getOne().getTitle());

        System.out.println();
        System.out.println("set으로 가방에 든 책 바꾸기");
        bookBag.setOne(pythonBook);
        System.out.println(bookBag.toString());

    }
}
