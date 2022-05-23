package avena;

public class RemoveAspasDupla {
    public static void main(String[] args) {
        String estring = "teste\"";
        String imprimeestringsempaspasdupla = null;
        imprimeestringsempaspasdupla = estring.replace("\"","");
        System.out.println(estring);
        System.out.println(imprimeestringsempaspasdupla);
    }
}
