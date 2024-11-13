package staragile.Abstractdemos;

public class square extends  Rectangle{
    int sd;
    public square(int length,int breadth,int sd)
    {
        super(length,breadth);
        this.sd=sd;
    }
    public void calculatearea()
    {
        int area = sd*sd;
        System.out.println("Area of square"+area);
    }
}
