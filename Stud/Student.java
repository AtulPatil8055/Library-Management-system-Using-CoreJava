package Stud;


import java.io.*;
import java.util.Scanner;

public class Student {
    String nam,t_add,p_add,gen,ma_stat,inst,level;
    int age,choice;
    String ph_num;

    Scanner sc=new Scanner(System.in);

    public void input()
    {
        System.out.println("Enter Name t_add P_add gen ma_stat inst level age ph_num");
        nam = sc.next();
        t_add=sc.next();
        p_add=sc.next();
        gen=sc.next();
        ma_stat=sc.next();
        inst=sc.next();
        level=sc.next();
        age=sc.nextInt();
        ph_num=sc.next();
    }
    public void writing() {
        try {
            //Whatever the file path is.
            File statText = new File("D:\\best.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            w.write("\n----------------------------------");
            w.write("\nPersonal Information::");
            w.write("\n-----------------------------------");
           w.write("\nName:"+nam+"\nTemporary address:"+t_add+"\nPermanent address:"+p_add+"\nGender:"+gen+"\nMarital Status:"+ma_stat+"\nAge:"+age+"\nContact Number:"+ph_num);
            w.write("\n------------------------------------");
            w.write("\nYour Academic Qualification:");
        w.write("\n----------------------------------------");
        w.write("\nLevel:"+level+"\nInstitution:"+inst+"");
            w.write("\n------------------------------------");
            System.out.println("Successfully Written To File , thank You!!!!");
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file statsTest.txt");
            e.printStackTrace();
        }
    }

    public void StudentInfo()
    {
        System.out.println("----------------------------------------------------------------------------------------------\n");
        System.out.println("Personal Information::");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Name:"+nam+"\nTemporary address:"+t_add+"\nPermanent address:"+p_add+"\nGender:"+gen+"\nMarital Status:"+ma_stat+"\nAge:"+age+"\nContact Number:"+ph_num);
        System.out.println("Your Academic Qualification:");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Level:"+level+"\nInstitution:"+inst+"");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public void Menu()
    {
        System.out.println("1.Input \n 2.StudentInfo\n 3.Write To File");
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        switch(choice)
        {

            case 1:
                input();
                break;
            case 2:
                StudentInfo();
                break;
            case 3:
                writing();
                break;

        }
    }
}
