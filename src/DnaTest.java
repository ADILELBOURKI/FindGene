
public class DnaTest {
	public String findGene(String dna) {
		
		//1-finding indexes of ATG (start) and TAA (stop)
		
		int atgIndex = dna.indexOf("ATG");
		int taaIndex = dna.indexOf("TAA");
		if(atgIndex !=-1 & (taaIndex-atgIndex)%3==0) {
		//2-extract the gene from the DNA 
		String result ="";
		result = dna.substring(atgIndex,taaIndex+3);
		//3-returning the result
		
		return result ; 
		}
		else 
			return "----No gene---";
		}
	
	//Some test cases
	public void testOne() {
		String dna = "ATGTAA";
		System.out.println(findGene(dna));
	}
	public void testTwo() {
		String dna = "AAATGCCCTAACTAGATTAAGAAACC";
		System.out.println(findGene(dna));
	}
	public void testThree() {
		String dna = "GCTTGCTGAATGGCTGTGTGCGATGCTATGTCGTCGTAGCTAAGCTGAT";
		System.out.println(findGene(dna));
	}
	public void testFour() {
		String dna = "GCTTGCTGAGCTGTGTGCGCTTCGTCGTAGCTAAGCTGAT";
		System.out.println(findGene(dna));
	}
	
	
	public static void main(String[] args) {
//		String s = "ATGATATGGTCGATGHGTAA";
		String DNA = "ATGATCGCTAATGCTAAGCTATG";
		DnaTest dnaTest = new DnaTest();
		System.out.println(dnaTest.findGene(DNA));
		System.out.println("----------------");
		dnaTest.testOne();
		dnaTest.testTwo();
		dnaTest.testThree();
		dnaTest.testFour();
		
	}
}
