package mentor.lesson8;

public class RegisterRequest {
    @NotNull
    private String username;

    @NotNull
    private String password;

    private String bio;

    @Override
    public String toString() {
        return "RegisterRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }

    public RegisterRequest(String username, String password, String bio) {
        this.username = username;
        this.password = password;
        this.bio = bio;
    }
}
