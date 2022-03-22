package uoc.invoice;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Invoice> invoiceList = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, List<Invoice> invoiceList) {
        this.name = name;
        this.invoiceList = invoiceList;
    }

    public void addInvoice(Invoice invoice){
        this.invoiceList.add(invoice);
    }

    public int getTotalAmount(){
        int totalAmount = 0;
        for (Invoice invoice : invoiceList) {
            totalAmount+=invoice.getAmount();
        }

        return totalAmount;
    }
}
