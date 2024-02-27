package prjRestoDiv;

public class MetRecursivoResto {
	public int restoDivisao (int a, int b) 
	{
 
		if(b > a) 
		{
			return a;
		}
		a = a - b;
		return restoDivisao(a, b);
	}

}
