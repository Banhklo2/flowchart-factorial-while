package factorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("프로그램을 시작합니다.");
        int n;
        long result = 1; // 누적 곱셈 결과

        // 양의 정수 입력받기
        while (true) {

            System.out.println("숫자를 입력하세요.");

            if (!sc.hasNextInt()) {
                System.out.println("정수를 입력하세요");
                sc.next();
                continue;
            }

            n = sc.nextInt();

            if (n >= 1) {
                break;
            } else {
                System.out.println("양의 정수를 입력하세요.");
            }
        }

        // 팩토리얼 계산 반복
        while (n >= 1) {
            result = result * n;
            n = n - 1 ;
        }

        // 결과 출력
        System.out.println("팩토리얼 결과 : " + result);
    }
}
