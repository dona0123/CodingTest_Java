#include <stdio.h>

int main() {
    char str[101];         // 최대 100자 문자열 저장할 배열
    int alphabet[26];      // 알파벳 a~z까지 각 문자의 첫 등장 위치 저장
    char *p = str;         // 문자열을 가리킬 포인터

    // 알파벳 배열을 -1로 초기화 (등장하지 않았다고 가정)
    for (int i = 0; i < 26; i++) {
        alphabet[i] = -1;
    }

    scanf("%s", str);      // 문자열 입력 받기

    // 문자열 순회
    for (int i = 0; *(p + i) != '\0'; i++) {
        int index = *(p + i) - 'a';  // 해당 문자의 알파벳 인덱스 계산 (a=0, b=1, ..., z=25)

        // 아직 해당 문자가 등장한 적이 없다면 위치 저장
        if (alphabet[index] == -1) {
            alphabet[index] = i;
        }
    }

    // 알파벳 a~z까지 각 문자의 첫 등장 위치 출력
    for (int i = 0; i < 26; i++) {
        printf("%d ", alphabet[i]);
    }

    return 0;
}
