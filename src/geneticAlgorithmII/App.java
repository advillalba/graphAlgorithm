package geneticAlgorithmII;

public class App {
	public static void main(String[] args) {
		GeneticAlgorithms geneticAlgorithms = new GeneticAlgorithms();
		Population population = new Population(100);
		
		population.initialize();
		
		int geneticCounter = 0;
		
		while( geneticCounter != Constants.SIMULATION_LENGTH) {
			++geneticCounter;
			System.out.println("Generation: "+ geneticCounter + " - fittest is: " + population.getFittestIndividual().getFitness());
			System.out.println(population.getFittestIndividual()+"\n");
			population = geneticAlgorithms.evolvePopulation(population);
		}
		
		System.out.println("Solution found!!");
		System.out.println(population.getFittestIndividual().getFitness());
	}
}
