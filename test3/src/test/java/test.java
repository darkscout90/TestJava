import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Configuration;

import java.net.URL;

public class test {
    @Test
    public void test() {
        Configuration.holdBrowserOpen = true;
        URL url = ClassLoader.getSystemClassLoader().getResource("TestSite.html");
        Selenide.open(url.toString());
        System.out.println("All ok");
    }
}
