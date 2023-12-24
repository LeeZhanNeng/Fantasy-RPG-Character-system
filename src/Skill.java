/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Newbie
 */
class Skill {
    private String skillName;
    private String skillDescription;

    public Skill(String skillName, String skillDescription) {
        this.skillName = skillName;
        this.skillDescription = skillDescription;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }
}