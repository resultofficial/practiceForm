package example.task5;

public class Car implements Drivable{
    private String stamp;
    private String model;
    private int yearRelease;

    public String getStamp(){
        return stamp;
    }

    public void setStamp(String stamp){
        this.stamp = stamp;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYearRelease(){
        return yearRelease;
    }

    public void setYearRelease(int yearRelease){
        this.yearRelease = yearRelease;
    }

    @Override
    public void start(){
        System.out.println("Машина поехала");
    }

    @Override
    public void stop(){
        System.out.println("Машиина остановилась");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Машина проехала: " + distance);
    }
}
