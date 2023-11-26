public class RotateImage {
    public void rotate(int[][] matrix) {
        // transpose the matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j]; // grab a temporary value so we don't lost data
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; // swap the values
            }
        }

        // reverse each row
        for(int i = 0; i < matrix.length; i++){
            // only need to go halfway through the row as we swap as we go
            for(int j = 0; j < matrix.length / 2; j++){
                int temp = 0;
                temp = matrix[i][j]; // temporary value so we don't lose data
                matrix[i][j] = matrix[i][matrix.length-1-j]; // length -j -1 is our second pointer
                matrix[i][matrix.length-1-j] = temp; // swap the values
            }
        }
    }
}