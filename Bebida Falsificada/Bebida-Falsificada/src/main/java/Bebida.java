import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data; // Se estiver usando Lombok

import java.util.Date;

@Entity // Marca a classe como uma entidade JPA (tabela no banco)
@Data // Gera Getters, Setters, toString, etc. (se usar Lombok)
public class Bebida {

    @Id // Define como chave primária
    // Importante: No seu caso, o código da bebida é a chave primária
    private String codigoBebida;

    private String tipoBebida;

    private Date anoFabricacao;

    private String Fabricante;



    // Se não estiver usando Lombok, adicione getters e setters aqui
}
