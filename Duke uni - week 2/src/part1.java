
public class part1 {

public static String findSimpleGene (String dna) {
		
		// Exercise to find a gene within a DNA string
		// a gene starts with 'STA' and ends with 'STO', and can be divided by 3
		String result;
		int index = dna.indexOf("STA");
		
		while (true) {
			
			if(index == -1 || index >= dna.length() - 3) {
				return "";
		}
		
		int indexStop = dna.indexOf("STO");
		if (indexStop == -1) {
			return "";
		}
		
		
		result = dna.substring(index, indexStop+3);
		
		if((indexStop - index +1) % 3 !=0) {
			System.out.println("This gene strand does not divide by 3");
		}
		
		return result;
		}
	}
	
	public static void main(String[] args) {
	
	System.out.println("Exercise: find gene within a DNA strand");
	System.out.println("-----------------------");
		
	String dna = "XXXSTAXXXXXXXXSTOXXXXXX";
	System.out.println("DNA strand is " + dna);
	String gene = findSimpleGene(dna);
	System.out.println("Gene strand is " + gene);
	System.out.println("-----------------------");
	
	dna = "XSTAXXXXXXSTO";
	System.out.println("DNA strand is " + dna);
	gene = findSimpleGene(dna);
	System.out.println(gene);
	System.out.println("-----------------------");
	
	// DNA strand with no genes
	dna = "XXXXXX";
	System.out.println("DNA strand is " + dna);
	gene = findSimpleGene(dna);
	System.out.println(gene);
	
	}
}

