package com.koreait.short_url_project.domain.surl.surl.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Surl {
    private long id;
    @Builder.Default
    private LocalDateTime createDate = LocalDateTime.now();
    @Builder.Default
    private LocalDateTime modifyDate = LocalDateTime.now();
    private String body;
    private String url;

    @Setter(AccessLevel.NONE)
    private long count;

    public void incrementCount() {
        count++;
    }
}