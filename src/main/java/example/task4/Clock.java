package example.task4;

public class Clock implements java.lang.Readable {
    private int hour;
    private int minutes;
    private int sec;

    public int getHour(){
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public int getSec(){
        return sec;
    }

    public void setSec(int sec){
        this.sec = sec;
    }

    public void plusSecond(){
        setSec(this.sec + 1);
    }

    @Override
    public void readTime(){
        System.out.println("Часы: " + this.hour + " Минуты: " + this.minutes + " Секунды: " + this.sec);
    }
}
