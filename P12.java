public class P12 {

    public static void main(String[] args) {
        long triangular = 0;
        for (long i = 1; i < 999999999; i++){
            triangular += i;
            System.out.println(i);
            if (getNumberOfFactors(triangular) > 500){
                System.out.println(triangular);
                break;
            }
        }
   
    }

    private static long getNumberOfFactors(long triangular) {
        long factors = 0;
        for (long i = 1; i <= triangular; i++){
            if (triangular % i == 0){
                factors++;
            }
        }
        return factors;
       
       
       
    }

}