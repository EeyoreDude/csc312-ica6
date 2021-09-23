import java.sql.SQLOutput;

public class TwoArray {
    int[][] intArray;
    String[][] stringArray;

    public TwoArray(int[][] intArray, String[][] stringArray) {
        this.intArray = intArray;
        this.stringArray = stringArray;
    }

    public TwoArray(TwoArray other) {
        this.intArray = other.intArray;
        this.stringArray = other.stringArray;
    }

    public int[][] getIntArray() {
        return intArray;
    }

    public String[][] getStringArray() {
        return stringArray;
    }

    public void printValues(){
        System.out.println("IntArray");
        print2DArray(intArray);
        System.out.println();
        System.out.println("StringArray");
        print2DArray(stringArray);
    }

    private void print2DArray(int[][] a){
        for(int i = 0; i < a[0].length; i++){
            for(int j = 0; j < a[1].length; j++){
                System.out.print("[" + a[i][j] + "]");
            }
            System.out.println();
        }
    }

    private void print2DArray(String[][] a){
        for(int i = 0; i < a[0].length; i++){
            for(int j = 0; j < a[1].length; j++){
                if(a[i][j] != null)
                    System.out.print("[" + a[i][j] + "]");
                else
                    System.out.print("[n]");
            }
            System.out.println();
        }
    }

}
