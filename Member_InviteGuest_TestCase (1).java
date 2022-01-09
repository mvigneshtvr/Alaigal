package com.adm.Testcase;

import java.io.IOException;



import org.openqa.selenium.Keys;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.adm.commonfuctions.Commonfunction;
import com.adm.page_object.Member_InviteGuest_Pageobject;

public class Member_InviteGuest_TestCase extends Commonfunction{
	@Test(enabled=false)
	public static void inviteGuest() throws IOException {
		
		Member_InviteGuest_Pageobject .guest.click();
		Member_InviteGuest_Pageobject .invite.click();
		Member_InviteGuest_Pageobject .IG_guestname.sendKeys(readdata().getProperty("IG_guestname"));
		Member_InviteGuest_Pageobject .IG_company.sendKeys(readdata().getProperty("IG_company"));
		Select select1 = new Select(Member_InviteGuest_Pageobject .industry1);
		select1.selectByVisibleText("Tours & Travels");
		Member_InviteGuest_Pageobject .IG_companyaddress.sendKeys(readdata().getProperty("IG_companyaddress"));

		Select select2 =new Select(Member_InviteGuest_Pageobject .city1);
		select2.selectByVisibleText("Chennai");
		Select select3 =new Select(Member_InviteGuest_Pageobject .state);
		select3.selectByVisibleText("Tamilnadu");

		Member_InviteGuest_Pageobject .IG_phone.sendKeys(readdata().getProperty("IG_phone"));
		Member_InviteGuest_Pageobject .IG_email.sendKeys(readdata().getProperty("IG_email"));
		Member_InviteGuest_Pageobject .IG_idproof.sendKeys(readdata().getProperty("IG_idproof"));
		Member_InviteGuest_Pageobject .IG_business.sendKeys(readdata().getProperty("IG_business"));
		Member_InviteGuest_Pageobject .IG_photo.sendKeys(readdata().getProperty("IG_photo"));
		Member_InviteGuest_Pageobject .submit.sendKeys(Keys.ENTER);
	}

}
