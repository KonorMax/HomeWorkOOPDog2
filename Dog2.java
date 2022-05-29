package HomeWorkOOPDog2;

class Dog2 {
    String name;
    String gender;
    String breedName;
    double age;
    double weight;

    Dog2(String name, double age) {
        System.out.println("My name is " + name + " and i am " + age + " years old ");
    }

    Dog2(String name, double age, String gender) {
        System.out.println("My name is " + name + " and i am " + age + " years old, and I am " + gender);
    }

    Dog2(String name, double age, String gender, double weight, String breedName) {
        System.out.println("My name is " + name + " and i am " + age + " years old, and I am " + gender + " and I am weight " + weight + " and I am breedName " + breedName);
    }

    Dog2(String name, double age, String gender, String breedName) {
        System.out.println("My name is " + name + " and i am " + age + " years old, and I am " + gender + " and I am breedName " + breedName);
    }


}

class Dog2Demo {
    public static void main(String[] args) {
        Dog2 myDog = new Dog2("Rex", 7.5);
        Dog2 hisDog = new Dog2("Dex", 15, "Male");
        Dog2 herDog = new Dog2("Chapa", 6, "female", 6.5, "Spitz");
        Dog2 yourDog = new Dog2("Pex", 12.5, "male", "Bulldog");


    }
}
