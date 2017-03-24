package com.uoowo.bean;

import java.util.ArrayList;
import java.util.List;

public class BbsPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbsPostExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
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

        public Criteria andIsfirstIsNull() {
            addCriterion("isfirst is null");
            return (Criteria) this;
        }

        public Criteria andIsfirstIsNotNull() {
            addCriterion("isfirst is not null");
            return (Criteria) this;
        }

        public Criteria andIsfirstEqualTo(Integer value) {
            addCriterion("isfirst =", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotEqualTo(Integer value) {
            addCriterion("isfirst <>", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstGreaterThan(Integer value) {
            addCriterion("isfirst >", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstGreaterThanOrEqualTo(Integer value) {
            addCriterion("isfirst >=", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstLessThan(Integer value) {
            addCriterion("isfirst <", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstLessThanOrEqualTo(Integer value) {
            addCriterion("isfirst <=", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstIn(List<Integer> values) {
            addCriterion("isfirst in", values, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotIn(List<Integer> values) {
            addCriterion("isfirst not in", values, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstBetween(Integer value1, Integer value2) {
            addCriterion("isfirst between", value1, value2, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotBetween(Integer value1, Integer value2) {
            addCriterion("isfirst not between", value1, value2, "isfirst");
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

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(Short value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(Short value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(Short value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(Short value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(Short value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(Short value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<Short> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<Short> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(Short value1, Short value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(Short value1, Short value2) {
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

        public Criteria andFilesEqualTo(Short value) {
            addCriterion("files =", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesNotEqualTo(Short value) {
            addCriterion("files <>", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesGreaterThan(Short value) {
            addCriterion("files >", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesGreaterThanOrEqualTo(Short value) {
            addCriterion("files >=", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesLessThan(Short value) {
            addCriterion("files <", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesLessThanOrEqualTo(Short value) {
            addCriterion("files <=", value, "files");
            return (Criteria) this;
        }

        public Criteria andFilesIn(List<Short> values) {
            addCriterion("files in", values, "files");
            return (Criteria) this;
        }

        public Criteria andFilesNotIn(List<Short> values) {
            addCriterion("files not in", values, "files");
            return (Criteria) this;
        }

        public Criteria andFilesBetween(Short value1, Short value2) {
            addCriterion("files between", value1, value2, "files");
            return (Criteria) this;
        }

        public Criteria andFilesNotBetween(Short value1, Short value2) {
            addCriterion("files not between", value1, value2, "files");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNull() {
            addCriterion("doctype is null");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNotNull() {
            addCriterion("doctype is not null");
            return (Criteria) this;
        }

        public Criteria andDoctypeEqualTo(Byte value) {
            addCriterion("doctype =", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotEqualTo(Byte value) {
            addCriterion("doctype <>", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThan(Byte value) {
            addCriterion("doctype >", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("doctype >=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThan(Byte value) {
            addCriterion("doctype <", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThanOrEqualTo(Byte value) {
            addCriterion("doctype <=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeIn(List<Byte> values) {
            addCriterion("doctype in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotIn(List<Byte> values) {
            addCriterion("doctype not in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeBetween(Byte value1, Byte value2) {
            addCriterion("doctype between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotBetween(Byte value1, Byte value2) {
            addCriterion("doctype not between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andQuotepidIsNull() {
            addCriterion("quotepid is null");
            return (Criteria) this;
        }

        public Criteria andQuotepidIsNotNull() {
            addCriterion("quotepid is not null");
            return (Criteria) this;
        }

        public Criteria andQuotepidEqualTo(Integer value) {
            addCriterion("quotepid =", value, "quotepid");
            return (Criteria) this;
        }

        public Criteria andQuotepidNotEqualTo(Integer value) {
            addCriterion("quotepid <>", value, "quotepid");
            return (Criteria) this;
        }

        public Criteria andQuotepidGreaterThan(Integer value) {
            addCriterion("quotepid >", value, "quotepid");
            return (Criteria) this;
        }

        public Criteria andQuotepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("quotepid >=", value, "quotepid");
            return (Criteria) this;
        }

        public Criteria andQuotepidLessThan(Integer value) {
            addCriterion("quotepid <", value, "quotepid");
            return (Criteria) this;
        }

        public Criteria andQuotepidLessThanOrEqualTo(Integer value) {
            addCriterion("quotepid <=", value, "quotepid");
            return (Criteria) this;
        }

        public Criteria andQuotepidIn(List<Integer> values) {
            addCriterion("quotepid in", values, "quotepid");
            return (Criteria) this;
        }

        public Criteria andQuotepidNotIn(List<Integer> values) {
            addCriterion("quotepid not in", values, "quotepid");
            return (Criteria) this;
        }

        public Criteria andQuotepidBetween(Integer value1, Integer value2) {
            addCriterion("quotepid between", value1, value2, "quotepid");
            return (Criteria) this;
        }

        public Criteria andQuotepidNotBetween(Integer value1, Integer value2) {
            addCriterion("quotepid not between", value1, value2, "quotepid");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadIsNull() {
            addCriterion("GG_reply_read is null");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadIsNotNull() {
            addCriterion("GG_reply_read is not null");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadEqualTo(Integer value) {
            addCriterion("GG_reply_read =", value, "ggReplyRead");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadNotEqualTo(Integer value) {
            addCriterion("GG_reply_read <>", value, "ggReplyRead");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadGreaterThan(Integer value) {
            addCriterion("GG_reply_read >", value, "ggReplyRead");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("GG_reply_read >=", value, "ggReplyRead");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadLessThan(Integer value) {
            addCriterion("GG_reply_read <", value, "ggReplyRead");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadLessThanOrEqualTo(Integer value) {
            addCriterion("GG_reply_read <=", value, "ggReplyRead");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadIn(List<Integer> values) {
            addCriterion("GG_reply_read in", values, "ggReplyRead");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadNotIn(List<Integer> values) {
            addCriterion("GG_reply_read not in", values, "ggReplyRead");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadBetween(Integer value1, Integer value2) {
            addCriterion("GG_reply_read between", value1, value2, "ggReplyRead");
            return (Criteria) this;
        }

        public Criteria andGgReplyReadNotBetween(Integer value1, Integer value2) {
            addCriterion("GG_reply_read not between", value1, value2, "ggReplyRead");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserIsNull() {
            addCriterion("GG_reply_user is null");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserIsNotNull() {
            addCriterion("GG_reply_user is not null");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserEqualTo(Integer value) {
            addCriterion("GG_reply_user =", value, "ggReplyUser");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserNotEqualTo(Integer value) {
            addCriterion("GG_reply_user <>", value, "ggReplyUser");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserGreaterThan(Integer value) {
            addCriterion("GG_reply_user >", value, "ggReplyUser");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("GG_reply_user >=", value, "ggReplyUser");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserLessThan(Integer value) {
            addCriterion("GG_reply_user <", value, "ggReplyUser");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserLessThanOrEqualTo(Integer value) {
            addCriterion("GG_reply_user <=", value, "ggReplyUser");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserIn(List<Integer> values) {
            addCriterion("GG_reply_user in", values, "ggReplyUser");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserNotIn(List<Integer> values) {
            addCriterion("GG_reply_user not in", values, "ggReplyUser");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserBetween(Integer value1, Integer value2) {
            addCriterion("GG_reply_user between", value1, value2, "ggReplyUser");
            return (Criteria) this;
        }

        public Criteria andGgReplyUserNotBetween(Integer value1, Integer value2) {
            addCriterion("GG_reply_user not between", value1, value2, "ggReplyUser");
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