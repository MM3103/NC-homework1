package homework.part1.figures;

public enum TypeTriangle {
    EQUILATERIAL("equilateral"),
    ISOSCELES("isosceles"),
    SCALENE("scalene");

    private String type;

    TypeTriangle(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
