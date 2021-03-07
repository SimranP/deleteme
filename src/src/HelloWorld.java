public class HelloWorld {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println("Hello! I am a calculator");
    System.out.println("2 + 2 = " + calculator.add(2, 2));
    System.out.println("2 - 2 = " + calculator.sub(2, 2));
  }
}
