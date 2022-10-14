package generic_09;

public class Card {

    // 카드에는 카드회사 이름과 신용카드/체크카드 타입을 넣을 수 있다.
    private String name;
    private String type;

    public Card(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
