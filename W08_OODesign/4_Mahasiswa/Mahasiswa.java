
import java.lang.Comparable;

class Mahasiswa implements Comparable<Mahasiswa> {
  private float ipk;
  private int kodeJurusan;
  private int angkatan;

  public Mahasiswa(float ipk) {
    this.ipk = ipk;
  }

  public Mahasiswa(int kodeJurusan, int angkatan, float ipk){
    this.ipk = ipk;
    this.kodeJurusan = kodeJurusan;
    this.angkatan = angkatan;
  }

  public float getIpk(){
    return this.ipk;
  }

  public int getKodeJurusan(){
    return this.kodeJurusan;
  }

  public int getAngkatan(){
    return this.angkatan;
  }

  public int compareTo(Mahasiswa m){
    if(this.kodeJurusan < m.kodeJurusan){
      return -1;
    } else if(this.kodeJurusan > m.kodeJurusan){
      return 1;
    } else {
      if(this.angkatan > m.angkatan){
        return -1;
      } else if (this.angkatan < m.angkatan){
        return 1;
      } else {
        if(this.ipk > m.ipk){
          return -1;
        } else if(this.ipk < m.ipk){
          return 1;
        } else {
          return 0;
        }
      }
    }
  }
}