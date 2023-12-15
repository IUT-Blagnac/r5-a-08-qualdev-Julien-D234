package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails = new ArrayList<>();

    public void declareOwner(String fOwner){
        this.owner = fOwner;
    }

    public void declareTarget(String fTarget){
        this.target = fTarget;
    }

    public List<String> getCocktails(){
        return cocktails;
    }

    public void setCocktails(int n) {
    for(int i=0; i<n; i++){
        this.cocktails.add("cocktail "+n);
    }
}
    
}
