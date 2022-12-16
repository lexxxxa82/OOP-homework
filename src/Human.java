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
        if (name== null ||name.isEmpty()){
            name = " информация не указана";
        }
        return name;
    }

    public String getTown() {
        if (town== null ||town.isEmpty()){
            town = " информация не указана";
        }
        return town;
    }

    public int getYearOfBirth() {
        if (yearOfBirth<0) {
            yearOfBirth = 0;
        }
        return yearOfBirth;
}


    public String getJobTitle() {
        if (jobTitle== null ||jobTitle.isEmpty()){
            jobTitle = " информация не указана";
        }
        return jobTitle;
    }

    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() +
              " . Я работаю в должности "+getJobTitle()+  " году. Будем знакомы!";
    }
}

