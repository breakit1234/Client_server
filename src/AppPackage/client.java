
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author OM
 */
public class client {
    public static void main(String args[]) throws Exception
    {
        int number;
        Socket s= new Socket("localhost",5525);
        System.out.print("Enter your number: ");
        Scanner sc= new Scanner(System.in);
        number=sc.nextInt();
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(number);
        Scanner fsc = new Scanner(s.getInputStream());
        String str=fsc.nextLine();
        System.out.println("The server response is "+str);
    }
}
