import java.util.HashMap;
import java.util.Arrays;
import java.lang.reflect.*;

public class Injector {
    // Menerima sebuah definisi dependencies
    // yang berupa sebuah instansiasi kelas
    // Catatan: Injector bisa menampung lebih dari 1 dependency,
    //          jadi injector bisa menginject banyak sekaligus.
    //          Jika ada 2 objek dengan kelas yang sama,
    //          inject dengan object terakhir yang di add ke daftar dependency
    HashMap<Class, Object> dependencies;
    Injector(){
        this.dependencies = new HashMap<>();
    }
    void addDependencies(Object object){
        this.dependencies.put(object.getClass(), object);
    }
    /*
      Menginjeksi dependencies yang telah dibuat ke dalam objek
      Injeksi dilakukan dengan mengacu pada dependencies yang ditambah
      pada method addDependencies.

      Setiap field di object yang diinject, bila kelasnya
      sudah ditambahkan sebagai dependency, maka akan diset sebagai
      object yang sudah di add didependency.
    */
    void inject(Object object) throws Exception {
        Arrays.asList(object.getClass().getDeclaredFields()).forEach(f -> {
            f.setAccessible(true);
            try{f.set(object, this.dependencies.get(f.getType()));} catch (Exception e){}
        });
    }
}