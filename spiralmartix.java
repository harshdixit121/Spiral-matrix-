public class spiralmartix {
    public static void matris(int matrix[][]) {
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;

        // Conditon for printing spiral matrix
        while (startrow <= endrow && startcol <= endcol) {

            // top row print
            for (int i = startcol; i <= endcol; i++) {
                System.out.print(matrix[startrow][i] + " ");
            }
            // Right most part of the matrix
            for (int j = startrow + 1; j<= endrow; j++) {
                System.out.print(matrix[j][endcol] + " ");
            }
            // Left most part of the matrix
            for (int i = endcol - 1; i >= startcol; i--) {
                if (startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][i] + " ");
            
        }
            for (int j = endrow - 1; j >= startrow + 1; j--) {
                if (startcol == endcol){
                    break;
                }
                System.out.print(matrix[startcol][j] + " ");
            }
            startcol++;
        endcol--;
        startrow++;
        endcol--;
        }
        System.out.println();
    }


    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
      matris(matrix);
}
}
