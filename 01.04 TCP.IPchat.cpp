import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
    HashMap clients;

    Server() {
        clients = new HashMap();
        Collections.synchronizedMap(clients);
    }

    public void start() {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("������ ���۵Ǿ����ϴ�.");

            while(true) {
                socket = serverSocket.accept();
                System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"���� �����Ͽ����ϴ�.");
                ServerReceiver thread = new ServerReceiver(socket);
                thread.start();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    } // start()

    void sendToAll(String msg) {
        Iterator it = clients.keySet().iterator();

        while(it.hasNext()) {
            try {
                DataOutputStream out = (DataOutputStream)clients.get(it.next());
                out.writeUTF(msg);
            } catch(IOException e){}
        } // while
    } // sendToAll

    public static void main(String args[]) {
        new Sub().start();
    }
    class ServerReceiver extends Thread {
        Socket socket;
        DataInputStream in;
        DataOutputStream out;

        ServerReceiver(Socket socket) {
            this.socket = socket;
            try {
                in  = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
            } catch(IOException e) {}
        }

        public void run() {
            String name = "";
            try {
                name = in.readUTF();
                sendToAll("#"+name+"���� �����̽��ϴ�.");

                clients.put(name, out);
                System.out.println("���� ���������� ���� "+ clients.size()+"�Դϴ�.");

                while(in!=null) {
                    sendToAll(in.readUTF());
                }
            } catch(IOException e) {
                // ignore
            } finally {
                sendToAll("#"+name+"���� �����̽��ϴ�.");
                clients.remove(name);
                System.out.println("["+socket.getInetAddress() +":"+socket.getPort()+"]"+"���� ������ �����Ͽ����ϴ�.");
                System.out.println("���� ���������� ���� "+ clients.size()+"�Դϴ�.");
            } // try
        } // run
    } // ReceiverThread
} // class


import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) {
        if(args.length!=1) {
            System.out.println("USAGE: java TcpIpMultichatClient ��ȭ��");
            System.exit(0);
        }

        try {
            String serverIp = "127.0.0.1";
            // ������ �����Ͽ� ������ ��û�Ѵ�.
            Socket socket = new Socket(serverIp, 7777);
            System.out.println("������ ����Ǿ����ϴ�.");
            Thread sender   = new Thread(new ClientSender(socket, args[0]));
            Thread receiver = new Thread(new ClientReceiver(socket));

            sender.start();
            receiver.start();
        } catch(ConnectException ce) {
            ce.printStackTrace();
        } catch(Exception e) {}
    } // main

    static class ClientSender extends Thread {
        Socket socket;
        DataOutputStream out;
        String name;

        ClientSender(Socket socket, String name) {
            this.socket = socket;
            try {
                out = new DataOutputStream(socket.getOutputStream());
                this.name = name;
            } catch(Exception e) {}
        }

        public void run() {
            Scanner scanner = new Scanner(System.in);
            try {
                if(out!=null) {
                    out.writeUTF(name);
                }

                while(out!=null) {
                    out.writeUTF("["+name+"]"+scanner.nextLine());					}
            } catch(IOException e) {}
        } // run()
    } // ClientSender

    static class ClientReceiver extends Thread {
        Socket socket;
        DataInputStream in;

        ClientReceiver(Socket socket) {
            this.socket = socket;
            try {
                in = new DataInputStream(socket.getInputStream());
            } catch(IOException e) {}
        }

        public void run() {
            while(in!=null) {
                try {
                    System.out.println(in.readUTF());
                } catch(IOException e) {}
            }
        } // run
    } // ClientReceiver
} // class

