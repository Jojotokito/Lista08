package exExtra;

public class ConcatenationComparison {
    public static void main(String[] args) {
        int iterations = 100000; 

        // Usando a classe String
        long startTimeString = System.currentTimeMillis();
        
        String concatenatedString = "";
        
        for (int i = 0; i < iterations; i++) {
            concatenatedString += "a";
        }
        
        long endTimeString = System.currentTimeMillis();
        
        long elapsedTimeString = endTimeString - startTimeString;
        
        System.out.println("Tempo de concatenação usando String: " + elapsedTimeString + " ms");

        
        // Usando a classe StringBuffer
        long startTimeStringBuffer = System.currentTimeMillis();
        
        StringBuffer stringBuffer = new StringBuffer();
        
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("a");
        }
        
        long endTimeStringBuffer = System.currentTimeMillis();
        
        long elapsedTimeStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
        
        System.out.println("Tempo de concatenação usando StringBuffer: " + elapsedTimeStringBuffer + " ms");
    }
}

// A diferença de desempenho entre String e StringBuffer ocorre porque a classe String é imutável em Java, 
// o que significa que cada operação de concatenação cria um novo objeto String. Isso é ineficiente para 
// grandes quantidades de concatenações, pois muitos objetos String intermediários são criados e descartados, 
// resultando em um alto consumo de memória e tempo de processamento (eu acho :-) ).

// Por outro lado, a classe StringBuffer é mutável e permite que você altere o conteúdo da sequência sem 
// criar novos objetos, o que resulta em um desempenho melhor em operações de concatenação repetitiva, 
// pois evita a criação desnecessária de objetos intermediários. 

// Bom trabalho, monitor! :-)
