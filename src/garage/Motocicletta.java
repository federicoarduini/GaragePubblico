package garage;

public class Motocicletta extends VeicoloAMotore
{
	protected String tipologia;
	protected int numeroTempiMotore;
	
	public Motocicletta(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, 
			            String tipologia, int numeroTempiMotore) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
		this.tipologia = tipologia;
		this.numeroTempiMotore = numeroTempiMotore;
	}

	public String getTipologia() {
		return tipologia;
	}

	public int getNumeroTempiMotore() {
		return numeroTempiMotore;
	}

	private void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	private void setNumeroTempiMotore(int numeroTempiMotore) {
		this.numeroTempiMotore = numeroTempiMotore;
	}
	
	public String toString()
	{
		String s = super.toString();
		      s += "DETTAGLI MOTOCICLETTA:\n";
		      s += "- Tipologia: " + this.getTipologia() + "\n";
		      s += "- numero tempi del motore: " + this.getNumeroTempiMotore() + "\n";
		      
		return s;
	}
}
