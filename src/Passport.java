import static java.lang.StringTemplate.STR;

public class Passport {
    int id;
    String name;
    String lastName;
    String yearOfBrith;
    char gender;
    String country;

    public Passport(int id, String name, String lastName, String yearOfBrith, char gender, String country){
        this.name = name;
        this.lastName = lastName;
        this.yearOfBrith = yearOfBrith;
        this.gender = gender;
        this.country = country;
    }

    public void getinfo(){
        System.out.println(STR."""
                Name: \{name}
                Last name: \{lastName}
                Year of brith: \{yearOfBrith}
                Gender: \{gender}
                Country: \{country}


                """);
    }
}
