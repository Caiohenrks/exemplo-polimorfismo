/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exemplodi.service.notificacao;

import exemplodi.modelo.Cliente;

/**
 *
 * @author Caioh
 */
public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
