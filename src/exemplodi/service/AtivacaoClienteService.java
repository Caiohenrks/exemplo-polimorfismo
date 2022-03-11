package exemplodi.service;

import exemplodi.modelo.Cliente;
import exemplodi.service.notificacao.Notificador;

public class AtivacaoClienteService {
    
    private Notificador notificador;
    
    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;
    }
    
    public void ativar(Cliente cliente){
        cliente.ativar();
            
        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        
    }
}
