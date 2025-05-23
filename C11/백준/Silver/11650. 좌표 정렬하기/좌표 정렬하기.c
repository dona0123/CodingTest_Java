#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int x;
    int y;
} Point;

// 비교 함수: x 오름차순, x 같으면 y 오름차순
int compare(const void* a, const void* b) {
    Point* p1 = (Point*)a;
    Point* p2 = (Point*)b;

    if (p1->x != p2->x)
        return p1->x - p2->x;
    else
        return p1->y - p2->y;
}

int main() {
    int n;
    scanf("%d", &n);

    Point points[n];

    for (int i = 0; i < n; i++) {
        scanf("%d %d", &points[i].x, &points[i].y);
    }

    qsort(points, n, sizeof(Point), compare);

    for (int i = 0; i < n; i++) {
        printf("%d %d\n", points[i].x, points[i].y);
    }

    return 0;
}