import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
class archivo{
    String[] m_obtnArchivo(String p_direccion){
        ArrayList<String> v_temp=new ArrayList<String>();
        try{
            Scanner v_teclado=new Scanner(new File(p_direccion));
            while(v_teclado.hasNextLine())
                v_temp.add(v_teclado.nextLine());
        }catch(Exception v_error){
            v_error.printStackTrace();
        }
        return v_temp.toArray(new String[v_temp.size()]);
    }
}