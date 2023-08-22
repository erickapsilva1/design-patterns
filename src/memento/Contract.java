package memento;

import java.util.Calendar;

public class Contract {

    private Calendar date;
    private String costumer;
    private ContractType contractType;

    public Contract(Calendar date, String costumer, ContractType contractType) {
        this.date = date;
        this.costumer = costumer;
        this.contractType = contractType;
    }

    public Calendar getDate() {
        return date;
    }

    public String getCostumer() {
        return costumer;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void next(){
        if(contractType == ContractType.NEW) contractType = ContractType.IN_PROGRESS;
        else if (contractType == ContractType.IN_PROGRESS) contractType = ContractType.DEAL;
        else if (contractType == ContractType.DEAL) contractType = ContractType.COMPLETED;
    }

    public State saveState(){
        return new State(new Contract(this.date, this.costumer, this.contractType));
    }

}
