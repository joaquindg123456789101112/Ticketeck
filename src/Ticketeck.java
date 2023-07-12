import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner; // Importamos los métodos Scanner, Localtime y Localdate

public class Ticketeck {

  static int[] asientos;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Introduzco el Scanner

    int entradas = 100; // Definición de variables
    int precio1 = 2000;
    int precio2 = 4000;
    int precio3 = 10000;
    asientos = new int[entradas + 1];
    LocalDate fecha = LocalDate.of(2024, 01, 10);
    LocalTime hora = LocalTime.of(20, 00, 00);
    String lugar;
    lugar = "Francia, Paris";
    int opcion = 1;

    while (opcion != 0) { // Utilizamos el while para repetir la información mientras la variable opción
      // sea dsitinta de cero
      System.out.println(
        "En esta página puedes adquirir las entradas para ir a ver el concierto de Taylor Swift"
      );
      System.out.println();
      System.out.println(
        "El valor de la entrada para la zona lejana es: " + precio1
      );
      System.out.println(
        "El valor de la entrada para la zona media es: " + precio2
      );
      System.out.println(
        "El valor de la entrada para la zona cercana es: " + precio3
      );

      System.out.println(
        "El concierto será el " +
        fecha +
        " a las " +
        hora +
        " en " +
        lugar +
        "."
      );

      System.out.println("Menú");
      System.out.println("0 - Salir");
      System.out.println("1 - Comprar entrada");
      System.out.println("2 - Listado de entradas vendidas");
      System.out.println();

      System.out.print("Ingrese la opción: ");
      opcion = sc.nextInt();

      switch (opcion) { // Añadimos un switch para que el usuario elija que quiere hacer
        case 1:
          System.out.println("Cuantas entradas desea comprar?");
          int n = sc.nextInt();

          if (n > entradas) { // El if hace que el usuario no pueda comprar más entradas de las disponibles
            System.out.println(
              "Estas comprando más entradas de las que estan disponibles, inserte un número de entradas menor o igual a 100"
            );
          }
          if (n <= entradas) {
            System.out.println(
              "Ingrese que tipo de entrada quiere comprar (1,2 y 3)."
            );
            int tipoentrada = sc.nextInt();

            switch (tipoentrada) { // El switch le pide al usuario que elija qué tipo de entrada quiere
              case 1:
                System.out.println("Estara ubicado en la zona lejana");
                Boolean pedirAsiento = true;
                for (int i = n; i > 0; i--) {
                  pedirAsiento = true;
                  while (pedirAsiento) { // While pedirAsiento
                    System.out.print("Ingrese la fila 7, 8 o 9: ");
                    int fila = sc.nextInt();
                    if (fila == 7) {
                      System.out.println("Que asiento desea del 70 al 79 ?");
                      int asiento = sc.nextInt();
                      if (asiento >= 70 && asiento <= 79) {
                        if (asientos[asiento] == 1) {
                          System.out.println(
                            "El asiento " + asiento + " está ocupado. "
                          );
                          for (int i2 = 70; i2 <= 79; i2++) {
                            if (asientos[i2] == 0) {
                              System.out.println(
                                "Asiento " + i2 + " está libre"
                              );
                            }
                          }
                        } else {
                          System.out.println("Su asiento sera: " + asiento);

                          pedirAsiento = false;
                          asientos[asiento] = 1; // Marcamos que el asiento está ocupado.
                        }
                      } else {
                        System.out.println(
                          "Su asiento no esta dentro de la zona elegida. "
                        );
                      }
                    }
                    if (fila == 8) {
                      System.out.println("Que asiento desea del 80 al 89 ?");
                      int asiento = sc.nextInt();
                      if (asiento >= 80 && asiento <= 89) {
                        if (asientos[asiento] == 1) {
                          System.out.println(
                            "El asiento " + asiento + " está ocupado. "
                          );
                          for (int i2 = 80; i2 <= 89; i2++) {
                            if (asientos[i2] == 0) {
                              System.out.println(
                                "Asiento " + i2 + " está libre"
                              );
                            }
                          }
                        } else {
                          System.out.println("Su asiento sera: " + asiento);

                          pedirAsiento = false;
                          asientos[asiento] = 1; // Marcamos que el asiento está ocupado.
                        }
                      } else {
                        System.out.println(
                          "Su asiento no esta dentro de la zona elegida. "
                        );
                      }
                    }
                    if (fila == 9) {
                      System.out.println("Que asiento desea del 90 al 99 ?");
                      int asiento = sc.nextInt();
                      if (asiento >= 90 && asiento <= 99) {
                        if (asientos[asiento] == 1) {
                          System.out.println(
                            "El asiento " + asiento + " está ocupado. "
                          );
                          for (int i2 = 90; i2 <= 99; i2++) {
                            if (asientos[i2] == 0) {
                              System.out.println(
                                "Asiento " + i2 + " está libre"
                              );
                            }
                          }
                        } else {
                          System.out.println("Su asiento será " + asiento);
                          pedirAsiento = false;
                          asientos[asiento] = 1; // Marcamos que el asiento está ocupado.
                        }
                      } else {
                        System.out.println(
                          "Su asiento no esta dentro de la zona elegida. "
                        );
                      }
                    }
                  } // Fin While pedirAsiento
                }
                System.out.println(
                  "Como desea recibir el comprobante de pago?"
                );

                System.out.println();
                System.out.println("1- Número de telefono.");
                System.out.println("2- Correo electronico.");
                int comprobante = sc.nextInt();
                switch (comprobante) {
                  case 1:
                    System.out.println("Ingrese su número de telefono:");
                    String telefono = sc.next();
                    System.out.println("El comprobante ha sido enviado.");
                    break;
                  case 2:
                    System.out.println("Ingrese correo electronico:");
                    String gmail = sc.next();
                    System.out.println("El comprobante ha sido enviado.");
                }

                break;
              case 2:
                System.out.println("Estara ubicado en la zona media");
                Boolean pedirAsiento1 = true;
                for (int i3 = n; i3 > 0; i3--) {
                  pedirAsiento1 = true;
                  while (pedirAsiento1) { // While pedirAsiento
                    System.out.print("Ingrese la fila 4, 5 o 6: ");
                    int fila = sc.nextInt();
                    if (fila == 4) {
                      System.out.println("Que asiento desea del 40 al 49 ?");
                      int asiento1 = sc.nextInt();
                      if (asiento1 >= 40 && asiento1 <= 49) {
                        if (asientos[asiento1] == 1) {
                          System.out.println(
                            "El asiento " + asiento1 + " está ocupado. "
                          );
                          for (int i4 = 40; i4 <= 49; i4++) {
                            if (asientos[i4] == 0) {
                              System.out.println(
                                "Asiento " + i4 + " está libre"
                              );
                            }
                          }
                        } else {
                          System.out.println("Su asiento sera: " + asiento1);

                          pedirAsiento1 = false;
                          asientos[asiento1] = 1; // Marcamos que el asiento está ocupado.
                        }
                      } else {
                        System.out.println(
                          "Su asiento no esta dentro de la zona elegida. "
                        );
                      }
                    }
                    if (fila == 5) {
                      System.out.println("Que asiento desea del 50 al 59 ?");
                      int asiento1 = sc.nextInt();
                      if (asiento1 >= 50 && asiento1 <= 59) {
                        if (asientos[asiento1] == 1) {
                          System.out.println(
                            "El asiento " + asiento1 + " está ocupado. "
                          );
                          for (int i4 = 50; i4 <= 59; i4++) {
                            if (asientos[i4] == 0) {
                              System.out.println(
                                "Asiento " + i4 + " está libre"
                              );
                            }
                          }
                        } else {
                          System.out.println("Su asiento sera: " + asiento1);

                          pedirAsiento1 = false;
                          asientos[asiento1] = 1; // Marcamos que el asiento está ocupado.
                        }
                      } else {
                        System.out.println(
                          "Su asiento no esta dentro de la zona elegida. "
                        );
                      }
                    }
                    if (fila == 6) {
                      System.out.println("Que asiento desea del 60 al 69 ?");
                      int asiento1 = sc.nextInt();
                      if (asiento1 >= 60 && asiento1 <= 69) {
                        if (asientos[asiento1] == 1) {
                          System.out.println(
                            "El asiento " + asiento1 + " está ocupado. "
                          );
                          for (int i4 = 60; i4 <= 69; i4++) {
                            if (asientos[i4] == 0) {
                              System.out.println(
                                "Asiento " + i4 + " está libre"
                              );
                            }
                          }
                        } else {
                          System.out.println("Su asiento sera: " + asiento1);

                          pedirAsiento1 = false;
                          asientos[asiento1] = 1; // Marcamos que el asiento está ocupado.
                        }
                      } else {
                        System.out.println(
                          "Su asiento no esta dentro de la zona elegida. "
                        );
                      }
                    }
                  } // Fin While pedirAsiento
                }

                System.out.println("Como desea recibir el comprobante?");

                System.out.println();
                System.out.println("1- Número de telefono.");
                System.out.println("2- Correo electronico.");
                int comprobante1 = sc.nextInt();
                switch (comprobante1) {
                  case 1:
                    System.out.println("Ingrese su número de telefono:");
                    String telefono = sc.next();
                    System.out.println("El comprobante ha sido enviado.");
                    break;
                  case 2:
                    System.out.println("Ingrese correo electronico:");
                    String gmail = sc.next();
                    System.out.println("El comprobante ha sido enviado.");
                }
                break;
              case 3:
                System.out.println("Estara ubicado en la zona cercana");
                Boolean pedirAsiento2 = true;
                for (int i5 = n; i5 > 0; i5--) {
                  pedirAsiento2 = true;
                  while (pedirAsiento2) { // While pedirAsiento
                    System.out.print("Ingrese la fila 1, 2 o 3: ");
                    int fila = sc.nextInt();
                    if (fila == 1) {
                      System.out.println("Que asiento desea del 10 al 19 ?");
                      int asiento2 = sc.nextInt();
                      if (asiento2 >= 10 && asiento2 <= 19) {
                        if (asientos[asiento2] == 1) {
                          System.out.println(
                            "El asiento " + asiento2 + " está ocupado. "
                          );
                          for (int i6 = 10; i6 <= 19; i6++) {
                            if (asientos[i6] == 0) {
                              System.out.println(
                                "Asiento " + i6 + " está libre"
                              );
                            }
                          }
                        } else {
                          System.out.println("Su asiento sera: " + asiento2);

                          pedirAsiento2 = false;
                          asientos[asiento2] = 1; // Marcamos que el asiento está ocupado.
                        }
                      } else {
                        System.out.println(
                          "Su asiento no esta dentro de la zona elegida. "
                        );
                      }
                    }
                    if (fila == 2) {
                      System.out.println("Que asiento desea del 20 al 29 ?");
                      int asiento2 = sc.nextInt();
                      if (asiento2 >= 20 && asiento2 <= 29) {
                        if (asientos[asiento2] == 1) {
                          System.out.println(
                            "El asiento " + asiento2 + " está ocupado. "
                          );
                          for (int i6 = 20; i6 <= 29; i6++) {
                            if (asientos[i6] == 0) {
                              System.out.println(
                                "Asiento " + i6 + " está libre"
                              );
                            }
                          }
                        } else {
                          System.out.println("Su asiento sera: " + asiento2);

                          pedirAsiento2 = false;
                          asientos[asiento2] = 1; // Marcamos que el asiento está ocupado.
                        }
                      } else {
                        System.out.println(
                          "Su asiento no esta dentro de la zona elegida. "
                        );
                      }
                    }
                    if (fila == 3) {
                      System.out.println("Que asiento desea del 30 al 39 ?");
                      int asiento2 = sc.nextInt();
                      if (asiento2 >= 30 && asiento2 <= 39) {
                        if (asientos[asiento2] == 1) {
                          System.out.println(
                            "El asiento " + asiento2 + " está ocupado. "
                          );
                          for (int i6 = 30; i6 <= 39; i6++) {
                            if (asientos[i6] == 0) {
                              System.out.println(
                                "Asiento " + i6 + " está libre"
                              );
                            }
                          }
                        } else {
                          System.out.println("Su asiento sera: " + asiento2);

                          pedirAsiento2 = false;
                          asientos[asiento2] = 1; // Marcamos que el asiento está ocupado.
                        }
                      } else {
                        System.out.println(
                          "Su asiento no esta dentro de la zona elegida. "
                        );
                      }
                    }
                  } // Fin While pedirAsiento
                }
                System.out.println(
                  "Como desea recibir el comprobante de pago?"
                );

                System.out.println();
                System.out.println("1- Número de telefono.");
                System.out.println("2- Correo electronico.");
                int comprobante2 = sc.nextInt();
                switch (comprobante2) {
                  case 1:
                    System.out.println("Ingrese su número de telefono:");
                    String telefono = sc.next();
                    System.out.println("El comprobante ha sido enviado.");
                    break;
                  case 2:
                    System.out.println("Ingrese correo electronico:");
                    String gmail = sc.next();
                    System.out.println("El comprobante ha sido enviado.");

                    break;
                }
            }
          }
          break;
        case 2:
          System.out.println("Seleccionaste la opción 2");
          listadodeasientos(1);
          break;
        case 0:
          break;
        default:
          System.out.println("Opción inválida");
      }
    }

    sc.close();
  }

  public static void listadodeasientos(int tipo) {
    int contador = 0;
    if (tipo == 0) {
      System.out.println("Listado de asientos libres");
      for (int i = 1; i < asientos.length; i++) {
        if (asientos[i] == 0) {
          System.out.println(i + ", ");
          contador++;
        }
      }
    } else {
      System.out.println("Listado de asientos ocupados");
      for (int i = 1; i < asientos.length; i++) {
        if (asientos[i] == 1) {
          System.out.println(i + ", ");
          contador++;
        }
      }
    }
    System.out.println(
      "Cantidad de entradas ocupadas: " + contador + " de " + (asientos.length-1)
    );
    System.out.println("Presione un número cualquiera para continuar");
    Scanner sc = new Scanner(System.in);
    int seguir = sc.nextInt();
       
  }
}
