package memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<State> savedStates = new ArrayList<State>();

    public void add(State state){
        savedStates.add(state);
    }

    public State capture(int index){
        return savedStates.get(index);
    }

}
