package com.koreait.short_url_project.domain.article.repository;

import com.koreait.short_url_project.domain.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}