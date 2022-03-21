package com.taemin.tadadak.user.domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Embedded
    private NickName nickName;

    private String picture;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createDate;

    protected User() {
    }

    @Builder
    public User(String email, NickName nickName, Role role, String picture) {
        this.email = email;
        this.nickName = nickName;
        this.role = role;
        this.picture = picture;

        this.createDate = LocalDateTime.now();
    }

    @Builder
    public User(Long id, String authenticationCode, NickName nickName, Role role, String picture) {
        this(authenticationCode, nickName, role, picture);
        this.id = id;
    }

    public User update(String nickName, String picture) {
        this.nickName = new NickName(nickName);
        this.picture = picture;
        return this;
    }

    public String getRoleKey() {
        return role.getKey();
    }

}
