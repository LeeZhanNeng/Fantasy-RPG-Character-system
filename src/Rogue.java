/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Newbie
 */
class Rogue extends Character {
    private int stealthLevel;
    private String daggerType;

    public Rogue(String characterID, String characterName, int level, int stealthLevel, String daggerType) {
        super(characterID, characterName, level);
        this.stealthLevel = stealthLevel;
        this.daggerType = daggerType;
    }

    public int getStealthLevel() {
        return stealthLevel;
    }

    public String getDaggerType() {
        return daggerType;
    }

    public void setStealthLevel(int stealthLevel) {
        this.stealthLevel = stealthLevel;
    }

    public void setDaggerType(String daggerType) {
        this.daggerType = daggerType;
    }

    public void stab(Character target) {
        int damage = 0;

        if (getLevel() >= 1 && getLevel() <= 3) {
            damage = 10;
        } else if (getLevel() >= 4 && getLevel() <= 5) {
            damage = 15;
        } else if (getLevel() > 5) {
            damage = 20;
        }
        
        if (this == target) {
            System.out.println(getCharacterName() + " can't perform a charge attack on self.");
            return;
        }

        if(target.getHealth()<= 0){
            System.out.println(getCharacterName() + " can't perform the action. The target is dead.");
            return;
        }
        
        if(target.getHealth() - damage > 0){
            target.setHealth(target.getHealth() - damage);
        }else{
            target.setHealth(0);
        }
        
        System.out.println(getCharacterName() + " stabbed " + target.getCharacterName() + ".");
        System.out.println(target.getCharacterName() + "'s current health: " + target.getHealth());
        if(target.getHealth()<= 0){
            System.out.println(target.getCharacterName() + "'s health has reduced to 0. " + target.getCharacterName() + " is dead.");
        }
    }

    public void evade() {
        if(getHealth()<= 0){
            System.out.println(getCharacterName() + " can't perform the action. The character is dead.");
            return;
        }
        
        if (getStealthLevel() < 5) {
            System.out.println(getCharacterName() + "'s stealth level must reach level 5 before evading attacks.");
        } else {
            System.out.println(getCharacterName() + " successfully evaded the incoming attack.");
        }
    }

    @Override
    public String toString() {
        String status = "Alive";
        if(getHealth()<= 0){
            status = "Dead";
        }
        
        StringBuilder skillsString = new StringBuilder("Skills: ");
        for (Skill skill : getSkills()) {
            skillsString.append(skill.getSkillName()).append(", ");
        }
        if (skillsString.length() > 2) {
            skillsString.setLength(skillsString.length() - 2); // Remove the trailing ", "
        }
        
        return "Rogue: " +
               "\nCharacter ID: " + getCharacterID() +
               "\nName: " + getCharacterName() +
               "\nLevel: " + getLevel() +
               "\nHealth: " + getHealth() +
               "\nStatus: " + status +
               "\nStealth Level: " + getStealthLevel() +
               "\nDagger Type: " + getDaggerType() +
               "\n" + skillsString.toString() +
               "\n";
    }
}
