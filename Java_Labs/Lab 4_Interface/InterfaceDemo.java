interface Example1{
   public void Hello();
   public  void Bye();
}
interface Example2{
   public  void CollegeName();
   public  void Address();
}
class Implementation implements Example1,Example2{
    public void Hello(){
        System.out.println("Hello There ");
    };
    public void Bye()
    {
        System.out.println("Bye");
    }
    public void CollegeName()
    {
        System.out.println("Gces");
    }
    public void Address(){
        System.out.println("Lamachaur");
    }
}
class InterfaceDemo{
    public static void main(String[] args)
    {
        Implementation obj=new Implementation();
        obj.Hello();
        obj.Bye();
        obj.CollegeName();
        obj.Address();
    }
}