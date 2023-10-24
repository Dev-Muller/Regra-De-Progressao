package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int numActivities = scanner.nextInt();

    String[] nameActivities = new String[numActivities];
    double[] weightActivities = new double[numActivities];
    double[] nota = new double[numActivities];

    int totalWeight = 0;

    for (int i = 0; i < numActivities; i++) {
      System.out.print("Digite o nome da atividade " + (i + 1) + ": ");
      scanner.nextLine();
      nameActivities[i] = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + (i + 1) + ": ");
      weightActivities[i] = scanner.nextDouble();

      totalWeight += weightActivities[i];

      System.out.print("Digite a nota obtida para " + nameActivities[i] + ": ");
      nota[i] = scanner.nextDouble();
    }

    if (totalWeight != 100) {
      System.out.print("A soma dos pesos é diferente de 100!");
      return;
    }
  }
}