package Calculator;
public class Calc {

    public Calc(){
//        /
//        Default Constructor
//        /
    }

    public int AddNumber(int a,int b){
        return a+b;
    }

    public int SubtractNumber(int a,int b){
        return b - a;
    }

    public int MultiplyNumber(int a,int b){
        return a*b;
    }

    public int DivideNumber(int a,int b){
         return b/a;
    }

    public int ModuloOfNumber(int a,int b){
        return b%a;
    }

    public static class ScientificCalc extends Calc {

        public ScientificCalc(){
            System.out.println("In Scientific Calculator");
        }

        public double GetSquareRoot(double number){
             return Math.sqrt(number);
        }

        public double Get(double number){
             return Math.getExponent(number);
        }

        @Override
        public int AddNumber(int a, int b) {
            return super.AddNumber(a, b);
        }




    }
}

