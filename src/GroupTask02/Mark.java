package GroupTask02;

public abstract class Mark {
}
class stuA extends Mark {
    Double sub1, sub2, sub3;

    public stuA(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    double getPercentage() {
        return ((sub1 + sub2 + sub3) / 3);
    }
}

class stuB extends Mark {

    Double sub1, sub2, sub3, sub4;

    public stuB(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    double getPercentage() {
        return ((sub1 + sub2 + sub3 + sub4) / 4);
    }
}

class Main{

    public static void main(String[] args) {
        stuA a = new stuA(1, 2, 3);
        System.out.println(a.getPercentage());
        stuB b = new stuB(1, 2, 3, 4);
        System.out.println(b.getPercentage());
    }}