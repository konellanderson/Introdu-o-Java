import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int contador = 0;

        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador++; // ou colocar += 2 soma de 2 em 2, e assim por diante
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador++;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);

        
        // Valor absoluto

        int numeroA = -5;
        int numeroB = 6;

        int resultado = Math.abs(numeroA)
        JOptionPane.showMessageDialog(null, resultado);
    }
}
