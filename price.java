public class price {

    public static void main(String[] args) {

        double po = 23.99;
        double pd = (po * 20) /100 ;
        double pf = po - pd;

        System.out.println("The price is: $" + po + ", but the desc of 20% is: $" + (String.format("%.2f", pd)));
        System.out.println("The price final is: $" +(String.format("%.2f", pf)));
    }
}
