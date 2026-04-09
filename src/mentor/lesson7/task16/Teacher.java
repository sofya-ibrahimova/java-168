package mentor.lesson7.task16;

public class Teacher implements Comparable<Teacher> {

    private  String name;
    private String subject;
    private int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }


    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.experience > o.experience) return 1;
        if (this.experience < o.experience) return -1;
        return 0;
    }
}
