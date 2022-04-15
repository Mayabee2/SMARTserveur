/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Random;
import metier.service.Service;
import dao.JpaUtil;



/**
 *
 * @author gdela
 */
public class Main {
    private static final Service service = new Service();
	private static final Random rand = new Random();

	public static void main(String[] args) {
            System.out.println("Hello 0 ");
		JpaUtil.init();
                            System.out.println("Hello 1");

		service.init();
                            System.out.println("Hello 2 ");

    
		JpaUtil.destroy();
        }
}
