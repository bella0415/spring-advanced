package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class UserChangePasswordRequest {

    @NotBlank(message = "기존 비밀번호를 입력해주세요.")
    private String oldPassword;

    @NotBlank(message = "새 비밀번호를 입력해주세요.")
    @Size(min = 8, message = "새 비밀번호는 8자 이상이어야 합니다.")
    @Pattern(regexp = ".*\\d.*", message = "새 비밀번호에는 숫자가 하나 이상 포함되어야 합니다.")
    @Pattern(regexp = ".*[A-Z].*", message = "새 비밀번호에는 대문자가 하나 이상 포함되어야 합니다.")
    @Pattern(regexp = ".*[!@#$%^&*(),.?\":{}|<>].*", message = "새 비밀번호에는 특수문자가 하나 이상 포함되어야 합니다.")
    private String newPassword;

    // 생성자, getter, setter 등 필요한 부분 작성
}