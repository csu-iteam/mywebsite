package cn.net.pikachu.model;

import javax.persistence.*;

/**
 * Created by pikachu on 2016/9/13 20:41 in
 * Comment
 */
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long commentId;
    String name;
    String context;
    String email;
    String qq;
    @ManyToOne
    Article article;
    @OneToOne
    Admin admin;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", name='" + name + '\'' +
                ", context='" + context + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", article=" + article +
                ", admin=" + admin +
                '}';
    }
}
