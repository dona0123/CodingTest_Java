#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int arr[n];  // 배열 선언
    for (int i = 0; i < n; i++) {
        scanf("%d", arr + i);  // 포인터로 입력
    }

    int *min = arr;  // 최솟값을 가리키는 포인터
    int *max = arr;  // 최댓값을 가리키는 포인터

    for (int i = 1; i < n; i++) {
        if (*(arr + i) < *min) {
            min = arr + i;
        }
        if (*(arr + i) > *max) {
            max = arr + i;
        }
    }

    printf("%d %d\n", *min, *max);
    return 0;
}