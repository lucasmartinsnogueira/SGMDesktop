/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.ImageIcon;

public class Util {
    public static String historico = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2FHistorico2.JPG?alt=media&token=fb88e807-80f2-4f06-906b-02a34fd55a64"; 
    public static String relatorio = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2FRelatorio2.JPG?alt=media&token=3a0e4290-902f-452a-8160-0a7806065985";
    public static String relatorio2 =  "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2FRelatorio.JPG?alt=media&token=965628ce-73ba-4059-8a2a-0d9b461233e7";
    public static String usuario = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2FUsuario2.JPG?alt=media&token=0c125c47-45fa-42fe-8c2d-f9ae5e52d52a";
    public static String usuario2 = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2FUsuario3.JPG?alt=media&token=af89bad3-9764-467d-aece-98b92a25d549";
    public static String OS = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2FOS.JPG?alt=media&token=bb2ccd64-5cf6-4519-8bc3-d5314dfc5d67";
    public static String os2 = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2FOS2.JPG?alt=media&token=f860e0fc-593a-4fb0-a3e7-ad5ebd89bc6c";
    public static String sair = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2Fsair2.JPG?alt=media&token=530f77be-d9b3-4cd5-a1bb-362e350d7d9d";
    public static String perfil = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/TcId2KLlwvfEuowW4MIVtYBIdfv2?alt=media&token=6d054f42-0624-426c-bdb8-86cf34e76909";
    public static String mecanico = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2Fmec.png?alt=media&token=e3f2d7b6-1650-45a1-a662-9866bddce103";
    
    public static byte[] imgFromInternet(String caminho) throws IOException{
        URL url = new URL(caminho);
        URLConnection conn = url.openConnection();
        InputStream in = conn.getInputStream();
        
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[16384];
        
        while ((nRead = in.read(data, 0, data.length)) != -1) {
          buffer.write(data, 0, nRead);
        }

        return buffer.toByteArray();
    
    }
    
    public static int[] getScaledDimension(ImageIcon img, int boundW, int boundH) {

        int original_width = img.getIconWidth();
        int original_height = img.getIconHeight();
        int bound_width = boundW;
        int bound_height = boundH;
        int new_width = original_width;
        int new_height = original_height;
        // ver se precisa mudar width
        if (original_width > bound_width) {
            //muda para caber
            new_width = bound_width;
            //muda  a altura para manter o aspecto
            new_height = (new_width * original_height) / original_width;
        }

        // então vê se precisa mudar até mesmo a altura
        if (new_height > bound_height) {
            //scale height to fit instead
            new_height = bound_height;
            //scale width to maintain aspect ratio
            new_width = (new_height * original_width) / original_height;
        }
        int[] finalDim = new int[]{new_width, new_height};
        return finalDim;
    }
    
}
