package selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class dragAndDrop {
    @Test
    void dragAndDrop() {
        // Открыть страницу https://the-internet.herokuapp.com/drag_and_drop
        open ("https://the-internet.herokuapp.com/drag_and_drop");
        // Переместить прямоугольник А на место В
        $("#column-a").dragAndDropTo($("#column-b"));
        // Проверка, что прямоугольники действительно поменялись
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
}
}
