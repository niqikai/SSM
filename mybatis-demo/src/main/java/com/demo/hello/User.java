package com.demo.hello;

import lombok.Data;
import lombok.Getter;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Data
public class User {
    private int id;
    private String name;
    private int age;

}
@Getter
class PageResult {
    private List<?> result;

    private int totalCount;
    private int currentPage = 1;
    private int pageSize = 3;

    private int prevPage;
    private int nextPage;
    private int totalPage;

    public PageResult (List<?> result, int totalCount, int currentPage, int pageSize) {
        this.result = result;
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.pageSize = pageSize;

        this.totalPage = totalCount % pageSize == 0 ? totalCount/pageSize : totalCount/pageSize +1;
        this.prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1;
        this.nextPage = currentPage+1 <= totalPage ? currentPage+1 : totalPage;

        currentPage  = totalPage > totalPage?totalPage : currentPage;
    }
}