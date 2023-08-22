package memento;

import java.util.Calendar;

public class Program {

    public static void main(String[] args) {

        History history = new History();
        Contract contract = new Contract(Calendar.getInstance(), "Fred", ContractType.NEW);

        history.add(contract.saveState());

        contract.next();
        history.add(contract.saveState());

        contract.next();
        history.add(contract.saveState());

        State previousState = history.capture(0);
        System.out.println(previousState.getState().getContractType());

    }

}
