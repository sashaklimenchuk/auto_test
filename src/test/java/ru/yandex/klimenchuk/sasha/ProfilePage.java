package ru.yandex.klimenchuk.sasha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    /*** конструктор класса, занимающийся инициализацией полей класса */
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /*** определение локатора меню пользователя */
    @FindBy(xpath = "//*[contains(@class, 'account__name_hasAccentLetter')]")
    private WebElement userMenu;
    /*** определение локатора кнопки выхода из аккаунта */
    @FindBy(xpath = "//*[contains(@class, 'menu-item_action_exit menu__item menu__item_type_link')]")
    private WebElement logoutBtn;

}