
class Human{
  private int age;
  private String name;

  public Human(){
      System.out.println("Normal Default Constructor");
  }

    public  Human(int age, String name){
        {/*
          This is the Parametrized Constructor
        */}
        this.age = age;
        this.name = name;

        System.out.println("In The Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Static {

    public static void main(String[] args){

        MobilePhone phone1 = new MobilePhone();
        phone1.Model = "iphone 13";
        phone1.price = 150000;

        MobilePhone phone2 = new MobilePhone();
        phone2.Model = "Iphone 14";
        phone2.price = 180000;

        phone1.printdetails();
        phone2.printdetails();

        Human h1 = new Human(20,"Ankit");
        System.out.println(h1.getAge());

        System.out.println(h1.getName());
    }
}
