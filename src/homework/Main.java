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
        Circle circle2 = new Circle(3, "red");
        Circle circle3 = new Circle(4, "red");
        System.out.println(circle3.equals(circle2));
        System.out.println(circle.equals(circle2));
        System.out.println(circle.hashCode());
        System.out.println(circle2.hashCode());
        System.out.println(circle3.hashCode());
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
        Rectangle rectangle2=new Rectangle(10,5);
        Rectangle rectangle3=new Rectangle(15,5);
        System.out.println(rectangle.equals(rectangle2));
        System.out.println(rectangle.equals(rectangle3));
        System.out.println(rectangle.hashCode());
        System.out.println(rectangle2.hashCode());
        System.out.println(rectangle3.hashCode());
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
        Employee employee2 = new Employee(10,"first","Second",500);
        Employee employee3 = new Employee(15,"first","Second",500);
        System.out.println(employee.equals(employee2));
        System.out.println(employee2.equals(employee3));
        System.out.println(employee.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee3.hashCode());
        System.out.println(employee.getName());
        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());
        employee.setSalary(233);
        System.out.println(employee.getSalary());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(10));*/


        /*Author author1=new Author("John1","John21",'m');
        Author author2 = new Author("John2","John21",'m');
        Author author3 = new Author("John3","John21",'m');
        Author author4 = new Author("John4","John21",'m');
        Author authors[] = {author1,author2,author3,author4};
        Author authors2[] = {author1,author2,author3,author4};
        Author authors3[] = {author1,author3,author3,author4};
        Book book = new Book("book1",21.0,30,authors);
        Book book1 = new Book("book1",21.0,30,authors2);
        Book book2 = new Book("book1",21.0,30,authors3);
        System.out.println(book.equals(book1));
        System.out.println(book.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book.hashCode());
        System.out.println( book.getAuthorName());
        System.out.println( book.getName());
        book.setPrice(23.0);
        System.out.println( book.getPrice());
        book.setQty(40);
        System.out.println( book.getQty());
        System.out.println( book);*/


        /*MyPoint myPoint = new MyPoint(1.0,2.0);
        MyPoint myPoint1 = new MyPoint(1.0,2.0);
        MyPoint myPoint2 = new MyPoint(1.0,3.0);
        System.out.println(myPoint.equals(myPoint1));
        System.out.println(myPoint.equals(myPoint2));
        System.out.println(myPoint.hashCode());
        System.out.println(myPoint1.hashCode());
        System.out.println(myPoint2.hashCode());
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
        MyPoint myPoint3 = new MyPoint(0.0,2.1);
        System.out.println(myPoint.distance(myPoint1));
        MyTriangle myTriangle = new MyTriangle(myPoint,myPoint1,myPoint2);
        MyTriangle myTriangle1 = new MyTriangle(myPoint,myPoint1,myPoint3);
        System.out.println(myTriangle.equals(myTriangle));
        System.out.println(myTriangle.equals(myTriangle1));
        System.out.println(myTriangle.hashCode());
        System.out.println(myTriangle.hashCode());
        System.out.println(myTriangle);
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());*/


        /*MyComplex myComplex = new MyComplex(2,3);
        MyComplex myComplex1 = new MyComplex(2,3);
        MyComplex myComplex2 = new MyComplex(3,4);
        System.out.println(myComplex.equals(myComplex1));
        System.out.println(myComplex.equals(myComplex2));
        System.out.println(myComplex.hashCode());
        System.out.println(myComplex2.hashCode());
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
        double[] coeffs1 = new double[]{2.0,2.0,3.0};
        MyPolynomial myPolynomial = new MyPolynomial(coeffs);
        MyPolynomial myPolynomial1 = new MyPolynomial(coeffs);
        MyPolynomial myPolynomial2 = new MyPolynomial(coeffs1);
        System.out.println(myPolynomial.equals(myPolynomial1));
        System.out.println(myPolynomial.equals(myPolynomial2));
        System.out.println(myPolynomial.hashCode());
        System.out.println(myPolynomial1.hashCode());
        System.out.println(myPolynomial2.hashCode());
        System.out.println(myPolynomial);
        System.out.println(myPolynomial.getDegree());
        System.out.println(myPolynomial.evaluate(2.0));
        System.out.println(myPolynomial.add(myPolynomial1));
        System.out.println(myPolynomial.multiply(myPolynomial1));*/

        Ball ball1 = new Ball((float) 0.5, (float) 5, 1, 10, 0);
        Ball ball2 = new Ball((float) 0.5, (float) 10, 2, 5, 0);
        System.out.println(ball1.equals(ball2));
        System.out.println(ball1.equals(ball1));
        System.out.println(ball2.hashCode());
        System.out.println(ball1.hashCode());
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
