public class evenDigits {
    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896};
        System.out.println(findNumbers(num));
    }
    static  int findNumbers(int[] num){
        int count = 0;
        for(int number : num){
            if(even(number)){
                count++;
            }
        }

        return  count;
    }
    static boolean  even(int num){
        int numberofdigits = digit2(num);
        if(numberofdigits % 2 == 0){
            return  true;
        }
        return  false;
    }
    static  int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count =0;
        while (num > 0){
            count++;
            num = num/10;
        }
        return  count;
    }
    static  int digit2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}
