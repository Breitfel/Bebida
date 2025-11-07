import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/api/bebidas")
public class BebidaController {

    @Autowired
    private BebidaRepository bebidaRepository; // Injeta o repositório

    // Endpoint para buscar a bebida pelo código
    @GetMapping("/{codigo}")
    public ResponseEntity<String> verificarBebida(@PathVariable String codigo) {

        // 1. Busca no banco de dados
        Optional<Bebida> Bebida = bebidaRepository.findById(codigo);

        // 2. Implementa a lógica
        if (Bebida.isPresent()) {
            // Se encontrar a bebida, retorna "Bebida Aprovada" com status HTTP 200 (OK)
            return ResponseEntity.ok("Bebida Aprovada");
        } else {
            // Se não encontrar, retorna "Bebida Falsificada" com status HTTP 404 (Not Found)
            // Usar 404 para "não encontrado" é uma boa prática em APIs REST
            return ResponseEntity.status(404).body("Bebida Falsificada");
        }
    }
}