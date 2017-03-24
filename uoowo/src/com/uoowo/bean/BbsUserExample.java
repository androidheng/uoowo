package com.uoowo.bean;

import java.util.ArrayList;
import java.util.List;

public class BbsUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbsUserExample() {
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("idnumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("idnumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("idnumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("idnumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("idnumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("idnumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("idnumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("idnumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("idnumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("idnumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("idnumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("idnumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("idnumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("idnumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsIsNull() {
            addCriterion("password_sms is null");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsIsNotNull() {
            addCriterion("password_sms is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsEqualTo(String value) {
            addCriterion("password_sms =", value, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsNotEqualTo(String value) {
            addCriterion("password_sms <>", value, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsGreaterThan(String value) {
            addCriterion("password_sms >", value, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsGreaterThanOrEqualTo(String value) {
            addCriterion("password_sms >=", value, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsLessThan(String value) {
            addCriterion("password_sms <", value, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsLessThanOrEqualTo(String value) {
            addCriterion("password_sms <=", value, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsLike(String value) {
            addCriterion("password_sms like", value, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsNotLike(String value) {
            addCriterion("password_sms not like", value, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsIn(List<String> values) {
            addCriterion("password_sms in", values, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsNotIn(List<String> values) {
            addCriterion("password_sms not in", values, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsBetween(String value1, String value2) {
            addCriterion("password_sms between", value1, value2, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andPasswordSmsNotBetween(String value1, String value2) {
            addCriterion("password_sms not between", value1, value2, "passwordSms");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
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

        public Criteria andCreditsIsNull() {
            addCriterion("credits is null");
            return (Criteria) this;
        }

        public Criteria andCreditsIsNotNull() {
            addCriterion("credits is not null");
            return (Criteria) this;
        }

        public Criteria andCreditsEqualTo(Integer value) {
            addCriterion("credits =", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotEqualTo(Integer value) {
            addCriterion("credits <>", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThan(Integer value) {
            addCriterion("credits >", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThanOrEqualTo(Integer value) {
            addCriterion("credits >=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThan(Integer value) {
            addCriterion("credits <", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThanOrEqualTo(Integer value) {
            addCriterion("credits <=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsIn(List<Integer> values) {
            addCriterion("credits in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotIn(List<Integer> values) {
            addCriterion("credits not in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsBetween(Integer value1, Integer value2) {
            addCriterion("credits between", value1, value2, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotBetween(Integer value1, Integer value2) {
            addCriterion("credits not between", value1, value2, "credits");
            return (Criteria) this;
        }

        public Criteria andGoldsIsNull() {
            addCriterion("golds is null");
            return (Criteria) this;
        }

        public Criteria andGoldsIsNotNull() {
            addCriterion("golds is not null");
            return (Criteria) this;
        }

        public Criteria andGoldsEqualTo(Integer value) {
            addCriterion("golds =", value, "golds");
            return (Criteria) this;
        }

        public Criteria andGoldsNotEqualTo(Integer value) {
            addCriterion("golds <>", value, "golds");
            return (Criteria) this;
        }

        public Criteria andGoldsGreaterThan(Integer value) {
            addCriterion("golds >", value, "golds");
            return (Criteria) this;
        }

        public Criteria andGoldsGreaterThanOrEqualTo(Integer value) {
            addCriterion("golds >=", value, "golds");
            return (Criteria) this;
        }

        public Criteria andGoldsLessThan(Integer value) {
            addCriterion("golds <", value, "golds");
            return (Criteria) this;
        }

        public Criteria andGoldsLessThanOrEqualTo(Integer value) {
            addCriterion("golds <=", value, "golds");
            return (Criteria) this;
        }

        public Criteria andGoldsIn(List<Integer> values) {
            addCriterion("golds in", values, "golds");
            return (Criteria) this;
        }

        public Criteria andGoldsNotIn(List<Integer> values) {
            addCriterion("golds not in", values, "golds");
            return (Criteria) this;
        }

        public Criteria andGoldsBetween(Integer value1, Integer value2) {
            addCriterion("golds between", value1, value2, "golds");
            return (Criteria) this;
        }

        public Criteria andGoldsNotBetween(Integer value1, Integer value2) {
            addCriterion("golds not between", value1, value2, "golds");
            return (Criteria) this;
        }

        public Criteria andRmbsIsNull() {
            addCriterion("rmbs is null");
            return (Criteria) this;
        }

        public Criteria andRmbsIsNotNull() {
            addCriterion("rmbs is not null");
            return (Criteria) this;
        }

        public Criteria andRmbsEqualTo(Integer value) {
            addCriterion("rmbs =", value, "rmbs");
            return (Criteria) this;
        }

        public Criteria andRmbsNotEqualTo(Integer value) {
            addCriterion("rmbs <>", value, "rmbs");
            return (Criteria) this;
        }

        public Criteria andRmbsGreaterThan(Integer value) {
            addCriterion("rmbs >", value, "rmbs");
            return (Criteria) this;
        }

        public Criteria andRmbsGreaterThanOrEqualTo(Integer value) {
            addCriterion("rmbs >=", value, "rmbs");
            return (Criteria) this;
        }

        public Criteria andRmbsLessThan(Integer value) {
            addCriterion("rmbs <", value, "rmbs");
            return (Criteria) this;
        }

        public Criteria andRmbsLessThanOrEqualTo(Integer value) {
            addCriterion("rmbs <=", value, "rmbs");
            return (Criteria) this;
        }

        public Criteria andRmbsIn(List<Integer> values) {
            addCriterion("rmbs in", values, "rmbs");
            return (Criteria) this;
        }

        public Criteria andRmbsNotIn(List<Integer> values) {
            addCriterion("rmbs not in", values, "rmbs");
            return (Criteria) this;
        }

        public Criteria andRmbsBetween(Integer value1, Integer value2) {
            addCriterion("rmbs between", value1, value2, "rmbs");
            return (Criteria) this;
        }

        public Criteria andRmbsNotBetween(Integer value1, Integer value2) {
            addCriterion("rmbs not between", value1, value2, "rmbs");
            return (Criteria) this;
        }

        public Criteria andCreateIpIsNull() {
            addCriterion("create_ip is null");
            return (Criteria) this;
        }

        public Criteria andCreateIpIsNotNull() {
            addCriterion("create_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIpEqualTo(Integer value) {
            addCriterion("create_ip =", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpNotEqualTo(Integer value) {
            addCriterion("create_ip <>", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpGreaterThan(Integer value) {
            addCriterion("create_ip >", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_ip >=", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpLessThan(Integer value) {
            addCriterion("create_ip <", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpLessThanOrEqualTo(Integer value) {
            addCriterion("create_ip <=", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpIn(List<Integer> values) {
            addCriterion("create_ip in", values, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpNotIn(List<Integer> values) {
            addCriterion("create_ip not in", values, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpBetween(Integer value1, Integer value2) {
            addCriterion("create_ip between", value1, value2, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpNotBetween(Integer value1, Integer value2) {
            addCriterion("create_ip not between", value1, value2, "createIp");
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

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(Integer value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(Integer value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(Integer value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(Integer value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(Integer value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<Integer> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<Integer> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(Integer value1, Integer value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(Integer value1, Integer value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNull() {
            addCriterion("login_date is null");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNotNull() {
            addCriterion("login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDateEqualTo(Integer value) {
            addCriterion("login_date =", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotEqualTo(Integer value) {
            addCriterion("login_date <>", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThan(Integer value) {
            addCriterion("login_date >", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_date >=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThan(Integer value) {
            addCriterion("login_date <", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThanOrEqualTo(Integer value) {
            addCriterion("login_date <=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateIn(List<Integer> values) {
            addCriterion("login_date in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotIn(List<Integer> values) {
            addCriterion("login_date not in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateBetween(Integer value1, Integer value2) {
            addCriterion("login_date between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotBetween(Integer value1, Integer value2) {
            addCriterion("login_date not between", value1, value2, "loginDate");
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

        public Criteria andLoginsEqualTo(Integer value) {
            addCriterion("logins =", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsNotEqualTo(Integer value) {
            addCriterion("logins <>", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsGreaterThan(Integer value) {
            addCriterion("logins >", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsGreaterThanOrEqualTo(Integer value) {
            addCriterion("logins >=", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsLessThan(Integer value) {
            addCriterion("logins <", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsLessThanOrEqualTo(Integer value) {
            addCriterion("logins <=", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsIn(List<Integer> values) {
            addCriterion("logins in", values, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsNotIn(List<Integer> values) {
            addCriterion("logins not in", values, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsBetween(Integer value1, Integer value2) {
            addCriterion("logins between", value1, value2, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsNotBetween(Integer value1, Integer value2) {
            addCriterion("logins not between", value1, value2, "logins");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(Integer value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(Integer value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(Integer value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(Integer value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(Integer value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(Integer value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<Integer> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<Integer> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(Integer value1, Integer value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(Integer value1, Integer value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
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