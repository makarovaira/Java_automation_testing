package org.example;

import org.junit.Test;

public class DeleteNoteTest extends TestBase {
    User user = new User("9047691056", "nata091074");
    @Test
    public void deleteNote() throws InterruptedException {
        LoginData user = new LoginData("9047691056", "nata091074");
        //manager.goTo().OpenHomePage();
//        manager.login().InputLogin(user);
//        manager.login().InputPassword(user);
        //manager.noteHelper().createNote();
        manager.noteHelper().deleteNoteTest();
    }
}
