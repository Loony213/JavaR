import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        // Crear un servidor HTTP en el puerto 8080
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(8080), 0);
        
        // Definir el manejador para las solicitudes HTTP
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "¡Hola, Mundo! en Railway con Java";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });
        
        // Iniciar el servidor
        server.start();
        System.out.println("Servidor corriendo en http://localhost:8080");
    }
}
