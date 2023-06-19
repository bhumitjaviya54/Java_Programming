public class Dconstruct{
    String pname;
    int qty;
    int price;

    Dconstruct (int prodqty,String prodname, int prodprice)
    {
        pname=prodname;
        qty=prodqty;
        price=prodprice;
    }

    Dconstruct(int q,String p1name)
    {
        pname=p1name;
        price = q;
        qty = price/10;
    }
    
    Dconstruct(String ppname,int pprice)
    {
        pname= ppname;
        price = (int)(pprice - (0.1));
    }

    void print()
    {
        System.out.println("Product Name:" + pname);

        System.out.println("Quantity:" + qty);

        System.out.println("Price:" + price);

    }

    public static void main(String args[]){

        Dconstruct prods = new Dconstruct("apple",10);

        Dconstruct prods1 = new Dconstruct(200,"orange");

        prods.print();

        prods1.print();

    }

}