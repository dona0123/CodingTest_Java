#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    int age;
    char name[101];
    int order;  // 가입 순서를 기억
} Member;

int compare(const void* a, const void* b) {
    Member* m1 = (Member*)a;
    Member* m2 = (Member*)b;

    if (m1->age != m2->age) {
        return m1->age - m2->age; // 나이 오름차순
    } else {
        return m1->order - m2->order; // 가입 순서 오름차순 (안정 정렬 흉내냄)
    }
}

int main() {
    int n;
    scanf("%d", &n);

    Member members[n];

    for (int i = 0; i < n; i++) {
        scanf("%d %s", &members[i].age, members[i].name);
        members[i].order = i;  // 입력 순서 저장
    }

    qsort(members, n, sizeof(Member), compare);

    for (int i = 0; i < n; i++) {
        printf("%d %s\n", members[i].age, members[i].name);
    }

    return 0;
}