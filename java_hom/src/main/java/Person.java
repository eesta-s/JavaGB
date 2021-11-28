class Person {
//    ФИО, должность, email, телефон, зарплата, возраст.

    String name;
    String email;
    int zp;
    int age;
    String numberPhone;

    public Person(String name, String email, int zp, int age, String numberPhone) {
        this.name = name;
        this.email = email;
        this.zp = zp;
        this.age = age;
        this.numberPhone = numberPhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void information(){
        System.out.println(this.name + " " + this.email + " " + this.zp  + " " + this.age + " " + this.numberPhone);
    }

}
