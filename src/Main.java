public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(3);
        System.out.print(60);
        System.out.print(false);


        Calculator c = new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.Subtract(10,20));
        System.out.println(c.Divide(10,20));

        int no = 10;
        float gh = 10.5F;
        String h = "Ankit";

        System.out.println(no);
        System.out.println(gh);
        System.out.println(h);

        // Type Conversion//
        int g = (int)gh;

        // Arithmetic Operators

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2);

        int num3 = 70;
        int num4 = 80;

        System.out.println(num4 - num3);

        System.out.println(num1++);
        System.out.println(num1);

        System.out.println(7<5);

        Calculator.Calc.ScientificCalc calc = new Calculator.Calc.ScientificCalc();
        calc.AddNumber(3,4);
        
    }
}