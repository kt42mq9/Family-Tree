import java.util.ArrayList;
class nodo{
    private ArrayList<String> a_nodos;
    boolean m_crearNodo(String[] p_nodo){
        int v_cont;
        String v_temp="";
        if(p_nodo.length==1){
            a_nodos.add(p_nodo[0]);
            return false;
        }
        else{
            for(v_cont=0;v_cont<p_nodo.length;v_cont++)
                v_temp+=p_nodo[v_cont]+"|";
            return true;
        }
    }
    String m_obtnNodo(String p_nodo){
        int v_cont=0;
        while(v_cont<a_nodos.size()){
            if(a_nodos)
        }
    }
}