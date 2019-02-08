public class VariousTasks {
   
    //example getXORProduct(5,8)
    // 5 xor 6 xor 7 xor 8 = 12
    public static int getXORProduct(int m, int n){

        int result = m^m+1;

        for(int i = m+1; i < n ; i++){
            result=result^i+1;
        }
        return result;
    }


}
