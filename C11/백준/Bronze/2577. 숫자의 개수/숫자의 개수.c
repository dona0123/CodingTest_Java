#include <stdio.h>

int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    int result = a * b * c;
    int count[10] = {0};  // 0~9 개수 저장

    int *p = count;  // 포인터로 접근

    while (result > 0) {
        int digit = result % 10;
        (*(p + digit))++;  // 포인터를 이용해 개수 증가
        result /= 10;
    }

    for (int i = 0; i < 10; i++) {
        printf("%d\n", *(p + i));  // 포인터로 출력
    }

    return 0;
}