class Shinobi{
  private String registrasi, nama, peringkat;

  public void setRegistrasi (String registrasi){
    this.registrasi = registrasi;
  }
  public String getRegistrasi (){
    return registrasi;
  }
  public void setNama (String nama){
    this.nama = nama;
  }
  public String getNama () {
    return nama;
  }
  public void setPeringkat (String peringkat){
    this.peringkat = peringkat;
  }
  public String getPeringkat () {
    return peringkat;
  }
}

public class Tugas1 {
  public static void main(String[] args) {
    Shinobi[] ID = new Shinobi[3];

    //membentuk objek 1
    ID[0] = new Shinobi();
    ID[0].setRegistrasi("012606");
    ID[0].setNama("Uchiha Sasuke");
    ID[0].setPeringkat("Genin");

    //membentuk objek 2
    ID[1] = new Shinobi();
    ID[1].setRegistrasi("012607");
    ID[1].setNama("Uzumaki Naruto");
    ID[1].setPeringkat("Genin");

    //membentuk objek 3
    ID[2] = new Shinobi();
    ID[2].setRegistrasi("012601");
    ID[2].setNama("Haruno Sakura");
    ID[2].setPeringkat("Chunin");

    //menampilkan 3 objek dari array
    System.out.println("===============================");
    System.out.println("\tData Shinobi");
    System.out.println("===============================");
    for(Shinobi x:ID){
      System.out.println("No.Registrasi : "+x.getRegistrasi());
      System.out.println("Nama : "+x.getNama());
      System.out.println("Peringkat : "+x.getPeringkat());
      System.out.println();
    }
  }
}
