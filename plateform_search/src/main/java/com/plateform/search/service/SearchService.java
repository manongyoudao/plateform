package com.plateform.search.service;

import com.plateform.search.dao.SearchRepository;
import com.plateform.search.entity.Article;
import entity.CommonResponse;
import entity.StatuCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class SearchService {

    @Autowired
    private SearchRepository searchRepository;

    public CommonResponse save(Article article) {
        Article saveArticle = searchRepository.save(article);
        if (Objects.isNull(saveArticle)) {
            return new CommonResponse(StatuCode.REMOTEERROT, false, "保存失败");
        }
        return new CommonResponse(StatuCode.ok, true, "保存成功");
    }
}
