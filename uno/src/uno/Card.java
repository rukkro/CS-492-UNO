package uno;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Card {
    private String value,color;
    private boolean special;
    private Object button;
    
    //Initializes Cards
    public Card(String value, String color, boolean special){
        this.value = value;
        this.color = color;
        this.special = special;
    }
    public boolean isSpecial(){
        return this.special;
    }
    public String getValue(){
        return this.value;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String s){
        this.color = s;
    }
    public void setButton(Object button){
        this.button = button;
    }
    public Object getButton(){
        return this.button;
    }
    public String getImage(){
        return "/resources/cards/" + this.color + "_" + this.value + ".png";
    }
    public String toString(){
        return this.color + " " + this.value + " special:" + this.special + " image:" + this.getImage();
    }
}
