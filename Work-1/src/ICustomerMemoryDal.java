import java.util.ArrayList;
import java.util.List;
//Depolama Alanı Simülasyonu.
public class ICustomerMemoryDal implements ICustomerDal{
    List<Customer> customers = new ArrayList<>();

    public ICustomerMemoryDal() {
        customers.add(new Customer(1,"Batu","Keskin",21));
        customers.add(new Customer(2,"Okan","Tasin",28));
        customers.add(new Customer(3,"Kubra","Şahin",25));
        customers.add(new Customer(4,"Samet","Sertman",25));
    }
    //Customer Classından çekilmiş olan bilgileri For döngüsüne alındığı blok.
    @Override
    public List<Customer> getAll() {
       for (Customer c : customers) {
            System.out.println(c.getId()+" - "+ c.getFirstName()+" - "+c.getLastName()+" - "+c.getAge());

       }
        return null;
    }
    //getById komutunun çıktısının oluştuğu blok.
    @Override
    public Customer getById(int id) {
        System.out.println("id :"+ customers.get(id-1).getId()
                +", first name :"+ customers.get(id-1).getFirstName()
                +",  last name :"+ customers.get(id-1).getLastName()
                +", age :"+ customers.get(id-1).getAge()
        );
        return null;
    }
    
    @Override
    public void add(Customer customer) {
        customers.add(customer);
        System.out.println("Sisteme eklendi");
    }

    @Override
    public void delete(Customer customer) {
        customers.remove(customer);
    }
    //Update komutu istisna bir oluşum, İD`sine göre den Customer listesinde değiştiren blok.
    @Override 
    public void update(int id ,Customer customer) {
        customers.set(id,customer);
    }
}
