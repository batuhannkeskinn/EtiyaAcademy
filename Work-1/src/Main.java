public class Main {
    public static void main(String[] args) {
    CustomerManager customerManager = new CustomerManager(new ICustomerMemoryDal());
    ICustomerMemoryDal iCustomerMemoryDal = new ICustomerMemoryDal();
    //-----------------------------ADD---------------------------------------------------------------
    customerManager.add(new Customer(5,"Eren","Erdoğan",21));
    //--------------------------------GetAll----------------------------------------------------------

        customerManager.getAll();
    //----------------------------------Update-------------------------------------------
       Customer customer = new Customer(2,"SS","BBB",15);
        customerManager.update(3,customer);
    //-----------------------------------Delete----------------------------------------------
        Customer customer2 = new Customer(2,"SS","BBB",15);
        customerManager.delete(customer2);
        customerManager.getAll();
    //-----------------------------------GetById----------------------------------------------------
        customerManager.getById(2);

    }


}
