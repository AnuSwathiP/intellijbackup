package staragile.ArrayDemos;

public class D032darray {
    public static void main(String[] args) {
        int[][]matrix= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//        System.out.println(matrix[0]);
        System.out.println(matrix[0][0]);

//        for (int i=0;i<4;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                System.out.println(matrix[i][j]+"\t");
//            }
//            System.out.println("\n");
//        }
        for (int [] m : matrix)
        {
            // traverses through number of rows
            for (int element : m)
            {
                // 'element' has current element of row index
                System.out.print( element  + "\t");
            }
            System.out.println();
        }
    }
}
