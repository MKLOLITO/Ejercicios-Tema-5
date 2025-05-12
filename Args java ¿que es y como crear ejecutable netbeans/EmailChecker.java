public class EmailChecker {

    // Liz Neria
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your email adress > ");
        String myEmail= scan.next();
        try{
            EmailAddress address= new EmailAddress(myEmail);
            System.out.println("your is "+ address.getHost());
        } catch (IilegalEmailException iee){
            System.out.println(iee.getMessage());
        }
    }
    
}
