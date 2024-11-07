package example.task3;

public class Point implements Movable{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    @Override
    public void moveUp(int yMoveUp){
        setY(this.y += yMoveUp);
    }

    @Override
    public void moveDown(int yMoveDown){
        setY(this.y -= yMoveDown);
    }

    @Override
    public void moveLeft(int xMoveLeft){
        setX(this.x -= xMoveLeft);
    }

    @Override
    public void moveRight(int xMoveRight){
        setX(this.x += xMoveRight);
    }

    @Override
    public void coordinates(){
        System.out.println("Координата x: " + this.x + " Координата y: " + this.y);
    }
}
