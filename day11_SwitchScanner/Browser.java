package day11_SwitchScanner;

public class Browser {
    public static void main(String[] args) {

        String browserName="safarii";
        String result="";

        if(browserName=="chrome" || browserName=="safari" || browserName=="firefox" || browserName=="opera"  || browserName=="edge") {
           result= (browserName == "chrome") ? "chrome" : (browserName == "safari") ? "safari" : (browserName == "firefox") ? "firefox" : (browserName == "opera") ? "opera" : "edge";
            System.out.println(result + " browser is selected");
        }else System.out.println("Invalid browser");








    }
}
