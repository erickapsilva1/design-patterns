package memento;

public class State {

    private final Contract contract;

    public State(Contract contract){
        this.contract = contract;
    }

    public Contract getState(){
        return contract;
    }
}
