public class IntegerToEnglish {
    public static String numberToWords(int num){
        String [] ones = {"", " One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"};
        String [] one = {"", "One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String [] tens = {""," Ten"," Twenty"," Thirty"," Fourty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninety"};
        String [] Hundred = {""," Hundred"," Hundred"," Hundred"," Hundred"," Hundred"," Hundred"," Hundred"," Hundred"," Hundred"};
        String [] Million = {""," Million"," Million"," Million"," Million"," Million"," Million"," Million"," Million"," Million"};
        String [] Thousand = {""," Thousand"," Thousand"," Thousand"," Thousand"," Thousand"," Thousand"," Thousand"," Thousand"," Thousand"};
        String [] Billion = {""," Billion"," Billion"," Billion"," Billion"," Billion"," Billion"," Billion"," Billion"," Billion"};

        //234,567,891

        /* num/1000000 */
        return one[num/1000000000] + Billion[num/1000000000] + ones[(num%1000000000)/100000000] 
        + Hundred[(num%1000000000)/100000000] + tens[(num%100000000)/10000000] + ones[(num%10000000)/1000000] + Million[(num%10000000)/1000000] + ones[num/100000] 
        + Hundred[(num%1000000)/100000] + tens[(num%100000)/10000] + ones[(num%10000)/1000] + Thousand[(num%10000)/1000] + ones[(num%1000)/100] 
        + Hundred[(num%1000)/100] + tens[(num%100)/10] + ones[num/1];
    }

    public static void main(String [] args){
        System.out.println(numberToWords(12345));
    }
}
