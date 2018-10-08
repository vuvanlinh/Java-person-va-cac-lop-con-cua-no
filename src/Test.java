public class Test {
    public static void main(String[] args) {
        Person person = new Person("Thanh", "Hoang Quoc Viet");
        System.out.println(person);

        Student student = new Student("Thanh", "Hoang Quoc Viet"
                , "computer", 1, 8300000);
        System.out.println(student);

        Staff staff = new Staff("Thanh", "Hoang Quoc Viet", "Codegym", 10000000);
        System.out.println(staff);
    }
}
