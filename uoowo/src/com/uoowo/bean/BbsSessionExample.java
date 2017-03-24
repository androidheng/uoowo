package com.uoowo.bean;

import java.util.ArrayList;
import java.util.List;

public class BbsSessionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbsSessionExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
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

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Byte value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Byte value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Byte value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Byte value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Byte value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Byte value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Byte> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Byte> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Byte value1, Byte value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Byte value1, Byte value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(Integer value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(Integer value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(Integer value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(Integer value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(Integer value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(Integer value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<Integer> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<Integer> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(Integer value1, Integer value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(Integer value1, Integer value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andUseragentIsNull() {
            addCriterion("useragent is null");
            return (Criteria) this;
        }

        public Criteria andUseragentIsNotNull() {
            addCriterion("useragent is not null");
            return (Criteria) this;
        }

        public Criteria andUseragentEqualTo(String value) {
            addCriterion("useragent =", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentNotEqualTo(String value) {
            addCriterion("useragent <>", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentGreaterThan(String value) {
            addCriterion("useragent >", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentGreaterThanOrEqualTo(String value) {
            addCriterion("useragent >=", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentLessThan(String value) {
            addCriterion("useragent <", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentLessThanOrEqualTo(String value) {
            addCriterion("useragent <=", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentLike(String value) {
            addCriterion("useragent like", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentNotLike(String value) {
            addCriterion("useragent not like", value, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentIn(List<String> values) {
            addCriterion("useragent in", values, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentNotIn(List<String> values) {
            addCriterion("useragent not in", values, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentBetween(String value1, String value2) {
            addCriterion("useragent between", value1, value2, "useragent");
            return (Criteria) this;
        }

        public Criteria andUseragentNotBetween(String value1, String value2) {
            addCriterion("useragent not between", value1, value2, "useragent");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("data is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("data is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(String value) {
            addCriterion("data =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(String value) {
            addCriterion("data <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(String value) {
            addCriterion("data >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(String value) {
            addCriterion("data >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(String value) {
            addCriterion("data <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(String value) {
            addCriterion("data <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLike(String value) {
            addCriterion("data like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotLike(String value) {
            addCriterion("data not like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<String> values) {
            addCriterion("data in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<String> values) {
            addCriterion("data not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(String value1, String value2) {
            addCriterion("data between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(String value1, String value2) {
            addCriterion("data not between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andBigdataIsNull() {
            addCriterion("bigdata is null");
            return (Criteria) this;
        }

        public Criteria andBigdataIsNotNull() {
            addCriterion("bigdata is not null");
            return (Criteria) this;
        }

        public Criteria andBigdataEqualTo(Boolean value) {
            addCriterion("bigdata =", value, "bigdata");
            return (Criteria) this;
        }

        public Criteria andBigdataNotEqualTo(Boolean value) {
            addCriterion("bigdata <>", value, "bigdata");
            return (Criteria) this;
        }

        public Criteria andBigdataGreaterThan(Boolean value) {
            addCriterion("bigdata >", value, "bigdata");
            return (Criteria) this;
        }

        public Criteria andBigdataGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bigdata >=", value, "bigdata");
            return (Criteria) this;
        }

        public Criteria andBigdataLessThan(Boolean value) {
            addCriterion("bigdata <", value, "bigdata");
            return (Criteria) this;
        }

        public Criteria andBigdataLessThanOrEqualTo(Boolean value) {
            addCriterion("bigdata <=", value, "bigdata");
            return (Criteria) this;
        }

        public Criteria andBigdataIn(List<Boolean> values) {
            addCriterion("bigdata in", values, "bigdata");
            return (Criteria) this;
        }

        public Criteria andBigdataNotIn(List<Boolean> values) {
            addCriterion("bigdata not in", values, "bigdata");
            return (Criteria) this;
        }

        public Criteria andBigdataBetween(Boolean value1, Boolean value2) {
            addCriterion("bigdata between", value1, value2, "bigdata");
            return (Criteria) this;
        }

        public Criteria andBigdataNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bigdata not between", value1, value2, "bigdata");
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