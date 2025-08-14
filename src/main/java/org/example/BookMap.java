package org.example;

import java.util.*;

// 이미 재고에 있는 도서
// 수정 - 해당 도서가 재고에 없습니다
// 모든 도서 출력
public class BookMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bookNameAndStock = new HashMap<>();
        boolean endOfProgram = false;
        String bookName;
        Integer bookStock;

        while (!endOfProgram) {
            System.out.println("---도서 재고 관리 프로그램---");
            System.out.println("1. 도서 추가\n2. 재고 수정\n3. 재고 목록\n4. 종료");
            System.out.print("메뉴를 선택하세요. >>> ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.print("새 도서명을 입력하세요 >>>");
                bookName = scanner.nextLine();

                // 도서명이 이미 있다면(key값이 있다면)
                if (bookNameAndStock.containsKey(bookName)) {
                    System.out.println("이미 재고에 있는 도서입니다.");

                } else {
                    // 일치하는게 없으니까 추가
                    System.out.print("재고 수량을 입력하세요. >>> ");
                    bookStock =scanner.nextInt();
                    scanner.nextLine();
                    // Map 에 집어넣음(key, value)
                    bookNameAndStock.put(bookName,bookStock);
                    System.out.println(bookName + " 도서가 " + bookStock + "권 추가되었습니다.");
                }

            } else if (menu == 2) {
                System.out.print("재고를 수정할 도서를 입력하세요 >>> ");
                String modifyBookName = scanner.nextLine();

                if (!bookNameAndStock.containsKey(modifyBookName)) {
                    System.out.println("해당 도서는 재고에 없습니다.");
                } else {
                    System.out.print("수정할 재고 수량을 입력해주세요. >>> ");
                    Integer modifyStock = scanner.nextInt();
                    scanner.nextLine();
                    bookNameAndStock.put(modifyBookName,modifyStock);
                    System.out.println(modifyBookName + " 도서가 " + modifyStock + " 권으로 수정되었습니다.");
                }

            } else if (menu == 3) {
                System.out.println("--- 현재 재고 목록 ---");
                // Map에서 key값(제목)을 String으로 가져옴
                Set<String> bookSet = bookNameAndStock.keySet();
                List<String> bookList = new ArrayList<>();
                // bookSet을 List에 모두 복사
                bookList.addAll(bookSet);
                for (String key : bookList) {
                    System.out.println("도서명 : " + key  + ", 현재 재고 : " + bookNameAndStock.get(key) ); // list.get(해당 책 제목(key)의 value를 가져옴)
                }

            } else if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 선택입니다.");
            }


        }

    }

}

