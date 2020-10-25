public class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int[][] data;

    public IntegerMatrix(int rowNum, int colNum, int[] linearData) {
        if (rowNum * colNum != linearData.length) {
            throw new IllegalArgumentException("rowNum*colNum!=linearData.length");

            this.rowNum = rowNum;
            this.colNum = colNum;
            data = new int[rowNum][colNum];
            for (int i = 0; i < linearData.length; i++) {
                int row = (int) Math.floor(i / colNum);
                int col = i % colNum;
                System.out.println(i+ " " + row + " " + col);
                data[row][col]= linearData[i];
            }
        }
    }
    
}