package principal;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Principal {

    private Scanner teclado = new Scanner(System.in);

    public void mostrarMenu(){

        int opcion = -1;

        while(opcion != 0){

            System.out.println("""
                    
                    ===== LiterAlura =====
                    
                    1 - Buscar libro por titulo
                    2 - Listar libros
                    3 - Listar autores
                    4 - Autores vivos en un año
                    5 - Cantidad de libros por idioma
                    0 - Salir
                    """);

            opcion = teclado.nextInt();

        }
    }
}