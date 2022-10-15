#include <stdio.h>
// printf()
#include <stdlib.h>
// atoi(), qsort()
#include <string.h>
// strtok

#define DELIM ","

/**
 * @brief   comparison function used by stdlib qsort()
 */
int compare(const void *a, const void *b)
{
    int aa = *(int*) a;
    int bb = *(int*) b;
    if(aa > bb) return 1;
    return -1;
}

/**
 * @brief   binary search function
 */
static int rank(int key, int* a, size_t n)
{
    int lo = 0;
    int hi = n-1;

    while(lo <= hi){
        int mid = lo + (hi-lo) / 2;
        if(key < a[mid]) hi = mid - 1;
        else if(key > a[mid]) lo = mid + 1;
        else return mid;
    }
    return -1;
}

/**
 * @param[in]   argv[1] comma sepparated integer numbers 
 * @return      status
 * @note        usage example: ./a.out 1,2,3,4,5
 */
int main(int argc, char **argv)
{
    int     key;
    size_t  n;
    size_t  idx;
    char*   aux;
    int*    input_vector;
    char    line[1024];

    printf("Input list: %s\n", argv[1]);

    n   = 0;
    aux = argv[1];
    
    while(*aux != '\0'){
        if(strncmp(aux, DELIM, 1) == 0) n++;
        aux++;
    }  
    
    if(n < 1) return -1; 
  
    input_vector = (int*) calloc(n+1, sizeof(int));
    if(input_vector == NULL) return -1;
    
    n = 0;
    aux = strtok(argv[1], DELIM);
    while(aux){
        input_vector[n] = atoi(aux);
        n += 1;
        aux = strtok(NULL, DELIM);
    }
    
    qsort(input_vector, n, sizeof(int), compare);

    printf("checking white list (-1) to exit\n");
    while(scanf(" %d", &key) == 1) {
        if(key == -1) break;
        if(rank(key, input_vector, n) == -1){
            printf(">>> The key: %d is allowed <<<\n", key);
        }
        printf("checking white list (-1) to exit\n");
    } 

    free(input_vector);
    
    return 0;
}
