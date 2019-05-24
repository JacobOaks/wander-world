package game;

import engine.Engine;
import engine.Window;
import engine.logic.Logic;
import engine.logic.WorldLogic;
import engine.utils.Node;

public class Game {

    //main method
    public static void main(String[] args) {

        //create window, logic, engine, start engine
        Logic logic = new WorldLogic();
        Engine engine = new Engine(logic);
        engine.start();
    }
}
