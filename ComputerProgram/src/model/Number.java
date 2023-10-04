package model;

public class Number {
    private double n1;
    private double n2;
    private Operator op;
    public Number() {

    }

    public Number(double n1, double n2, String operator) {
        this.n1 = n1;
        this.n2 = n2;
        op = new Operator(operator);
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public Operator getOp() {
        return op;
    }

    public void setOp(Operator op) {
        this.op = op;
    }
}
