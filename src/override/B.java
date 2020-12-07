package override;

class B extends A {

    @Override
    double f(double x, double y) {
        double m = super.f(x, y);
        return m + x * y;
    }

    static int g(int n) {
        int m = A.g(n);
        return m + n;
    }
}
