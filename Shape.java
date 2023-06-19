class Shape{
    final float PI = 3.14f;
    float area(float radius){
        return PI*(radius*radius);
    }
    float area(float length, float width){
        return length*width;
    }
    void display(){
        System.out.print("Area of circle is: " + area(10) + "\n Area of Rectangle is: " + area(5,10));
    }
    public static void main(String [] args){
        Shape s = new Shape();

        s.display();
    }
}