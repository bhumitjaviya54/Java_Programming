class Rectangle{
    int hight;
    int width;

    Rectangle(int h, int w){
        hight = h;
        width = w;
    }
    void display(){
        // int sum = hight*width;
        // System.out.print("Hight = " + sum + "\n Width =" + sum);
        System.out.print("Hight = " + hight + "\n Width =" + width);
    }
    public static void main(String [] args){
        Rectangle r = new Rectangle(5,10);
        r.display();
    }
}