package com.webrtc.videoChattingService.entity.member;


import com.webrtc.videoChattingService.entity.Salt.Salt;
import lombok.*;

import java.time.LocalDateTime;


@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDto {
    
    private Integer id;
    private String email;
    private String password;
    private String nickName;
    private String imgUrl;
    private String base64;
    private String address;
    private String phone;
    private LocalDateTime regDate;
    private Salt salt;

}
