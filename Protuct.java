package sample;

public class Protuct {
    private int pid;
    private String pName;
    private String pPrice;
    private String pQuantity;

    public Protuct(int pid, String pName, String pPrice, String pQuantity) {
        this.pid = pid;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pQuantity = pQuantity;
    }

    public int getPid() {
        return pid;
    }

    public String getpName() {
        return pName;
    }

    public String getpPrice() {
        return pPrice;
    }

    public String getpQuantity() {
        return pQuantity;
    }

    @Override
    public String toString() {
        return String.format("%-8d,%-30s,%-8s,%-4s",pid,pName,pPrice,pQuantity);
    }
}
