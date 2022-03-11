/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplodi.service;

import exemplodi.modelo.Cliente;
import exemplodi.modelo.Produto;
import exemplodi.service.notificacao.Notificador;

/**
 *
 * @author Caioh
 */
public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {

        notificador.notificar(cliente, "Nota fiscal do produto "
                + produto.getNome() + "foi emitida!");

    }
}
