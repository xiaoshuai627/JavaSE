package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * ClassName : ReceiveUDP
 * package : net
 *
 * @date :2019/6/11 23:03
 * @Author :xiaoshuai
 */
public class ReceiveUDP {
    public static void main(String[] args) throws IOException {

        //创建接收端socket对象
        DatagramSocket rs = new DatagramSocket(10088);

        //创建接收数据的数组
        byte[] rb = new byte[1024];

        int length = rb.length;

        //创建接收的数据包
        DatagramPacket dp = new DatagramPacket(rb,length);

        rs.receive(dp);

        byte[] dpData = dp.getData();
        int len = dpData.length;

        String s = new String(dpData,0,len);
        System.out.println(s);

        rs.close();


    }
}
