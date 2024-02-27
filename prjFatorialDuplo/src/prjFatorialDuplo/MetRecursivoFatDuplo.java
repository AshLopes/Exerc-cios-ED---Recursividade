package prjFatorialDuplo;

public class MetRecursivoFatDuplo {
	public int fatorialDuplo(int a) 
	{
		if (a <= 1) 
		{
			return 1;
		}
		return a * fatorialDuplo(a - 2);
	}
}
