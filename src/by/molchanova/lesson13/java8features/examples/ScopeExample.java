package by.molchanova.lesson13.java8features.examples;

public class ScopeExample {

    public void showInfo(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        ScopeExample scopeExample = new ScopeExample();
        scopeExample.getLambda(3, 4);
    }

    public void getLambda(int a, int b) {
        TestOperation testOperation = (x, y) -> {
            this.showInfo("test string");
            return x * y;
        };
        System.out.println("lambda result = " + testOperation.calculate(a, b));
    }
}

interface TestOperation {
    int calculate(int x, int y);
}
