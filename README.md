### BreadthFirstSearch(BFS)
Amplitude Search, useful for a first view of the environment, use Java queue, First In First Out. Is slow.

### DeepFirstSearch(DFS)
Depth search, useful to find a deep node on a node tree, use Java Stack, Last in First Out.

### Iterative deepening depth-first search(IDDFS)
Combine BFS and DFS, more efficient

```java
bool IDDFS(src, target, max_depth)
    for limit from 0 to max_depth
       if DLS(src, target, limit) == true
           return true
    return false   

bool DLS(src, target, limit)
    if (src == target)
        return true;

    // If reached the maximum depth, 
    // stop recursing.
    if (limit <= 0)
        return false;   

    foreach adjacent i of src
        if DLS(i, target, limit?1)             
            return true

    return false
    
```
 
### BruteForceSearch
Consists of systematically enumerating all possible candidates for the solution and checking whether each candidate satisfies the problem's statement. Always get the best solution. Is slow.

```java
c ← first(P)
while c ≠ Λ do
 if valid(P,c) then output(P, c)
 c ← next(P,c)
 
end while
```

### RandomSearch(Stochastic search)
It has finite iterations. Given a defined function, we assume that the first given value is the optimum, we take an other random value of the given function and if its higher that the last value, we store it as new optimum value. The algorithm generate random values of the given function and it store the higher value as optimum. Not always is the best solution, but is an acceptable solution. We have to define how many random values we want to generate.

### HillClimbing
Given a defined function we can get the best local optimum value. Using a defined initial value, we have to check the next value and, if its greater, we store it. The algorithm finish when the next value is lower than the stored one.

### SimulatedAnnealing
Similar to Hillclimbing algorithm, but we accept some errors. The number of accepted errors is defined by the temperature, when we find a lower value than the current one, we decrease the current temperature until we dont accept more errors. Is a good algorithm because we get the global optimum value.

### Genetic Algorithms
Metaheuristic algorithm inspired by the process of natural selection. With a initial population using binary to simulate de chromosomes of each individual, we can simulate hundreds of generations in order to get a valid solution for our problem. It works with a population wich can have these operators:
 * Crossover: Given two individiduals chromosomes from the population of one generation, we get a third individual using probability which will be based on both given chromosomes. Inspired on reproduction. 
 * Mutation: Given one individual from the population of one generation, its chromosomes can be mutated with a probability.

### Swarm Algorithm(particle algorithm)
Metaheuristic algorithm wich simulate the a insects colony. Each individual of the colony has simple instructions, alone is unable to get a global minimum/maximum but using hundreds of individuals we create an complex algorithm based on it. Each individual can find a local minimum an the other individuals can move to that minimum or follow their own path in order to find a global minimum.
