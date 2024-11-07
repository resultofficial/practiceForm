package example.task2;

public class Student implements Printable{
    private String name;
    private int bookNumber;
    private int averageScore;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBookNumber(){
        return bookNumber;
    }

    public void setBookNumber(int bookNumber){
        this.bookNumber = bookNumber;
    }

    public int getAverageScore(){
        return averageScore;
    }

    public void setAverageScore(int averageScore){
        this.averageScore = averageScore;
    }

    @Override
    public void print(){
        System.out.println("Имя студента: " + this.name + " Номер студенческой книжки : " + this.bookNumber + " Средний балл : " + this.averageScore);
    }
}
