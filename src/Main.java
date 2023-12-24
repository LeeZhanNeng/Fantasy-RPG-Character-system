/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Newbie
 */
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("P001", "Player1");
        Player player2 = new Player("P002", "Player2");

        Warrior gideon = new Warrior("GS001", "Gideon Stoneheart", 5, "Sword", "Chainmail");
        Mage elara = new Mage("EF001", "Elara Frostweaver", 1, "Ice");
        Rogue darian = new Rogue("DW001", "Darian Whisperwind", 10, 15, "Shuriken");

        Skill whirlwindSlash = new Skill("Whirlwind Slash", "A powerful spinning attack.");
        Skill dualWielding = new Skill("Dual Wielding", "Mastering the art of dual-wielding weapons.");
        Skill frostNova = new Skill("Frost Nova", "Freezing enemies in their tracks.");
        Skill lockpicking = new Skill("Lockpicking", "Unlocking doors and chests with finesse.");

        gideon.addSkill(whirlwindSlash);
        gideon.addSkill(dualWielding);
        elara.addSkill(frostNova);
        darian.addSkill(lockpicking);

        player1.addCharacter(gideon);
        player1.addCharacter(elara);
        player2.addCharacter(darian);

        gideon.chargeAttack(darian);

        elara.castElementalSpell("Teleportation");

        darian.stab(gideon);

        gideon.shieldBlock();

        darian.evade();

        System.out.println(gideon);
        System.out.println(elara);
        System.out.println(darian);
    }
}
