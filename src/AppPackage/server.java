/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author OM
 */
public class server {
    public static void main(String args[]) throws IOException
    {
        int got_number;
        String response="I have got the number";
        ServerSocket s = new ServerSocket(5525);
        Socket ss = s.accept();
        Scanner sc1 = new Scanner(ss.getInputStream());
        got_number=sc1.nextInt();
        System.out.println("I have got "+ got_number);
        PrintStream pp = new PrintStream(ss.getOutputStream());
        pp.println(response);
    } 
}


