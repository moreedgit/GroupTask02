package GroupTask02;

    public interface Shape {
        double calculateA();

        double calculateP();
    }

    class Circle implements Shape {
        double Rad;

        public Circle(double Rad) {
            this.Rad = Rad;
        }

        @Override
        public double calculateA() {
            return Math.PI * Math.pow(Rad, 2);
        }

        @Override
        public double calculateP() {
            return 2 * Math.PI * Rad;
        }
    }

    class squ implements Shape {
        double a;

        public squ(double a) {
            this.a = a;
        }

        @Override
        public double calculateA() {
            return Math.pow(a, 2);
        }

        @Override
        public double calculateP() {
            return 4 * a;
        }
    }

    class ShapeTester {
        public static void main(String[] args) {
            Shape circle = new Circle(3);
            System.out.println(circle.calculateA());
            System.out.println(circle.calculateP());

            Shape squ = new squ(4);
            System.out.println(squ.calculateA());
            System.out.println(squ.calculateP());
        }
    }
