package task7.prac_3_4;



public class MovableCircle implements Movable {
    protected int radius;
    protected MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString(){
        return "X: " + center.x + " Y: " + center.y;
    }

    public void moveUp() { center.y += center.ySpeed; }
    public void moveDown() { center.y -= center.ySpeed; }
    public void moveLeft() { center.x -= center.xSpeed; }
    public void moveRight() { center.x += center.xSpeed; }
}
