package com.tr.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddPhotoToProfile  extends  TestBase{
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException {
    if (!app.getBoardHelper().isOnTheHomePage()) {
      app.getHeader().clickOnHomeButtonOnHeader();
    }
  }

  @Test
  public void testAddPhoto() throws InterruptedException {
    //click on avatar
    app.getUser().clickOnAvatar();
    //clickprofile
    app.getUser().clickProfileFromDropDown();

    //clickChangeProto
    app.getUser().clickChangePhoto();

    Thread.sleep(10000);

    //uploadPicture


  }

}
