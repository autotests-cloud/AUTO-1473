package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("My first test")
    void generatedTest() {
        step("Open ya.ru", () -> {
            step("// todo: just add selenium action");
        });

        step("1. Type \"test search\" into the search field", () -> {
            step("// todo: just add selenium action");
        });

        step("2. Click Search", () -> {
            step("// todo: just add selenium action");
        });

        step("Verify page has a search results", () -> {
            step("// todo: just add selenium action");
        });
    }
}