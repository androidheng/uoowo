package com.uoowo.bean;

import java.util.ArrayList;
import java.util.List;

public class BbsQueueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbsQueueExample() {
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

        public Criteria andQueueidIsNull() {
            addCriterion("queueid is null");
            return (Criteria) this;
        }

        public Criteria andQueueidIsNotNull() {
            addCriterion("queueid is not null");
            return (Criteria) this;
        }

        public Criteria andQueueidEqualTo(Integer value) {
            addCriterion("queueid =", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidNotEqualTo(Integer value) {
            addCriterion("queueid <>", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidGreaterThan(Integer value) {
            addCriterion("queueid >", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("queueid >=", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidLessThan(Integer value) {
            addCriterion("queueid <", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidLessThanOrEqualTo(Integer value) {
            addCriterion("queueid <=", value, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidIn(List<Integer> values) {
            addCriterion("queueid in", values, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidNotIn(List<Integer> values) {
            addCriterion("queueid not in", values, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidBetween(Integer value1, Integer value2) {
            addCriterion("queueid between", value1, value2, "queueid");
            return (Criteria) this;
        }

        public Criteria andQueueidNotBetween(Integer value1, Integer value2) {
            addCriterion("queueid not between", value1, value2, "queueid");
            return (Criteria) this;
        }

        public Criteria andVIsNull() {
            addCriterion("v is null");
            return (Criteria) this;
        }

        public Criteria andVIsNotNull() {
            addCriterion("v is not null");
            return (Criteria) this;
        }

        public Criteria andVEqualTo(Integer value) {
            addCriterion("v =", value, "v");
            return (Criteria) this;
        }

        public Criteria andVNotEqualTo(Integer value) {
            addCriterion("v <>", value, "v");
            return (Criteria) this;
        }

        public Criteria andVGreaterThan(Integer value) {
            addCriterion("v >", value, "v");
            return (Criteria) this;
        }

        public Criteria andVGreaterThanOrEqualTo(Integer value) {
            addCriterion("v >=", value, "v");
            return (Criteria) this;
        }

        public Criteria andVLessThan(Integer value) {
            addCriterion("v <", value, "v");
            return (Criteria) this;
        }

        public Criteria andVLessThanOrEqualTo(Integer value) {
            addCriterion("v <=", value, "v");
            return (Criteria) this;
        }

        public Criteria andVIn(List<Integer> values) {
            addCriterion("v in", values, "v");
            return (Criteria) this;
        }

        public Criteria andVNotIn(List<Integer> values) {
            addCriterion("v not in", values, "v");
            return (Criteria) this;
        }

        public Criteria andVBetween(Integer value1, Integer value2) {
            addCriterion("v between", value1, value2, "v");
            return (Criteria) this;
        }

        public Criteria andVNotBetween(Integer value1, Integer value2) {
            addCriterion("v not between", value1, value2, "v");
            return (Criteria) this;
        }

        public Criteria andExpiryIsNull() {
            addCriterion("expiry is null");
            return (Criteria) this;
        }

        public Criteria andExpiryIsNotNull() {
            addCriterion("expiry is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryEqualTo(Integer value) {
            addCriterion("expiry =", value, "expiry");
            return (Criteria) this;
        }

        public Criteria andExpiryNotEqualTo(Integer value) {
            addCriterion("expiry <>", value, "expiry");
            return (Criteria) this;
        }

        public Criteria andExpiryGreaterThan(Integer value) {
            addCriterion("expiry >", value, "expiry");
            return (Criteria) this;
        }

        public Criteria andExpiryGreaterThanOrEqualTo(Integer value) {
            addCriterion("expiry >=", value, "expiry");
            return (Criteria) this;
        }

        public Criteria andExpiryLessThan(Integer value) {
            addCriterion("expiry <", value, "expiry");
            return (Criteria) this;
        }

        public Criteria andExpiryLessThanOrEqualTo(Integer value) {
            addCriterion("expiry <=", value, "expiry");
            return (Criteria) this;
        }

        public Criteria andExpiryIn(List<Integer> values) {
            addCriterion("expiry in", values, "expiry");
            return (Criteria) this;
        }

        public Criteria andExpiryNotIn(List<Integer> values) {
            addCriterion("expiry not in", values, "expiry");
            return (Criteria) this;
        }

        public Criteria andExpiryBetween(Integer value1, Integer value2) {
            addCriterion("expiry between", value1, value2, "expiry");
            return (Criteria) this;
        }

        public Criteria andExpiryNotBetween(Integer value1, Integer value2) {
            addCriterion("expiry not between", value1, value2, "expiry");
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