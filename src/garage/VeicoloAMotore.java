package garage;

public abstract class VeicoloAMotore
{
	protected int annoImmatricolazione;
	protected String marca;
	protected String tipoAlimentazione;
	protected int cilindrata;
	
	public VeicoloAMotore(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata)
	{
		this.annoImmatricolazione = annoImmatricolazione;
		this.marca = marca;
		this.tipoAlimentazione = tipoAlimentazione;
		this.cilindrata = cilindrata;
	}

	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}

	public String getMarca() {
		return marca;
	}

	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	private void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private void setTipoAlimentazione(String tipoAlimentazione) {
		this.tipoAlimentazione = tipoAlimentazione;
	}

	private void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public String toString()
	{
		String s = "Veicolo: " + this.getMarca() + " - " + this.getCilindrata() + " " + this.getTipoAlimentazione() + "\n";
		      s += "immatricolato nel " + this.getAnnoImmatricolazione() + "\n";
		      s += "--------------------------------------------\n";
		      
		return s;
	}
}
