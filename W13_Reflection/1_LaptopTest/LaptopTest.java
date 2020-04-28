import java.lang.reflect.*;
import java.lang.Integer;
import java.lang.String;

public class LaptopTest {
    // Anda boleh menambahkan atribut yang diperlukan
    private Class test = null;

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
        boolean passed = true;
        Method[] methods = this.test.getDeclaredMethods();
        if (methods.length == 1/* hanya ada 1 method di kelas yang diberikan */) {
            Method method = methods[0];
            // Jika nama method bukan getRamSize, tuliskan "Nama method harus getRamSize" (tanpa petik) ke layar
            if(!method.getName().equals("getRamSize")){
                System.out.println("Nama method harus getRamSize");
                passed = false;
            }
            // Jika tipe return bukan Integer, tuliskan "Tipe return method harus Integer" (tanpa petik) ke layar
            if(!method.getReturnType().equals(Integer.class)){
                System.out.println("Tipe return method harus Integer");
                passed = false;
            }
        } else {
            // Menuliskan "Banyaknya method hanya boleh 1" (tanpa petik) ke layar
            System.out.println("Banyaknya method hanya boleh 1");
            passed = false;
        }
        // Return true jika semua tes berhasil
        // Jika ada 1 yang salah, return false
        return passed;
    }

    public boolean testFields() {
        if(this.test == null){
        	return false;
        }
        boolean passed = true;
        Field[] fields = this.test.getDeclaredFields();
        if (fields.length == 1/* hanya ada 1 field di kelas yang diberikan */) {
            Field field = fields[0];
            // Jika nama field bukan serialNumber, tuliskan "Nama field harus serialNumber" (tanpa petik) ke layar
            if(!field.getName().equals("serialNumber")){
        		System.out.println("Nama field harus serialNumber");
                passed = false;
        	}
            // Jika tipe return bukan String, tuliskan "Tipe field harus String" (tanpa petik) ke layar
            if(!field.getType().equals(String.class)){
        		System.out.println("Tipe field harus String");
                passed = false;
        	}
        } else {
            // Menuliskan "Banyaknya field hanya boleh 1" (tanpa petik) ke layar
            System.out.println("Banyaknya field hanya boleh 1");
            passed = false;
        }
        // Return true jika semua tes berhasil
        // Jika ada 1 yang salah, return false
        return passed;
    }
}