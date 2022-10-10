package oop_04;

public class Book {
    private String title;
    private String content;

    public Book(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(){
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(){
        this.content = content;
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + "\'" +
                ", content='" + content + '\'' +
                "}";
    }
}
