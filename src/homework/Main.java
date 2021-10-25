package homework;

import homework.part1.book.Author;
import homework.part1.book.Book;
import homework.part1.figures.Circle;
import homework.part1.employees.Employee;
import homework.part1.figures.MyPoint;
import homework.part1.figures.MyTriangle;
import homework.part1.figures.Rectangle;
import homework.part2.ball.Ball;
import homework.part2.ball.Container;
import homework.part2.mycomplex.MyComplex;
import homework.part2.mypolynomial.MyPolynomial;

public class Main {

    public static void main(String[] args) {

        /*Circle circle = new Circle(3, "red");
        System.out.println( circle.getArea());
        System.out.println( circle.getColor());
        System.out.println( circle.getRadius());
        circle.setColor("blu");
        circle.setRadius(4);
        System.out.println( circle.getColor());
        System.out.println( circle.getRadius());
        System.out.println( circle.getArea());
        System.out.println( circle);*/


        /*Rectangle rectangle=new Rectangle(10,5);
        System.out.println( rectangle.getArea());
        System.out.println( rectangle.getPerimeter());
        System.out.println( rectangle.getLength());
        System.out.println( rectangle.getWidth());
        rectangle.setLength(15);
        rectangle.setWidth(10);
        System.out.println( rectangle.getArea());
        System.out.println( rectangle.getPerimeter());
        System.out.println( rectangle.getLength());
        System.out.println( rectangle.getWidth());
        System.out.println(rectangle);*/


        /*Employee employee = new Employee(10,"first","Second",500);
        System.out.println(employee.getName());
        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());
        employee.setSalary(233);
        System.out.println(employee.getSalary());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(10));*/


        /*Author author1=new Author("John","John21",'m');
        Author author2 = new Author("John","John21",'m');
        Author author3 = new Author("John","John21",'m');
        Author author4 = new Author("John","John21",'m');
        Author authors[] = {author1,author2,author3,author4};
        Book book = new Book("book1",21.0,30,authors);
        System.out.println( book.getAuthorName());
        System.out.println( book.getName());
        book.setPrice(23.0);
        System.out.println( book.getPrice());
        book.setQty(40);
        System.out.println( book.getQty());
        System.out.println( book);*/


        /*MyPoint myPoint = new MyPoint(1.0,2.0);
        MyPoint myPoint1 = new MyPoint(1.0,2.0);
        System.out.println(myPoint);
        System.out.println(myPoint1);
        System.out.println(myPoint.distance(myPoint1));
        System.out.println(myPoint.distance(1.0,2.0));
        System.out.println(myPoint.distance());
        System.out.println(myPoint.distance(0.0,0.0));
        myPoint.setXY(0.0,0.0);
        System.out.println(myPoint);*/

        /*MyPoint myPoint = new MyPoint(0.0,0.0);
        MyPoint myPoint1 = new MyPoint(0.1,0.0);
        MyPoint myPoint2 = new MyPoint(0.0,0.1);
        System.out.println(myPoint.distance(myPoint1));
        MyTriangle myTriangle = new MyTriangle(myPoint,myPoint1,myPoint2);
        System.out.println(myTriangle);
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());*/


        /*MyComplex myComplex = new MyComplex(2,3);
        MyComplex myComplex1 = new MyComplex(2,3);
        System.out.println(myComplex);
        System.out.println(myComplex.getReal());
        System.out.println(myComplex.getImag());
        System.out.println(myComplex.isReal());
        System.out.println(myComplex.isImaginary());
        System.out.println(myComplex.magnitude());
        System.out.println(myComplex.argument());
        System.out.println(myComplex.add(myComplex1));
        System.out.println( myComplex.addNew(myComplex1));
        System.out.println(myComplex.conjugate());*/

        /*double[] coeffs = new double[]{1.0,2.0,3.0};
        MyPolynomial myPolynomial = new MyPolynomial(coeffs);
        MyPolynomial myPolynomial1 = new MyPolynomial(coeffs);
        System.out.println(myPolynomial);
        System.out.println(myPolynomial.getDegree());
        System.out.println(myPolynomial.evaluate(2.0));
        System.out.println(myPolynomial.add(myPolynomial1));
        System.out.println(myPolynomial.multiply(myPolynomial1));*/

        Ball ball1 = new Ball((float) 0.5, (float) 5, 1, 10, 0);
        System.out.println(ball1);
        Container container = new Container(0, 0, 20, 10);
        System.out.println(container.collides(ball1));
        ball1.move();
        System.out.println(ball1);
        System.out.println(container.collides(ball1));
        ball1.setXDelta(5);
        ball1.move();
        System.out.println(ball1);
        System.out.println(container.collides(ball1));
        ball1.setYDelta(5);
        ball1.move();
        System.out.println(ball1);
        System.out.println( container.collides(ball1));
        ball1.reflectHorizontal();
        ball1.reflectVertical();
        ball1.move();
        System.out.println(ball1);
        System.out.println( container.collides(ball1));

    }
}
