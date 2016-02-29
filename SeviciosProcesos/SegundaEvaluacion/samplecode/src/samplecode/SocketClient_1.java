/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplecode;

import java.net.*;
import java.io.*;

/**
 *
 * @author Alvaro
 */
public class SocketClient_1 {

    public static void main(String[] args) {

        Socket s = null;

        // Create the socket connection to the MultiThreadedSocketServer port 11111 
        try {
            s = new Socket("127.0.0.1", 11111);
        } catch (UnknownHostException uhe) {
            // Server Host unreachable 
            System.out.println("Unknown Host :" + args[0]);
            s = null;
        } catch (IOException ioe) {
            // Cannot connect to port on given server host 
            System.out.println("Cant connect to server at 11111. Make sure it is running.");
            s = null;
        }

        if (s == null) {
            System.exit(-1);
        }

        BufferedReader in = null;
        PrintWriter out = null;

        try {
            // Create the streams to send and receive information 
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

            // Since this is the client, we will initiate the talking. 
            // Send a string data and flush 
            out.println("end");
            out.flush();
            // Receive the reply. 
            System.out.println(in.readLine());

            // Send the special string to tell server to quit. 
            //out.println("Quit");
            //out.flush();
        } catch (IOException ioe) {
            System.out.println("Exception during communication. Server probably closed connection.");
        } finally {
            try {
                // Close the input and output streams 
                out.close();
                in.close();
                // Close the socket before quitting 
                s.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
