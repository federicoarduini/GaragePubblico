package garage;

public class Garage
{
	private VeicoloAMotore[] veicoli;
	
	public Garage()
	{
		this.veicoli = new VeicoloAMotore[15];
	}
	
	public int immettiNuovoVeicolo(VeicoloAMotore v)
	{
		for (int i = 0; i < this.veicoli.length; i++)
		{
			if (this.veicoli[i] == null)
			{
				this.veicoli[i] = v;
				return i;
			}
		}
		
		return -1;
	}
	
	public VeicoloAMotore estraiVeicolo(int posto)
	{
		if (this.veicoli[posto] != null)
		{
			VeicoloAMotore estratto = this.veicoli[posto];
			this.veicoli[posto] = null;
			return estratto;
		}
		else return null;
	}
	
	public String stampaSituazionePosti()
	{
		String s = "SITUAZIONE POSTI IN GARAGE\n";
		      s += "---------------------------------\n\n";
		      
		for (int i = 0; i < this.veicoli.length; i++)
		{
			s += "--[ Posto " + i + " ]--\n";
			if (this.veicoli[i] != null)
				s += this.veicoli[i].toString() + "\n";
			else
				s += "** vuoto **\n";
		}
		
		return s;
	}
}
