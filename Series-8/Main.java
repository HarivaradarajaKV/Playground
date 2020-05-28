#include<stdio.h>
 
main()
{
   int n, i = 100, count, c;
   scanf("%d",&n);
   for ( count = 2 ; count <= n+1 ;  )
   {
      for ( c = 2 ; c <= i - 1 ; c++ )
      {
         if ( i%c == 0 )
            break;
      }
      if ( c == i )
      {
         printf("%d ",i);
         count++;
      }
      i++;
   }         
   return 0;
}