public class ModeloSIR {

    // População total do Distrito Federal
    static final double N = 2800000;

    // Parâmetros do modelo
    static final double beta = 0.144; // Taxa de transmissão
    static final double gamma = 0.0714; // Taxa de recuperação (1/14 dias)

    // Valores iniciais
    static double S = 1845676; // População suscetível
    static double I = 923; // Casos ativos (infectados)
    static double R = 941382; // Recuperados

    // Passo de tempo (em dias)
    static final double dt = 1.0;

    // Número de dias para a simulação
    static final int diasSimulacao = 30;

    public static void main(String[] args) {
        System.out.println("Dia\tSuscetíveis\tInfectados\tRecuperados");

        // Simulação do modelo SIR por 30 dias
        for (int dia = 0; dia <= diasSimulacao; dia++) {
            System.out.printf("%d\t%.0f\t%.0f\t%.0f\n", dia, S, I, R);

            // Equações do modelo SIR
            double novoS = S - (beta * S * I / N) * dt;
            double novoI = I + ((beta * S * I / N) - (gamma * I)) * dt;
            double novoR = R + (gamma * I) * dt;

            // Atualiza os valores para o próximo dia
            S = novoS;
            I = novoI;
            R = novoR;
        }
    }
}
