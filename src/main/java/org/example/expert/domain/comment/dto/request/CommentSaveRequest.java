package org.example.expert.domain.comment.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class CommentSaveRequest {

    @NotBlank(message = "댓글 내용을 입력해주세요.")
    private String contents = "";

    public CommentSaveRequest(String contents) {
        this.contents = contents;
    }
}