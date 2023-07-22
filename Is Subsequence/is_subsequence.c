#include <stdio.h>
#include <string.h>

int isSubsequence(char * s, char * t){
    int s_cnt, t_cnt = 0; // grab pointers and size
    int size_s = strlen(s);
    int size_t = strlen(t);

    while(s_cnt < size_s && t_cnt < size_t){ // while the index's are valid
        if(s[s_cnt] == t[t_cnt]) // if two char's are the same
            s_cnt++; // increment s pointer
        t_cnt++; // increment t pointer
    }
    return s_cnt == size_s; // return if they're the same
}

int main(){
    printf("%d", isSubsequence("abc", "ajdbnec"));
}