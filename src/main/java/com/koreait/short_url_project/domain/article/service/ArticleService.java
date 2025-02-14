package com.koreait.short_url_project.domain.article.service;

import com.koreait.short_url_project.domain.article.entity.Article;
import com.koreait.short_url_project.domain.article.repository.ArticleRepository;
import com.koreait.short_url_project.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public long count() {
        return articleRepository.count();
    }

    public RsData<Article> write(String title, String body){
        Article article = Article.builder()
                .title(title)
                .body(body)
                .build();
        articleRepository.save(article);

        return RsData.of("%d번 게시글 생성".formatted(article.getId()), article);
    }
    public void delete(Article article) {
        articleRepository.delete(article);
    }
    public Optional<Article> findById(long id) {
        return articleRepository.findById(id);
    }
    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}

