import java.util.Formattable;
import java.util.List;

public class CustomerManager implements ICustomerDal{
    ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    @Override
    public List<Customer> getAll() {
        return customerDal.getAll();
    }

    @Override
    public Customer getById(int id) {
        return customerDal.getById(id);
    }

    @Override
    public void add(Customer customer) {
        customerDal.add(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerDal.delete(customer);
    }

    @Override
    public void update(int id,Customer customer) {
        customerDal.update(id,customer);
    }


}
