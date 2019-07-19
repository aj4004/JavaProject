public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello  World! I am here after adding webhooks");
    int num1 = 3,num2 = 4;
    System.out.println("Adding "+ Integer.toString(num1) + " and "+ Integer.toString(num2) +" = "+ add(num1,num2) );
  }

  private static int add(int a,int b){
  	return (a+b);
  }

}

