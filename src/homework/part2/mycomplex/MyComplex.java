package homework.part2.mycomplex;

import java.util.Objects;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real,double imag){
        this.real=real;
        this.imag=imag;
    }

    public boolean isReal(){
        return this.real != 0.0;
    }

    public boolean isImaginary(){
        return  this.imag != 0.0;
    }

    public boolean equals(double real,double imag){
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex myComplex){
        return equals(myComplex.getReal(),myComplex.getImag());
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }

    public double argument(){
        return Math.atan(imag/real);
    }

    public MyComplex add(MyComplex right){
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return  new MyComplex(this.real + right.getReal(),this.imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right){
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return  new MyComplex(this.real - right.getReal(),this.imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right){
        real = real*right.getReal()-imag*right.getImag();
        imag = real*right.getImag()+imag*right.getReal();
        return this;
    }

    public MyComplex divide(MyComplex right){
        real = (real*right.getReal()+imag*right.getImag()) / (Math.pow(right.getReal(),2)+Math.pow(right.getImag(),2));
        imag = (imag*right.getReal()-real*right.getImag()) / (Math.pow(right.getReal(),2)+Math.pow(right.getImag(),2));
        return this;
    }

    public MyComplex conjugate(){
        return  new MyComplex(this.real,-this.imag);
    }

    @Override
    public String toString() {
        return "("+real + "+(" + imag +")i)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyComplex)) {
            return false;
        }

        MyComplex myComplex = (MyComplex) o;

        return Double.compare(myComplex.real, this.real) == 0 &&
                Double.compare(myComplex.imag, this.imag) == 0;
    }

    @Override
    public int hashCode() {
        int result=17;
        result = 31*result + (int)this.real;
        result = 31*result + (int)this.imag;
        return result;
    }
}

