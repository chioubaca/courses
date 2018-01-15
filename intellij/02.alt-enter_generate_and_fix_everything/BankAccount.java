import com.sun.javaws.exceptions.JreExecException;

public class BankAccount {

    private String iban = null;
    private String bic;

    public BankAccount(String iban, String bic) {
        this.bic = bic;
        this.iban = iban;
    }

    public boolean validateParams() throws JreExecException {
        return (bic == null || bic.length() < 3 || iban == null || iban.length() < 14);
    }
}