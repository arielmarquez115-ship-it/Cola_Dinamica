package UNIDAD3;
import java.util.Scanner;

/**
 *
 * @author Garza Albiter Ariel
 */
public class ColaDinamica {
    static Scanner sc=new Scanner(System.in);
    static DocD u,p;
    
    public static void insertar(DocD aux){
        if(p==null)
            p=u=aux;
        else{
            u.sig=aux;
            u=aux;
        }
    }
    
    public static DocD eliminar(){
        DocD aux=p;
        p=p.sig;
        return aux;
    }
    
    public static DocD leerDatos(){
        DocD doc=new DocD();
        System.out.print("Ingrese nombre: ->");
        doc.nombre=sc.next();
        System.out.print("Ingrese tamaño: ->");
        doc.tamaño=sc.nextInt();
        System.out.print("Ingrese tipo: ->");
        doc.tipo=sc.next();
        return doc;
    }
    
    public static void imprimir(DocD aux){
        System.out.println("Nombre :  "+aux.nombre);
        System.out.println("Tamaño :  "+aux.tamaño);
    }
    
    public static void main(String[] args) {
        int opc;
        do{
            System.out.println("1)Insertar\n2)Eliminar\n3)Salir");
            opc=sc.nextInt();
            switch(opc){
                case 1:
                    insertar(leerDatos());
                break;
                
                case 2:
                    if(p==null)
                        System.out.println("Cola Vacia");
                    else
                        imprimir(eliminar());
                break; 
            }
        }while(opc!=3);
    }
    
}
