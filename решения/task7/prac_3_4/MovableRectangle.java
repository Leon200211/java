package task7.prac_3_4;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;



    MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    boolean provSpeed(){
        if(topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed){
            return true;
        }
        else {
            return false;
        }
    }

    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    };
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    };
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    };
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    };
}
