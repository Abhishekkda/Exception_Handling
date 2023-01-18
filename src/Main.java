public class Main {
    public static void main(String[] args) {

        System.out.println("Before");
        int i =10;
        int j = 0; //use 5 to change catch block
        try {
            int k = i / j;

            int arr[] = {1,2,3,4};
            System.out.println(arr[5]); //won't work as there is excep above it
        }
        catch (ArithmeticException e) { //ArrayIndexOutOfBoundsException will not work as it catches diff exception
            //Exceptio will work here because it is parent class
            System.out.println("Hey idiot,you divided by zero " +e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hey idiot,that's array exception");
        }
        catch(Exception e){
            System.out.println("Exception Handled");
        } // can't be written before afore excep due to error as others can't be reached
        finally {
            System.out.println("Finally Executed");
        }//definitely will be executed whether exception is caught or not

        System.out.println("After");


//        try {
//            fun(5);
//        } catch (RuntimeException e) {
//            System.out.println("Bhai abhi chota hai tu " +e.getMessage());
//        }
        try {
            fun();
        } catch (ArithmeticException e) {
            System.out.println("Bhai padh le!!" +e);
        }

        try {
            fun1(10);
        }
        catch (UnderAgeException e){
            System.out.println(e.getMessage());
        }

    }
    public  static void fun() throws ArithmeticException{
        int i = 10;
        int j = 0;
        System.out.println(i/j);
        System.out.println("A");
//        if(age<18){
//            throw new RuntimeException("You are under aged");
//        } // throws is written with the name of function ,diff from throw in this way
    }
    public static void fun1(int age) throws UnderAgeException{
        int i = 10;
        int j = 0;
        if(age <18){
            throw new UnderAgeException("Bhai abhi chota hai tu");
        }

    }
    public static class UnderAgeException extends RuntimeException{
        public UnderAgeException(String message){
            super(message);
        }
    }
}