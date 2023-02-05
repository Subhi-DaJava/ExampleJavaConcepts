package inheritance.person_client_employee;

/**
 * the class Client has additional fields to store the contract number and status (gold or not);
 */
public class ClientSubClassFromPersonTopSuperClass extends PersonTopSuperClass {
    protected String contractNumber;
    protected boolean gold;

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }
// public getters and setters for all fields here
}
