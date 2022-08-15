import java.util.*;

public class HumanResoucres {
    public static void main(String[] args) {
        //tao ArrayList Staff
        List<Staff> stf = new ArrayList<>();
        //tao ArrayList Department
        List<Department> Dp = new ArrayList<>();
        String InputMaNV,InputTen,InputNvl;
        int InputAge,InputNp,InputCd;
        float InputHsl,InputGlt;
        Department dp = new Department(1);
        Department dp2 = new Department(2);
        //them gia tri mac dinh cho ArrayList Department
        Dp.add(dp);
        Dp.add(dp2);
        Scanner sc = new Scanner(System.in);
        //them gia tri mac dinh cho ArrayList Staff
        stf.add(new Employee("1","NhanVanVien",20,3,dp,"17/08/2021",5,10));
        stf.add(new Manager("2","QuanThiLy",30,3,dp2,"17/08/2021",10,1));
        String kt;
        do{
            //Bang Menu hien thi cac lua chon tuong
            System.out.println("\t=====================MENU==================");
            System.out.println("\t1.Hien thi danh sach nhan vien co trong cong ty");
            System.out.println("\t2.Hien thi cac bo phan trong cong ty");
            System.out.println("\t3.Hien thi nhan vien theo tung bo phan");
            System.out.println("\t4.Them nhan vien moi vao cong ty ");
            System.out.println("\t5.Tim kiem nhan vien theo ten hoac ma nhan vien");
            System.out.println("\t6.Hien thi bang luong cua tung nhan vien cong ty");
            System.out.println("\t7.Hien thi bang luong cua nhan vien theo thu tu tang dan");
            System.out.print("\t\t Nhap vao lua chon cua ban :");
            int sl = 0;
            //Kiem tra dieu kien nhap lua chon
            do {
                sl = sc.nextInt();
                if(sl < 0 || sl > 7){
                    System.out.print("lua chon khong hop le.Vui long nhap lai!!!");
                }
            } while (sl < 0 || sl > 7);
            if(sl == 1) {
                //hien thi toan bo thong tin cua nhan vien trong ArrayList Staff
                stf.forEach(st -> st.displayInformation());
            }
            else if (sl == 2) {
                //hien thi thong tin cua cac bo phan trong ArrayList Department
                int l = Dp.size();
                for(int j = 0 ; j < l ; j++){
                    System.out.println(Dp.get(j).toString());
                }
            }
            else if (sl == 3) {
                //hien thi nhan vien theo tung bo phan
                int Length = stf.size();
                System.out.println("\t\t\t****Bo phan 1****");
                for(int i = 0 ; i < Length ; i++){
                    if(stf.get(i).getBplv().getMaBP() == 1){
                        stf.get(i).displayInformation();
                    }
                }
                System.out.println("\t\t\t****Bo phan 2****");
                for(int i = 0 ; i < Length ; i++){
                    if(stf.get(i).getBplv().getMaBP() == 2){
                        stf.get(i).displayInformation();
                    }
                }
            }
            else if( sl == 4){
                //them nhan vien moi vao ArrayList Staff
                System.out.print("Nhap vao so luong nhan vien :");
                int  m = sc.nextInt();
                for(int i = 0; i < m ; i++){
                      int choose;
                      //kiem tra dieu kien chon loai nhan vien
                      System.out.println("Chon loai nhan vien (1-them nhan vien thong thuong,2-them nhan vien quan li) ");
                      do {
                          choose = sc.nextInt();
                          if(choose <0 || choose > 2){
                              System.out.println("Lua chon khong hop le.Vui long nhap lai!!!!");
                          }
                      }while (choose < 0 || choose >2);
                      if(choose == 1){
                              Department InputBplv1;
                              Employee newInputE = new Employee();
                              System.out.print("Nhap ma nhan vien:");
                              InputMaNV = sc.next();
                              System.out.print("Nhap ten nhan vien:");
                              InputTen = sc.next();
                              System.out.print("Nhap tuoi nhan vien:");
                              InputAge = sc.nextInt();
                              System.out.print("Nhap he so luong:");
                              InputHsl = sc.nextFloat();
                              System.out.print("Nhap ngay vao lam:");
                              InputNvl = sc.next();
                              InputBplv1 = new Department();
                              System.out.print("Nhap so ngay nghi phep:");
                              InputNp = sc.nextInt();
                              System.out.print("Nhap gio lam them");
                              InputGlt = sc.nextFloat();
                              //su dung cac phuong thuc setter de thiet lap gia tri cho Employee theo Input
                              newInputE.setMaNV(InputMaNV);
                              newInputE.setName(InputTen);
                              newInputE.setAge(InputAge);
                              newInputE.setHsl(InputHsl);
                              newInputE.setNvl(InputNvl);
                              newInputE.setBplv(InputBplv1);
                              newInputE.setNp(InputNp);
                              newInputE.setGlt(InputGlt);
                              stf.add(newInputE);
                              //xet dieu kien sau khi de them thanh cong 1 nhan vien thi so luong nhan vien tuong ung trong bo phan cung tang
                              if(InputBplv1.getNameBp().equalsIgnoreCase("Business")){
                                  Dp.get(0).autoset();
                              }
                              else if(InputBplv1.getNameBp().equalsIgnoreCase("Engineering")){
                                  Dp.get(1).autoset();
                              }
                          }
                          else if(choose == 2){
                              Manager newInputM = new Manager();
                              Department InputBplv;
                              System.out.print("Nhap ma nhan vien:");
                              InputMaNV = sc.next();
                              System.out.print("Nhap ten nhan vien:");
                              InputTen = sc.next();
                              System.out.print("Nhap tuoi nhan vien:");
                              InputAge = sc.nextInt();
                              System.out.print("Nhap he so luong:");
                              InputHsl = sc.nextFloat();
                              System.out.print("Nhap ngay vao lam:");
                              InputNvl = sc.next();
                              InputBplv = new Department();
                              System.out.print("Nhap so ngay nghi phep:");
                              InputNp = sc.nextInt();
                              System.out.print("Nhap chuc danh(1-Business Leader,2-Project Leader,3-Technical Leader)");
                              InputCd = sc.nextInt();
                              newInputM.setMaNV(InputMaNV);
                              newInputM.setName(InputTen);
                              newInputM.setAge(InputAge);
                              newInputM.setHsl(InputHsl);
                              newInputM.setNvl(InputNvl);
                              newInputM.setBplv(InputBplv);
                              newInputM.setNp(InputNp);
                              newInputM.setCd(InputCd);
                              stf.add(newInputM);
                              if(InputBplv.getNameBp().equalsIgnoreCase("Business")){
                                  Dp.get(0).autoset();
                              }
                              else if(InputBplv.getNameBp().equalsIgnoreCase("Engineering")){
                                  Dp.get(1).autoset();
                              }
                          }
                }
            }
            else if (sl == 5){
                //tim kiem nhan vien theo ten va ma nhan vien
                System.out.println("Nhap vao ma nhan vien hoac ten nhan vien can tim :");
                String maNhap = sc.next();
                int Length = stf.size();
                int check = 0;
                for(int i = 0 ; i < Length ; i++){
                    if(stf.get(i).getMaNV().equals(maNhap)||stf.get(i).getName().equalsIgnoreCase(maNhap)){
                        stf.get(i).displayInformation();
                        check ++;
                    }
                }
                //neu check khong tang tuong duong voi khong tim thay nhan vien
                if(check == 0){
                    System.out.println("Khong tim thay nhan vien !!!");
                }
            }
            else if(sl == 6){
                int Length = stf.size();
                //in ra ten va bang luong tuong ung cua tung nhan vien trong ArrayList Staff
                System.out.println("\n\t\tBang luong cua tung nhan vien cong ty la :");
                for(int i = 0 ; i < Length ; i++){
                    System.out.println("Ten nhan vien :" + stf.get(i).getName() +"\t\tLuong :" + stf.get(i).calculateSalary());
                }
            }
            else if(sl == 7){
                   //Sap xep nhan vien theo luong tang dan va hien thi ten va bang luong tuong ung
                    Collections.sort(stf, new Comparator<Staff>() {
                        public int compare(Staff st, Staff st2) {
                            if(st.calculateSalary() <= st2.calculateSalary()){
                                return -1;
                            }
                            else return 1;
                        }
                    });
                    int Length = stf.size();
                    System.out.println("\n\t\tDanh sach nhan vien sap xep theo luong tang dan la :");
                    for(int i = 0 ; i < Length ; i++){
                        System.out.println("Ten nhan vien :" + stf.get(i).getName() +"\t\tLuong :" + stf.get(i).calculateSalary());
                    }
                }
            System.out.println("Tiep tuc chuong trinh khong ?(chon bat ky de tiep tuc ,chon 0 de thoat chuong trinh)");
            kt = sc.next();
            //khi lua chon bang 0 thi se ket thuc chuong trinh
        }while (kt.equals("0") == false);
    }
}

