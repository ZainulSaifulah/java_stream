public class Invoice {
    Integer id;
    Double amount;
    Customer customer;
    String title;

    public Invoice() {
    }

    public Invoice(Integer id, Double amount, Customer customer, String title) {
        this.id = id;
        this.amount = amount;
        this.customer = customer;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", amount=" + amount +
                ", customer=" + customer +
                ", title='" + title + '\'' +
                '}';
    }
}
