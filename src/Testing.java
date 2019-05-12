public class Testing {

    boolean isRightTriangle(Triangle ta){
        double przy = ta.a * ta.a + ta.b * ta.b;
        double przeciw = ta.c * ta.c;
        boolean wynik = przy == przeciw;
        return wynik;
    }

}
