package com.backboard.backboard.domain;

import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDateTime;

public class ArticleComment {


    private long id;
    private  Article article; // 계시글 id
    private String  content; //내용

    private LocalDateTime createAt; // 생성일시
    private String createdBy; // 생성자
    private  LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; //수정자



}
