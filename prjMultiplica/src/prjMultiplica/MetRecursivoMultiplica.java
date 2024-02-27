package prjMultiplica;

public class MetRecursivoMultiplica {
	public int multiplicaSoma (int a, int b) 
	{
		if( b <= 1) 
		{
			return a;
		}
		return a + multiplicaSoma(a, b-1);
	}
}
