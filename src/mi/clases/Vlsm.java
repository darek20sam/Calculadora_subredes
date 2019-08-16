
package mi.clases;

/**
 *
 * @author Vaio
 */
public class Vlsm {
    private String rangoHost;
    private String ip;

    public String getRangoHost() {
        return rangoHost;
    }

    public void setRangoHost(String rangoHost) {
        this.rangoHost = rangoHost;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    public void ordenarHost(int[] subRedesNumeros){
        int j=0;
        for (int i = 1; i < subRedesNumeros.length; i++){
          int aux = subRedesNumeros[i];
          for ( j = i - 1; (j >= 0) && (subRedesNumeros[j] < aux); j--){
            subRedesNumeros[(j + 1)] = subRedesNumeros[j];
          }
          subRedesNumeros[(j + 1)] = aux;
        }
    }
    
    public void calcularHostMax(int numeroBits, int[] redNumeros){
        if (numeroBits < 9){
            redNumeros[3] = ((int)(redNumeros[3] + Math.pow(2.0D, numeroBits) - 2.0D));
        }else if (numeroBits < 17){
            redNumeros[3] = ((int)(redNumeros[3] + Math.pow(2.0D, 8.0D) - 2.0D));
            numeroBits -= 8;
            redNumeros[2] = ((int)(redNumeros[2] + Math.pow(2.0D, numeroBits) - 1.0D));
        }else if (numeroBits < 25){
          redNumeros[3] = ((int)(redNumeros[3] + Math.pow(2.0D, 8.0D) - 2.0D));
          numeroBits -= 8;
          redNumeros[2] = ((int)(redNumeros[2] + Math.pow(2.0D, 8.0D) - 1.0D));
          numeroBits -= 8;
          redNumeros[1] = ((int)(redNumeros[1] + Math.pow(2.0D, numeroBits) - 1.0D));
        }
    }  
    
    public int calcularNumerodeBits(int subRedesNumeros){
      int i=0;
      int result = 0;
      for ( i = 0; (Math.pow(2.0D, i)-2) < subRedesNumeros; i++){
      }
      result = i;
      return result;
    }  

    public void convertirStringInt(int longitud, String[] vectorStr, int[] vectorNumeros){
        for (int j = 0; j < longitud; j++){
          vectorNumeros[j] = Integer.parseInt(vectorStr[j]);
        }
    }
    
    public String convertirIntBinario(int numero){
        String resultado = Integer.toBinaryString(numero);
        for (int i = 8 - resultado.length(); i > 0; i--) {
          resultado = "0" + resultado;
        }
        return resultado;
    }
    
    public void calcularMascaraSubred(int numeroBits, int[] mascaraSubred){
        int i = 32 - numeroBits;
        for (int j = 0; j < 4; j++){
          if (i > 8){
            mascaraSubred[j] = ((int)(Math.pow(2.0D, 8.0D) - 1.0D));
          } else {
            for (int exponente = 7; i > 0; exponente--){
              mascaraSubred[j] = ((int)(mascaraSubred[j] + Math.pow(2.0D, exponente)));i--;
            }
          }
          i -= 8;
        }
    }
}
