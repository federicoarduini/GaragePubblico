package garage;

public class Furgone extends VeicoloAMotore 
{
	protected int capacitaCarico;

	public Furgone(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, int capacitaCarico) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
		this.capacitaCarico = capacitaCarico;
	}

	public int getCapacitaCarico() {
		return capacitaCarico;
	}

	private void setCapacitaCarico(int capacitaCarico) {
		this.capacitaCarico = capacitaCarico;
	}
	
	public String toString()
	{
		String s = super.toString();
		      s += "DETTAGLI FURGONE:\n";
		      s += " - capacita' di carico: " + this.getCapacitaCarico() + " kg\n";
		
		return s;
	}
}
