public class Vetor01 {
    public static void main(String[] args) {
        int[] n = {2, 3, 8, 7, 5, 4};
        System.out.println("Total de casas de N: " + n.length);
        for (int c = 0; c <= n.length-1; c++) {
            System.out.println("Na posição " + c + " temos o valor  " + n[c]);
        }
    }
}
