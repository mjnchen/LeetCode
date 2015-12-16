/**
 * Created by jchen on 6/5/15.
 */
public class BinomialCoefficient {
    // Using dynamic programming
    public int binomialCoefficient(int n, int k) {
        int[][] costMatrix= new int[n+1][k+1];
        for(int j=0;j<=k;j++){
            for(int i=0;i<=n;i++){
                if(j==0 || j==i){
                    costMatrix[i][j]=1;
                }else if(j>i){
                    costMatrix[i][j]=0;
                }else{
                    costMatrix[i][j]=costMatrix[i-1][j-1]+costMatrix[i-1][j];
                }
            }
        }
        return costMatrix[n][k];
    }
}
