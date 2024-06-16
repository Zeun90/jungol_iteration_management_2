# 반복 제어문 (2)

## 연습 문제

#### [1] 10 이하의 정수를 입력받아 입력받은 정수만큼 "C언어 프로그래밍"이라고 출력하는 프로그램을 작성하시오.
입력
```
5
```
출력
```
C언어 프로그래밍
C언어 프로그래밍
C언어 프로그래밍
C언어 프로그래밍
C언어 프로그래밍
```
---
#### [2] 대문자를 'A'부터 'Z'까지 차례로 출력하는 프로그램을 작성하시오.
출력
```
ABCDEFGHIJKLMNOPQRSTUVWXYZ
```
---
#### [3] 1부터 20까지의 홀수를 차례대로 출력하는 프로그램을 작성하시오.
출력
```
1 3 5 7 9 11 13 15 17 19
```
---
#### [4] 자연수를 입력받아서 1부터 입력받은 수까지의 합을 출력하는 프로그램을 작성하시오.
입력
```
10
```
출력
```
55
```
---
#### [5] 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램을 작성하시오.
입력
```
15 22 3 129 66 81 35 1 46 888
```
출력
```
입력받은 짝수는 4개입니다.
```
---
#### [6] 5명의 성적을 입력받아서 총점과 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 첫째자리까지 출력한다.)
입력
```
90 85 100 66 88
```
출력
```
총점 : 429
평균 : 85.8
```
---
#### [7] 아래 출력예와 같이 출력하는 프로그램을 작성하시오.
출력
```
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
```
---
#### [8] 아래와 같이 2단부터 4단까지의 구구단을 출력하는 프로그램을 작성하시오.
출력
```
2 * 1 =  2   3 * 1 =  3   4 * 1 =  4
2 * 2 =  4   3 * 2 =  6   4 * 2 =  8
2 * 3 =  6   3 * 3 =  9   4 * 3 = 12
2 * 4 =  8   3 * 4 = 12   4 * 4 = 16
2 * 5 = 10   3 * 5 = 15   4 * 5 = 20
2 * 6 = 12   3 * 6 = 18   4 * 6 = 24
2 * 7 = 14   3 * 7 = 21   4 * 7 = 28
2 * 8 = 16   3 * 8 = 24   4 * 8 = 32
2 * 9 = 18   3 * 9 = 27   4 * 9 = 36
```

<br>

---
## 자가 진단

#### [1] 문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.
입력
```
A
```
출력
```
AAAAAAAAAAAAAAAAAAAA
```
---
#### [2] 10부터 20까지의 숫자를 차례대로 출력하는 프로그램을 작성하시오.for문을 사용하세요.
출력
```
10 11 12 13 14 15 16 17 18 19 20
```
---
#### [3] 하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 차례대로 출력하는 프로그램을 작성하시오. 입력되는 정수는 50이하이다.
입력
```
10
```
출력
```
2 4 6 8 10
```
---
#### [4] 100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.
입력
```
95
```
출력
```
4560
```
---
#### [5] 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
입력
```
10 15 36 99 100 19 46 88 87 13
```
출력
```
Multiples of 3 : 4
Multiples of 5 : 3
```
---
#### [6] 10 이하의 과목수 n이 주어진다.<br>정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고<br>평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.<br>평균은 반올림하여 소수 첫째자리까지 출력한다.
입력
```
4
75 80 85 90
```
출력
```
avg : 82.5
pass
```
---
#### [7] 아래와 같이 출력되는 프로그램을 작성하시오.
출력
```
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
6 7 8 9 10
```
---
#### [8] 구구단의 일부를 다음과 같이 출력하는 프로그램을 작성하시오.<br>곱셈의 결과는 오른쪽으로 맞추어 출력을 하고 결과값 사이의 공백은 3칸으로 한다.<br>출력형식 예) 2_*_1_=__2___ (_는 공백을 나타내는 것임)
출력
```
2 * 1 =  2   2 * 2 =  4   2 * 3 =  6   2 * 4 =  8   2 * 5 = 10
3 * 1 =  3   3 * 2 =  6   3 * 3 =  9   3 * 4 = 12   3 * 5 = 15
4 * 1 =  4   4 * 2 =  8   4 * 3 = 12   4 * 4 = 16   4 * 5 = 20
```

<br>

---
## 형성 평가

#### [1] 10 이하의 자연수 n을 입력받아 "JUNGOL"을 n번 출력하는 프로그램을 작성하시오.
입력
```
4
```
출력
```
JUNGOL
JUNGOL
JUNGOL
JUNGOL
```
---
#### [2] 100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.
입력
```
10 5
```
출력
```
5 6 7 8 9 10
```
---
#### [3] 정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.
입력
```
20
```
출력
```
50
```
---
#### [4] 100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)
입력
```
3
99 65 30
```
출력
```
64.67
```
---
#### [5] 10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.
입력
```
10 20 30 55 66 77 88 99 100 15
```
출력
```
even : 6
odd : 4
```
---
#### [6] 두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.<br>(평균은 반올림하여 소수 첫째자리까지 출력한다.)
입력
```
10 15
```
출력
```
sum : 37
avg : 12.3
```
---
#### [7] 한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오
입력
```
5
```
출력
```
5 10 15 20 25 30 35 40 45 50
```
---
#### [8] 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
입력
```
3 4
```
출력
```
1 2 3 4
2 4 6 8
3 6 9 12
```
---
#### [9] 정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.
입력
```
4
```
출력
```
(1, 1) (1, 2) (1, 3) (1, 4)
(2, 1) (2, 2) (2, 3) (2, 4)
(3, 1) (3, 2) (3, 3) (3, 4)
(4, 1) (4, 2) (4, 3) (4, 4)
```
---
#### [10] 2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.<br>단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.<br>구구단 사이의 공백은 3칸이다
입력
```
5 3
```
출력
```
5 * 1 =  5   4 * 1 =  4   3 * 1 =  3
5 * 2 = 10   4 * 2 =  8   3 * 2 =  6
5 * 3 = 15   4 * 3 = 12   3 * 3 =  9
5 * 4 = 20   4 * 4 = 16   3 * 4 = 12
5 * 5 = 25   4 * 5 = 20   3 * 5 = 15
5 * 6 = 30   4 * 6 = 24   3 * 6 = 18
5 * 7 = 35   4 * 7 = 28   3 * 7 = 21
5 * 8 = 40   4 * 8 = 32   3 * 8 = 24
5 * 9 = 45   4 * 9 = 36   3 * 9 = 27
```