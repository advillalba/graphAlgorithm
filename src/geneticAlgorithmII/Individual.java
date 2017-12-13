package geneticAlgorithmII;

import java.util.Arrays;
import java.util.Random;



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
			int gene = randomGenerator.nextInt(2);
			genes[i] = gene;
		}
	}

	public double f(double x) {
		return Math.sin(x) * ((x - 2) * (x - 2)) + 3;
	}

	public double getFitness() {
		double genesToDouble = genesToDouble();
		return f(genesToDouble);
	}
	public double genesToDouble() {
		int base = 1;
		double geneInDouble = 0;
		
		for(int i=0;i<Constants.GENE_LENGTH;++i) {
			if(this.genes[i] == 1) {
				geneInDouble += base;
			}
			base *= 2;
		}
		geneInDouble /= 102.4f;
		
		return geneInDouble;
	}
	
	public int getGene(int index) {
		return this.genes[index];
	}

	public void setGene(int index, int value) {
		this.genes[index] = value;
		this.fitness = 0;
	}

	@Override
	public String toString() {
		return "Individual [genes=" + Arrays.toString(genes) + ", fitness=" + fitness + ", randomGenerator="
				+ randomGenerator + "]";
	}

}
