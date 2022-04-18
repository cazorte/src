package day40_FinalKeyword;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', "White", "Large", 4);
        Dog dog1 = new Dog("Max", "Husky1", 'M', "White", "Large", 4);
        Dog dog2 = new Dog("Max", "Husky2", 'M', "White", "Large", 4);

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();


        System.out.println(dog.getBreed());
        System.out.println(dog1.getBreed());
        System.out.println(dog2.getBreed());



        //01.00 da kaldım




    }

}