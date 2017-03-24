package com.uoowo.bean;

import java.util.ArrayList;
import java.util.List;

public class BbsIpaccessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbsIpaccessExample() {
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

        public Criteria andMailsIsNull() {
            addCriterion("mails is null");
            return (Criteria) this;
        }

        public Criteria andMailsIsNotNull() {
            addCriterion("mails is not null");
            return (Criteria) this;
        }

        public Criteria andMailsEqualTo(Short value) {
            addCriterion("mails =", value, "mails");
            return (Criteria) this;
        }

        public Criteria andMailsNotEqualTo(Short value) {
            addCriterion("mails <>", value, "mails");
            return (Criteria) this;
        }

        public Criteria andMailsGreaterThan(Short value) {
            addCriterion("mails >", value, "mails");
            return (Criteria) this;
        }

        public Criteria andMailsGreaterThanOrEqualTo(Short value) {
            addCriterion("mails >=", value, "mails");
            return (Criteria) this;
        }

        public Criteria andMailsLessThan(Short value) {
            addCriterion("mails <", value, "mails");
            return (Criteria) this;
        }

        public Criteria andMailsLessThanOrEqualTo(Short value) {
            addCriterion("mails <=", value, "mails");
            return (Criteria) this;
        }

        public Criteria andMailsIn(List<Short> values) {
            addCriterion("mails in", values, "mails");
            return (Criteria) this;
        }

        public Criteria andMailsNotIn(List<Short> values) {
            addCriterion("mails not in", values, "mails");
            return (Criteria) this;
        }

        public Criteria andMailsBetween(Short value1, Short value2) {
            addCriterion("mails between", value1, value2, "mails");
            return (Criteria) this;
        }

        public Criteria andMailsNotBetween(Short value1, Short value2) {
            addCriterion("mails not between", value1, value2, "mails");
            return (Criteria) this;
        }

        public Criteria andUsersIsNull() {
            addCriterion("users is null");
            return (Criteria) this;
        }

        public Criteria andUsersIsNotNull() {
            addCriterion("users is not null");
            return (Criteria) this;
        }

        public Criteria andUsersEqualTo(Short value) {
            addCriterion("users =", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersNotEqualTo(Short value) {
            addCriterion("users <>", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersGreaterThan(Short value) {
            addCriterion("users >", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersGreaterThanOrEqualTo(Short value) {
            addCriterion("users >=", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersLessThan(Short value) {
            addCriterion("users <", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersLessThanOrEqualTo(Short value) {
            addCriterion("users <=", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersIn(List<Short> values) {
            addCriterion("users in", values, "users");
            return (Criteria) this;
        }

        public Criteria andUsersNotIn(List<Short> values) {
            addCriterion("users not in", values, "users");
            return (Criteria) this;
        }

        public Criteria andUsersBetween(Short value1, Short value2) {
            addCriterion("users between", value1, value2, "users");
            return (Criteria) this;
        }

        public Criteria andUsersNotBetween(Short value1, Short value2) {
            addCriterion("users not between", value1, value2, "users");
            return (Criteria) this;
        }

        public Criteria andLoginsIsNull() {
            addCriterion("logins is null");
            return (Criteria) this;
        }

        public Criteria andLoginsIsNotNull() {
            addCriterion("logins is not null");
            return (Criteria) this;
        }

        public Criteria andLoginsEqualTo(Short value) {
            addCriterion("logins =", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsNotEqualTo(Short value) {
            addCriterion("logins <>", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsGreaterThan(Short value) {
            addCriterion("logins >", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsGreaterThanOrEqualTo(Short value) {
            addCriterion("logins >=", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsLessThan(Short value) {
            addCriterion("logins <", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsLessThanOrEqualTo(Short value) {
            addCriterion("logins <=", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsIn(List<Short> values) {
            addCriterion("logins in", values, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsNotIn(List<Short> values) {
            addCriterion("logins not in", values, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsBetween(Short value1, Short value2) {
            addCriterion("logins between", value1, value2, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsNotBetween(Short value1, Short value2) {
            addCriterion("logins not between", value1, value2, "logins");
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

        public Criteria andThreadsEqualTo(Short value) {
            addCriterion("threads =", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsNotEqualTo(Short value) {
            addCriterion("threads <>", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsGreaterThan(Short value) {
            addCriterion("threads >", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsGreaterThanOrEqualTo(Short value) {
            addCriterion("threads >=", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsLessThan(Short value) {
            addCriterion("threads <", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsLessThanOrEqualTo(Short value) {
            addCriterion("threads <=", value, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsIn(List<Short> values) {
            addCriterion("threads in", values, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsNotIn(List<Short> values) {
            addCriterion("threads not in", values, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsBetween(Short value1, Short value2) {
            addCriterion("threads between", value1, value2, "threads");
            return (Criteria) this;
        }

        public Criteria andThreadsNotBetween(Short value1, Short value2) {
            addCriterion("threads not between", value1, value2, "threads");
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

        public Criteria andPostsEqualTo(Short value) {
            addCriterion("posts =", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsNotEqualTo(Short value) {
            addCriterion("posts <>", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsGreaterThan(Short value) {
            addCriterion("posts >", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsGreaterThanOrEqualTo(Short value) {
            addCriterion("posts >=", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsLessThan(Short value) {
            addCriterion("posts <", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsLessThanOrEqualTo(Short value) {
            addCriterion("posts <=", value, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsIn(List<Short> values) {
            addCriterion("posts in", values, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsNotIn(List<Short> values) {
            addCriterion("posts not in", values, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsBetween(Short value1, Short value2) {
            addCriterion("posts between", value1, value2, "posts");
            return (Criteria) this;
        }

        public Criteria andPostsNotBetween(Short value1, Short value2) {
            addCriterion("posts not between", value1, value2, "posts");
            return (Criteria) this;
        }

        public Criteria andAttachsIsNull() {
            addCriterion("attachs is null");
            return (Criteria) this;
        }

        public Criteria andAttachsIsNotNull() {
            addCriterion("attachs is not null");
            return (Criteria) this;
        }

        public Criteria andAttachsEqualTo(Short value) {
            addCriterion("attachs =", value, "attachs");
            return (Criteria) this;
        }

        public Criteria andAttachsNotEqualTo(Short value) {
            addCriterion("attachs <>", value, "attachs");
            return (Criteria) this;
        }

        public Criteria andAttachsGreaterThan(Short value) {
            addCriterion("attachs >", value, "attachs");
            return (Criteria) this;
        }

        public Criteria andAttachsGreaterThanOrEqualTo(Short value) {
            addCriterion("attachs >=", value, "attachs");
            return (Criteria) this;
        }

        public Criteria andAttachsLessThan(Short value) {
            addCriterion("attachs <", value, "attachs");
            return (Criteria) this;
        }

        public Criteria andAttachsLessThanOrEqualTo(Short value) {
            addCriterion("attachs <=", value, "attachs");
            return (Criteria) this;
        }

        public Criteria andAttachsIn(List<Short> values) {
            addCriterion("attachs in", values, "attachs");
            return (Criteria) this;
        }

        public Criteria andAttachsNotIn(List<Short> values) {
            addCriterion("attachs not in", values, "attachs");
            return (Criteria) this;
        }

        public Criteria andAttachsBetween(Short value1, Short value2) {
            addCriterion("attachs between", value1, value2, "attachs");
            return (Criteria) this;
        }

        public Criteria andAttachsNotBetween(Short value1, Short value2) {
            addCriterion("attachs not between", value1, value2, "attachs");
            return (Criteria) this;
        }

        public Criteria andAttachsizesIsNull() {
            addCriterion("attachsizes is null");
            return (Criteria) this;
        }

        public Criteria andAttachsizesIsNotNull() {
            addCriterion("attachsizes is not null");
            return (Criteria) this;
        }

        public Criteria andAttachsizesEqualTo(Short value) {
            addCriterion("attachsizes =", value, "attachsizes");
            return (Criteria) this;
        }

        public Criteria andAttachsizesNotEqualTo(Short value) {
            addCriterion("attachsizes <>", value, "attachsizes");
            return (Criteria) this;
        }

        public Criteria andAttachsizesGreaterThan(Short value) {
            addCriterion("attachsizes >", value, "attachsizes");
            return (Criteria) this;
        }

        public Criteria andAttachsizesGreaterThanOrEqualTo(Short value) {
            addCriterion("attachsizes >=", value, "attachsizes");
            return (Criteria) this;
        }

        public Criteria andAttachsizesLessThan(Short value) {
            addCriterion("attachsizes <", value, "attachsizes");
            return (Criteria) this;
        }

        public Criteria andAttachsizesLessThanOrEqualTo(Short value) {
            addCriterion("attachsizes <=", value, "attachsizes");
            return (Criteria) this;
        }

        public Criteria andAttachsizesIn(List<Short> values) {
            addCriterion("attachsizes in", values, "attachsizes");
            return (Criteria) this;
        }

        public Criteria andAttachsizesNotIn(List<Short> values) {
            addCriterion("attachsizes not in", values, "attachsizes");
            return (Criteria) this;
        }

        public Criteria andAttachsizesBetween(Short value1, Short value2) {
            addCriterion("attachsizes between", value1, value2, "attachsizes");
            return (Criteria) this;
        }

        public Criteria andAttachsizesNotBetween(Short value1, Short value2) {
            addCriterion("attachsizes not between", value1, value2, "attachsizes");
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

        public Criteria andActionsIsNull() {
            addCriterion("actions is null");
            return (Criteria) this;
        }

        public Criteria andActionsIsNotNull() {
            addCriterion("actions is not null");
            return (Criteria) this;
        }

        public Criteria andActionsEqualTo(Integer value) {
            addCriterion("actions =", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsNotEqualTo(Integer value) {
            addCriterion("actions <>", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsGreaterThan(Integer value) {
            addCriterion("actions >", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("actions >=", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsLessThan(Integer value) {
            addCriterion("actions <", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsLessThanOrEqualTo(Integer value) {
            addCriterion("actions <=", value, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsIn(List<Integer> values) {
            addCriterion("actions in", values, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsNotIn(List<Integer> values) {
            addCriterion("actions not in", values, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsBetween(Integer value1, Integer value2) {
            addCriterion("actions between", value1, value2, "actions");
            return (Criteria) this;
        }

        public Criteria andActionsNotBetween(Integer value1, Integer value2) {
            addCriterion("actions not between", value1, value2, "actions");
            return (Criteria) this;
        }

        public Criteria andAction1IsNull() {
            addCriterion("action1 is null");
            return (Criteria) this;
        }

        public Criteria andAction1IsNotNull() {
            addCriterion("action1 is not null");
            return (Criteria) this;
        }

        public Criteria andAction1EqualTo(Integer value) {
            addCriterion("action1 =", value, "action1");
            return (Criteria) this;
        }

        public Criteria andAction1NotEqualTo(Integer value) {
            addCriterion("action1 <>", value, "action1");
            return (Criteria) this;
        }

        public Criteria andAction1GreaterThan(Integer value) {
            addCriterion("action1 >", value, "action1");
            return (Criteria) this;
        }

        public Criteria andAction1GreaterThanOrEqualTo(Integer value) {
            addCriterion("action1 >=", value, "action1");
            return (Criteria) this;
        }

        public Criteria andAction1LessThan(Integer value) {
            addCriterion("action1 <", value, "action1");
            return (Criteria) this;
        }

        public Criteria andAction1LessThanOrEqualTo(Integer value) {
            addCriterion("action1 <=", value, "action1");
            return (Criteria) this;
        }

        public Criteria andAction1In(List<Integer> values) {
            addCriterion("action1 in", values, "action1");
            return (Criteria) this;
        }

        public Criteria andAction1NotIn(List<Integer> values) {
            addCriterion("action1 not in", values, "action1");
            return (Criteria) this;
        }

        public Criteria andAction1Between(Integer value1, Integer value2) {
            addCriterion("action1 between", value1, value2, "action1");
            return (Criteria) this;
        }

        public Criteria andAction1NotBetween(Integer value1, Integer value2) {
            addCriterion("action1 not between", value1, value2, "action1");
            return (Criteria) this;
        }

        public Criteria andAction2IsNull() {
            addCriterion("action2 is null");
            return (Criteria) this;
        }

        public Criteria andAction2IsNotNull() {
            addCriterion("action2 is not null");
            return (Criteria) this;
        }

        public Criteria andAction2EqualTo(Integer value) {
            addCriterion("action2 =", value, "action2");
            return (Criteria) this;
        }

        public Criteria andAction2NotEqualTo(Integer value) {
            addCriterion("action2 <>", value, "action2");
            return (Criteria) this;
        }

        public Criteria andAction2GreaterThan(Integer value) {
            addCriterion("action2 >", value, "action2");
            return (Criteria) this;
        }

        public Criteria andAction2GreaterThanOrEqualTo(Integer value) {
            addCriterion("action2 >=", value, "action2");
            return (Criteria) this;
        }

        public Criteria andAction2LessThan(Integer value) {
            addCriterion("action2 <", value, "action2");
            return (Criteria) this;
        }

        public Criteria andAction2LessThanOrEqualTo(Integer value) {
            addCriterion("action2 <=", value, "action2");
            return (Criteria) this;
        }

        public Criteria andAction2In(List<Integer> values) {
            addCriterion("action2 in", values, "action2");
            return (Criteria) this;
        }

        public Criteria andAction2NotIn(List<Integer> values) {
            addCriterion("action2 not in", values, "action2");
            return (Criteria) this;
        }

        public Criteria andAction2Between(Integer value1, Integer value2) {
            addCriterion("action2 between", value1, value2, "action2");
            return (Criteria) this;
        }

        public Criteria andAction2NotBetween(Integer value1, Integer value2) {
            addCriterion("action2 not between", value1, value2, "action2");
            return (Criteria) this;
        }

        public Criteria andAction3IsNull() {
            addCriterion("action3 is null");
            return (Criteria) this;
        }

        public Criteria andAction3IsNotNull() {
            addCriterion("action3 is not null");
            return (Criteria) this;
        }

        public Criteria andAction3EqualTo(Integer value) {
            addCriterion("action3 =", value, "action3");
            return (Criteria) this;
        }

        public Criteria andAction3NotEqualTo(Integer value) {
            addCriterion("action3 <>", value, "action3");
            return (Criteria) this;
        }

        public Criteria andAction3GreaterThan(Integer value) {
            addCriterion("action3 >", value, "action3");
            return (Criteria) this;
        }

        public Criteria andAction3GreaterThanOrEqualTo(Integer value) {
            addCriterion("action3 >=", value, "action3");
            return (Criteria) this;
        }

        public Criteria andAction3LessThan(Integer value) {
            addCriterion("action3 <", value, "action3");
            return (Criteria) this;
        }

        public Criteria andAction3LessThanOrEqualTo(Integer value) {
            addCriterion("action3 <=", value, "action3");
            return (Criteria) this;
        }

        public Criteria andAction3In(List<Integer> values) {
            addCriterion("action3 in", values, "action3");
            return (Criteria) this;
        }

        public Criteria andAction3NotIn(List<Integer> values) {
            addCriterion("action3 not in", values, "action3");
            return (Criteria) this;
        }

        public Criteria andAction3Between(Integer value1, Integer value2) {
            addCriterion("action3 between", value1, value2, "action3");
            return (Criteria) this;
        }

        public Criteria andAction3NotBetween(Integer value1, Integer value2) {
            addCriterion("action3 not between", value1, value2, "action3");
            return (Criteria) this;
        }

        public Criteria andAction4IsNull() {
            addCriterion("action4 is null");
            return (Criteria) this;
        }

        public Criteria andAction4IsNotNull() {
            addCriterion("action4 is not null");
            return (Criteria) this;
        }

        public Criteria andAction4EqualTo(Integer value) {
            addCriterion("action4 =", value, "action4");
            return (Criteria) this;
        }

        public Criteria andAction4NotEqualTo(Integer value) {
            addCriterion("action4 <>", value, "action4");
            return (Criteria) this;
        }

        public Criteria andAction4GreaterThan(Integer value) {
            addCriterion("action4 >", value, "action4");
            return (Criteria) this;
        }

        public Criteria andAction4GreaterThanOrEqualTo(Integer value) {
            addCriterion("action4 >=", value, "action4");
            return (Criteria) this;
        }

        public Criteria andAction4LessThan(Integer value) {
            addCriterion("action4 <", value, "action4");
            return (Criteria) this;
        }

        public Criteria andAction4LessThanOrEqualTo(Integer value) {
            addCriterion("action4 <=", value, "action4");
            return (Criteria) this;
        }

        public Criteria andAction4In(List<Integer> values) {
            addCriterion("action4 in", values, "action4");
            return (Criteria) this;
        }

        public Criteria andAction4NotIn(List<Integer> values) {
            addCriterion("action4 not in", values, "action4");
            return (Criteria) this;
        }

        public Criteria andAction4Between(Integer value1, Integer value2) {
            addCriterion("action4 between", value1, value2, "action4");
            return (Criteria) this;
        }

        public Criteria andAction4NotBetween(Integer value1, Integer value2) {
            addCriterion("action4 not between", value1, value2, "action4");
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