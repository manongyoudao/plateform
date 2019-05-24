package com.plateform.search.controler;

import com.plateform.search.entity.Article;
import com.plateform.search.service.SearchService;
import entity.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import util.IdWorker;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @Autowired
    private IdWorker idWorker;

    @Transactional(rollbackFor = Exception.class)
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public CommonResponse save(@RequestBody Article article) {
        article.setId(idWorker.nextId());
        return searchService.save(article);
    }
}
