class Main{
    private int v1 = 7;
    protected int v2 = 70;
    public int v3 = 700;

    public static void main(String [] args)
    {
        Main m = new Main();
        System.out.println("v1=" + m.v1 + " v2=" + m.v2 + " v3=" + m.v3);
        derived d = new derived();
        d.show();
        another a = new another();
        a.show();
    }
}
class derived extends Main{
    void show(){
        System.out.println("v2 = " +v2);
    }
}
class another{
    void show(){
        Main m = new Main();
        System.out.println("v3 = " +m.v3);
    }
}