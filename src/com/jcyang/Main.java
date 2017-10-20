package com.jcyang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Resume resume = new Resume();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first name: ");
        /** Name **/
        Name name = resume.getName();
        name.setFirstName(scanner.nextLine());
        System.out.println("Enter middle initial: ");
       name.setMiddleInitial(scanner.nextLine());
        System.out.println("Enter last name: ");
       name.setLastName(scanner.nextLine());
        System.out.println("Enter email: ");
        name.setEmail(scanner.nextLine());
        /** Name **/

        /** Education **/
        String repeatSwitch = "";
        ArrayList<EducationalAchievement> educations = new ArrayList<>();

        while (!repeatSwitch.equalsIgnoreCase("no")) {


        EducationalAchievement education = new EducationalAchievement();
        educations.add(education);
        System.out.println("Enter degree: ");
        education.setDegree(scanner.nextLine());
        System.out.println("Enter field: ");
        education.setField(scanner.nextLine());
        System.out.println("Enter school: ");
        education.setSchool(scanner.nextLine());
        System.out.println("Enter year: ");
        education.setYearGrad(scanner.nextLine());
            System.out.println("Would you like to enter a new educational achievement? Enter any key to continue or 'no' to exit");
        repeatSwitch = scanner.nextLine();
        }
        /** Education **/




        /** Experience **/
        repeatSwitch="";
        ArrayList<Experience> experiences= new ArrayList<>();
        while (!repeatSwitch.equalsIgnoreCase("no")){
        Experience experience = new Experience();
        experiences.add(experience);
            System.out.println("Enter title");
            experience.setTitle(scanner.nextLine());
            System.out.println("Enter company");
            experience.setCompany(scanner.nextLine());
            System.out.println("Enter duration");
            experience.setDuration(scanner.nextLine());

            String dutiesSwitch ="";
            ArrayList<String> duties = new ArrayList<>();
            experience.setDuties(duties);
            while(!dutiesSwitch.equalsIgnoreCase("no")) {
                System.out.println("Enter work duty");
                String duty = scanner.nextLine();
                experience.getDuties().add(duty);
                System.out.println("Would you like to enter a new duty? Enter any key to continue or 'no' to exit");
                dutiesSwitch = scanner.nextLine();
            }

            System.out.println("Would you like to enter a new experience? Enter any key to continue or 'no' to exit");
        repeatSwitch = scanner.nextLine();
        }

        /** Experience **/


        /**Skills**/

        repeatSwitch = "";

        ArrayList<Skill> skills = new ArrayList<>();
        while(!repeatSwitch.equalsIgnoreCase("no")){
            Skill skill = new Skill();
            skills.add(skill);
            System.out.println("Enter skill: ");
            skill.setAsset(scanner.nextLine());
            System.out.println("Enter proficiency: ");
            skill.setProficiency(scanner.nextLine());
            System.out.println("Would you like to enter a new skill? Enter any key to continue or 'no' to exit");
            repeatSwitch=scanner.nextLine();
        }

        /**Skills  **/

        String outString = name.getFirstName();
        outString+=" ";
        outString+=name.getMiddleInitial();
        outString+=" ";
        outString+=name.getLastName();
        outString+=" \n";
        outString+=name.getEmail();
        outString +="\n";
        outString +="\n";

        outString+="Education \n";
        for( EducationalAchievement entry: educations){
            outString += entry.getDegree();
            outString +=" ";
            outString += entry.getField();
            outString +=" \n";
            outString += entry.getSchool();
            outString +=", ";
            outString += entry.getYearGrad();
            outString += "\n";
        }
        outString +="\n";

        outString +="Experience \n";
        for(Experience entry: experiences){
            outString +=entry.getTitle();
            outString +="\n";
            outString +=entry.getCompany();
            outString +=", ";
            outString +=entry.getDuration();
            outString +="\n";
            int counter = 0;
            for (String e: entry.getDuties()){
                outString +=" Duty ";
                outString +=++counter;
                outString +=", ";
                outString +=e;
                outString +="\n";
            }
        }
        outString +="\n";

        outString +="Skills \n";
        for(Skill entry: skills){
            outString += entry.getAsset();
            outString += ", ";
            outString += entry.getProficiency();
            outString += "\n";
        }
        outString +="\n";

        System.out.println(outString);

    }
}

