class FutureStuff {

  public static void helloWorld(){
    System.out.println("Hello World");
  }

  public static void greetUser(String userName){
    System.out.println("Hello " + userName);
  }

  public static boolean isEven(int number){
    if(number % 2 == 0){
      return true;
    }else{
      return false;
    }
  }

  public static boolean isEvenShortHand(int number){
      return (number % 2 == 0) ? true : false;
  }

  public static boolean isOverTwentyOneCheck(int age){
    return(age >= 21) ? true : false;
  }
  
  public static boolean isOverTwentyOneCheck(boolean checked){
      return checked;
  }

  public static double addition(double firstNum, double secondNum){
      return firstNum + secondNum;
  }

  public static int addition(int firstNum, int secondNum){
      return firstNum + secondNum;
  }
  
  public static void main(String[] args) {
      helloWorld();
      greetUser("Logan");
      System.out.println(isEven(3));
      System.out.println(isEven(4));
      System.out.println(isEvenShortHand(3));
      System.out.println(isEvenShortHand(4));

      System.out.println((isOverTwentyOneCheck(21)) ? "Drinking is legal for this person!" : "Do not");
      System.out.println((isOverTwentyOneCheck(17)) ? "Drinking is legal for this person!" : "Do not");
      System.out.println((isOverTwentyOneCheck(true)));
      System.out.println((isOverTwentyOneCheck(false)));

      System.out.println((addition(1, 1)));
      System.out.println((addition(16.5, 72.8)));

      AboutUser logan = new AboutUser();
      logan.setName("Logan");
      logan.setAge(17.5);
      logan.setFunnyStatus(true);
      logan.setGrade(12);

      System.out.println(logan.getName());
      System.out.println(logan.getAge());
      System.out.println(logan.getFunnyStatus());
      System.out.println(logan.getGrade());
      System.out.println(logan.getFirstInitial());
  }
}
