public class MainTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 5, 3);
        Triangle triangle2 = new Triangle(3, 4, 5);
        Testing testing = new Testing();
        boolean x = testing.isRightTriangle(triangle);
        boolean y = testing.isRightTriangle(triangle2);
        System.out.println("Czy trójkąt jest prostokątny? " + x);
        System.out.println("Czy trójkąt 2 jest prostokątny? " + y);


    }
}