package day59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement loginLink = new Link();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);

        WebElement userName = new InputField();
        userName.sendKeys("wooden spoon");
        userName.click();

        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(userName);
    }
}
