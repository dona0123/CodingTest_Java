#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char name[101];
    int korean;
    int english;
    int math;
} Student;

// 정렬 기준 구현
int compare(const void* a, const void* b) {
    Student* s1 = (Student*)a;
    Student* s2 = (Student*)b;

    // 1. 국어 점수 내림차순
    if (s1->korean != s2->korean) {
        return s2->korean - s1->korean;
    }

    // 2. 영어 점수 오름차순
    if (s1->english != s2->english) {
        return s1->english - s2->english;
    }

    // 3. 수학 점수 내림차순
    if (s1->math != s2->math) {
        return s2->math - s1->math;
    }

    // 4. 이름 사전순 오름차순
    return strcmp(s1->name, s2->name);
}

int main() {
    int n;
    scanf("%d", &n);

    Student students[n];

    for (int i = 0; i < n; i++) {
        scanf("%s %d %d %d", students[i].name, &students[i].korean, &students[i].english, &students[i].math);
    }

    qsort(students, n, sizeof(Student), compare);

    for (int i = 0; i < n; i++) {
        printf("%s\n", students[i].name);
    }

    return 0;
}

