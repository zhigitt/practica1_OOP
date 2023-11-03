import java.time.LocalDate;

public class Studentt {
    String name;
    LocalDate dateOfBrith;
    String phoneNumber;
    String nationality;

    public String getInfo(){
        return (STR."""
                Name: \{name}
                Local Date: \{dateOfBrith}
                Phone number: \{phoneNumber}
                Nationally: \{nationality}
                """);
    }
    public Studentt(String name, LocalDate dateOfBrith, String phoneNumber, String nationality){
        this.name = name;
        this.dateOfBrith = dateOfBrith;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }
    public Studentt(){}
}
