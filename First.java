class First
{
public static void main (String [ ]args) throws IOException
{
Thread t =Thread.currentThread( );
System.out.println(“CURRENTTHREAD = ” + t);
t.setName(“NewThread”);
t.setPriority(t.getPriority( ) – 1);
System.out.println(“CURRENTTHREAD = ” + t);
System.out.println(“NAME = ” + t.getName( ));
}
}