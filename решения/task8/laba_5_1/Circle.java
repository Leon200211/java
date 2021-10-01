package task8.laba_5_1;

public class Circle extends Shape{


        public Circle(){
                super();
                this.r = (int)(Math.random()*256);
                this.g = (int)(Math.random()*256);
                this.b = (int)(Math.random()*256);

                this.x = (int)(Math.random()*740)+10;
                this.y = (int)(Math.random()*440)+10;
        }
}
