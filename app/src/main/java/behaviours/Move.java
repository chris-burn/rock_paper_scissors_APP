package behaviours;

/**
 * Created by user on 22/06/2017.
 */

public enum Move {

    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");


    private String type;

    Move(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    //    assign value to ENUM in ()

}

