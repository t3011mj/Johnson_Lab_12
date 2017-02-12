import java.util.Scanner;

/**
 * Created by mpjoh on 2/10/2017.
 */
public enum Roshambo {
    ROCK {
        @Override
        public boolean beats(Roshambo other) {
            return other == SCISSORS;
        }
    },

    PAPER {
        @Override
        public boolean beats(Roshambo other) {
            return other == ROCK;
        }
    },

        SCISSORS{
            @Override
            public boolean beats (Roshambo other){
                return other == PAPER;
            }
        };

    public abstract boolean beats(Roshambo other);
    @Override

    // public static Type parseType(String value){
        //if /else logic here to return either ROCK, PAPER or SCISSOR

        //if value is not either, you can return null
    // }


    public String toString(){
        if (this.ordinal() == 0)
            return "ROCK";
        if (this.ordinal() == 1)
            return "PAPER";
        if (this.ordinal() == 2)
            return "SCISSORS";
        return "";
    }
}