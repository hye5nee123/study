package com.mysite.noticeexam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/notices")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private CommentService commentService;

    @GetMapping
    public String readList(Model model) {
        List<Notice> notices = noticeService.getAllNotices();
        model.addAttribute("notices", notices);
        return "readlist"; // 뷰 이름이 맞는지 확인
    }

    @GetMapping("/{id}")
    public String readDetail(@PathVariable Integer id, Model model) {
        Notice notice = noticeService.getNoticeById(id);
        if (notice == null) { // 예외 처리를 추가
            model.addAttribute("errorMessage", "Notice not found");
            return "error"; // 에러 페이지로 리다이렉트
        }
        model.addAttribute("notice", notice);
        model.addAttribute("comments", commentService.getCommentsByNoticeId(id));
        return "readdetail"; // 뷰 이름이 맞는지 확인
    }

    @PostMapping("/{id}/comments")
    public String addComment(@PathVariable Integer id, 
                             @RequestParam String content, 
                             Model model) {
        Notice notice = noticeService.getNoticeById(id);
        if (notice == null) { // 예외 처리를 추가
            model.addAttribute("errorMessage", "Notice not found");
            return "error"; // 에러 페이지로 리다이렉트
        }

        if (content == null || content.trim().isEmpty()) {
            model.addAttribute("errorMessage", "Comment content cannot be empty");
            return "readdetail"; // 에러 메시지를 추가한 후 원래 페이지로 돌아감
        }

       

        return "redirect:/notices/" + id;
    }
}
