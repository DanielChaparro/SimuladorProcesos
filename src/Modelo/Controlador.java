/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Controlador{
		
		private boolean Cambio=true;
		
		public synchronized void cam1() {
			
			while (!Cambio) {
				try {
					//System.out.println("1"+Cambio);
					wait();
				} catch (InterruptedException e) {
					
				}
			}
			Cambio=false;
			notify();
		}
		
		public synchronized void cam2() {
			
			while (Cambio) {
				try {
					//System.out.println("2"+Cambio);
					wait();
				} catch (InterruptedException e) {
					
				}
				
			}
			//System.out.println("Aqui");
			Cambio=true;
			notify();
			
		}
}
