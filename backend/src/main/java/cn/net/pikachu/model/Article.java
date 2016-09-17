package cn.net.pikachu.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by pikachu on 2016/9/13 20:34 in
 * Article
 */
@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    Integer type;
    String title;
    String description;
    String htmlContext;
    String markdownContext;
    Date createdTime;
    Date lastModifiedTime;
    @OneToOne
    Admin admin;
    @OneToMany
    List<Comment> comments;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHtmlContext() {
        return htmlContext;
    }

    public void setHtmlContext(String htmlContext) {
        this.htmlContext = htmlContext;
    }

    public String getMarkdownContext() {
        return markdownContext;
    }

    public void setMarkdownContext(String markdownContext) {
        this.markdownContext = markdownContext;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Article{" +
                "Id=" + Id +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", htmlContext='" + htmlContext + '\'' +
                ", markdownContext='" + markdownContext + '\'' +
                ", createdTime=" + createdTime +
                ", lastModifiedTime=" + lastModifiedTime +
                '}';
    }
}
