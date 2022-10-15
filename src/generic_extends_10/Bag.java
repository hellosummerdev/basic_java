package generic_extends_10;

/**
 * 한 개의 Book을 담을 수 있는 가방
 * 책이면 어떤 책이어도 담을 수 있다.
 */

public class Bag<T extends Book> {
    private T one;

    public Bag(T one) {
        this.one = one;
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "one=" + one +
                '}';
    }
}
