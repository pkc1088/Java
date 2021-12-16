#include <stdio.h>

int main(void)
{
	char score[3][4]={ {'a', 'b', 'c', 'd'},
                       {'e', 'f', 'g'},
                       {'h', 'i'}};
    
    printf("%c %c\n", score[0][4], score[0][5]);
    printf("%s\n", score[2]);
    
	char score2[3][10]={{"Hey"},
						{"what the"},
						{"fuck you"}};
    
	printf("%s %s\n", score2[0], score2[1]);
    printf("%c\n", score2[0][7]); 
}
/*
#include <iostream>
using namespace std;
int main(void)
{
	char score[3][4]={ {'a', 'b', 'c', 'd'},
                       {'e', 'f', 'g'},
                       {'h', 'i'}};
    
	cout<<score[0][4]<<" "<<score[0][5]<<endl;
    cout<<score[2]<<endl;
    
	char score2[3][10]={{"Hey"},
						{"what the"},
						{"fuck you"}};
    
	cout<<score2[0]<<" "<<score2[1]<<endl;
    cout<<score2[0][9]<<endl;
}*/
