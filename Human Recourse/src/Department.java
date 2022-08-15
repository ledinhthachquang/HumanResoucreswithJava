import java.util.Scanner;
public class Department {
    Scanner sc = new Scanner(System.in);
    private int maBP;//Ma bo phan
    private String NameBp;//Ten bo phan
    private int slnv;//So luong nhan vien
    //Constructor khong tham so
    public Department(){
     System.out.println("Chon ma bo phan (1 - Business, 2 - Engineering)");
     // kiem tra dieu kien Input
     do {
         maBP = sc.nextInt();
         if(maBP<0 || maBP> 2){
             System.out.println("Ma nhap vao khong hop le . Vui long nhap lai !!!");
         }
     }while (maBP<0 || maBP> 2);
         if(maBP == 1) {
             // neu ma bo phan la 1 thi tuong ung bo phan do se la Business
             NameBp = "Business";
         }
         else if(maBP == 2){
             // neu ma bo phan la 2 thi tuong ung bo phan do se la Engineering
             NameBp = "Engineering";
         }
    }
    //Constructor co tham so
    public Department(int maBP){
        this.maBP = maBP;
        if(maBP == 1) {
            NameBp = "Business";
        }
        else if(maBP == 2){
            NameBp = "Engineering";
        }
    }
    public int getMaBP(){
        return maBP;
    }
    public String getNameBp(){
        return NameBp;
    }
    public int getSlnv(){
        return slnv;
    }
    public void setSlnv(){
        this.slnv = 1;
    }
    public int tangSLnv(){
        return slnv++;
    }
    //phuong thuc tang gia tri so luong nhan vien len 1 ,su dung khi 1 Staff bat ky duoc them vao 1 bo phan
    public void autoset(){
        int a = this.slnv + 1;
        this.slnv = a ;
    }
    //phuong thuc hien thi cac gia tri cua Department
    public String toString(){
        return ("Ma bo phan : "+ maBP + "\t\tTen bo phan : " + NameBp + "\t\tSo luong nhan vien :" + slnv);
    }
}
