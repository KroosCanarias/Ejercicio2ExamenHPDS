package es.ulpgc.gii.hpds;

import java.util.ArrayList;

public class HistoricalToken
{
    private ArrayList <Token> tokenList;

    public HistoricalToken( ) {
        this.tokenList = new ArrayList<>();
    }
    public void addToken(Token token){
        tokenList.add(token);
    }


}
