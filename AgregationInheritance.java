
//Q18----> Class implementation order: BFADE
import java.lang.*;
import java.util.*;

public class AgregationInheritance{

    public static void main(String argv[]) {
        System.out.println("QUE FUE");
        E eObj = new E(5, 4, "01", 2, 6);
        System.out.println(eObj);
    }
}

class B {
    private int b;

    public B(int b1) {
        this.b = b1;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b1) {
        this.b = b1;
    }
}

class F {
    private int f;

    public F(int f1) {
        this.f = f1;
    }

    public int getF() {
        return this.f;
    }

    public void setF(int f1) {
        this.f = f1;
    }
}

class A {
    private String a;
    private B bObj = new B(0);
    private F fObj = new F(0);

    public A(String a1, int b1, int f1) {
        this.a = a1;
        this.bObj.setB(b1);
        this.fObj.setF(f1);
    }

    public String getA() {
        return this.a;
    }

    public void setA(String a1) {
        this.a = a1;
    }

    public B getBobj() {
        return this.bObj;
    }

    public void setBobj(B bObj1) {
        this.bObj = bObj1;
    }

    public F getFobj() {
        return this.fObj;
    }

    public void setFobj(F fObj1) {
        this.fObj = fObj1;
    }
}

class D {
    private int d;

    public D(int d1) {
        this.d = d1;
    }

    public int getD() {
        return this.d;
    }

    public void setD(int d1) {
        this.d = d1;
    }
}

class E extends A {
    private int e;
    private D dObj = new D(0);

    public E(int e1, int d1, String a1, int b1, int f1) {
        super(a1, b1, f1);
        this.e = e1;
        this.dObj.setD(d1);
    }

    public int getE() {
        return this.e;
    }

    public void setE(int e1) {
        this.e = e1;
    }

    public D getDobj() {
        return this.dObj;
    }

    public void setDobj(D dObj1) {
        this.dObj = dObj1;
    }

    public String toString() {
        String s = "";
        s += this.getA();
        s += this.getBobj().getB();
        return s;
    }
}
