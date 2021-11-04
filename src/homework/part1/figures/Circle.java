package homework.part1.figures;

import java.util.Objects;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color+'\''+
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Circle)) {
            return false;
        }

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, this.radius) == 0 &&
                this.color.equals(circle.color);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result+(int)this.radius;
        result = 31 * result + color.hashCode();
        return result;
    }
}
