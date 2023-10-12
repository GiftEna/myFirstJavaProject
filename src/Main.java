public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I am Gift");
        System.out.println("It is my first day as a programmer");
        System.out.println("I am from Nigeria and Spain");
        System.out.println("I love programming");
        String myName = "Gift";
        System.out.println("My name is " + myName);
        int myAge = 20;
        System.out.println("Iam " + myAge);
        boolean inHeilbroon = true;
        System.out.println("I am in Heilbroon: " + inHeilbroon);

        int foudingageTUM = 1868;
        String TUMfounder = "Ludwig II. von Bayern";
        int currentYear = 2023;
        System.out.println(currentYear - foudingageTUM);
        int yearsOfExistence = currentYear - foudingageTUM;

        System.out.println("Tum was founded in " + yearsOfExistence + " by " + TUMfounder);

        int timoAge = 19;
        if (myAge > timoAge) {
            System.out.println("Gift is older than Timo");
        }

        if (myAge > timoAge) {
            System.out.println("I am " + (myAge - timoAge) + " year older than Timo");
        }

        int personAge = 20;
        if (myAge == personAge) {
            System.out.println("Gift and Person are the same age " + myAge);
        }

        System.out.println(personalInformation());
        System.out.println(yearsOfExistence);
        System.out.println(schoolComparison());

        System.out.println("Time for debugging");
        System.out.print("Today I learned about:");
        System.out.println("IDE");
        System.out.println("Basic operations and variables");
        System.out.print("Very simple control flow and functions");
        System.out.println("Debugging");
        System.out.println(churchExistence());
        System.out.println(familyInfo());
        System.out.println(churchExistence());
        family();
    }

    static String personalInformation() {
        String myIntroduction = "My name is Gift, I am 20 years old, It is my first day programming Java, " +
                "I love programing";
        return myIntroduction;
    }

    static int tumExistence() {
        int foundingTUM = 1868;
        int thisYear = 2023;
        int yearsofExistence = thisYear - foundingTUM;
        return yearsofExistence;
    }

    static String schoolComparison() {
        int foundingTUM = 1868;
        int foundingRobertBoschFOS = 2002;
        if (foundingRobertBoschFOS > foundingTUM) {
            return "Robert Bosch Fos is younger than TUM";
        } else {
            return "TUM is younger than Robert Bosch FOS";
        }
    }

    static String  churchExistence() {
        int foundingYearRCCG = 2013;
        int thisYear = 2023;
        String founderOfRccgMuc = "Pastor Sam ";
        String currentPastor = "Pastor Abimbola";
        int howOldIsRccg = thisYear - foundingYearRCCG;
        String rccgInfo = "Rccg Munich was founded in the Year " +foundingYearRCCG+ " by " + founderOfRccgMuc + ".\n"
                +"The church is currently run by a woman called " + currentPastor + ".";
        String churchAge =  "The church is currently" + howOldIsRccg + "years old.";
        return rccgInfo + churchAge;
    }

    static String familyInfo() {
        String momName = "Sonia";
        String fatherName = "Efosa";
        String eldestDaughter = "Gift";
        String sonName = "Nelson";
        String middleDaughter = "Victoria";
        String lastChild = "Mary";
        String familyName = "Asemota Enabulele";
        int momAge = 39;
        int fatherAge = 49;
        int eldestDaughterAge = 20;
        int sonAge = 14;
        int middleChildAge = 12;
        int familyAge = 8;
        int totalOfFamilyMembers = 6;
        String heritage = "Nigeria";
        int sumOfAge = momAge + fatherAge + eldestDaughterAge + sonAge + middleChildAge + familyAge;
        String summaryOfAge = "All their Ages together sum the number: " + sumOfAge ;
        String summaryOfNames = "In the " + familyName + " there are " + totalOfFamilyMembers + " people who are named: "
                + "\n" + momName + " " + fatherName +  " " + eldestDaughter + " " + sonName + " " +
                middleDaughter + " " + lastChild + "\nThey are all from " + heritage +"." ;

        return summaryOfNames + "\n" + summaryOfAge;

    }

    static void family(){
        System.out.println("Gift Enabulele Asemota, 20Years old. ");
        System.out.println("Nelson Enabulele Asemota, 14 Years old.");
        System.out.println("Sonia Enabulele, 39 Years old");
        System.out.println("Victoria Asemota Enabulele, 12 years old");
        System.out.println("Efosa Asemota, 49Years old");
        System.out.println("Mary Asemota, 8 Years old");

    }
}
