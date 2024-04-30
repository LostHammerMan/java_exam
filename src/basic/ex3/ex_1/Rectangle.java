package basic.ex3.ex_1;

public class Rectangle {

    private int width;
    private int height;
    private int area;
    private int perimeter;

    public int calculateArea(int width, int height){
        area = width * height;
        return area;
    }

    public int calculatePerimeter(int width, int height){
        perimeter = 2 * (width + height);
        return perimeter;
    }

    public boolean isSquare(int width, int height){
        return width == height;
    }

    public void print(int width, int height){
        System.out.println("넓이 : " + calculateArea(width, height));
        System.out.println("둘레 길이 : " + calculatePerimeter(width, height));
        System.out.println("정사각형 여부 : " + isSquare(width, height));
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
