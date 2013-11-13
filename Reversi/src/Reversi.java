
public class Reversi {
	
	private String joueurCourant;
	private String joueurPassif;
	private String[][] tableDeJeu = new String[][]{{"", "", "", "", "", "", "", ""}, 
		{"", "", "", "", "", "", "", ""}, 
		{"", "", "", "", "", "", "", ""}, 
		{"", "", "", "", "", "", "", ""}, 
		{"", "", "", "", "", "", "", ""}, 
		{"", "", "", "", "", "", "", ""}, 
		{"", "", "", "", "", "", "", ""}, 
		{"", "", "", "", "", "", "", ""}, 
        };
	
	public Reversi(){
		this.joueurCourant = "W";
		this.joueurPassif = "B";
		this.tableDeJeu[3][3]="B";
		this.tableDeJeu[3][4]="W";
		this.tableDeJeu[4][3]="W";
		this.tableDeJeu[4][4]="B";
	}
	
	public String getJoueurEnCours() {
		return joueurCourant;
	}
	
	public Reversi coupDuJoueur() {
		this.joueurPassif = this.getJoueurEnCours();
		if(this.getJoueurEnCours() == "W")
			this.joueurCourant = "B";
		else
			this.joueurCourant = "W";
		
		return this;
	}

	public String[][] getTableDeJeu() {
		return this.tableDeJeu;
	}

	public String[][] getTableDeJeuAvecPossibilites() {
		String[][] tableDeJeuAvecPossibilites = this.tableDeJeu;
		
		for(int i=0;i<this.tableDeJeu.length;i++){
			for(int j=0;j<this.tableDeJeu.length;j++){
				
			}
		}
		
		return null;
	}

}
