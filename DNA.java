package csc223.sb;

public class DNA {
    
    
    public static String countNucleotides(String dna){
        int a = 0;
        int c = 0;
        int g = 0;
        int t = 0;
        // need a increment count for A, C, G, T
        for (int i = 0; i < dna.length(); i++){
            
            if (dna.charAt(i) == 'A'){
                a += 1;
            } else if (dna.charAt(i) == 'C'){
                c += 1;
            } else if (dna.charAt(i) == 'G'){
                g += 1;
            } else{
                t += 1;
            }
        }
        return String.format("%d %d %d %d", a, c, g, t);
    }


    public static String transcribe(String dna){
        return dna.replace('T','U');
    }


    public static String reverseComplement(String dna){


        String reverse_complement = new String();

        for (int i = dna.length() - 1; i >= 0; i--){
            if (dna.charAt(i) == 'A'){
                reverse_complement += 'T';
            } else if (dna.charAt(i) == 'C'){
                reverse_complement += 'G';
            } else if (dna.charAt(i) == 'G'){
                reverse_complement += 'C';
            } else{
                reverse_complement += 'A';
            }
        }
        return reverse_complement;
        
    }
    public static void main(String[] args){

        String sampleDNA1 = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        String sampleDNA2 = "GATGGAACTTGACTACGTAAATT";
        String sampleDNA3 = "AAAACCCGGT";

        System.out.println(countNucleotides(sampleDNA1));
        System.out.println(transcribe(sampleDNA2));
        System.out.println(reverseComplement(sampleDNA3));
    }
}
