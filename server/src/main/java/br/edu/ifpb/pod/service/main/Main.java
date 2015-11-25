/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.service.main;

import br.edu.ifpb.pod.service.RMIServiceImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emanuel Batista da Silva Filho - https://github.com/emanuelbatista
 */
public class Main {
    public static void main(String[] args) {
        try {
            Registry registry=LocateRegistry.createRegistry(9000);
            registry.rebind("service", new RMIServiceImpl());
        } catch (RemoteException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
