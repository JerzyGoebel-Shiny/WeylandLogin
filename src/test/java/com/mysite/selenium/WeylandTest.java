package com.mysite.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;

@Config(
        browser = Browser.CHROME,
        url     = "http://jerzygoebel.com/weyland"
)

public class WeylandTest extends Locomotive {
    @Test
    public void testLoginOnWeylandMainframe(){
        setText(Weyland.LOC_BOX_USERNAME,"jerzygoe_test");
        setText(Weyland.LOC_BOX_PASSWORD,"TestPass123");
        click(Weyland.LOC_BTN_CONNECT);
        validateText(Weyland.LOC_MSG_CONNECT,"Login Successful.");
    }
}
