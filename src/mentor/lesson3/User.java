package mentor.lesson3;

public class User {
    private String name;
    private String surname;

    User(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
