/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplodi.service.notificacao;

import exemplodi.modelo.Cliente;

/**
 *
 * @author Caioh
 */
public class NotificadorSMS implements Notificador{
    
    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s por SMS através do telefone %s: %s\n",
        cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
