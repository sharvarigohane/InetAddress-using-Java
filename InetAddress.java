import java.net.*;
public class InetAddressTest
{
    public static void main(String args[]) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

    Address = InetAddress.getByName("www.rknec.edu&quot;);
    System.out.println(Address);

    InetAddress Sw[] = InetAddress.getAllByName("www.nba.com&quot;);
    for (int i=0; i<Sw.length; i++)
        System.out.println (Sw [i]);
}
}
