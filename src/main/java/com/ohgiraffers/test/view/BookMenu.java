package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {}

    public void Menu() {

        /* 1. 새 도서 추가
        *  2. 도서정보 정렬 후 출력
        *  3. 도서 삭제
        *  4. 도서 검색출력
        *  5. 전체 출력
        *  6. 끝내기
        * */

        while (true) {
            System.out.println("=== 도서 관리 프로그램 ===");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.println("===================================");
            System.out.println("번호 입력 : ");
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    bm.bookInsert(BookDTO)
            }
        }
    }

    // 1. 새 도서 추가
    public void bookInsert(BookDTO dto) {
        int r
    }

}
