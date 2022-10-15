package generic_extends_10;

/**
 * extends 명령어를 사용하여 Book 클래스의 모든 변수와 메소드 사용 가능
 * 필요에 따라 오버라이딩으로 수정 가능
 */
public class JavaBook extends Book{

    private String firstCode;
    private String ide = "intellij";

    public JavaBook(String author, String title, String firstCode) {
        super(author, title);
        this.firstCode = firstCode;
    }

    public String getFirstCode() {
        return firstCode;
    }

    public void setFirstCode(String firstCode) {
        this.firstCode = firstCode;
    }

    @Override
    public String toString() {
        return "JavaBook{" +
                "firstCode='" + firstCode + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }
}
