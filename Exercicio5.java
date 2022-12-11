public class Exercicio5 {
    /*Faça um programa com uma função chamada somaImposto.
     A função possui dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas 
     expressa em porcentagem e custo, que é o custo de um item antes do imposto. 
    A função “altera” o valor de custo para incluir o imposto sobre vendas. */
    public static void main(String[] args) {
        double sm = somaImposto(50,100);
        System.out.println(" O valor total do produto é: " +sm);
    }

    

    public static double somaImposto(double taxaImposto, double custo){
        
        taxaImposto = (taxaImposto/100);
        double totalProduto = (custo * (1 + taxaImposto));
        System.out.println(totalProduto);
        return totalProduto;

    }
    

}
