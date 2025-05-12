public class Excepciones3 {

    // Liz Neria

    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        int c = 0; 
        try{
            c=a/b;
            System.out.println("c="+c);
        } catch (ArithmeticException m){
            System.out.println("error message= "+m.getMessage());
            System.out.println("\n"+"Divison entre cero");
        }

    }

}
