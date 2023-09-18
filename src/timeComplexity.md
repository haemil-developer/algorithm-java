# 시간 복잡도
### 입력 크기와 알고리즘간의 관계
- 알고리즘의 복잡도를 나타내는 지표 중 하나
- 입력 크기에 대해 프로그램의 동작시간을 가늠해볼 수 있는 수단
- Big-O/ Big-Omega / Big-theta 와 같은 표기법으로 나타낼 수 있다.
    - 정의된 입력 데이터 중 가장 최악의 상황을 포함한 시간의 상한선


### 시간 복잡도: O(L)
```
// 알파벳 구성을 파악하는 코드 시간 복잡도
for (int i = 0; i < str.length(); i++ {
	int alphabetIndex = str.charAt(i) - 'A';
	count[alphabetIndex]++;
}
```

입력된 문자열 길이에 비례한다


### 시간 복잡도: O(NM)
```
long sum = 0;
for (int i = 0; i < N; i++ {
	for (int j = 0; j < M; j++) {
		sum += (long)a[i] * b[j]
	}
}
```


- 현실에서 프로그램의 동작시간은 환경적 요소에 따라 달라질 수 있다.
- 보편적은 코딩테스트에는 문제마다 시간 제한이 주어진다.
    - 시간 제한이 1초라면, 최악의 테스트케이스에서도 해당 시간 내에 프로그램이 답을 구할 수 있어야 한다.
- 편의상 1초에 약 1억 번 연산을 기준으로 소요시간을 가늠할 수 있다.
    - 절대적 기준이 아닌 상대적 지표
    - 상수/최적화 등에 따라 시간복잡도가 1천만 밖에 되지 않아도 1초를 넘기거나 시간복잡도로 10억이 넘어도 1초안에 실행 될 수 있다.

### 보다 적합한 알고리즘을 선택할 수 있는 기준
- 올바른 정답을 구하는 알고리즘이 여럿이라면?
    - 시간이 넉넉하다면 구현이 쉬운 방법을 택하거나
    - 제한에 따라 시간/메모리상으로 효율적인 방법을 택할 수 있다.