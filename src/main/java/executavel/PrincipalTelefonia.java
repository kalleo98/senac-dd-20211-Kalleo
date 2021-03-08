package executavel;

import java.util.ArrayList;

import model.entity.telefonia.Cliente;
import model.entity.telefonia.Endereco;

public class PrincipalTelefonia {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco("Rua Mauro Ramos", "SC", "Florianópolis", "88050-500", "200");

		Cliente cliente1 = new Cliente("Kalleo Agostinho", "000.000.000-00", new ArrayList(), endereco1, true);
		Cliente cliente2 = new Cliente("Kalleo Agostinho", "000.000.000-00", new ArrayList(), endereco1, true);
		Cliente cliente3 = new Cliente("Kalleo Agostinho", "000.000.000-00", new ArrayList(), endereco1, true);
		Cliente cliente4 = new Cliente("Kalleo Agostinho", "000.000.000-00", new ArrayList(), endereco1, true);
		Cliente cliente5 = new Cliente("Kalleo Agostinho", "000.000.000-00", new ArrayList(), endereco1, true);

	}

}
