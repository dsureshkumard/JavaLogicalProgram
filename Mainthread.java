class Mainthread
{
   public static void main(String args[])
    {
         Thread th=Thread.currentThread();
          
        System.out.println("Current Thread is:"+th);
        th.setName("Suresh");
         System.out.println("Current Thread is:"+th);
    }
}