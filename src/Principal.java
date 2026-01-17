import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        ConecctionAPI consulta = new ConecctionAPI();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        int opcionSwitch = 0;
        List <TituloStarWar> tituloStarWarList = new ArrayList<>();

        System.out.println("BIENVENIDO A TÚ ESPACIO DE STAR WAR");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Acá podrás encontrar información sobre" +
                "las peliculas de Stars Wars");

        while (true){
            System.out.println("Por favor ingresá un Episodio del 1 al 6." +
                    "Para salir por favor escriba: salir");
            var numero = teclado.nextLine();

            if (numero.equalsIgnoreCase("salir")) {
                break;
            }
        try {
            //asi obtenemos el JSON de la API no olvidarse de habilitar la variable
            //consulta uniendo a la clase correspondiente para poder realizar la busqueda
            String json = consulta.buscarPelicula(Integer.parseInt(numero));

            //Convertimos el JSON al RECORD
            tituloAPI miRecord = gson.fromJson(json, tituloAPI.class);

            TituloStarWar miPelicula = new TituloStarWar(miRecord);

            System.out.println("Pelicula Encontrada");
            System.out.println(miPelicula);
            tituloStarWarList.add(miPelicula);



        } catch (NumberFormatException e) {
            System.out.println("Error ingrese una opción válida");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        }
        System.out.println("Peliculas que buscaste hasta ahora" );
        for (TituloStarWar p : tituloStarWarList){
            System.out.println("-- " + p.getNombre());
        }

        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(tituloStarWarList));
        escritura.close();
        System.out.println("Finalizó la ejecución del programa!");

    }
}
