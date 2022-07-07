package es.ulpgc.gii.hpds;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class HistoricalTokenTest
{
    Token token;
    @Before
    public void init(){
        StateList.addState("undiscovered");
        StateList.addState("discovered");
        StateList.addState("unstudied");
        StateList.addState("lost state");
        StateList.addState("stolen state");
        StateList.addState("who knows");
        StateList.addState("unknown");
        token=new Token();
    }
    @Test
    public void tokenUnStudied()
    {
        Token token=new Token();
        token.setState(2);
        assertEquals(token.getState(),"unstudied");
    }
    @Test
    public void tokenDiscovered()
    {
        Token token=new Token();
        token.setState(1);
        assertEquals(token.getState(),"discovered");
    }
    @Test
    public void tokenUnDiscovered()
    {
        Token token=new Token();
        token.setState(0);
        assertEquals(token.getState(),"undiscovered");
    }
    @Test
    public void tokenStolen()
    {
        Token token=new Token();
        token.setState(4);
        assertEquals(token.getState(),"stolen state");
    }
    @Test
    public void newTokenState()
    {
        Token token=new Token();
        StateList.addState("new state");
        token.setState(StateList.stateList.size()-1);
        assertEquals(token.getState(),"new state");
    }

}
