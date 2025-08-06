package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calArea(){
        return width*height;
    }

    int calPerimeter(){
        return 2*(width+height);
    }

    boolean isSquare(){
        return width==height;
    }
}
