package com.sparta.sparta_prepare;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
    private String username;
    private String contents;

    // @RequiredArgsConstructor => 변수에 final이 붙어있어야 함

}