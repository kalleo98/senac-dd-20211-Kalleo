package executavel;

import java.util.ArrayList;

import model.entity.telefonia.Cliente;
import model.entity.telefonia.Endereco;
import model.entity.telefonia.Telefone;

public class PrincipalTelefonia {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco("Rua Mauro Ramos", "SC", "Florianópolis", "88050-500", "200");
		Telefone telefone1 = new Telefone("55", "48", "99926-3311", true);

		Cliente cliente1 = new Cliente("Kalleo Agostinho", "000.000.000-00", new ArrayList(), endereco1, true);
		Cliente cliente2 = new Cliente("Kalleo Agostinho", "000.000.000-00", new ArrayList(), endereco1, true);
		Cliente cliente3 = new Cliente("Kalleo Agostinho", "000.000.000-00", new ArrayList(), endereco1, true);
		Cliente cliente4 = new Cliente("Kalleo Agostinho", "000.000.000-00", new ArrayList(), endereco1, true);
		Cliente cliente5 = new Cliente("Kalleo Agostinho", "000.000.000-00", new ArrayList(), endereco1, true);

	}

}
