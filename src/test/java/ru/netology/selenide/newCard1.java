package ru.netology.selenide;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class newCard1 {



    @Test
    public void shouldDisplayRightRequest() {
        open("http://localhost:9999" );
        SelenideElement form = $("from");
        form.$("[data-test-id='name'] input").setValue("Карл Карлсон");
        form.$("[data-test-id='phone'] input").setValue("+79806314388");
        form.$("[data-test-id='agreement']").click();
        form.$("[type='button']").click();
        $("[data-test-id='order-success']").shouldHave(text("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }

}
