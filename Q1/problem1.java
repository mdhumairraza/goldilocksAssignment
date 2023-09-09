/* 1. Write a function to convert a decimal number string into binary string.
For example, string A contains “123” which is decimal value 123. Convert
this string into binary string. */
public class Main{
    public static String decimalToBinary(String dec){
        int num=Integer.parseInt(dec);
        if(num==0){
            return "0";
        }else{
            StringBuilder str=new StringBuilder();
            while(num > 0){
                int x=num%2;
                str.insert(0,x);
                num=num/2;
            }
            return str.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res=decimalToBinary(str);
        System.out.println(res);
    }
}
