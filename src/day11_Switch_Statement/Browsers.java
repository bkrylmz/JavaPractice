package day11_Switch_Statement;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "firefox";
        boolean validBrowser = browserName == "chrome" || browserName == "firefox" ||
                browserName == "opera" || browserName == "safari" || browserName == "edge";
        if(validBrowser) {
            if (browserName == "chrome") {
                System.out.println("Your browser is " + browserName);

            } else if (browserName == "firefox") {
                System.out.println("Your browser is " + browserName);

            } else if (browserName == "opera") {
                System.out.println("Your browser is " + browserName);

            } else if (browserName == "safari") {
                System.out.println("Your browser is " + browserName);

            } else if (browserName == "edge") {
                System.out.println("Your browser is " + browserName);

            } else {
                System.out.println("Invalid Browser Name");
            }
        }

    }
}
