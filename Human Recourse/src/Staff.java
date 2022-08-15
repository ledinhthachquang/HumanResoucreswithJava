import java.util.Scanner;
public abstract class Staff implements ICalculator {
    private String maNV;//ma nhan vien
    private String Name;//ten nhan vien
    private int age;//tuoi nhan vien
    private float hsl; //he so luong
    private String nvl; //ngay vao lam
    private Department bplv; //bo phan lam viec
    private int np; //ngay nghi phep
    Scanner sc = new Scanner(System.in);
     //Ham Constructor khong tham so
    public Staff(){
    }
    //cac phuong thuc setter cua class
    public void setMaNV(String maNV){
        this.maNV = maNV ;
    }
    public void setName(String Name){
      this.Name = Name;
    }
    public void setAge(int age){
      this.age = age;
    }
    public void setHsl(float hsl){
      this.hsl = hsl;
    }
    public void setNvl(String nvl){
      this.nvl = nvl;
    }
    public void setBplv(Department bplv){
      this.bplv = bplv;
    }
    public void setNp(int np){
      this.np = np;
    }
    //Constructor co chua tham so
    public Staff(String maNV,String Name,int age,float hsl,Department bplv,String nvl,int np){
      this.maNV = maNV;
      this.Name = Name;
      this.age = age;
      this.hsl = hsl;
      this.bplv = bplv;
      this.nvl = nvl;
      this.np = np;
      bplv.autoset();
    }
    // cac phuong thuc getter cua class
    public String getMaNV(){
      return maNV;
    }
    public String getName(){
      return Name;
    }
    public String getNvl(){
      return nvl;
    }
    public Department getBplv(){
      return bplv;
    }
    public int getAge(){
      return age;
    }
    public int getNp(){
      return np;
    }
    public float getHsl(){
      return hsl;
    }
    // ham abstract de cho cac subclass override
    public abstract void displayInformation();
}
