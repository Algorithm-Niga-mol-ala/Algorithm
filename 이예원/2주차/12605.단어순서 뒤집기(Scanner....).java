
//문자열 여러개가 주어질 때 단어들을 반대 순서로 뒤집어라
//각 라인은 w개의 영단어로 이루어져 있고 총 L개의 알파벳을 가짐

//입력
//첫 행은 N, 전체 케이스의 개수
//N = 5
//1<=L<=25

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Stack<String> stack = new Stack<>();

		for (int tc = 1; tc <= N; tc++) { // 테스트케이스 반복하는 for문

			String str = sc.nextLine(); // next냐 Line이냐

      //여기에서 Line을 쓰면 N 입력할 때 치는 엔터까지 입력받아서 스택의 첫번째요소를 pop하지 못함

			String[] word = str.split(" "); // 공백을 기준으로 하나씩 배열에 저장

			for (int i = 0; i < word.length; i++) {
				stack.push(word[i]);
			}

		} // 큰for문
		for (int j = 1; j <= stack.size(); j++) {
			System.out.print(stack.pop() + " ");
		}

	}
}
