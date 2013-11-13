import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ReversiTest {

	Reversi reversi;
	
	@Before
	public void initReversi(){
		this.reversi = new Reversi();
	}
	
	@Test
	public void BlancJoueurCourantAuLancementDuJeu() {
		assertEquals("W",this.reversi.getJoueurEnCours());
	}
	
	@Test
	public void NoirJoueurCourantApresCoupDuBlanc(){
		assertEquals("B",this.reversi.coupDuJoueur().getJoueurEnCours());
	}
	
	@Test
	public void BlancJoueurCourantApresCoupDuBlancEtDuNoir(){
		assertEquals("W",this.reversi.coupDuJoueur().coupDuJoueur().getJoueurEnCours());
	}
	
	@Test
	public void TableDeJeuEtatInitial(){
		assertArrayEquals(new String[][]
				{{"", "", "", "", "", "", "", ""}, 
				{"", "", "", "", "", "", "", ""}, 
				{"", "", "", "", "", "", "", ""}, 
				{"", "", "", "B", "W", "", "", ""}, 
				{"", "", "", "W", "B", "", "", ""}, 
				{"", "", "", "", "", "", "", ""}, 
				{"", "", "", "", "", "", "", ""}, 
				{"", "", "", "", "", "", "", ""}, 
	            },this.reversi.getTableDeJeu());
	}
		
	@Test
	public void TableDeJeuEtatInitialAvecPossibilites(){
		assertArrayEquals(new String[][]
				{{"", "", "", "", "", "", "", ""}, 
				{"", "", "", "", "", "", "", ""}, 
				{"", "", "", "o", "", "", "", ""}, 
				{"", "", "o", "B", "W", "", "", ""}, 
				{"", "", "", "W", "B", "o", "", ""}, 
				{"", "", "", "", "o", "", "", ""}, 
				{"", "", "", "", "", "", "", ""}, 
				{"", "", "", "", "", "", "", ""}, 
	            },this.reversi.getTableDeJeuAvecPossibilites());
	}
	

}
