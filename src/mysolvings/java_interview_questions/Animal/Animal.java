package mysolvings.java_interview_questions.Animal;

public abstract class Animal {
    //Write an abstract class Animal that contains 2 instance variables: name and age.
    //
    //Provide getters and setters for these variables. Add an abstract method getAgeInHumanYears() that returns int.
    //Define 2 args constructor that initializes instance variables.
    //Write a class Dog that extends the Animal class. Define 2 instance variables for this class: breed (String) and humanYears (int).
    //
    //Add a constructor that accepts three String parameters.
    // The value of the first is used to initialize the value of name,
    // the value of the second is used to initialize age and the value of the third is used to initialize breed.
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract int getAgeInHumanYears();

    public Animal(String name,int age){
        this.name=name;
        this.age= age;
    }
}
