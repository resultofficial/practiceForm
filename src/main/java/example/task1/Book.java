package example.task1;

public class Book implements Displayable {
    private String name;
    private String author;
    private int yearPublication;

    public String getName() {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getYearPublication(){
        return yearPublication;
    }

    public void setYearPublication(int yearPublication){
        this.yearPublication = yearPublication;
    }

    @Override
    public void display() {
        System.out.println("Название книги: " + this.name + ", Год издания: " + this.yearPublication + ", Имя автора: " + this.author);
    }
}
