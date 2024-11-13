package staragile.collectionsDemo;

public class D06Assignment {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            System.out.println("Ankush"+i);
        }
        for (int i=1;i<=4;i++)
        {
            for(int j=1;j<=3;j++) {
                System.out.print("Row" + i + " cell" + j);
                System.out.print("\t");
            }
            System.out.print("\n");
        }

    }
}
