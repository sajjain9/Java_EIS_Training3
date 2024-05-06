package src;

class Calculate{
    //sum : two integers
    public static void sum(int a, int b){
        System.out.println(a+b+10);
        System.out.println("Adding two integers");
        System.out.println("difference of two numbers:"+ sub(a,b));
    }

    public static int sub(int a, int b){
        return a-b;
    }
    public static void main(String[] argv) {
        sum(5,5);
    }
}