package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ClassName : SendUDP
 * package : net
 *
 * @date :2019/6/11 23:02
 * @Author :xiaoshuai
 */
public class SendUDP {
    public static void main(String[] args)  throws IOException {

        //创建发送端的Socket对象
        DatagramSocket dg = new DatagramSocket();

        byte[] b = "hello world".getBytes();

        int length = b.length;

        InetAddress inet = InetAddress.getByName("192.168.200.1");

        int prot = 10088;

        DatagramPacket dp = new DatagramPacket(b,length,inet,prot);

        dg.send(dp);

        dg.close();


    }
}
