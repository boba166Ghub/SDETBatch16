package GroupTask2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}


interface TakesScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver,TakesScreenshot{
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Chrome open");
    }

    @Override
    public void close() {
        System.out.println("Chrome close");
    }

    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void navigate() {
        System.out.println("Chrome navigates");
    }

    @Override
    public void getScreenshot() {

    }
}

class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void open() {

        System.out.println("Firefox open");
    }

    @Override
    public void close() {

        System.out.println("Firefox close");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

        System.out.println("Firefox navigates");
    }

    @Override
    public void getScreenshot() {

    }
}

class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {

        System.out.println("Safari open");
    }

    @Override
    public void close() {

        System.out.println("Safari close");
    }

    @Override
    public String getTitle()
    {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Safari navigates");
    }

    @Override
    public void getScreenshot() {

    }
}

class Test {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        System.out.println("Methods available for ChromeDriver: ");
        chromeDriver.open();
        chromeDriver.close();
        chromeDriver.navigate();
        System.out.println(chromeDriver.getTitle());


        FirefoxDriver firefoxDriver = new FirefoxDriver();
        System.out.println("Methods available for FirefoxDriver: ");
        firefoxDriver.open();
        firefoxDriver.close();
        firefoxDriver.navigate();
        System.out.println(firefoxDriver.getTitle());

        SafariDriver safariDriver = new SafariDriver();
        System.out.println("Methods available for SafariDriver: ");
        safariDriver.open();
        safariDriver.close();
        safariDriver.navigate();
        System.out.println(safariDriver.getTitle());
    }
}


