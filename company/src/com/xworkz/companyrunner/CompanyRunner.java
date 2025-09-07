package com.xworkz.companyrunner;

import com.xworkz.companyrunner.company.Company;
import com.xworkz.companyrunner.project.Project;

import java.util.Scanner;

public class CompanyRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of project:");
        int size=sc.nextInt();
        Company company=new Company(size);
        for(int i=0;i<size;i++) {
            Project project = new Project();
            System.out.println("Enter the project name: ");
            project.setProjectName(sc.next());

            System.out.println("Enter the number of workers in project");
            project.setNoOfWorkers(sc.nextInt());

            System.out.println("The project is Completed? ");
            project.setIsCompleted(sc.nextBoolean());

            company.addProject(project);

        }
        company.getAllData();

    }
}
