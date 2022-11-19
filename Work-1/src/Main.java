public class Main {
    public static void main(String[] args) {
    CustomerManager customerManager = new CustomerManager(new ICustomerMemoryDal());
    ICustomerMemoryDal iCustomerMemoryDal = new ICustomerMemoryDal();
   // customerManager.add(new Customer(5,"","erdog",21));

     //customerManager.getById(2);
        customerManager.getAll();
       Customer customer = new Customer(2,"SS","BBB",15);
        customerManager.update(3,customer);
        customerManager.getAll();
    }
}