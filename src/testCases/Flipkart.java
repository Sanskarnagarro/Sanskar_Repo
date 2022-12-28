package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Category;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart extends SupertestNG{
	Category logger = null;
			@Test(enabled=true,priority = 4)
			public void login() throws InterruptedException {
				driver.get("https://www.flipkart.com/");
			
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8810279358");
				driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Thakur@21");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
				
				
			try {
				Thread.sleep(1500);
				} catch(InterruptedException e) {
				    System.out.println("got interrupted!");
				}
		}
			@Test(enabled=true,priority = 5)
			public void Search()  throws InterruptedException { 
				driver.get("https://www.flipkart.com/");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Iphone 11");

				
				System.out.println("Test passed");
			}
			 @Test(enabled=true,priority = 6)
			    public void grocery() throws InterruptedException {
				 driver.get("https://www.flipkart.com/");
				 Thread.sleep(3000);
				 
			        driver.findElement(By.xpath("//div[@class=\"xtXmba\"]")).click();
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//input[@class=\"_166SQN\"]")).sendKeys("121004");
			        
			    }
			 
			@Test(enabled=true,priority= 7)
			public void Mobile() throws InterruptedException {
				driver.get("https://www.flipkart.com/");
				Thread.sleep(10000);
				driver.navigate().to("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=1486c056-28dc-43ea-8369-878578bec394");
				
				Thread.sleep(2000);
				
				driver.navigate().to("https://www.flipkart.com/apple-iphone-11-white-128-gb/p/itme32df47ea6742?pid=MOBFWQ6B7KKRXDDS&lid=LSTMOBFWQ6B7KKRXDDSULUZ0N&marketplace=FLIPKART&q=mobiles&store=tyy%2F4io&srno=s_1_10&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&fm=neo%2Fmerchandising&iid=5e888504-e643-4502-baf6-b775f42ed2e2.MOBFWQ6B7KKRXDDS.SEARCH&ppt=hp&ppn=homepage&ssid=zd58tsl91c0000001670963721509&qH=eb4af0bf07c16429");
				System.out.println("Test passed");
				
			}
	@Test(enabled=true,priority = 8)
	public void Fashions() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		
		driver.navigate().to("https://www.flipkart.com/clothing-and-accessories/bottomwear/pr?sid=clo,vua&p[]=facets.ideal_for%255B%255D%3DMen&p[]=facets.ideal_for%255B%255D%3Dmen&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_d2c9cf85-ee7f-4365-be6f-1b3741f23567_1_372UD5BXDFYS_MC.8HARX8UX7IX5&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BBottom%2BWear_8HARX8UX7IX5&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L1_view-all&cid=8HARX8UX7IX5");
		 Thread.sleep(3000);
		 driver.navigate().to("https://www.flipkart.com/peter-england-university-tapered-fit-men-grey-jeans/p/itmd9c4704305314?pid=JEAGDTNKMHTZ2CH2&lid=LSTJEAGDTNKMHTZ2CH2R1MO0M&marketplace=FLIPKART&store=clo%2Fvua&srno=b_1_28&otracker=browse&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L1_view-all&fm=neo%2Fmerchandising&iid=en_xqDjgtIyaP9d4U3myrsjsAuOL1MFg5oFgN0nMTV%2F0CHjuO51hIeyzfGNqrDPFCW4oi%2F9c50PbBUFiSl85p6p%2Fg%3D%3D&ppt=browse&ppn=browse");

		System.out.println("Test passed");
		
		try {
			Thread.sleep(3000);
			} catch(InterruptedException e) {
			    System.out.println("got interrupted!");
			}		    
	}
	
			
				@Test (enabled=true,priority = 9)
				public void Electronic() throws InterruptedException {
					driver.get("https://www.flipkart.com/");
					Thread.sleep(3000);
					
					driver.navigate().to("https://www.flipkart.com/audio-video/speakers/pr?count=40&otracker=categorytree&p%5B%5D=facets.type%255B%255D%3DHome%2BAudio%2BSpeaker&p%5B%5D=facets.type%255B%255D%3DLaptop%252FDesktop%2BSpeaker&p%5B%5D=facets.type%255B%255D%3DSoundbar&sid=0pm%2F0o7&otracker=nmenu_sub_Electronics_0_Home%20Audio%20Speakers");
					Thread.sleep(3000);
					
					driver.navigate().to("https://www.flipkart.com/motorola-amphisoundx-dolby-audio-400-w-bluetooth-soundbar/p/itm20be30cfa9d13?pid=ACCG3UXC5ZATTBKY&lid=LSTACCG3UXC5ZATTBKYFGACSG&marketplace=FLIPKART&store=0pm%2F0o7&srno=b_1_17&otracker=browse&fm=organic&iid=3e4837ac-0861-43ff-ad6c-54f6ab4e2a3d.ACCG3UXC5ZATTBKY.SEARCH&ppt=browse&ppn=browse&ssid=687ymbxgmo0000001670846929757");
					Thread.sleep(1000);

					try {
						Thread.sleep(3000);
						} catch(InterruptedException e) {
						    System.out.println("got interrupted!");
						}
				}
				@Test(enabled=true,priority = 10)
				public void HomeDecor() throws Exception {
						Thread.sleep(3000);
							driver.get("https://www.flipkart.com/");
						driver.navigate().to("https://www.flipkart.com/home-decor/pr?sid=arb&marketplace=FLIPKART&otracker=nmenu_sub_Home%20%26%20Furniture_0_Home%20Decor&fm=neo%2Fmerchandising&iid=M_03877b94-ef3e-4eae-952b-c4239dda876d_1_372UD5BXDFYS_MC.YSSCYSKQOXI0&otracker=hp_rich_navigation_6_1.navigationCard.RICH_NAVIGATION_Home~Home%2BDecor_YSSCYSKQOXI0&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_6_L1_view-all&cid=YSSCYSKQOXI0");
						Thread.sleep(3000);
							
						driver.navigate().to("https://www.flipkart.com/god-god-s-adiyogi-745-medium-self-adhesive-sticker/p/itm46420182c063d?pid=STIFST4YFVXVKMYS&lid=LSTSTIFST4YFVXVKMYSKJRD2T&marketplace=FLIPKART&store=arb&srno=b_1_10&otracker=nmenu_sub_Home%20%26%20Furniture_0_Home%20Decor&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_6_L1_view-all&fm=organic&iid=113addcd-e4d4-408f-ad9b-74c2ee6a391f.STIFST4YFVXVKMYS.SEARCH&ppt=browse&ppn=browse&ssid=quaweplms00000001670847148610");
						Thread.sleep(1000);
						
						try {
							Thread.sleep(1500);
							} catch(InterruptedException e) {
							    System.out.println("got interrupted!");
						}
						}
				
				@Test(enabled=true,priority = 11)
				public void appliances() throws InterruptedException {
					driver.get("https://www.flipkart.com/");
					Thread.sleep(3000);
					
					driver.navigate().to("https://www.flipkart.com/tvs-and-appliances-new-clp-store?fm=neo%2Fmerchandising&iid=M_c8727947-dd1b-4d7a-97e1-2d4d71ac1bfc_1_372UD5BXDFYS_MC.LO4IWVHA61BX&otracker=hp_rich_navigation_6_1.navigationCard.RICH_NAVIGATION_Appliances_LO4IWVHA61BX&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_6_L0_view-all&cid=LO4IWVHA61BX");
					
					driver.navigate().to("https://www.flipkart.com/televisions/~cs-9vjhgm32fy/pr?sid=ckf%2Cczl&collection-tab-name=Best+deals+on+Premium+TVs&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&param=hsgvdgbdgdg&otracker=clp_creative_card_1_7.creativeCard.CREATIVE_CARD_tvs-and-appliances-new-clp-store_I0CJUSU8RRIZ&fm=neo%2Fmerchandising&iid=M_34d75141-8c82-4a1a-bd29-14ca5f650967_7.I0CJUSU8RRIZ&ppt=clp&ppn=tvs-and-appliances-new-clp-store&ssid=q4ag8govww0000001670856025529");
					
					Assert.assertEquals(driver.getTitle(), "Best deals on Premium TVs - Buy Best deals on Premium TVs Online at Low Prices In India | Flipkart.com");
					try {
						Thread.sleep(3000);
						} catch(InterruptedException e) {
						    System.out.println("got interrupted!");
						}
				}
				
					@Test(enabled=true,priority= 12)

					public void viewCart()  throws InterruptedException {
											
					driver.findElement(By.xpath("//div[@class=\'KK-o3G\']"));
					Thread.sleep(3000); 
					
				
					}
				
				
					@Test(enabled=true,priority= 13)

					public void viewOrder()  throws InterruptedException {
					driver.get("https://www.flipkart.com/");
						Thread.sleep(3000); 
						Actions action = new Actions(driver);

					WebElement ele = driver.findElement(By.xpath("//div[@class='exehdJ']"));
					action.moveToElement(ele);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@class=\"_3vhnxf\"]")).click();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					}
					
					
					@Test(priority= 14)
					public void logOut()  throws InterruptedException {
						Thread.sleep(3000);  
						
						logger.info("testong");
						
						Actions action = new Actions(driver);

						WebElement ele = driver.findElement(By.xpath("//div[@class='exehdJ']"));
						action.moveToElement(ele).perform();
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//*[text()='Logout']")).click();
						
					}

		}			 
				