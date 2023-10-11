package ClasseVsInstance;

import java.util.Scanner;

public class Person {
    private int age;
    public Person(int initialAge) {
        if (initialAge > 0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }
    //method two
    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young");
        } else if (age <=18) {
            System.out.println("You are a teenager.");
        } else{
            System.out.println("You are old");
        }
    }

    //method one
    public int yearPasses() {
        return age + 1;
    }

    public static void main(String[] args) {

//        for (int i = 0; i < arrayOfAges.length; i++) {
//
//            Person person1 = new Person(arrayOfAges[i]);
//
//            System.out.println(person1.yearPasses());
//            person1.amIOld();
//            System.out.println();
//        }

        int[] arrayOfAges = {5, 10, 13, 20};

        for (int i: arrayOfAges) {
            Person person = new Person(i);

            System.out.println(person.yearPasses());
            person.amIOld();
            System.out.println();
        }
    }
}
