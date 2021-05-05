package gameCenter;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello");

		UserManager userManager = new UserManager(new MernisServiceAdapter());
		User user = new User();
		user.setId(1);
		user.setFirstName("Aysel");
		user.setLastName("Mehmetzade");
		user.setEmail("aysel@testcom");
		user.setPassword("1234");
		user.setIdentityNumber("147258");
		user.setBirthDate(LocalDate.of(1994, 12, 28));
		userManager.add(user);

		System.out.println("*****************");
		
		GameManager gameManager = new GameManager();
		Game game=new Game();
		game.setId(1);
		game.setGameName("valo");
		game.setDescription("fps");
		game.setPrice(50);
		
		gameManager.add(game);
		
		
		System.out.println("*****************");
		
		CampaignManager campaignManager=new CampaignManager();
		Campaign campaign=new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("Yýl sonu");
		campaign.setDiscount(15);
		
		campaignManager.add(campaign);
		
		SaleManager saleManager=new SaleManager();
		saleManager.sale(game, user, campaign);
	}

}
