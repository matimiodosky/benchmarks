#include <stdio.h>
#include <time.h> 
#include <math.h>

void fun() 
{ 
    for (long i = 0; i < 55000000; ++i)
    {
    	long a = 1000 * 1000;
    }
    for (long i = 0; i < 1000000; ++i)
    {
    	double b = acos(0.5);
    }
} 

int main() {
   // printf() displays the string inside quotation
	clock_t t; 
   	t = clock(); 
    fun(); 
    t = clock() - t; 
    double time_taken = ((double)t)/CLOCKS_PER_SEC * 1000;  
 	printf("fun() took %f seconds to execute \n", time_taken); 
   	return 0;
}

