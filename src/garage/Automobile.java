package garage;

public class Automobile extends VeicoloAMotore
{
	protected int numeroPorte;

	public Automobile(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, int numeroPorte) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
		this.numeroPorte = numeroPorte;
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	private void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
	
	public String toString()
	{
		String s = super.toString();
		      s += "DETTAGLI AUTOMOBILE:\n";
		      s += " - numero di porte: " + this.getNumeroPorte() + "\n";
		      
		return s;
	}
}
