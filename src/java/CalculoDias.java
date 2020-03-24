
import java.text.SimpleDateFormat;
import java.util.Date;


public class CalculoDias {
    
    public int calculoMes()
    {
        String data = new SimpleDateFormat().format(new Date());
        
        char[] caractere = data.toCharArray();
        
         String a = String.valueOf(caractere[3]);
         String b = String.valueOf(caractere[4]);
         
         String mes = a+b;
        
         int mesNumero = Integer.valueOf(mes);
         
         return (mesNumero);        
    }
    
    
    public int calculoAno()
    {
        String data = new SimpleDateFormat().format(new Date());
        
        char[] caractere = data.toCharArray();
        
         String a = String.valueOf(caractere[6]);
         String b = String.valueOf(caractere[7]);
         
         String ano = a+b;
        
         int anoNumero = Integer.valueOf(ano);
         
         return (anoNumero);        
    }
    
}
