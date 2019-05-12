public class Testing {

    boolean isRightTriangle(Triangle ta, Triangle tb, Triangle tc){
        double przy = ta.a * ta.a + tb.b * tb.b;
        double przeciw = tc.c * tc.c;
        boolean wynik = przy == przeciw;
        return wynik;
    }

}
