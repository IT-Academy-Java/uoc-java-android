package uoc.invoice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {

    private Date date;
    private String description;
    private int amount;
    private static int id = 0;
    private int invoiceID;

    public Invoice() {
    }

    public Invoice(Date date, String description, int amount){
        this.date = date;
        this.description = description;
        this.invoiceID = id;
        this.amount = amount;
        id++;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Invoice.id = id;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public int isLessThan(Invoice i) {
        int isLess = 0;
        if (this.date.before(i.date)) {
            isLess = -1;
        }else if (i.date.before(this.date)) {
            isLess = 1;
        }else {
            if (this.amount < i.amount) {
                isLess = -1;
            }else if (this.amount > i.amount) {
                isLess = 1;
            }else {
                isLess = 0;
            }
        }
        return isLess;
    }

    public String getDate () {
        String date = "";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        date = formatter.format(this.date);

        return date;
    }

    @Override
    public String toString() {
        return "Invoice{" +
          "date=" + date +
          "\n description='" + description + '\'' +
          "\n amount=" + amount +
          "\n invoiceID=" + invoiceID +
          '}';
    }
}
