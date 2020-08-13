
public class DnaTest {
	public String findGene(String dna) {

		//1-finding indexes of ATG (start) and TAA (stop)
		int atgIndex = dna.indexOf("ATG");
		int taaIndex = dna.indexOf("TAA",atgIndex+3);
		while(taaIndex!=-1) {
			if((taaIndex-atgIndex)%3==0) {
				return dna.substring(atgIndex,taaIndex+3);
			}
			
			else {
				taaIndex=dna.indexOf("TAA",taaIndex+1);
				
			}
		}
		return "";
}

	//Some test cases
	public void testOne() {
		String dna = "AATGCGTAATTAATCG";
		System.out.println(findGene(dna));
	}
	public void testTwo() {
		String dna = "AAATGCCCTAACTAGATTAAGAAACC";
		System.out.println(findGene(dna));
	}
	public void testThree() {
		String dna = "GCTTGCTGAATGTAAGCTGTGTGCGATGCTATGTCGTCGTAGTAAGCTGAT";
		System.out.println(findGene(dna));
	}
	public void testFour() {
		String dna = "GCTTGCTGAGCTGTGTGCGCTTCGTCGTAGCTAAGCTGAT";
		System.out.println(findGene(dna));
	}


	public static void main(String[] args) {
//		//		String s = "ATGATATGGTCGATGHGTAA";
//		String DNA = "ATGATCGCTAATGCTAAGCTATG";
		DnaTest dnaTest = new DnaTest();
//		System.out.println(dnaTest.findGene(DNA));
//		System.out.println("----------------");
		dnaTest.testOne();
		dnaTest.testTwo();
		dnaTest.testThree();
		dnaTest.testFour();

	}
}
