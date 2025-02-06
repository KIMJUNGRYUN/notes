package com.secure.notes.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob //많은 글자 255개 이상의 문자를 저장하고 싶을때
    private String content;

    private String ownerUsername;
}
