package entities;

public class Rectangle {

    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (width + width) + (height + height);
    }

    public double diagonal(){
        return  Math.sqrt((width * width) + (height * height)) ;
    }






}

