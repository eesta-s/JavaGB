import java.util.stream.Stream;

public class JavaApp {
        public static void main (String[] args){
            Person[] persArray = {
                    new Person("Oleg", "gffw@mail.ru", 120450, 23, "89991001010"),
                    new Person("Adam", "erye@mail.ru", 137900, 47, "89992002020"),
                    new Person("Dima", "iuytr@mail.ru", 123400, 34, "89993003030"),
                    new Person("Misha", "eyye@mail.ru", 136000, 42, "89994004040"),
                    new Person("Maks", "ethbb@mail.ru", 145000, 37, "89995005050"),
            };
            for (Object inf: persArray) {
                Person p = (Person) inf;
                if (p.getAge() > 40) {
                        p.information();
                    }
                }
//            Stream.of(persArray).forEach(Person::information);
        }
    }
