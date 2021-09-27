package Selenium;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(DriverType type){
        DriverManager driverManager;
        switch (type){
            case CHROME:
                driverManager =new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager =new FireFoxDriverManager();
                break;
            case EDGE:
                driverManager =new EdgeDriverManager();
                break;
            default:
                driverManager = new IEDriverManager();
                break;
        }
        return driverManager;
    }
}
