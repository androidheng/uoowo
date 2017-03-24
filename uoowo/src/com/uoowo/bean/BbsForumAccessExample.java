package com.uoowo.bean;

import java.util.ArrayList;
import java.util.List;

public class BbsForumAccessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbsForumAccessExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andAllowreadIsNull() {
            addCriterion("allowread is null");
            return (Criteria) this;
        }

        public Criteria andAllowreadIsNotNull() {
            addCriterion("allowread is not null");
            return (Criteria) this;
        }

        public Criteria andAllowreadEqualTo(Boolean value) {
            addCriterion("allowread =", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadNotEqualTo(Boolean value) {
            addCriterion("allowread <>", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadGreaterThan(Boolean value) {
            addCriterion("allowread >", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allowread >=", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadLessThan(Boolean value) {
            addCriterion("allowread <", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadLessThanOrEqualTo(Boolean value) {
            addCriterion("allowread <=", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadIn(List<Boolean> values) {
            addCriterion("allowread in", values, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadNotIn(List<Boolean> values) {
            addCriterion("allowread not in", values, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadBetween(Boolean value1, Boolean value2) {
            addCriterion("allowread between", value1, value2, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allowread not between", value1, value2, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadIsNull() {
            addCriterion("allowthread is null");
            return (Criteria) this;
        }

        public Criteria andAllowthreadIsNotNull() {
            addCriterion("allowthread is not null");
            return (Criteria) this;
        }

        public Criteria andAllowthreadEqualTo(Boolean value) {
            addCriterion("allowthread =", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadNotEqualTo(Boolean value) {
            addCriterion("allowthread <>", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadGreaterThan(Boolean value) {
            addCriterion("allowthread >", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allowthread >=", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadLessThan(Boolean value) {
            addCriterion("allowthread <", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadLessThanOrEqualTo(Boolean value) {
            addCriterion("allowthread <=", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadIn(List<Boolean> values) {
            addCriterion("allowthread in", values, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadNotIn(List<Boolean> values) {
            addCriterion("allowthread not in", values, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadBetween(Boolean value1, Boolean value2) {
            addCriterion("allowthread between", value1, value2, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allowthread not between", value1, value2, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowpostIsNull() {
            addCriterion("allowpost is null");
            return (Criteria) this;
        }

        public Criteria andAllowpostIsNotNull() {
            addCriterion("allowpost is not null");
            return (Criteria) this;
        }

        public Criteria andAllowpostEqualTo(Boolean value) {
            addCriterion("allowpost =", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostNotEqualTo(Boolean value) {
            addCriterion("allowpost <>", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostGreaterThan(Boolean value) {
            addCriterion("allowpost >", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allowpost >=", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostLessThan(Boolean value) {
            addCriterion("allowpost <", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostLessThanOrEqualTo(Boolean value) {
            addCriterion("allowpost <=", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostIn(List<Boolean> values) {
            addCriterion("allowpost in", values, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostNotIn(List<Boolean> values) {
            addCriterion("allowpost not in", values, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostBetween(Boolean value1, Boolean value2) {
            addCriterion("allowpost between", value1, value2, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allowpost not between", value1, value2, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowattachIsNull() {
            addCriterion("allowattach is null");
            return (Criteria) this;
        }

        public Criteria andAllowattachIsNotNull() {
            addCriterion("allowattach is not null");
            return (Criteria) this;
        }

        public Criteria andAllowattachEqualTo(Boolean value) {
            addCriterion("allowattach =", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachNotEqualTo(Boolean value) {
            addCriterion("allowattach <>", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachGreaterThan(Boolean value) {
            addCriterion("allowattach >", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allowattach >=", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachLessThan(Boolean value) {
            addCriterion("allowattach <", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachLessThanOrEqualTo(Boolean value) {
            addCriterion("allowattach <=", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachIn(List<Boolean> values) {
            addCriterion("allowattach in", values, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachNotIn(List<Boolean> values) {
            addCriterion("allowattach not in", values, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachBetween(Boolean value1, Boolean value2) {
            addCriterion("allowattach between", value1, value2, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allowattach not between", value1, value2, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowdownIsNull() {
            addCriterion("allowdown is null");
            return (Criteria) this;
        }

        public Criteria andAllowdownIsNotNull() {
            addCriterion("allowdown is not null");
            return (Criteria) this;
        }

        public Criteria andAllowdownEqualTo(Boolean value) {
            addCriterion("allowdown =", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownNotEqualTo(Boolean value) {
            addCriterion("allowdown <>", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownGreaterThan(Boolean value) {
            addCriterion("allowdown >", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allowdown >=", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownLessThan(Boolean value) {
            addCriterion("allowdown <", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownLessThanOrEqualTo(Boolean value) {
            addCriterion("allowdown <=", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownIn(List<Boolean> values) {
            addCriterion("allowdown in", values, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownNotIn(List<Boolean> values) {
            addCriterion("allowdown not in", values, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownBetween(Boolean value1, Boolean value2) {
            addCriterion("allowdown between", value1, value2, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allowdown not between", value1, value2, "allowdown");
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