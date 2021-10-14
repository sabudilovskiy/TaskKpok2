package Size;

import java.text.DecimalFormat;

public class Size {
    private Long s_byte = 0L, kilobyte = 0L, megabyte = 0L, gigabyte = 0L, terabyte = 0L;
    public Size(Long bytes){
        s_byte = bytes%1024;
        kilobyte = bytes/1024;
        if (kilobyte > 0) {
            megabyte = kilobyte / 1024;
            kilobyte = kilobyte % 1024;
        }
        if (megabyte > 0) {
            gigabyte = megabyte / 1024;
            megabyte = megabyte % 1024;
        }
        if (gigabyte > 0) {
            terabyte = gigabyte / 1024;
            gigabyte = gigabyte % 1024;
        }
    }
    public String toString(){
        if (terabyte > 0L){
            double temp = terabyte + (double)gigabyte / (double)1024;
            return new DecimalFormat ("#.#").format (temp) + " TB";
        }
        else if (gigabyte > 0L){
            double temp = gigabyte + (double)megabyte / (double)1024;
            return new DecimalFormat ("#.#").format (temp) + " GB";
        }
        else if (megabyte > 0L){
            double temp = megabyte + (double)kilobyte / (double)1024;
            return new DecimalFormat ("#.#").format (temp) + " MB";
        }
        else if (kilobyte > 0L){
            double temp = kilobyte + (double)s_byte / (double)1024;
            return new DecimalFormat ("#.#").format (temp) + " KB";
        }
        else return Long.toString (s_byte) + " B";
    }

}
