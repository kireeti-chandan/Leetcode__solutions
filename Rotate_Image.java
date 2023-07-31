class Rotate_Image {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        for(int i=0;i<m;i++){
            for(int j=i+1 ;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++){
            int low=0;int high=m-1;
            while(low < high){
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
        }
    }
}
