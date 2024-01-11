public class Person {
    String firstName;
    String lastName;
    int age;
    int studentNumber;
    String cityOfBirth;
    double weightOfStudent;
    public Person (String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person (String firstName, String lastName, int age, int studentNumber, String cityOfBirth, double weightOfStudent){
        this(firstName,lastName, age);
        this.studentNumber=studentNumber;
        this.cityOfBirth=cityOfBirth;
        this.weightOfStudent=weightOfStudent;

    }
    public String getFirstName (){
        return this.firstName;
    }
    public String getLastName (){
        return this.lastName;
    }
    public int getAge (){
        return this.age;
    }
    public boolean isTeen (){
        return this.age>=13 && this.age<=19;
    }

}
