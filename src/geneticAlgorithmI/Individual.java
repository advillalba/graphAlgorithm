package geneticAlgorithmI;

import java.util.Random;

import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator.Fitness;

public class Individual {
	private int[] genes;
	private int fitness;
	private Random randomGenerator;

	public Individual() {
		this.genes = new int[Constants.CROMOSOME_LENGTH];
		this.randomGenerator = new Random();
	}

	public void generateIndividual() {
		for (int i = 0; i < Constants.CROMOSOME_LENGTH; i++) {
			int gene = randomGenerator.nextInt(10);
			genes[i] = gene;
		}
	}

	public int getFitness() {
		if (fitness == 0) {
			for(int i = 0;i<Constants.CROMOSOME_LENGTH;i++) {
				if(getGene(i) == Constants.SOLUTION_SEQUENCE[i]) {
					this.fitness++;
				}
			}
		}
		return fitness;
	}

	private int getGene(int index) {
		return this.genes[index];
	}
	
	public void setGene(int index, int value ) {
		this.genes[index] = value;
		this.fitness = 0;
	}

}
