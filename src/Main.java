public class Main {
    public static void main(String[] args) {
        TwoArray t = LCS_length(new String[]{"A", "B", "C", "D", "A", "B"}, new String[]{"B", "D", "C", "A", "B", "A"});
        t.printValues();
    }

    public static TwoArray LCS_length(String[] X, String[] Y){
        int m = X.length;
        int n = Y.length;
        String[][] b = new String[m][n];
        int[][] c = new int[m][n];
        for(int i = 0; i < m; i++){
            c[i][0] = 0;
        }
        for(int j = 0; j < n; j++){
            c[j][0] = 0;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(X[i].equals(Y[j])){
                    c[i][j] = c[i-1][j-1] + 1;
                    b[i][j] = "↖";
                }
                else if(c[i-1][j] >= c[i][j-1]) {
                    c[i][j] = c[i-1][j];
                    b[i][j] = "↑";
                }
                else {
                    c[i][j] = c[i][j-1];
                    b[i][j] = "←";
                }
            }
        }
        return new TwoArray(c, b);
    }

    public void print_LCS(String[][] b, int[] X, int i, int j){
        if(i == 0 || j == 0)
            return;
        if(b[i][j].equals("↖")){
            print_LCS(b, X, i - 1, j - 1);
            System.out.print(X[i]);
        }
        else if (b[i][j].equals("↑")){
            print_LCS(b, X, i - 1, j);
        }
        else {
            print_LCS(b, X, i, j - 1);
        }
    }

}
