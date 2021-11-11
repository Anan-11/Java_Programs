//Concept of nested class

class Outer {                             // outer class

    int a = 10;

    class Inner {                         // inner class
        int a = 20;

        void display() {
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a);
        }
    }
}

    class Tmain {
        public static void main(String[] args) {
            Outer obj1 = new Outer();
            Outer.Inner obj2 = obj1.new Inner();
            obj2.display();

        }

    }
