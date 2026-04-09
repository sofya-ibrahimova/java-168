package mentor.lesson8;

public class User {

    @JsonField("user_name")
    private String name;

    @JsonField
    private Integer age;

    private String password;

    public User(String name, Integer age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}
