package com.jcyang;

import java.util.ArrayList;

public class Resume {



    private Name name;
    private ArrayList<Experience> experiences;
    private ArrayList<EducationalAchievement> educationAchievements;
    private ArrayList<Skill> skills;



    public  Resume(){
        name = new Name();
        experiences = new ArrayList<Experience>();
        educationAchievements= new ArrayList<EducationalAchievement>();
        skills = new ArrayList<Skill>();
    }



    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<Experience> experiences) {
        this.experiences = experiences;
    }

    public ArrayList<EducationalAchievement> getEducationAchievements() {
        return educationAchievements;
    }

    public void setEducationAchievements(ArrayList<EducationalAchievement> educationAchievements) {
        this.educationAchievements = educationAchievements;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}
