package tostring_methode.theory.simple;

/**
 * A string like tostring_methode.theory.simple.Account@27082746 is not exactly what we would like to see.
 * What we got here is the full class name and the hashcode of the object. This is the default behavior of the method toString().
 */
public class Account {
    public static void main(String[] args) {
        Account account = new Account(1L, "code", 30L);
        System.out.println(account.toString());
    }
    private long id;
    private String code;
    private Long balance;

    public Account(long id, String code, Long balance) {
        this.id = id;
        this.code = code;
        this.balance = balance;
    }

    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
