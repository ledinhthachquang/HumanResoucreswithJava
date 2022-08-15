
public class Employee extends Staff implements ICalculator{
    private float glt;//gio lam them
    public Employee(){
        //goi de constructor cua superclass
        super();
    }
    //ham constructor co tham so cua class
    public Employee(String maNV,String Name,int age,float hsl,Department bplv,String nvl,int np,float glt){
        super(maNV,Name,age,hsl,bplv,nvl,np);
        this.glt = glt;
    }
    public void setGlt(float glt){
        this.glt = glt;
    }
    //override interface
    public long  calculateSalary(){
        //cong thuc tinh luong = hesoluong * 3000000 + gio lam them * 200000
        long salary = (long)(super.getHsl() * 3000000 + glt * 200000);
        return salary;
    }
    //override abstract class
    public void displayInformation(){
        // dung tu khoa super de goi toi cac phuong thuc cua super class
        // hien thi thong tin nhan vien
        System.out.println("Ma nhan vien : " + super.getMaNV());
        System.out.println("Ten : " + super.getName());
        System.out.println("Tuoi :" + super.getAge());
        System.out.println("He so luong : " + super.getHsl());
        System.out.println("Ngay vao lam viec : " + super.getNvl());
        System.out.println("Ma bo phan:"+ super.getBplv().getMaBP() + "\tTen bo phan:" + super.getBplv().getNameBp());
        System.out.println("So ngay nghi phep : " + super.getNp());
        System.out.println("Luong = " + calculateSalary());
        System.out.println("------------------------------------");
    }
}
