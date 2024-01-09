import java.util.*;
class invalidname extends Exception
{
    public invalidname(String data)
    {
        super(data);
    }
}
public class expus {
    public static void main(String args[])
    {
        String name="vishalvnair124";
        try{
            if(name.matches("[a-zA-Z]+"))
            {
                System.out.println("Only Letters");
            }
            else
            {
                throw new invalidname("Miss match found");
            }
        }
        catch(invalidname e)
        {
            System.out.println(" THE EXCEPTION MESSAGE IS : "+e.getMessage());
        }
    }   
}