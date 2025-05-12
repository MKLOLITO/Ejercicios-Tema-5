public class EmailAddress {

    // Liz Neria
    
    public static final char AT_SIGN = '@';
    private String email;
    
    public EmailAddress(String newEmail) throws IilegalEmailException {
        if (newEmail.indexOF(AT_SIGN)!= -1)
            email= newEmail;
        else 
            throw new IilegalEmailException (" Email address does not contain"+AT_SIGN);
    }
    public String getHost(){
        int index= email.indexOF (AT_SIGN);
        return email.substring(index + 1, email.length());
    }
}
