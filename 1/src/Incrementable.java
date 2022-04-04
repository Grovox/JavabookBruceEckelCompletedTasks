public class Incrementable {
    static int increment() {
        return ++StaticTest.i;
    }
    int k = increment();
}
