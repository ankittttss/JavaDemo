public class Calculator {

     //Stack:
    //- Store local variables
    //- Address of obj ( obj store in HEAP )
    //
    //Heap:
    //- Store obj. Have 2 sections: instance variables & .... (add(),....)
    //
    //Every method have own stack

    // JVM -: Virtual Machine to make the Platform Independent
    //JRE -: Java Runtime Env -: Providing the Runtime Environment.
    // Have all the Classes and check your bytecode

    // Jdk -> Jre -> Jvm -: This is the Hierarchy

    Calculator(){
      // Constructor//
    }

    public int add(int num1,int num2){
       return num1 + num2;
    }
   //Method overloading
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }


    public int Subtract(int num1,int num2){
        return num2 - num1;
    }

    public int Multiplication(int num1,int num2){
        return num1 * num2;
    }

    public int Divide(int num1,int num2){
        return num2/num1;
    }

    public int Modulo(int num1,int num2){
        return num2%num1;
    }


}
