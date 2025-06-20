import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class SoftAssertions {
 @Test
  void SoftAssertions () {

        //- Откройте страницу Selenide в Github
     open("https://github.com/selenide/selenide");
        //- Перейдите в раздел Wiki проекта
     $("#wiki-tab").click();
        //- Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
     $("#wiki-body").shouldHave(text("Soft assertions"));
        //- Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
     $("a[href='/selenide/selenide/wiki/SoftAssertions']").click();
     $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
     $("#wiki-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})\n" +
             "class Tests {\n" +
             "  @Test\n" +
             "  void test() {\n" +
             "    Configuration.assertionMode = SOFT;\n" +
             "    open(\"page.html\");\n" +
             "\n" +
             "    $(\"#first\").should(visible).click();\n" +
             "    $(\"#second\").should(visible).click();\n" +
             "  }\n" +
             "}"));
 }


}


