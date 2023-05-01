package objeto;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class obj implements Comparable{
    private int orderId;
    private String product;
    private int quantityOrdered;
    private double priceEach;
    private Date orderDate;
    private String purchaseAddress;

    public obj() {
    }

    public obj(int orderId, String product,
               int quantityOrdered,
               double priceEach,
               Date orderDate,
               String purchaseAddress) {

        this.orderId = orderId;
        this.product = product;
        this.quantityOrdered = quantityOrdered;
        this.priceEach = priceEach;
        this.orderDate = orderDate;
        this.purchaseAddress = purchaseAddress;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getPurchaseAddress() {
        return purchaseAddress;
    }

    public void setPurchaseAddress(String purchaseAddress) {
        this.purchaseAddress = purchaseAddress;
    }

    @Override
    public String toString() {
        return "obj{" +
                "orderId=" + orderId +
                ", product='" + product + '\'' +
                ", quantityOrdered=" + quantityOrdered +
                ", priceEach=" + priceEach +
                ", orderDate=" + orderDate +
                ", purchaseAddress='" + purchaseAddress + '\'' +
                '}';
    }


    public Object retornarChave(objOrdem ordenarPor) {

        if(ordenarPor == objOrdem.PORID){
            return getOrderId();
        }
        else return getProduct();


    }

    @Override
    public int compareTo(@NotNull Object o) {
        obj e  = (obj)o;
        return this.getProduct().compareToIgnoreCase(e.getProduct());
    }

}
