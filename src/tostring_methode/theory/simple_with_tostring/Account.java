package tostring_methode.theory.simple_with_tostring;

public class Account {
    public static void main(String[] args) {
        Account account = new Account(1121, "111-123", 400_000L);

        String accString = account.toString(); // Account{id=1121,code=111-123,balance=400000}
        System.out.println(accString);
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


    @Override
    public String toString() {
        return "Account{id=" + id + ",code=" + code + ",balance=" + balance + "}";
    }

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