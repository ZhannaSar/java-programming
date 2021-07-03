package mysolvings.java_interview_questions.Animal;

public class Dog extends Animal{
    String breed;
    int humanYears;
    public int getAgeInHumanYears(){
        if(age<=2){
            return age=age*2;
        } else{
            return 22 + ((age-2) * 5);
        }
    }
    public Dog(String name,String breed,int age){
    super(name,age);
    this.breed=breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", humanYears=" + humanYears +
                '}';
    }
}
