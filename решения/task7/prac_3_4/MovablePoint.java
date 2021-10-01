package task7.prac_3_4;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed = 1;
    protected int ySpeed = 1;

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "X: " + x + " Y: " + y;
    }

    public void moveUp() { x += xSpeed; }
    public void moveDown() { x -= xSpeed; }
    public void moveLeft() { y -= ySpeed; }
    public void moveRight() { y += ySpeed; }

}
