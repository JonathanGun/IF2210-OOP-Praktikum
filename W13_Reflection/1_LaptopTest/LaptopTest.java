import java.lang.reflect.*;
import java.lang.Integer;
import java.lang.String;

public class LaptopTest {
    // Anda boleh menambahkan atribut yang diperlukan
    Class test;

    public LaptopTest(String className) {
        /**
         * Memeriksa apakah ada kelas dengan nama className.
         * Jika tidak, tuliskan "Tidak ada kelas dengan nama yang diberikan" (tanpa petik) ke layar
         */
        try{
        	this.test = Class.forName(className);
        }catch (ClassNotFoundException e){
        	System.out.println("Tidak ada kelas dengan nama yang diberikan");
        }
    }

    public boolean testMethods() {
        if(this.test == null){
        	return false;
        }
        if (this.test.getDeclaredMethods().length == 1/* hanya ada 1 method di kelas yang diberikan */) {
            // Jika nama method bukan getRamSize, tuliskan "Nama method harus getRamSize" (tanpa petik) ke layar
            try{
            	Method method = this.test.getDeclaredMethod("getRamSize");
            	if(method.getReturnType().equals(Integer.class)){
            		return true;
            	} else {
            		System.out.println("Tipe return method harus Integer");
            	}
            } catch (NoSuchMethodException e){
            	System.out.println("Nama method harus getRamSize");
            	System.out.println("Tipe return method harus Integer");
            }
            // Jika tipe return bukan Integer, tuliskan "Tipe return method harus Integer" (tanpa petik) ke layar
        } else {
            // Menuliskan "Banyaknya method hanya boleh 1" (tanpa petik) ke layar
            System.out.println("Banyaknya method hanya boleh 1");
        }
        // Return true jika semua tes berhasil
        // Jika ada 1 yang salah, return false
        return false;
    }

    public boolean testFields() {
        if(this.test == null){
        	return false;
        }
        if (this.test.getDeclaredFields().length == 1/* hanya ada 1 field di kelas yang diberikan */) {
            // Jika nama field bukan serialNumber, tuliskan "Nama field harus serialNumber" (tanpa petik) ke layar
            try{
            	Field field = this.test.getDeclaredField("serialNumber");
            	if(field.getType().equals(String.class)){
            		return true;
            	} else {
            		System.out.println("Tipe field harus String");
            	}
            } catch (NoSuchFieldException e){
            	System.out.println("Nama field harus serialNumber");
            	System.out.println("Tipe field harus String");
            }
            // Jika tipe return bukan String, tuliskan "Tipe field harus String" (tanpa petik) ke layar
        } else {
            // Menuliskan "Banyaknya field hanya boleh 1" (tanpa petik) ke layar
            System.out.println("Banyaknya field hanya boleh 1");
        }
        // Return true jika semua tes berhasil
        // Jika ada 1 yang salah, return false
        return false;
    }
}