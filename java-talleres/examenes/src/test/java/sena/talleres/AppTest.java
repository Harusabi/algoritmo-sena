package sena.talleres;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class ExamenCicloTest {

  @Test
  void testEjercicio2() {
    // Preparar los datos de entrada
    String input = "2\n70\n1.75\n80\n1.80\n";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    // Ejecutar el método
    StringBuilder result = ExamenCiclo.ejercicio2();

    // Verificar el resultado
    String expected =
        "La persona 1 peso es adecuado o acetable\n" + "La persona 2 peso es adecuado o acetable\n";
    assertEquals(expected, result.toString());
  }

  @Test
  void testEjercicio2ConDiferentesIMC() {
    // Preparar los datos de entrada para diferentes categorías de IMC
    String input = "5\n50\n1.70\n80\n1.75\n100\n1.80\n120\n1.75\n140\n1.70\n";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    // Ejecutar el método
    StringBuilder result = ExamenCiclo.ejercicio2();

    // Verificar el resultado
    String expected =
        "La persona 1 tiene bajo peso o delgado\n"
            + "La persona 2 peso es adecuado o acetable\n"
            + "La persona 3 tiene sobrepeso o sobrepeso\n"
            + "La persona 4 tiene obesidad grado 1 o obesidad\n"
            + "La persona 5 tiene obesidad tipo 2 o obesidad\n";
    assertEquals(expected, result.toString());
  }
}
