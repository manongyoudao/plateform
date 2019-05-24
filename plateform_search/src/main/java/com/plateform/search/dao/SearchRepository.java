package com.plateform.search.dao;

import com.plateform.search.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import sun.util.resources.ga.LocaleNames_ga;

public interface SearchRepository  extends ElasticsearchRepository<Article,Long>{
}
