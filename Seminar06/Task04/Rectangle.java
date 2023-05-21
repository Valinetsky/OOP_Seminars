package Seminar06.Task04;

public class Rectangle extends RightAngleShape {
    private int width;
    private int height;    
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}