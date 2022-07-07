package es.ulpgc.gii.hpds;

import java.util.ArrayList;

public class Token {
    private int state;

    public Token() {

        this.state = 0;
    }
    public void setState(int state){
        this.state = state;
    }
    public boolean isStateById(int idState){
        return this.state == idState;
    }
    public String getState(){
        return StateList.stateList.get(state);
    }

}
