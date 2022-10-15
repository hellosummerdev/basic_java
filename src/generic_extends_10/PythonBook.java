package generic_extends_10;

public class PythonBook extends Book{

    private String firstCode;
    private String ide = "pycharm";


    public PythonBook(String author, String title, String firstCode) {
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
        return "PythonBook{" +
                "firstCode='" + firstCode + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }
}
