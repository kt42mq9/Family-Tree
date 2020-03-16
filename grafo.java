import java.util.ArrayList;
class grafo extends nodo{
    grafo(){

    }
    void m_crearGrafo(String p_valor){
        boolean v_bandera;
        String v_nodo="";
        int v_cont=1;
        do{
            if(m_crearNodo(p_valor.split("\\|"))){
                v_nodo=m_obtnNodo(p_valor.split("\\|")[v_cont]);
            }
            else{
                
            }
        }while();
    }
}