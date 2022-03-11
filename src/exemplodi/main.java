/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplodi;

import exemplodi.modelo.Cliente;
import exemplodi.service.AtivacaoClienteService;
import exemplodi.service.notificacao.Notificador;
import exemplodi.service.notificacao.NotificadorSMS;

/**
 *
 * @author Caioh
 */
public class main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("Joao", "joao@xyz.com","1111111111");
        Cliente maria = new Cliente("Maria", "maria@xyz.com", "2222222222");
        
        Notificador notificador = new NotificadorSMS();
        
        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }
}
