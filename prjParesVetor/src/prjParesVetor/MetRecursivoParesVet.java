package prjParesVetor;

public class MetRecursivoParesVet {
	public int contaPares(int[] vet, int tam, int pares) 
	{
		if (tam < 0) 
		{ 
			return pares;
		}

		if( vet[tam] % 2 == 0) 
		{
			pares++;
		}

		return contaPares(vet, tam - 1, pares);
	}

}
