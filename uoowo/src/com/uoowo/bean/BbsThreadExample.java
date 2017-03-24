package com.uoowo.bean;

import java.util.ArrayList;
import java.util.List;

public class BbsThreadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbsThreadExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Short value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Short value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Short value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Short value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Short value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Short value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Short> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Short> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Short value1, Short value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Short value1, Short value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andTopIsNull() {
            addCriterion("top is null");
            return (Criteria) this;
        }

        public Criteria andTopIsNotNull() {
            addCriterion("top is not null");
            return (Criteria) this;
        }

        public Criteria andTopEqualTo(Boolean value) {
            addCriterion("top =", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotEqualTo(Boolean value) {
            addCriterion("top <>", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThan(Boolean value) {
            addCriterion("top >", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("top >=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThan(Boolean value) {
            addCriterion("top <", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThanOrEqualTo(Boolean value) {
            addCriterion("top <=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopIn(List<Boolean> values) {
            addCriterion("top in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotIn(List<Boolean> values) {
            addCriterion("top not in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopBetween(Boolean value1, Boolean value2) {
            addCriterion("top between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("top not between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUseripIsNull() {
            addCriterion("userip is null");
            return (Criteria) this;
        }

        public Criteria andUseripIsNotNull() {
            addCriterion("userip is not null");
            return (Criteria) this;
        }

        public Criteria andUseripEqualTo(Integer value) {
            addCriterion("userip =", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotEqualTo(Integer value) {
            addCriterion("userip <>", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripGreaterThan(Integer value) {
            addCriterion("userip >", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripGreaterThanOrEqualTo(Integer value) {
            addCriterion("userip >=", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripLessThan(Integer value) {
            addCriterion("userip <", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripLessThanOrEqualTo(Integer value) {
            addCriterion("userip <=", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripIn(List<Integer> values) {
            addCriterion("userip in", values, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotIn(List<Integer> values) {
            addCriterion("userip not in", values, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripBetween(Integer value1, Integer value2) {
            addCriterion("userip between", value1, value2, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotBetween(Integer value1, Integer value2) {
            addCriterion("userip not between", value1, value2, "userip");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
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

        public Criteria andLastDateIsNull() {
            addCriterion("last_date is null");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNotNull() {
            addCriterion("last_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastDateEqualTo(Integer value) {
            addCriterion("last_date =", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotEqualTo(Integer value) {
            addCriterion("last_date <>", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThan(Integer value) {
            addCriterion("last_date >", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_date >=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThan(Integer value) {
            addCriterion("last_date <", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThanOrEqualTo(Integer value) {
            addCriterion("last_date <=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateIn(List<Integer> values) {
            addCriterion("last_date in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotIn(List<Integer> values) {
            addCriterion("last_date not in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateBetween(Integer value1, Integer value2) {
            addCriterion("last_date between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotBetween(Integer value1, Integer value2) {
            addCriterion("last_date not between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Integer value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Integer value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Integer value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Integer value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Integer value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Integer> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Integer> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Integer value1, Integer value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andPostsIsNull() {
            addCriterion("posts is null");
            return (Criteria) this;
        }

        public Criteria andPostsIsNotNull() {
            addCriterion("posts is not null");
            return (Criteria) this;
        }

        public Criteria andPostsEqualTo(Integer value) {
            addCriterion("posts =", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsNotEqualTo(Integer value) {
            addCriterion("posts <>", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsGreaterThan(Integer value) {
            addCriterion("posts >", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsGreaterThanOrEqualTo(Integer value) {
            addCriterion("posts >=", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsLessThan(Integer value) {
            addCriterion("posts <", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsLessThanOrEqualTo(Integer value) {
            addCriterion("posts <=", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsIn(List<Integer> values) {
            addCriterion("posts in", values, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsNotIn(List<Integer> values) {
            addCriterion("posts not in", values, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsBetween(Integer value1, Integer value2) {
            addCriterion("posts between", value1, value2, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsNotBetween(Integer value1, Integer value2) {
            addCriterion("posts not between", value1, value2, "posts");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(Byte value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(Byte value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(Byte value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(Byte value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(Byte value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(Byte value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<Byte> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<Byte> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(Byte value1, Byte value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(Byte value1, Byte value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andFilesIsNull() {
            addCriterion("files is null");
            return (Criteria) this;
        }

        public Criteria andFilesIsNotNull() {
            addCriterion("files is not null");
            return (Criteria) this;
        }

        public Criteria andFilesEqualTo(Byte value) {
            addCriterion("files =", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesNotEqualTo(Byte value) {
            addCriterion("files <>", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesGreaterThan(Byte value) {
            addCriterion("files >", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesGreaterThanOrEqualTo(Byte value) {
            addCriterion("files >=", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesLessThan(Byte value) {
            addCriterion("files <", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesLessThanOrEqualTo(Byte value) {
            addCriterion("files <=", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesIn(List<Byte> values) {
            addCriterion("files in", values, "files");
            return (Criteria) this;
        }

        public Criteria andFilesNotIn(List<Byte> values) {
            addCriterion("files not in", values, "files");
            return (Criteria) this;
        }

        public Criteria andFilesBetween(Byte value1, Byte value2) {
            addCriterion("files between", value1, value2, "files");
            return (Criteria) this;
        }

        public Criteria andFilesNotBetween(Byte value1, Byte value2) {
            addCriterion("files not between", value1, value2, "files");
            return (Criteria) this;
        }

        public Criteria andModsIsNull() {
            addCriterion("mods is null");
            return (Criteria) this;
        }

        public Criteria andModsIsNotNull() {
            addCriterion("mods is not null");
            return (Criteria) this;
        }

        public Criteria andModsEqualTo(Byte value) {
            addCriterion("mods =", value, "mods");
            return (Criteria) this;
        }

        public Criteria andModsNotEqualTo(Byte value) {
            addCriterion("mods <>", value, "mods");
            return (Criteria) this;
        }

        public Criteria andModsGreaterThan(Byte value) {
            addCriterion("mods >", value, "mods");
            return (Criteria) this;
        }

        public Criteria andModsGreaterThanOrEqualTo(Byte value) {
            addCriterion("mods >=", value, "mods");
            return (Criteria) this;
        }

        public Criteria andModsLessThan(Byte value) {
            addCriterion("mods <", value, "mods");
            return (Criteria) this;
        }

        public Criteria andModsLessThanOrEqualTo(Byte value) {
            addCriterion("mods <=", value, "mods");
            return (Criteria) this;
        }

        public Criteria andModsIn(List<Byte> values) {
            addCriterion("mods in", values, "mods");
            return (Criteria) this;
        }

        public Criteria andModsNotIn(List<Byte> values) {
            addCriterion("mods not in", values, "mods");
            return (Criteria) this;
        }

        public Criteria andModsBetween(Byte value1, Byte value2) {
            addCriterion("mods between", value1, value2, "mods");
            return (Criteria) this;
        }

        public Criteria andModsNotBetween(Byte value1, Byte value2) {
            addCriterion("mods not between", value1, value2, "mods");
            return (Criteria) this;
        }

        public Criteria andClosedIsNull() {
            addCriterion("closed is null");
            return (Criteria) this;
        }

        public Criteria andClosedIsNotNull() {
            addCriterion("closed is not null");
            return (Criteria) this;
        }

        public Criteria andClosedEqualTo(Boolean value) {
            addCriterion("closed =", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotEqualTo(Boolean value) {
            addCriterion("closed <>", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedGreaterThan(Boolean value) {
            addCriterion("closed >", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("closed >=", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedLessThan(Boolean value) {
            addCriterion("closed <", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedLessThanOrEqualTo(Boolean value) {
            addCriterion("closed <=", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedIn(List<Boolean> values) {
            addCriterion("closed in", values, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotIn(List<Boolean> values) {
            addCriterion("closed not in", values, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedBetween(Boolean value1, Boolean value2) {
            addCriterion("closed between", value1, value2, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("closed not between", value1, value2, "closed");
            return (Criteria) this;
        }

        public Criteria andFirstpidIsNull() {
            addCriterion("firstpid is null");
            return (Criteria) this;
        }

        public Criteria andFirstpidIsNotNull() {
            addCriterion("firstpid is not null");
            return (Criteria) this;
        }

        public Criteria andFirstpidEqualTo(Integer value) {
            addCriterion("firstpid =", value, "firstpid");
            return (Criteria) this;
        }

        public Criteria andFirstpidNotEqualTo(Integer value) {
            addCriterion("firstpid <>", value, "firstpid");
            return (Criteria) this;
        }

        public Criteria andFirstpidGreaterThan(Integer value) {
            addCriterion("firstpid >", value, "firstpid");
            return (Criteria) this;
        }

        public Criteria andFirstpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstpid >=", value, "firstpid");
            return (Criteria) this;
        }

        public Criteria andFirstpidLessThan(Integer value) {
            addCriterion("firstpid <", value, "firstpid");
            return (Criteria) this;
        }

        public Criteria andFirstpidLessThanOrEqualTo(Integer value) {
            addCriterion("firstpid <=", value, "firstpid");
            return (Criteria) this;
        }

        public Criteria andFirstpidIn(List<Integer> values) {
            addCriterion("firstpid in", values, "firstpid");
            return (Criteria) this;
        }

        public Criteria andFirstpidNotIn(List<Integer> values) {
            addCriterion("firstpid not in", values, "firstpid");
            return (Criteria) this;
        }

        public Criteria andFirstpidBetween(Integer value1, Integer value2) {
            addCriterion("firstpid between", value1, value2, "firstpid");
            return (Criteria) this;
        }

        public Criteria andFirstpidNotBetween(Integer value1, Integer value2) {
            addCriterion("firstpid not between", value1, value2, "firstpid");
            return (Criteria) this;
        }

        public Criteria andLastuidIsNull() {
            addCriterion("lastuid is null");
            return (Criteria) this;
        }

        public Criteria andLastuidIsNotNull() {
            addCriterion("lastuid is not null");
            return (Criteria) this;
        }

        public Criteria andLastuidEqualTo(Integer value) {
            addCriterion("lastuid =", value, "lastuid");
            return (Criteria) this;
        }

        public Criteria andLastuidNotEqualTo(Integer value) {
            addCriterion("lastuid <>", value, "lastuid");
            return (Criteria) this;
        }

        public Criteria andLastuidGreaterThan(Integer value) {
            addCriterion("lastuid >", value, "lastuid");
            return (Criteria) this;
        }

        public Criteria andLastuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastuid >=", value, "lastuid");
            return (Criteria) this;
        }

        public Criteria andLastuidLessThan(Integer value) {
            addCriterion("lastuid <", value, "lastuid");
            return (Criteria) this;
        }

        public Criteria andLastuidLessThanOrEqualTo(Integer value) {
            addCriterion("lastuid <=", value, "lastuid");
            return (Criteria) this;
        }

        public Criteria andLastuidIn(List<Integer> values) {
            addCriterion("lastuid in", values, "lastuid");
            return (Criteria) this;
        }

        public Criteria andLastuidNotIn(List<Integer> values) {
            addCriterion("lastuid not in", values, "lastuid");
            return (Criteria) this;
        }

        public Criteria andLastuidBetween(Integer value1, Integer value2) {
            addCriterion("lastuid between", value1, value2, "lastuid");
            return (Criteria) this;
        }

        public Criteria andLastuidNotBetween(Integer value1, Integer value2) {
            addCriterion("lastuid not between", value1, value2, "lastuid");
            return (Criteria) this;
        }

        public Criteria andLastpidIsNull() {
            addCriterion("lastpid is null");
            return (Criteria) this;
        }

        public Criteria andLastpidIsNotNull() {
            addCriterion("lastpid is not null");
            return (Criteria) this;
        }

        public Criteria andLastpidEqualTo(Integer value) {
            addCriterion("lastpid =", value, "lastpid");
            return (Criteria) this;
        }

        public Criteria andLastpidNotEqualTo(Integer value) {
            addCriterion("lastpid <>", value, "lastpid");
            return (Criteria) this;
        }

        public Criteria andLastpidGreaterThan(Integer value) {
            addCriterion("lastpid >", value, "lastpid");
            return (Criteria) this;
        }

        public Criteria andLastpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastpid >=", value, "lastpid");
            return (Criteria) this;
        }

        public Criteria andLastpidLessThan(Integer value) {
            addCriterion("lastpid <", value, "lastpid");
            return (Criteria) this;
        }

        public Criteria andLastpidLessThanOrEqualTo(Integer value) {
            addCriterion("lastpid <=", value, "lastpid");
            return (Criteria) this;
        }

        public Criteria andLastpidIn(List<Integer> values) {
            addCriterion("lastpid in", values, "lastpid");
            return (Criteria) this;
        }

        public Criteria andLastpidNotIn(List<Integer> values) {
            addCriterion("lastpid not in", values, "lastpid");
            return (Criteria) this;
        }

        public Criteria andLastpidBetween(Integer value1, Integer value2) {
            addCriterion("lastpid between", value1, value2, "lastpid");
            return (Criteria) this;
        }

        public Criteria andLastpidNotBetween(Integer value1, Integer value2) {
            addCriterion("lastpid not between", value1, value2, "lastpid");
            return (Criteria) this;
        }

        public Criteria andDigestIsNull() {
            addCriterion("digest is null");
            return (Criteria) this;
        }

        public Criteria andDigestIsNotNull() {
            addCriterion("digest is not null");
            return (Criteria) this;
        }

        public Criteria andDigestEqualTo(Byte value) {
            addCriterion("digest =", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotEqualTo(Byte value) {
            addCriterion("digest <>", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThan(Byte value) {
            addCriterion("digest >", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThanOrEqualTo(Byte value) {
            addCriterion("digest >=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThan(Byte value) {
            addCriterion("digest <", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThanOrEqualTo(Byte value) {
            addCriterion("digest <=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestIn(List<Byte> values) {
            addCriterion("digest in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotIn(List<Byte> values) {
            addCriterion("digest not in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestBetween(Byte value1, Byte value2) {
            addCriterion("digest between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotBetween(Byte value1, Byte value2) {
            addCriterion("digest not between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andTagidsIsNull() {
            addCriterion("tagids is null");
            return (Criteria) this;
        }

        public Criteria andTagidsIsNotNull() {
            addCriterion("tagids is not null");
            return (Criteria) this;
        }

        public Criteria andTagidsEqualTo(String value) {
            addCriterion("tagids =", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotEqualTo(String value) {
            addCriterion("tagids <>", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsGreaterThan(String value) {
            addCriterion("tagids >", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsGreaterThanOrEqualTo(String value) {
            addCriterion("tagids >=", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsLessThan(String value) {
            addCriterion("tagids <", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsLessThanOrEqualTo(String value) {
            addCriterion("tagids <=", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsLike(String value) {
            addCriterion("tagids like", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotLike(String value) {
            addCriterion("tagids not like", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsIn(List<String> values) {
            addCriterion("tagids in", values, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotIn(List<String> values) {
            addCriterion("tagids not in", values, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsBetween(String value1, String value2) {
            addCriterion("tagids between", value1, value2, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotBetween(String value1, String value2) {
            addCriterion("tagids not between", value1, value2, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeIsNull() {
            addCriterion("tagids_time is null");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeIsNotNull() {
            addCriterion("tagids_time is not null");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeEqualTo(Integer value) {
            addCriterion("tagids_time =", value, "tagidsTime");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeNotEqualTo(Integer value) {
            addCriterion("tagids_time <>", value, "tagidsTime");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeGreaterThan(Integer value) {
            addCriterion("tagids_time >", value, "tagidsTime");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tagids_time >=", value, "tagidsTime");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeLessThan(Integer value) {
            addCriterion("tagids_time <", value, "tagidsTime");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeLessThanOrEqualTo(Integer value) {
            addCriterion("tagids_time <=", value, "tagidsTime");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeIn(List<Integer> values) {
            addCriterion("tagids_time in", values, "tagidsTime");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeNotIn(List<Integer> values) {
            addCriterion("tagids_time not in", values, "tagidsTime");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeBetween(Integer value1, Integer value2) {
            addCriterion("tagids_time between", value1, value2, "tagidsTime");
            return (Criteria) this;
        }

        public Criteria andTagidsTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tagids_time not between", value1, value2, "tagidsTime");
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