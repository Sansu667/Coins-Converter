package com.sansu.coinsconverter;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Scanner menuOptionUser = new Scanner(System.in);
        DecimalFormat formatoDecimal = new DecimalFormat("#,##0.00");
        Gson gson = new Gson();

        while (true) {
            System.out.println("******************************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Monedas\n");
            System.out.println("Opciones:");
            System.out.println("\n 1) Dólar (USD) --> Pesos Argentino (ARS)\n 2) Peso Argentino (ARS) --> Dólar (USD)\n 3) Dólar (USD) --> Real Brasileño (BRL)\n 4) Real Brasileño (BRL) --> Dólar (USD)\n 5) Dólar (USD) --> Peso Colombiano (COP)\n 6) Peso Colombiano (COP) --> Dólar (USD)\n 7) Salir\n");
            System.out.println("******************************************************************");
            System.out.println("\nEscribe el número de la opción deseada: ");

            String busqueda = menuOptionUser.nextLine();

            if (busqueda.equals("1")) {
                System.out.println("Ingrese la cantidad de USD que desea convertir a ARS: ");
                double cantidadDivisa = obtenerCantidad(menuOptionUser);

                if (cantidadDivisa >= 0) {
                    double tipoDeCambio = obtenerTipoDeCambio("USD", "ARS", gson);

                    if (tipoDeCambio > 0) {
                        double conversion = cantidadDivisa * tipoDeCambio;
                        System.out.println("\n******************************************************************");
                        System.out.println("Cantidad preliminar: " + cantidadDivisa + " USD");
                        System.out.println("Tipo de Cambio: 1 USD = " + formatoDecimal.format(tipoDeCambio) + " ARS");
                        System.out.println("Resultado de la operación: " + formatoDecimal.format(conversion) + " ARS");
                        System.out.println("******************************************************************\n");
                    } else {
                        System.out.println("Error al obtener el tipo de cambio.");
                    }
                }

            } else if (busqueda.equals("2")) {
                System.out.println("Ingrese la cantidad de ARS que desea convertir a USD: ");
                double cantidadDivisa = obtenerCantidad(menuOptionUser);

                if (cantidadDivisa >= 0) {
                    double tipoDeCambio = obtenerTipoDeCambio("ARS", "USD", gson);

                    if (tipoDeCambio > 0) {
                        double conversion = cantidadDivisa * tipoDeCambio;
                        System.out.println("\n******************************************************************");
                        System.out.println("Cantidad preliminar: " + cantidadDivisa + " ARS");
                        System.out.println("Tipo de Cambio: 1 ARS = " + formatoDecimal.format(tipoDeCambio) + " USD");
                        System.out.println("Resultado de la operación: " + formatoDecimal.format(conversion) + " USD");
                        System.out.println("******************************************************************\n");
                    } else {
                        System.out.println("Error al obtener el tipo de cambio.");
                    }
                }

            } else if (busqueda.equals("3")) {
                System.out.println("Ingrese la cantidad de USD que desea convertir a BRL: ");
                double cantidadDivisa = obtenerCantidad(menuOptionUser);

                if (cantidadDivisa >= 0) {
                    double tipoDeCambio = obtenerTipoDeCambio("USD", "BRL", gson);

                    if (tipoDeCambio > 0) {
                        double conversion = cantidadDivisa * tipoDeCambio;
                        System.out.println("\n******************************************************************");
                        System.out.println("Cantidad preliminar: " + cantidadDivisa + " USD");
                        System.out.println("Tipo de Cambio: 1 USD = " + formatoDecimal.format(tipoDeCambio) + " BRL");
                        System.out.println("Resultado de la operación: " + formatoDecimal.format(conversion) + " BRL");
                        System.out.println("******************************************************************\n");
                    } else {
                        System.out.println("Error al obtener el tipo de cambio.");
                    }
                }

            } else if (busqueda.equals("4")) {
                System.out.println("Ingrese la cantidad de BRL que desea convertir a USD: ");
                double cantidadDivisa = obtenerCantidad(menuOptionUser);

                if (cantidadDivisa >= 0) {
                    double tipoDeCambio = obtenerTipoDeCambio("BRL", "USD", gson);

                    if (tipoDeCambio > 0) {
                        double conversion = cantidadDivisa * tipoDeCambio;
                        System.out.println("\n******************************************************************");
                        System.out.println("Cantidad preliminar: " + cantidadDivisa + " BRL");
                        System.out.println("Tipo de Cambio: 1 BRL = " + formatoDecimal.format(tipoDeCambio) + " USD");
                        System.out.println("Resultado de la operación: " + formatoDecimal.format(conversion) + " USD");
                        System.out.println("******************************************************************\n");
                    } else {
                        System.out.println("Error al obtener el tipo de cambio.");
                    }
                }

            } else if (busqueda.equals("5")) {
                System.out.println("Ingrese la cantidad de USD que desea convertir a COP: ");
                double cantidadDivisa = obtenerCantidad(menuOptionUser);

                if (cantidadDivisa >= 0) {
                    double tipoDeCambio = obtenerTipoDeCambio("USD", "COP", gson);

                    if (tipoDeCambio > 0) {
                        double conversion = cantidadDivisa * tipoDeCambio;
                        System.out.println("\n******************************************************************");
                        System.out.println("Cantidad preliminar: " + cantidadDivisa + " USD");
                        System.out.println("Tipo de Cambio: 1 USD = " + formatoDecimal.format(tipoDeCambio) + " COP");
                        System.out.println("Resultado de la operación: " + formatoDecimal.format(conversion) + " COP");
                        System.out.println("******************************************************************\n");
                    } else {
                        System.out.println("Error al obtener el tipo de cambio.");
                    }
                }

            }else if (busqueda.equals("6")) {
                System.out.println("Ingrese la cantidad de COP que desea convertir a USD: ");
                double cantidadDivisa = obtenerCantidad(menuOptionUser);

                if (cantidadDivisa >= 0) {
                    double tipoDeCambio = obtenerTipoDeCambio("COP", "USD", gson);

                    if (tipoDeCambio > 0) {
                        double conversion = cantidadDivisa * tipoDeCambio;
                        System.out.println("\n******************************************************************");
                        System.out.println("Cantidad preliminar: " + cantidadDivisa + " COP");
                        System.out.println("Tipo de Cambio: 1 COP = " + formatoDecimal.format(tipoDeCambio) + " USD");
                        System.out.println("Resultado de la operación: " + formatoDecimal.format(conversion) + " USD");
                        System.out.println("******************************************************************\n");
                    } else {
                        System.out.println("Error al obtener el tipo de cambio.");
                    }
                }

            }else if (busqueda.equals("7")) {
                System.out.println("Programa finalizado. ¡Gracias por usar el conversor de monedas!");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        }
    }

    private static double obtenerCantidad(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }

    private static double obtenerTipoDeCambio(String base, String objetivo, Gson gson) {
        String url = "https://v6.exchangerate-api.com/v6/73809ebe88594bdfadd5de83/latest/" + base;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                RespuestaAPI datos = gson.fromJson(response.body(), RespuestaAPI.class);
                return datos.getConversionRates().get(objetivo);
            } else {
                System.out.println("Error en la solicitud: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
        }

        return -1;
    }

    // Clase para modelar la respuesta de la API
    static class RespuestaAPI {
        private String base_code;
        private java.util.Map<String, Double> conversion_rates;

        public java.util.Map<String, Double> getConversionRates() {
            return conversion_rates;
        }
    }
}