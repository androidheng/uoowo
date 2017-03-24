package com.uoowo.bean;

import java.util.ArrayList;
import java.util.List;

public class BbsGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbsGroupExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Short value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Short value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Short value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Short value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Short value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Short value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Short> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Short> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Short value1, Short value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Short value1, Short value2) {
            addCriterion("gid not between", value1, value2, "gid");
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

        public Criteria andCreditsfromIsNull() {
            addCriterion("creditsfrom is null");
            return (Criteria) this;
        }

        public Criteria andCreditsfromIsNotNull() {
            addCriterion("creditsfrom is not null");
            return (Criteria) this;
        }

        public Criteria andCreditsfromEqualTo(Integer value) {
            addCriterion("creditsfrom =", value, "creditsfrom");
            return (Criteria) this;
        }

        public Criteria andCreditsfromNotEqualTo(Integer value) {
            addCriterion("creditsfrom <>", value, "creditsfrom");
            return (Criteria) this;
        }

        public Criteria andCreditsfromGreaterThan(Integer value) {
            addCriterion("creditsfrom >", value, "creditsfrom");
            return (Criteria) this;
        }

        public Criteria andCreditsfromGreaterThanOrEqualTo(Integer value) {
            addCriterion("creditsfrom >=", value, "creditsfrom");
            return (Criteria) this;
        }

        public Criteria andCreditsfromLessThan(Integer value) {
            addCriterion("creditsfrom <", value, "creditsfrom");
            return (Criteria) this;
        }

        public Criteria andCreditsfromLessThanOrEqualTo(Integer value) {
            addCriterion("creditsfrom <=", value, "creditsfrom");
            return (Criteria) this;
        }

        public Criteria andCreditsfromIn(List<Integer> values) {
            addCriterion("creditsfrom in", values, "creditsfrom");
            return (Criteria) this;
        }

        public Criteria andCreditsfromNotIn(List<Integer> values) {
            addCriterion("creditsfrom not in", values, "creditsfrom");
            return (Criteria) this;
        }

        public Criteria andCreditsfromBetween(Integer value1, Integer value2) {
            addCriterion("creditsfrom between", value1, value2, "creditsfrom");
            return (Criteria) this;
        }

        public Criteria andCreditsfromNotBetween(Integer value1, Integer value2) {
            addCriterion("creditsfrom not between", value1, value2, "creditsfrom");
            return (Criteria) this;
        }

        public Criteria andCreditstoIsNull() {
            addCriterion("creditsto is null");
            return (Criteria) this;
        }

        public Criteria andCreditstoIsNotNull() {
            addCriterion("creditsto is not null");
            return (Criteria) this;
        }

        public Criteria andCreditstoEqualTo(Integer value) {
            addCriterion("creditsto =", value, "creditsto");
            return (Criteria) this;
        }

        public Criteria andCreditstoNotEqualTo(Integer value) {
            addCriterion("creditsto <>", value, "creditsto");
            return (Criteria) this;
        }

        public Criteria andCreditstoGreaterThan(Integer value) {
            addCriterion("creditsto >", value, "creditsto");
            return (Criteria) this;
        }

        public Criteria andCreditstoGreaterThanOrEqualTo(Integer value) {
            addCriterion("creditsto >=", value, "creditsto");
            return (Criteria) this;
        }

        public Criteria andCreditstoLessThan(Integer value) {
            addCriterion("creditsto <", value, "creditsto");
            return (Criteria) this;
        }

        public Criteria andCreditstoLessThanOrEqualTo(Integer value) {
            addCriterion("creditsto <=", value, "creditsto");
            return (Criteria) this;
        }

        public Criteria andCreditstoIn(List<Integer> values) {
            addCriterion("creditsto in", values, "creditsto");
            return (Criteria) this;
        }

        public Criteria andCreditstoNotIn(List<Integer> values) {
            addCriterion("creditsto not in", values, "creditsto");
            return (Criteria) this;
        }

        public Criteria andCreditstoBetween(Integer value1, Integer value2) {
            addCriterion("creditsto between", value1, value2, "creditsto");
            return (Criteria) this;
        }

        public Criteria andCreditstoNotBetween(Integer value1, Integer value2) {
            addCriterion("creditsto not between", value1, value2, "creditsto");
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

        public Criteria andAllowreadEqualTo(Integer value) {
            addCriterion("allowread =", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadNotEqualTo(Integer value) {
            addCriterion("allowread <>", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadGreaterThan(Integer value) {
            addCriterion("allowread >", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowread >=", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadLessThan(Integer value) {
            addCriterion("allowread <", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadLessThanOrEqualTo(Integer value) {
            addCriterion("allowread <=", value, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadIn(List<Integer> values) {
            addCriterion("allowread in", values, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadNotIn(List<Integer> values) {
            addCriterion("allowread not in", values, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadBetween(Integer value1, Integer value2) {
            addCriterion("allowread between", value1, value2, "allowread");
            return (Criteria) this;
        }

        public Criteria andAllowreadNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAllowthreadEqualTo(Integer value) {
            addCriterion("allowthread =", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadNotEqualTo(Integer value) {
            addCriterion("allowthread <>", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadGreaterThan(Integer value) {
            addCriterion("allowthread >", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowthread >=", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadLessThan(Integer value) {
            addCriterion("allowthread <", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadLessThanOrEqualTo(Integer value) {
            addCriterion("allowthread <=", value, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadIn(List<Integer> values) {
            addCriterion("allowthread in", values, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadNotIn(List<Integer> values) {
            addCriterion("allowthread not in", values, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadBetween(Integer value1, Integer value2) {
            addCriterion("allowthread between", value1, value2, "allowthread");
            return (Criteria) this;
        }

        public Criteria andAllowthreadNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAllowpostEqualTo(Integer value) {
            addCriterion("allowpost =", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostNotEqualTo(Integer value) {
            addCriterion("allowpost <>", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostGreaterThan(Integer value) {
            addCriterion("allowpost >", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowpost >=", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostLessThan(Integer value) {
            addCriterion("allowpost <", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostLessThanOrEqualTo(Integer value) {
            addCriterion("allowpost <=", value, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostIn(List<Integer> values) {
            addCriterion("allowpost in", values, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostNotIn(List<Integer> values) {
            addCriterion("allowpost not in", values, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostBetween(Integer value1, Integer value2) {
            addCriterion("allowpost between", value1, value2, "allowpost");
            return (Criteria) this;
        }

        public Criteria andAllowpostNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAllowattachEqualTo(Integer value) {
            addCriterion("allowattach =", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachNotEqualTo(Integer value) {
            addCriterion("allowattach <>", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachGreaterThan(Integer value) {
            addCriterion("allowattach >", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowattach >=", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachLessThan(Integer value) {
            addCriterion("allowattach <", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachLessThanOrEqualTo(Integer value) {
            addCriterion("allowattach <=", value, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachIn(List<Integer> values) {
            addCriterion("allowattach in", values, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachNotIn(List<Integer> values) {
            addCriterion("allowattach not in", values, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachBetween(Integer value1, Integer value2) {
            addCriterion("allowattach between", value1, value2, "allowattach");
            return (Criteria) this;
        }

        public Criteria andAllowattachNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAllowdownEqualTo(Integer value) {
            addCriterion("allowdown =", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownNotEqualTo(Integer value) {
            addCriterion("allowdown <>", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownGreaterThan(Integer value) {
            addCriterion("allowdown >", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowdown >=", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownLessThan(Integer value) {
            addCriterion("allowdown <", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownLessThanOrEqualTo(Integer value) {
            addCriterion("allowdown <=", value, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownIn(List<Integer> values) {
            addCriterion("allowdown in", values, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownNotIn(List<Integer> values) {
            addCriterion("allowdown not in", values, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownBetween(Integer value1, Integer value2) {
            addCriterion("allowdown between", value1, value2, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowdownNotBetween(Integer value1, Integer value2) {
            addCriterion("allowdown not between", value1, value2, "allowdown");
            return (Criteria) this;
        }

        public Criteria andAllowtopIsNull() {
            addCriterion("allowtop is null");
            return (Criteria) this;
        }

        public Criteria andAllowtopIsNotNull() {
            addCriterion("allowtop is not null");
            return (Criteria) this;
        }

        public Criteria andAllowtopEqualTo(Integer value) {
            addCriterion("allowtop =", value, "allowtop");
            return (Criteria) this;
        }

        public Criteria andAllowtopNotEqualTo(Integer value) {
            addCriterion("allowtop <>", value, "allowtop");
            return (Criteria) this;
        }

        public Criteria andAllowtopGreaterThan(Integer value) {
            addCriterion("allowtop >", value, "allowtop");
            return (Criteria) this;
        }

        public Criteria andAllowtopGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowtop >=", value, "allowtop");
            return (Criteria) this;
        }

        public Criteria andAllowtopLessThan(Integer value) {
            addCriterion("allowtop <", value, "allowtop");
            return (Criteria) this;
        }

        public Criteria andAllowtopLessThanOrEqualTo(Integer value) {
            addCriterion("allowtop <=", value, "allowtop");
            return (Criteria) this;
        }

        public Criteria andAllowtopIn(List<Integer> values) {
            addCriterion("allowtop in", values, "allowtop");
            return (Criteria) this;
        }

        public Criteria andAllowtopNotIn(List<Integer> values) {
            addCriterion("allowtop not in", values, "allowtop");
            return (Criteria) this;
        }

        public Criteria andAllowtopBetween(Integer value1, Integer value2) {
            addCriterion("allowtop between", value1, value2, "allowtop");
            return (Criteria) this;
        }

        public Criteria andAllowtopNotBetween(Integer value1, Integer value2) {
            addCriterion("allowtop not between", value1, value2, "allowtop");
            return (Criteria) this;
        }

        public Criteria andAllowupdateIsNull() {
            addCriterion("allowupdate is null");
            return (Criteria) this;
        }

        public Criteria andAllowupdateIsNotNull() {
            addCriterion("allowupdate is not null");
            return (Criteria) this;
        }

        public Criteria andAllowupdateEqualTo(Integer value) {
            addCriterion("allowupdate =", value, "allowupdate");
            return (Criteria) this;
        }

        public Criteria andAllowupdateNotEqualTo(Integer value) {
            addCriterion("allowupdate <>", value, "allowupdate");
            return (Criteria) this;
        }

        public Criteria andAllowupdateGreaterThan(Integer value) {
            addCriterion("allowupdate >", value, "allowupdate");
            return (Criteria) this;
        }

        public Criteria andAllowupdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowupdate >=", value, "allowupdate");
            return (Criteria) this;
        }

        public Criteria andAllowupdateLessThan(Integer value) {
            addCriterion("allowupdate <", value, "allowupdate");
            return (Criteria) this;
        }

        public Criteria andAllowupdateLessThanOrEqualTo(Integer value) {
            addCriterion("allowupdate <=", value, "allowupdate");
            return (Criteria) this;
        }

        public Criteria andAllowupdateIn(List<Integer> values) {
            addCriterion("allowupdate in", values, "allowupdate");
            return (Criteria) this;
        }

        public Criteria andAllowupdateNotIn(List<Integer> values) {
            addCriterion("allowupdate not in", values, "allowupdate");
            return (Criteria) this;
        }

        public Criteria andAllowupdateBetween(Integer value1, Integer value2) {
            addCriterion("allowupdate between", value1, value2, "allowupdate");
            return (Criteria) this;
        }

        public Criteria andAllowupdateNotBetween(Integer value1, Integer value2) {
            addCriterion("allowupdate not between", value1, value2, "allowupdate");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteIsNull() {
            addCriterion("allowdelete is null");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteIsNotNull() {
            addCriterion("allowdelete is not null");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteEqualTo(Integer value) {
            addCriterion("allowdelete =", value, "allowdelete");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteNotEqualTo(Integer value) {
            addCriterion("allowdelete <>", value, "allowdelete");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteGreaterThan(Integer value) {
            addCriterion("allowdelete >", value, "allowdelete");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowdelete >=", value, "allowdelete");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteLessThan(Integer value) {
            addCriterion("allowdelete <", value, "allowdelete");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("allowdelete <=", value, "allowdelete");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteIn(List<Integer> values) {
            addCriterion("allowdelete in", values, "allowdelete");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteNotIn(List<Integer> values) {
            addCriterion("allowdelete not in", values, "allowdelete");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteBetween(Integer value1, Integer value2) {
            addCriterion("allowdelete between", value1, value2, "allowdelete");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("allowdelete not between", value1, value2, "allowdelete");
            return (Criteria) this;
        }

        public Criteria andAllowmoveIsNull() {
            addCriterion("allowmove is null");
            return (Criteria) this;
        }

        public Criteria andAllowmoveIsNotNull() {
            addCriterion("allowmove is not null");
            return (Criteria) this;
        }

        public Criteria andAllowmoveEqualTo(Integer value) {
            addCriterion("allowmove =", value, "allowmove");
            return (Criteria) this;
        }

        public Criteria andAllowmoveNotEqualTo(Integer value) {
            addCriterion("allowmove <>", value, "allowmove");
            return (Criteria) this;
        }

        public Criteria andAllowmoveGreaterThan(Integer value) {
            addCriterion("allowmove >", value, "allowmove");
            return (Criteria) this;
        }

        public Criteria andAllowmoveGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowmove >=", value, "allowmove");
            return (Criteria) this;
        }

        public Criteria andAllowmoveLessThan(Integer value) {
            addCriterion("allowmove <", value, "allowmove");
            return (Criteria) this;
        }

        public Criteria andAllowmoveLessThanOrEqualTo(Integer value) {
            addCriterion("allowmove <=", value, "allowmove");
            return (Criteria) this;
        }

        public Criteria andAllowmoveIn(List<Integer> values) {
            addCriterion("allowmove in", values, "allowmove");
            return (Criteria) this;
        }

        public Criteria andAllowmoveNotIn(List<Integer> values) {
            addCriterion("allowmove not in", values, "allowmove");
            return (Criteria) this;
        }

        public Criteria andAllowmoveBetween(Integer value1, Integer value2) {
            addCriterion("allowmove between", value1, value2, "allowmove");
            return (Criteria) this;
        }

        public Criteria andAllowmoveNotBetween(Integer value1, Integer value2) {
            addCriterion("allowmove not between", value1, value2, "allowmove");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserIsNull() {
            addCriterion("allowbanuser is null");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserIsNotNull() {
            addCriterion("allowbanuser is not null");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserEqualTo(Integer value) {
            addCriterion("allowbanuser =", value, "allowbanuser");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserNotEqualTo(Integer value) {
            addCriterion("allowbanuser <>", value, "allowbanuser");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserGreaterThan(Integer value) {
            addCriterion("allowbanuser >", value, "allowbanuser");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowbanuser >=", value, "allowbanuser");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserLessThan(Integer value) {
            addCriterion("allowbanuser <", value, "allowbanuser");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserLessThanOrEqualTo(Integer value) {
            addCriterion("allowbanuser <=", value, "allowbanuser");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserIn(List<Integer> values) {
            addCriterion("allowbanuser in", values, "allowbanuser");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserNotIn(List<Integer> values) {
            addCriterion("allowbanuser not in", values, "allowbanuser");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserBetween(Integer value1, Integer value2) {
            addCriterion("allowbanuser between", value1, value2, "allowbanuser");
            return (Criteria) this;
        }

        public Criteria andAllowbanuserNotBetween(Integer value1, Integer value2) {
            addCriterion("allowbanuser not between", value1, value2, "allowbanuser");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserIsNull() {
            addCriterion("allowdeleteuser is null");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserIsNotNull() {
            addCriterion("allowdeleteuser is not null");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserEqualTo(Integer value) {
            addCriterion("allowdeleteuser =", value, "allowdeleteuser");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserNotEqualTo(Integer value) {
            addCriterion("allowdeleteuser <>", value, "allowdeleteuser");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserGreaterThan(Integer value) {
            addCriterion("allowdeleteuser >", value, "allowdeleteuser");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowdeleteuser >=", value, "allowdeleteuser");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserLessThan(Integer value) {
            addCriterion("allowdeleteuser <", value, "allowdeleteuser");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserLessThanOrEqualTo(Integer value) {
            addCriterion("allowdeleteuser <=", value, "allowdeleteuser");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserIn(List<Integer> values) {
            addCriterion("allowdeleteuser in", values, "allowdeleteuser");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserNotIn(List<Integer> values) {
            addCriterion("allowdeleteuser not in", values, "allowdeleteuser");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserBetween(Integer value1, Integer value2) {
            addCriterion("allowdeleteuser between", value1, value2, "allowdeleteuser");
            return (Criteria) this;
        }

        public Criteria andAllowdeleteuserNotBetween(Integer value1, Integer value2) {
            addCriterion("allowdeleteuser not between", value1, value2, "allowdeleteuser");
            return (Criteria) this;
        }

        public Criteria andAllowviewipIsNull() {
            addCriterion("allowviewip is null");
            return (Criteria) this;
        }

        public Criteria andAllowviewipIsNotNull() {
            addCriterion("allowviewip is not null");
            return (Criteria) this;
        }

        public Criteria andAllowviewipEqualTo(Integer value) {
            addCriterion("allowviewip =", value, "allowviewip");
            return (Criteria) this;
        }

        public Criteria andAllowviewipNotEqualTo(Integer value) {
            addCriterion("allowviewip <>", value, "allowviewip");
            return (Criteria) this;
        }

        public Criteria andAllowviewipGreaterThan(Integer value) {
            addCriterion("allowviewip >", value, "allowviewip");
            return (Criteria) this;
        }

        public Criteria andAllowviewipGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowviewip >=", value, "allowviewip");
            return (Criteria) this;
        }

        public Criteria andAllowviewipLessThan(Integer value) {
            addCriterion("allowviewip <", value, "allowviewip");
            return (Criteria) this;
        }

        public Criteria andAllowviewipLessThanOrEqualTo(Integer value) {
            addCriterion("allowviewip <=", value, "allowviewip");
            return (Criteria) this;
        }

        public Criteria andAllowviewipIn(List<Integer> values) {
            addCriterion("allowviewip in", values, "allowviewip");
            return (Criteria) this;
        }

        public Criteria andAllowviewipNotIn(List<Integer> values) {
            addCriterion("allowviewip not in", values, "allowviewip");
            return (Criteria) this;
        }

        public Criteria andAllowviewipBetween(Integer value1, Integer value2) {
            addCriterion("allowviewip between", value1, value2, "allowviewip");
            return (Criteria) this;
        }

        public Criteria andAllowviewipNotBetween(Integer value1, Integer value2) {
            addCriterion("allowviewip not between", value1, value2, "allowviewip");
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