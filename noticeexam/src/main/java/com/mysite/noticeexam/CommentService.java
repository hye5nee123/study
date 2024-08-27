package com.mysite.noticeexam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    // 공지사항 ID로 댓글 목록을 가져오는 메서드
    public List<Comment> getCommentsByNoticeId(Integer noticeId) {
        return commentRepository.findAll();
    }

    // 댓글을 저장하는 메서드
    public void saveComment(Comment comment) {
        if (comment != null) { // null 체크 추가
            commentRepository.save(comment);
        }
    }
}
