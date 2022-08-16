public class IntegerToRoman {
    public String intToRoman(int num) {
        //1~4는 I로 표시, 5는 IV, 9는 IX
        //40 = XL, 90 = XC, 400 = CD, 900 = CM
        //L = 50, C = 100, D = 500 , M = 1000
        String [] M = {"","M","MM","MMM"};
        String [] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM" };
        String [] X = {"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String [] I = {"", "I","II","III","IV", "V", "VI","VII","VIII","IX"};
        
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10]; 
    }
}