package staragile.Abstractdemos;

public   class Rectangle extends shape implements printable{
    int length;
    int breadth;
    public Rectangle(int length,int breadth)
    {
      this.length=length;
      this.breadth=breadth;
    }
    @Override
    public void calculatearea() {
     System.out.println("Area="+length*breadth);
    }
    public void print() {
        System.out.println("This is rectangle");
    }
}
