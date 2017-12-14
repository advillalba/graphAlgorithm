package particleSwarm;

public class App {
	public static void main(String[] args) {
		ParticleSwarmOptimization optimization = new ParticleSwarmOptimization();
		optimization.solve();
		optimization.showSolution();
	}
}
