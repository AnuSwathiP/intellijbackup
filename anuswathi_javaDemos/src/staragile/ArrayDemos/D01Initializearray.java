package staragile.ArrayDemos;

public class D01Initializearray {
    public static void main(String[] args) {
        int mark[]= new int[5];
//        int mark[]= new int[]{10,20,30,40,50};
//        int mark[]= {10,20,30,40,50};
        //Index:
        //Index is zero based(Index starts with 0)
        //always +ve
        //Integer number
        mark[0]=10;
        mark[1]=20;
        mark[2]=30;
        mark[3]=40;
        mark[4]=50;
        for (int i=0;i<5;i++)
        {
            System.out.println(mark[i]);
        }

    }
}
