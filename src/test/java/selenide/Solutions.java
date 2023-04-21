package selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Solutions {
    @Test
    void gitHubTest() {
        // Открыть страницу ГитХаб
        open("https://github.com/");
        // Навести на Solutions
        $(byText("Solutions")).hover();
        // Выбрать Enterprise
        $(byText("Enterprise")).click();
        // Убедится в наличии текста Build like the best
        $(".application-main").shouldHave(text("Build like the best"));
}
}