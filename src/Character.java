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

class Character {
    private String characterID;
    private String characterName;
    private int level;
    private int health;
    private List<Skill> skills;

    public Character(String characterID, String characterName, int level) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.level = level;
        this.health = 100; // Default health is 100
        this.skills = new ArrayList<>();
    }

    public String getCharacterID() {
        return characterID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public void setCharacterID(String characterID) {
        this.characterID = characterID;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void levelUp() {
        level++;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }
    
    public List<Skill> getSkills() {
        return skills;
    }
}
