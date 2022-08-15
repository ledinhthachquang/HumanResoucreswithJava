
# HumanResoucreswithJava


---

## Introduction
### 🆕This project is called human resource management. This project consists of 2 parts:
- #### Human Resoucres Console : Designing functions in the form of consoles using oop knowledge 
<img width="584" alt="image" src="https://user-images.githubusercontent.com/111257273/184632793-92546018-e089-4ec2-b295-8e9bf6fa50a2.png">

- #### HumanResoucresApplication : Android Programming designing app interfaces including 2 functions: adding and removing employees.
<img width="535" alt="image" src="https://user-images.githubusercontent.com/111257273/184577664-6769688e-6587-4039-b01d-0e46ef8f5bd6.png">

## Purpose
- Improve oop programming skills
- get acquainted with android programming

## 🚀 How to use
- Use Android Studio to open file.apk and folder Human Resources Console
- Download HumanResourcesApplication.rar then extract and open the folder with Android Studio

## Role for the projects 
Personal products

## Time
Starting Date : 05/08/2022
Total time : ~24h

## Project details

### Human Resoucres Console
#### Function
1. Display the list of existing employees in the company

2. Show departments in the company

3. Show employees by department

4. Add new employees to the company: includes 2 types

- Add regular staff

- More staff as management (with more positions)

5. Search for employee information by name or employee code
6. Display payroll of employees throughout the company
7. Display employee payroll in ascending order
#### Programming techniques applied
- Interface
- The four principles of oop
- Arraylist 
#### Difficulties encountered
- Must be familiar with the Arraylist library

### Android App
#### Function
- Adding 
<img width="325" alt="image" src="https://user-images.githubusercontent.com/111257273/184677494-f55e7680-ee76-48ad-9a84-4fa0a9b44575.png">
added success
<img width="325" alt="image" src="https://user-images.githubusercontent.com/111257273/184677604-b83f0ebc-74c3-4ad8-95db-6a9e1f703171.png">

- Removing

Click checkbox to removing

<img width="327" alt="image" src="https://user-images.githubusercontent.com/111257273/184677011-609e9753-bf23-4d81-88e5-dabb26c1cd06.png">

successful removed

<img width="335" alt="image" src="https://user-images.githubusercontent.com/111257273/184677122-3f35c6b1-27eb-4f55-adcc-3aa913501263.png">


#### Programming techniques applied
- Adapter
- ListView
#### Difficulties encountered
- Not familiar with adapter
- Encountered a bug with the 'Add' button, when adding male gender but the icon still shows female gender

the code encountered a bug
```
 boolean gioitinh = true;
 if(rdo_btNam.isChecked()){
            gioitinh = true;
        } else{
            gioitinh = false;
        }
        // Sự kiện thêm
        bt_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dsNhanVien.add(new NhanVien(txt_ID.getText().toString(),txt_Name.getText().toString(),gioitinh));
            }
        });
```


