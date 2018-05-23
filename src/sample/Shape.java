package sample;

public class Shape {
    String name;
    float radius;
    float height;

    Shape(String name, float radius, float height) {
        this.name = name;
        this.radius = radius;
        this.height = height;
    }

    Shape() {
        name = "undefined";
        radius = 0;
        height = 0;
    }


    void give_info() {
        System.out.println("Shape is: " + this.name +
                ". With radius of: " + this.radius +
                " and height of: " + this.height);
    }
}
