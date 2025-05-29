public class Customer {
    private String name;
    private long creditLimit;
    private String email;

    public String getName(){
        return this.name;
    }

    public long getCreditLimit(){
        return this.creditLimit;
    }

    public String getEmail(){
        return this.email;
    }

    //No-Argument Constructor
    public Customer(){
        this("Nobody", "nobody@gmail.com");
    }

    public Customer(String name, String email){
        this(name,1251,email);
    }

    public Customer(String name, long creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    
}
