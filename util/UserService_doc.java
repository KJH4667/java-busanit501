package util;

import java.util.Scanner;

public class UserService {
    // 회원 가입 기능, 정적 메소드 생성.
    // 콘솔로 입력을 받고, 결과를 문자열로 반환하는 기능을 포함.
    // 추후 업그레이드는 반환 타입을 : 문자열에서, 사용자 클래스 객체로 변경 예정.
    // 메인 메소드가 없음, 왜냐하면, 실행을 여기서 안함.
    // 이런 클래스를 , 설계용 클래스.
    public static void registerUser(Scanner scanner) {
        // Scanner 객체를 매개변수로 받기,
        // 해결책 1, 각 메서드에서, 공용으로 사용을 할 스캐너를 받는 변수를 정의
        System.out.println("이상용 홈피 회원가입");
        // 순서1, Scanner 객체 생성
        // Scanner scanner = new Scanner(System.in);

        // 순서2, 이름 입력 받기
        System.out.println("이름 입력해주세요 > ");
        String name = scanner.nextLine(); // 이름 입력 받기
        // 순서3, 이메일 입력 받기
        System.out.println("이메일 입력해주세요 > ");
        String email = scanner.nextLine(); // 이메일 입력 받기
        // 순서4, 패스워드 입력 받기
        System.out.println("패스워드 입력해주세요 > ");
        String password = scanner.nextLine(); // 패스워드 입력 받기

        // 순서5, 입력 받은 내용 출력
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("패스워드 : " + password);
        System.out.println("회원 가입 완료되었습니다.");

        // 순서6, scanner 닫기
        // scanner.close(); // Scanner 객체를 사용한 후에는 반드시 닫아줘야 함. 리소스 누수 방지
        // 메인에서, 한번에 다 사용후 , 자원 반납

    }

    // 콘솔로 이메일 입력받고, 패스워드 입력 받기.

    // 검증 없이, 단순 로그인 정보만 출력하기.

    // 힌트는 모두 문자열 해도 좋습니다.
    // 로그인 이메일 입력해주세요 >
    // 로그인 패스워드 입력해주세요 >

    // 출력 결과는
    // 로그인 이메일 정보 : {이메일}
    // 로그인 패스워드 정보 : {패스워드}
    // 로그인 완료되었습니다. 현재 임시로 단순 출력용입니다. 조금 있다. 검증도 추가 해보기
    public static void loginUser(Scanner scanner) { //
        // 해결책 1, 각 메서드에서, 공용으로 사용을 할 스캐너를 받는 변수를 정의
        System.out.println("이상용 홈피 로그인");
        // Scanner scanner = new Scanner(System.in); // 이슈 , 발생 ,

        System.out.println("이메일 입력해주세요 > ");
        String email = scanner.nextLine(); // 이메일 입력 받기
        System.out.println("패스워드 입력해주세요 > ");
        String password = scanner.nextLine(); // 패스워드 입력 받기

        System.out.println("로그인 이메일 정보 : " + email);
        System.out.println("로그인 패스워드 정보 : " + password);
        System.out.println("로그인 완료되었습니다. 현재 임시로 단순 출력용입니다.");

        // 순서6, scanner 닫기
        // scanner.close(); // Scanner 객체를 사용한 후에는 반드시 닫아줘야 함. 리소스 누수 방지
        // 메인에서, 한번에 다 사용후 , 자원 반납
    }
}
