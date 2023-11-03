import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 1
//        Passport passport = new Passport(121354, "Turumbekov", "Turumbekov", "15.01.03", 'M', "Kyrgyzstan");
//
//        passport.getinfo();


        //task 2
//        Student student1 = new Student("Zhigit", 20, "java");
//        Student student2 = new Student("Bili", 20, "java");
//        Student student3 = new Student("Aliaskar", 20, "java");
//        Student student4 = new Student("Aiturgan", 20, "java");
//        Student student5 = new Student("Muktar", 20, "js");
//
//        Student[] massStudent = new Student[]{student1, student2, student3, student4, student5};
//
//
//        int java = 0;
//        int js = 0;
//        for (Student student : massStudent) {
//            System.out.println(student);
//
//            if(student.group.equals("java")){
//                java++;
//            } else if (student.group.equals("js"))
//                js++;
//        }
//
//        System.out.println("Java: " + java);
//        System.out.println("Js " + js);
//
//        int summ = 0;
//        for (Student student:massStudent){
//           summ += student.age;
//        }
//
//        System.out.println("Srednee arif: " + summ / massStudent.length);



        //task 4
        Studentt studentt = new Studentt();
        studentt.name = "Nurtaazim";
        studentt.dateOfBrith = LocalDate.of(2003, 01, 15);
        studentt.phoneNumber = "00000000000000";
        studentt.nationality = "kyrgyz";

        System.out.println(studentt.name + "\n" + studentt.dateOfBrith + "\n" + studentt.phoneNumber + "\n" + studentt.nationality);

        LocalDate localDate = LocalDate.of(2003,12,12);
        LocalDate localDate1 = LocalDate.of(2003,11,12);
        LocalDate localDate2 = LocalDate.of(2003, 12, 01);

        Studentt student1 = new Studentt("Zhigit",localDate , "0707778899", "kyrgyz");
        Studentt student2 = new Studentt("Nurtaazim", localDate1, "0707778899", "kyrgyz");
        Studentt student3 = new Studentt("Aliaskar", localDate2, "0707778899", "kyrgyz");
        Studentt student4 = new Studentt("Ma", LocalDate.of(1989,11,11), "0707778899", "kyrgyz");
        Studentt student5 = new Studentt("dsd", localDate1, "0707778899", "kyrgyz");
        LocalDate localDate3 = LocalDate.now();

        Studentt[] studentts = new Studentt[]{student1, student2, student3, student4, student5};
        for (Studentt st : studentts) {
            System.out.println(st.getInfo());

        }

        System.out.println("JASHY");
        for (Studentt stt: studentts){
            System.out.println(stt.name + " " + Period.between(stt.dateOfBrith, localDate3). getYears() + " jashta");
        }
    }
}