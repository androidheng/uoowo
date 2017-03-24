package com.uoowo.bean;

import java.util.ArrayList;
import java.util.List;

public class BbsForumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbsForumExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Byte value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Byte value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Byte value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Byte value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Byte value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Byte value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Byte> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Byte> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Byte value1, Byte value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Byte value1, Byte value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andThreadsIsNull() {
            addCriterion("threads is null");
            return (Criteria) this;
        }

        public Criteria andThreadsIsNotNull() {
            addCriterion("threads is not null");
            return (Criteria) this;
        }

        public Criteria andThreadsEqualTo(Integer value) {
            addCriterion("threads =", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsNotEqualTo(Integer value) {
            addCriterion("threads <>", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsGreaterThan(Integer value) {
            addCriterion("threads >", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("threads >=", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsLessThan(Integer value) {
            addCriterion("threads <", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsLessThanOrEqualTo(Integer value) {
            addCriterion("threads <=", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsIn(List<Integer> values) {
            addCriterion("threads in", values, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsNotIn(List<Integer> values) {
            addCriterion("threads not in", values, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsBetween(Integer value1, Integer value2) {
            addCriterion("threads between", value1, value2, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsNotBetween(Integer value1, Integer value2) {
            addCriterion("threads not between", value1, value2, "threads");
            return (Criteria) this;
        }

        public Criteria andTodaypostsIsNull() {
            addCriterion("todayposts is null");
            return (Criteria) this;
        }

        public Criteria andTodaypostsIsNotNull() {
            addCriterion("todayposts is not null");
            return (Criteria) this;
        }

        public Criteria andTodaypostsEqualTo(Integer value) {
            addCriterion("todayposts =", value, "todayposts");
            return (Criteria) this;
        }

        public Criteria andTodaypostsNotEqualTo(Integer value) {
            addCriterion("todayposts <>", value, "todayposts");
            return (Criteria) this;
        }

        public Criteria andTodaypostsGreaterThan(Integer value) {
            addCriterion("todayposts >", value, "todayposts");
            return (Criteria) this;
        }

        public Criteria andTodaypostsGreaterThanOrEqualTo(Integer value) {
            addCriterion("todayposts >=", value, "todayposts");
            return (Criteria) this;
        }

        public Criteria andTodaypostsLessThan(Integer value) {
            addCriterion("todayposts <", value, "todayposts");
            return (Criteria) this;
        }

        public Criteria andTodaypostsLessThanOrEqualTo(Integer value) {
            addCriterion("todayposts <=", value, "todayposts");
            return (Criteria) this;
        }

        public Criteria andTodaypostsIn(List<Integer> values) {
            addCriterion("todayposts in", values, "todayposts");
            return (Criteria) this;
        }

        public Criteria andTodaypostsNotIn(List<Integer> values) {
            addCriterion("todayposts not in", values, "todayposts");
            return (Criteria) this;
        }

        public Criteria andTodaypostsBetween(Integer value1, Integer value2) {
            addCriterion("todayposts between", value1, value2, "todayposts");
            return (Criteria) this;
        }

        public Criteria andTodaypostsNotBetween(Integer value1, Integer value2) {
            addCriterion("todayposts not between", value1, value2, "todayposts");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsIsNull() {
            addCriterion("todaythreads is null");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsIsNotNull() {
            addCriterion("todaythreads is not null");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsEqualTo(Integer value) {
            addCriterion("todaythreads =", value, "todaythreads");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsNotEqualTo(Integer value) {
            addCriterion("todaythreads <>", value, "todaythreads");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsGreaterThan(Integer value) {
            addCriterion("todaythreads >", value, "todaythreads");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("todaythreads >=", value, "todaythreads");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsLessThan(Integer value) {
            addCriterion("todaythreads <", value, "todaythreads");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsLessThanOrEqualTo(Integer value) {
            addCriterion("todaythreads <=", value, "todaythreads");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsIn(List<Integer> values) {
            addCriterion("todaythreads in", values, "todaythreads");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsNotIn(List<Integer> values) {
            addCriterion("todaythreads not in", values, "todaythreads");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsBetween(Integer value1, Integer value2) {
            addCriterion("todaythreads between", value1, value2, "todaythreads");
            return (Criteria) this;
        }

        public Criteria andTodaythreadsNotBetween(Integer value1, Integer value2) {
            addCriterion("todaythreads not between", value1, value2, "todaythreads");
            return (Criteria) this;
        }

        public Criteria andAccessonIsNull() {
            addCriterion("accesson is null");
            return (Criteria) this;
        }

        public Criteria andAccessonIsNotNull() {
            addCriterion("accesson is not null");
            return (Criteria) this;
        }

        public Criteria andAccessonEqualTo(Integer value) {
            addCriterion("accesson =", value, "accesson");
            return (Criteria) this;
        }

        public Criteria andAccessonNotEqualTo(Integer value) {
            addCriterion("accesson <>", value, "accesson");
            return (Criteria) this;
        }

        public Criteria andAccessonGreaterThan(Integer value) {
            addCriterion("accesson >", value, "accesson");
            return (Criteria) this;
        }

        public Criteria andAccessonGreaterThanOrEqualTo(Integer value) {
            addCriterion("accesson >=", value, "accesson");
            return (Criteria) this;
        }

        public Criteria andAccessonLessThan(Integer value) {
            addCriterion("accesson <", value, "accesson");
            return (Criteria) this;
        }

        public Criteria andAccessonLessThanOrEqualTo(Integer value) {
            addCriterion("accesson <=", value, "accesson");
            return (Criteria) this;
        }

        public Criteria andAccessonIn(List<Integer> values) {
            addCriterion("accesson in", values, "accesson");
            return (Criteria) this;
        }

        public Criteria andAccessonNotIn(List<Integer> values) {
            addCriterion("accesson not in", values, "accesson");
            return (Criteria) this;
        }

        public Criteria andAccessonBetween(Integer value1, Integer value2) {
            addCriterion("accesson between", value1, value2, "accesson");
            return (Criteria) this;
        }

        public Criteria andAccessonNotBetween(Integer value1, Integer value2) {
            addCriterion("accesson not between", value1, value2, "accesson");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNull() {
            addCriterion("orderby is null");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNotNull() {
            addCriterion("orderby is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbyEqualTo(Byte value) {
            addCriterion("orderby =", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotEqualTo(Byte value) {
            addCriterion("orderby <>", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThan(Byte value) {
            addCriterion("orderby >", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThanOrEqualTo(Byte value) {
            addCriterion("orderby >=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThan(Byte value) {
            addCriterion("orderby <", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThanOrEqualTo(Byte value) {
            addCriterion("orderby <=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyIn(List<Byte> values) {
            addCriterion("orderby in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotIn(List<Byte> values) {
            addCriterion("orderby not in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyBetween(Byte value1, Byte value2) {
            addCriterion("orderby between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotBetween(Byte value1, Byte value2) {
            addCriterion("orderby not between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Integer value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Integer value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Integer value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Integer value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Integer value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Integer> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Integer> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Integer value1, Integer value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Integer value1, Integer value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(Integer value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(Integer value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(Integer value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(Integer value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(Integer value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(Integer value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<Integer> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<Integer> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(Integer value1, Integer value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(Integer value1, Integer value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andModuidsIsNull() {
            addCriterion("moduids is null");
            return (Criteria) this;
        }

        public Criteria andModuidsIsNotNull() {
            addCriterion("moduids is not null");
            return (Criteria) this;
        }

        public Criteria andModuidsEqualTo(String value) {
            addCriterion("moduids =", value, "moduids");
            return (Criteria) this;
        }

        public Criteria andModuidsNotEqualTo(String value) {
            addCriterion("moduids <>", value, "moduids");
            return (Criteria) this;
        }

        public Criteria andModuidsGreaterThan(String value) {
            addCriterion("moduids >", value, "moduids");
            return (Criteria) this;
        }

        public Criteria andModuidsGreaterThanOrEqualTo(String value) {
            addCriterion("moduids >=", value, "moduids");
            return (Criteria) this;
        }

        public Criteria andModuidsLessThan(String value) {
            addCriterion("moduids <", value, "moduids");
            return (Criteria) this;
        }

        public Criteria andModuidsLessThanOrEqualTo(String value) {
            addCriterion("moduids <=", value, "moduids");
            return (Criteria) this;
        }

        public Criteria andModuidsLike(String value) {
            addCriterion("moduids like", value, "moduids");
            return (Criteria) this;
        }

        public Criteria andModuidsNotLike(String value) {
            addCriterion("moduids not like", value, "moduids");
            return (Criteria) this;
        }

        public Criteria andModuidsIn(List<String> values) {
            addCriterion("moduids in", values, "moduids");
            return (Criteria) this;
        }

        public Criteria andModuidsNotIn(List<String> values) {
            addCriterion("moduids not in", values, "moduids");
            return (Criteria) this;
        }

        public Criteria andModuidsBetween(String value1, String value2) {
            addCriterion("moduids between", value1, value2, "moduids");
            return (Criteria) this;
        }

        public Criteria andModuidsNotBetween(String value1, String value2) {
            addCriterion("moduids not between", value1, value2, "moduids");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNull() {
            addCriterion("seo_title is null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNotNull() {
            addCriterion("seo_title is not null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleEqualTo(String value) {
            addCriterion("seo_title =", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotEqualTo(String value) {
            addCriterion("seo_title <>", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThan(String value) {
            addCriterion("seo_title >", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("seo_title >=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThan(String value) {
            addCriterion("seo_title <", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThanOrEqualTo(String value) {
            addCriterion("seo_title <=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLike(String value) {
            addCriterion("seo_title like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotLike(String value) {
            addCriterion("seo_title not like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIn(List<String> values) {
            addCriterion("seo_title in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotIn(List<String> values) {
            addCriterion("seo_title not in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleBetween(String value1, String value2) {
            addCriterion("seo_title between", value1, value2, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotBetween(String value1, String value2) {
            addCriterion("seo_title not between", value1, value2, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNull() {
            addCriterion("seo_keywords is null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNotNull() {
            addCriterion("seo_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsEqualTo(String value) {
            addCriterion("seo_keywords =", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotEqualTo(String value) {
            addCriterion("seo_keywords <>", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThan(String value) {
            addCriterion("seo_keywords >", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("seo_keywords >=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThan(String value) {
            addCriterion("seo_keywords <", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThanOrEqualTo(String value) {
            addCriterion("seo_keywords <=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLike(String value) {
            addCriterion("seo_keywords like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotLike(String value) {
            addCriterion("seo_keywords not like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIn(List<String> values) {
            addCriterion("seo_keywords in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotIn(List<String> values) {
            addCriterion("seo_keywords not in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsBetween(String value1, String value2) {
            addCriterion("seo_keywords between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotBetween(String value1, String value2) {
            addCriterion("seo_keywords not between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andDigestsIsNull() {
            addCriterion("digests is null");
            return (Criteria) this;
        }

        public Criteria andDigestsIsNotNull() {
            addCriterion("digests is not null");
            return (Criteria) this;
        }

        public Criteria andDigestsEqualTo(Byte value) {
            addCriterion("digests =", value, "digests");
            return (Criteria) this;
        }

        public Criteria andDigestsNotEqualTo(Byte value) {
            addCriterion("digests <>", value, "digests");
            return (Criteria) this;
        }

        public Criteria andDigestsGreaterThan(Byte value) {
            addCriterion("digests >", value, "digests");
            return (Criteria) this;
        }

        public Criteria andDigestsGreaterThanOrEqualTo(Byte value) {
            addCriterion("digests >=", value, "digests");
            return (Criteria) this;
        }

        public Criteria andDigestsLessThan(Byte value) {
            addCriterion("digests <", value, "digests");
            return (Criteria) this;
        }

        public Criteria andDigestsLessThanOrEqualTo(Byte value) {
            addCriterion("digests <=", value, "digests");
            return (Criteria) this;
        }

        public Criteria andDigestsIn(List<Byte> values) {
            addCriterion("digests in", values, "digests");
            return (Criteria) this;
        }

        public Criteria andDigestsNotIn(List<Byte> values) {
            addCriterion("digests not in", values, "digests");
            return (Criteria) this;
        }

        public Criteria andDigestsBetween(Byte value1, Byte value2) {
            addCriterion("digests between", value1, value2, "digests");
            return (Criteria) this;
        }

        public Criteria andDigestsNotBetween(Byte value1, Byte value2) {
            addCriterion("digests not between", value1, value2, "digests");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}