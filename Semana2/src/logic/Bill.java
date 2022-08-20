package logic;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Bill {
    private String number;
    private LocalDate dateBill;
    private ArrayList<Detail> details;

    public Bill(String number, LocalDate dateBill) {
        this.number = number;
        this.dateBill = dateBill;
        details = new ArrayList<Detail>();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDateBill() {
        return dateBill;
    }

    public void setDateBill(LocalDate dateBill) {
        this.dateBill = dateBill;
    }

    public void getDateBill(LocalDate dateBill) {
        this.dateBill = dateBill;
    }

    public double getTotal() {
        double total = 0;
        for (Detail detail : details) {
            total += detail.getSubTotal();
        }
        return total;
    }

    public boolean addDetail(Detail detail) {
        if (detail.getCant() <= detail.getProduct().getStockMin()) {
            details.add(detail);
            detail.getProduct().setCant(detail.getProduct().getCant() - detail.getCant());
            return true;
        }
        return false;
    }
}
