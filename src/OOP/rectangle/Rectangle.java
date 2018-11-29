package OOP.rectangle;

public class Rectangle {
    private double height, width;

    public Rectangle(double width, double height){
        if (width < height) {
            this.width = width;
            this.height = height;
        }else {
            this.width = height;
            this.height = width;
        }
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width + height);
    }
}
