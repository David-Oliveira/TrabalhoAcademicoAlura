import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
