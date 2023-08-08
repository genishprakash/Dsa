import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length,col=matrix[0].length,start=0;
        List<Integer>arr=new ArrayList<>();
        int max_count=row*col,count=0;
        while(max_count!=count){
            for(int j=start;j<col;j++){
                if(count==max_count){
                    break;
                }
                arr.add(matrix[start][j]);
                count++;              
            }
            for(int i=start+1;i<row;i++){
                if(count==max_count){
                    break;
                }
                arr.add(matrix[i][col-1]);
                count++; 
            }
            for(int j=col-2;j>=start;j--){
                if(count==max_count){
                    break;
                }
                arr.add(matrix[row-1][j]);
                count++; 
            }
            for(int i=row-2;i>=start+1;i--){
                if(count==max_count){
                    break;
                }
                arr.add(matrix[i][start]);
                count++;  
            }
            row--;
            col--;
            start++;
        }
        return arr;
    }
}
