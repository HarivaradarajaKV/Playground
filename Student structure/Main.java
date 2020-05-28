#include<stdio.h>
struct student
{
    int rn;
    int s1,s2,s3,s4,s5;
    int grade;
    float avg;
};
int main()
{
    int n;
    struct student S[10];
    printf("STUDENT MARKSHEET USING STRUCTURES\n");
    printf("Enter the no of students\n");
    printf("\n");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&S[i].rn);
        scanf("%d%d%d%d%d",&S[i].s1,&S[i].s2,&S[i].s3,&S[i].s4,&S[i].s5);
        S[i].avg=(S[i].s1+S[i].s2+S[i].s3+S[i].s4+S[i].s5)/5;
        if(S[i].avg>70)
            S[i].grade=1;
        else if(S[i].avg>50)
            S[i].grade=2;
        else
            S[i].grade=3;
    }
    printf("rn s1 s2 s3 s4 s5 avg grade\n");
    printf("\n");
    for(int i=0;i<n;i++)
    {
        printf("%d %d %d %d %d %d %.2f %d\n",S[i].rn,S[i].s1,S[i].s2,S[i].s3,S[i].s4,S[i].s5,S[i].avg,S[i].grade);
    }
    return 0;
}