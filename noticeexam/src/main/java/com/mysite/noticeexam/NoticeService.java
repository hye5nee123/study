package com.mysite.noticeexam;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
    @Autowired
    private NoticeRepository noticeRepository;

    public List<Notice> getAllNotices() {
        return noticeRepository.findAll();
    }

    public Notice getNoticeById(Integer id) {
    return noticeRepository.findById(id).orElse(null);
    }

    public void saveNotice(Notice notice) {
        noticeRepository.save(notice);
    }
}
