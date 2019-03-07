package TCP_UDP;
import java.io.*;
import java.net.*;

public class TCPClient {
	public static void main(String[] args) throws Exception{
		Socket s=new Socket("127.0.0.1",6666);
		OutputStream os=s.getOutputStream();   //getOutputStream:返回此套接字的输出流。
		DataOutputStream dos=new DataOutputStream(os);
		dos.writeUTF("hello server");
		dos.flush();
		dos.close();
	}
}
