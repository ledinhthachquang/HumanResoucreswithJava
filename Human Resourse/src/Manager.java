public class Manager extends Staff implements ICalculator {
    private int cd;//chuc danh cua quan li
    public Manager(){
        //goi de constructor cua superclass
        super();
    }
    //ham constructor co tham so cua class
    public Manager(String maNV,String Name,int age,float hsl,Department bplv,String nvl,int np,int cd){
        super(maNV,Name,age,hsl,bplv,nvl,np);
        this.cd = cd;
    }
    public void setCd(int cd) {
        this.cd = cd;
    }
    //override interface
    public long calculateSalary(){
        int luong_trach_nhiem = 0;
        if(cd == 1){
            //cd = 1 tuong duong voi chuc danh la Business Leader va co luong = 8000000
             luong_trach_nhiem = 8000000;
        }
        else if(cd == 2){
            //cd = 2 tuong duong voi chuc danh la Project Leader va co luong = 5000000
            luong_trach_nhiem = 5000000;
        }
        else if (cd == 3){
            //cd = 3 tuong duong voi chuc danh la Technical Leader va co luong = 6000000
            luong_trach_nhiem = 6000000;
        }
        // cong thuc tinh luong quan ly = he so luong * 5000000 + luong trach nhien(luong chuc danh)
        long salary = (long)(super.getHsl() * 5000000 + luong_trach_nhiem);
        return salary;
    }
    //override abstract class
    public void displayInformation(){
        // hien thi thong tin quan ly
        System.out.println("Ma nhan vien : " + super.getMaNV());
        System.out.println("Ten : " + super.getName());
        System.out.println("Tuoi :" + super.getAge());
        String chucDanh;
        if(cd == 1){
            chucDanh ="Business Leader";
        }
        else if(cd == 2){
            chucDanh ="Project Leader";
        }
        else {
            chucDanh ="Technical Leader";
        }
        System.out.println("Chuc Danh : " + chucDanh);
        System.out.println("He so luong : " + super.getHsl());
        System.out.println("Ngay vao lam viec : " + super.getNvl());
        System.out.println("Ma bo phan:"+ super.getBplv().getMaBP() + "\tTen bo phan:" + super.getBplv().getNameBp());
        System.out.println("So ngay nghi phep : " + super.getNp());
        System.out.println("Luong = " + calculateSalary());
        System.out.println("----------------------------------");
    }
}
