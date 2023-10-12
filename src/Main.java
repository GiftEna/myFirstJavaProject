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
}
