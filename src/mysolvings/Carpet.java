package mysolvings;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    public boolean isPersian;

    public Carpet(){
        width=300;
        length=300;
        totalPrice = 200;
        unitPrice=0;
        isPersian=false;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian){
        this.width=width;
        this.length=length;
        this.unitPrice =unitPrice;
        this.isPersian=isPersian;
        totalPrice=(width+length)*unitPrice;
        if(isPersian){
            totalPrice+=200;
        }

    }
}
