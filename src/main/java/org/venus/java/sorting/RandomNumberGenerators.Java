package sorting;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumberGenerators {
    // public void generateRandomSetToCsv(int range) {
        
    // }

    public void generateRandomSetToCsv(int range) {
        Random random = new Random();
         // Generate random number between 1 and 1,000,000

        try (FileWriter writer = new FileWriter("random_numbers.csv")) {
            writer.append("RandomNumber\n");
            for(int i = 0; i < 1_000_000; i++) {
                writer.append(String.valueOf(random.nextInt(range) + 1));
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortRandomNumbersSet() {
        List<Integer> randomNumbers = new ArrayList<>();
        try (Scanner scanner = new Scanner("random_numbers.csv")) {
            while(scanner.hasNextLine()) {
                randomNumbers.add(Integer.parseInt(scanner.nextLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(randomNumbers);
    }

    public static void main(String[] args) {
        RandomNumberGenerators rng = new RandomNumberGenerators();
        rng.generateRandomSetToCsv(1_000_000);
    }
}