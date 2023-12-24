/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Newbie
 */
import java.util.ArrayList;
import java.util.List;

class Player {
    private String playerID;
    private String playerName;
    private List<Character> characters;

    public Player(String playerID, String playerName) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.characters = new ArrayList<>();
    }

    public String getPlayerID() {
        return playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }
}
