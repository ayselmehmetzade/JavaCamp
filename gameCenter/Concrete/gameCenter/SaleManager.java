package gameCenter;

public class SaleManager implements SaleService{

//	private CampaignService campaingService;
//	
//	public SaleManager(CampaignService campaingService) {
//		this.campaingService = campaingService;
//	}

	@Override
	public void sale(Game game, User user, Campaign campaign) {
//		campaingService.add(campaign);
		
		System.out.println(campaign.getCampaignName() + "'n�n uygulam�� oldu�u %" + campaign.getDiscount()+"indirim ile " 
		+ game.getGameName() +"oyunu " + user.getFirstName()+" " + user.getLastName()+" taraf�ndan sat�n al�nd�");
		
		
		
	}

}
