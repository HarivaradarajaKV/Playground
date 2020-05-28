#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct employee
{
    int id,bs,hra,da,ma,pf,in;
    char name[300];
};
int main()
{
    struct employee E[10];
    int n;
    int ide;
    printf("Enter the number of employees:\n");
    scanf("%d",&n);
    printf("Enter your input for every employee:\n");
    for(int i=0;i<n;i++)
    {
        printf("Employee ID:\n");
        scanf("%d",&E[i].id);
        printf("Employee Name:\n");
        scanf("%s",&E[i].name);
        printf("Basic salary,HRA:\n");
        scanf("%d%d",&E[i].bs,&E[i].hra);
        printf("DA,Medical Allowance:\n");
        scanf("%d%d",&E[i].da,&E[i].ma);
        printf("PF and Insurance:");
        scanf("%d%d",&E[i].pf,&E[i].in);
    }
    printf("Enter employee ID to get payslip:\n");
    scanf("%d",&ide);
    for(int i=0;i<n;i++)
    {
        if(ide==E[i].id)
        {
            printf("Salary slip of %s:\n",E[i].name);
            printf("Employee ID:%d\n",E[i].id);
            printf("Basic Salary:%d\n",E[i].bs);
            printf("House Rent Allowance:%d\n",E[i].hra);
            printf("Dearness Allowance:%d\n",E[i].da);
            printf("Medical Allowance:%d\n",E[i].ma);
            float gs=0;
            gs=(E[i].bs+E[i].hra+E[i].da+E[i].ma)*12;
            printf("Gross Salary:%.2f Rupees\n",gs);
            printf("Deductions: \n");
            printf("Provident fund:%d\n",E[i].pf);
            printf("Insurance:%d\n",E[i].in);
            printf("Net Salary:%.2f Rupees",gs-E[i].pf*12-E[i].in*12);
        }
    }
    return 0;
}