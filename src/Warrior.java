/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Newbie
 */
class Warrior extends Character {
    private String weaponType;
    private String armorType;

    public Warrior(String characterID, String characterName, int level, String weaponType, String armorType) {
        super(characterID, characterName, level);
        this.weaponType = weaponType;
        this.armorType = armorType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public void chargeAttack(Character target) {
        int damage = 0;

        if (getLevel() > 5) {
            switch (getWeaponType()) {
                case "Sword":
                    damage = 50;
                    break;
                case "Dagger":
                    damage = 20;
                    break;
                case "Crossbow":
                    damage = 50;
                    break;
                case "Staff":
                    damage = 10;
                    break;
            }
        } else {
            switch (getWeaponType()) {
                case "Sword":
                    damage = 25;
                    break;
                case "Dagger":
                    damage = 10;
                    break;
                case "Crossbow":
                    damage = 25;
                    break;
                case "Staff":
                    damage = 5;
                    break;
            }
        }
        
        if (this == target) {
            System.out.println(getCharacterName() + " can't perform a charge attack on self.");
            return;
        }

        if(getHealth()<= 0){
            System.out.println(getCharacterName() + " can't perform the action. The character is dead.");
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

    public void shieldBlock() {
        String message;

        switch (getArmorType()) {
            case "Shield":
                message = getCharacterName() + " is raising its shield.";
                break;
            case "Gauntlet":
                message = getCharacterName() + " is raising its gauntlets.";
                break;
            case "Helmet":
                message = getCharacterName() + "'s head is protected.";
                break;
            default:
                message = getCharacterName() + " I hope you're protected...somehow.";
                break;
        }
        
        if(getHealth()<= 0){
            System.out.println(getCharacterName() + " can't perform the action. The character is dead.");
            return;
        }
        
        System.out.println(message);
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
        
        return "Warrior: " +
               "\nCharacter ID: " + getCharacterID() +
               "\nName: " + getCharacterName() +
               "\nLevel: " + getLevel() +
               "\nHealth: " + getHealth() +
               "\nStatus: " + status +
               "\nWeapon: " + getWeaponType() +
               "\nArmor: " + getArmorType() +
               "\n" + skillsString.toString() + 
               "\n";
    }
}
