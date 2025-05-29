public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("Hello", 2531, "hello@hello.com");
        System.out.println(c.getName());
        System.out.println(c.getEmail());
        System.out.println(c.getCreditLimit());

        Customer cus = new Customer();
        System.out.println(cus.getName());
        System.out.println(cus.getEmail());
        System.out.println(cus.getCreditLimit());
    }

}

