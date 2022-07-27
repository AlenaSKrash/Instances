package DefiningTriangles;

public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 20, 13,14,15);
        Triangle triangleB = new Triangle(20,12,34,23,32);

        double TriangleAArea = triangleA.findArea();
        System.out.println(TriangleAArea);

        System.out.println(triangleB.sideLenTwo);
        System.out.println(Triangle.numOfSides);


    }
}
