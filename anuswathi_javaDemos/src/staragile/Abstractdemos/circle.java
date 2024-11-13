package staragile.Abstractdemos;

public  class circle extends  shape implements  printable{
    private int rd;
    public circle(int rd)
    {
          this.rd = rd;
    }
    public void calculatearea()
    {
        double area= (3.14*rd*rd);
     System.out.println("Area="+(3.14*rd*rd));
    }

    @Override
    public void print() {
        System.out.println("This is circle");
    }
}
