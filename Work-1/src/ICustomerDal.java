import java.util.List;

public interface ICustomerDal {
    List<Customer> getAll();
    Customer getById(int id);
    void add(Customer customer);
    void delete(Customer customer);
    //destek al
    void update(int id,Customer customer);

}
