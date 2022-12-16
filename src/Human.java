public class Human {
    String name;
    String town;
    int yearOfBirth;
    String jobTitle;

    Human(String name, String town, int yearOfBirth,String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() +
              " . Я работаю в должности "+getJobTitle()+  " году. Будем знакомы!";
    }
}

