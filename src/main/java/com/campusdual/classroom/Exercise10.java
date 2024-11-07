package com.campusdual.classroom;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

  // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
  // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
  // COLOR_BOLA puede ser → rojo, azul, verde
  public static void main(String[] args) {
    int count = 0;
    do {
      String ball = getBall();
      if (ball == "azul") {
        count++;
      }
      System.out.println("La bola es de color: " + ball);
    } while (count <= 1);
  }

  // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
  // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
  // lo asociaremos al valor de un color de la siguiente manera:
  // 1 → rojo
  // 2 → azul
  // 3 → verde
  public static String getBall() {
    String ball = "";
    int num = randomWithRange(1, 3);
    switch (num) {
      case 1:
        ball = "rojo";
        break;
      case 2:
        ball = "azul";
        break;
      default:
        ball = "verde";
        break;
    }
    return ball;
  }

  public static int randomWithRange(int min, int max) {
    return ThreadLocalRandom.current().nextInt(min, max);
  }
}