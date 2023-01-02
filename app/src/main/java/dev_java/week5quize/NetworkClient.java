package dev_java.week5quize;

import java.net.Socket;

import java.net.InetAddress;

public class NetworkClient {
	public void client() {
		int port = 3000;
		String serverIP = "192.168.20.79";
		try {

			// Socket socket = new Socket(serverIP, port);

			System.out.println(InetAddress.getLocalHost().getHostAddress());
			Socket socket = new Socket(serverIP, port);
		} catch (Exception e) {
			System.out.println("NetworkClient client " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		NetworkClient nc = new NetworkClient();
		nc.client();
	}

}