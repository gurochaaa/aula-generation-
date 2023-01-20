package POOexercicios;

public class LojaDeGames1 {
	private String videoGame;
	private String spaco;
	private String aconpanhamento;
	private String jogoacp;
	private String valor;
	
	
	public String getConsole() {
		return videoGame;
	
	}
	public LojaDeGames1(String videoGame, String spaco, String aconpanhamento, String jogoacp,String valor) {
		this.videoGame = videoGame;
		this.spaco = spaco;
		this.aconpanhamento = aconpanhamento;
		this.jogoacp = jogoacp;
		this.valor = valor;
	}
	public void setConsole(String console) {
		this.videoGame = videoGame;
	}
	public String getSpaco() {
		return spaco;
	}
	public void setSpaco(String spaco) {
		this.spaco = spaco;
	}
	public String getAconpanhamento() {
		return aconpanhamento;
	}
	public void setAconpanhamento(String aconpanhamento) {
		this.aconpanhamento = aconpanhamento;
	}
	public String getJogoacp() {
		return jogoacp;
	}
	public void setJogoacp(String jogoacp) {
		this.jogoacp = jogoacp;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public void imprintInfo() {
	System.out.println("\nConsole:"+videoGame+"\nHd:"+spaco+"\nAcompanha: "+aconpanhamento+"\n 1 jogo: "+jogoacp+"\nValor:"+valor+"");
	}

	
	

}


public class LojaTeste {

	public static void main(String[] args) {

		LojaDeGames console1 = new LojaDeGames("X-box series-X","2Tb","1 Controle","Incluso GTA-V","= 3.200");
			console1.imprintInfo();
		LojaDeGames console2 = new LojaDeGames("PS5","1Tb","2 Controle","Jogo incluso FreeFire","= 4.800");
			console2.imprintInfo();
			
		
	}
	

}