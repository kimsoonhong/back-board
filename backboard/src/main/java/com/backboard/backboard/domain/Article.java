package com.backboard.backboard.domain;

import jdk.jshell.execution.LoaderDelegate;

public class Article {

    private long id;
    private String title;  //제목
    private String content; // 내용
    private String  hashtag; // 해시태그

    private LoaderDelegate createAt; //생성일시
    private String createdBy; // 생성자
    private LoaderDelegate modifiedAt; //수정일시
    private String modifiedBy; //수정자



}
