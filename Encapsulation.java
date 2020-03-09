public class Encapsulation 
{
private String Name;
public String getName()
{
  return Name; 
 }
public void setName(String n)
{
   this.Name=n;
}

    public static void main (String args[])
    {
        Encapsulation obj=new Encapsulation();
        obj.setName("My Name Is Sezan");
        System.out.println(obj.getName());
    }
}

    

