#include <stdio.h>

typedef struct {
    int ballNumber;
} Basket;

int main() {
    int n, m;
    scanf("%d %d", &n, &m);

    Basket baskets[n + 1]; // 1번부터 n번까지 사용

    // 초기화: 각 바구니에 자기 번호 공이 들어감
    for (int i = 1; i <= n; i++) {
        baskets[i].ballNumber = i;
    }

    // M번 바꾸는 작업 수행
    for (int k = 0; k < m; k++) {
        int i, j;
        scanf("%d %d", &i, &j);

        // 스왑
        int temp = baskets[i].ballNumber;
        baskets[i].ballNumber = baskets[j].ballNumber;
        baskets[j].ballNumber = temp;
    }

    // 결과 출력
    for (int i = 1; i <= n; i++) {
        printf("%d ", baskets[i].ballNumber);
    }
    printf("\n");

    return 0;
}