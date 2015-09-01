package Permutation;

public class Permutation {

	private int[] N ;
    private int n ;
    private String[] entrada ;
    private int r ;
 
    /**
     * entrada é seu vetor de elementos e r
     * é o tamanho da permutacao. Aqui r obrigatoriamente
     * deve ser maior que zero.
     */
    public Permutation(String[] entrada, int r) {
        this.r = r ;
        this.n = entrada.length ;
        this.N = new int[r+1] ;
        this.entrada = entrada ;
    }
 
    public boolean hasNext() {
        return this.N[this.r] == 0 ;
    }
 
    public String[] next() {
        String[] saida = new String[this.r] ;
        int i, j ;
 
        for(i=0, j=this.r-1; i < this.r; i++) {
            saida[j] = entrada[this.N[i]] ;
            j-=1 ;
        }
 
        this.N[0] += 1 ;
 
        for(i=0; i < this.r; i++) {
            if(this.N[i] == this.n) {
                this.N[i] = 0;
                this.N[i+1] += 1 ;
            }
        }
        return saida ;
    }
}
