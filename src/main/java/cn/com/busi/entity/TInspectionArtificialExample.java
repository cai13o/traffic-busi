package cn.com.busi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TInspectionArtificialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInspectionArtificialExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCphmIsNull() {
            addCriterion("cphm is null");
            return (Criteria) this;
        }

        public Criteria andCphmIsNotNull() {
            addCriterion("cphm is not null");
            return (Criteria) this;
        }

        public Criteria andCphmEqualTo(String value) {
            addCriterion("cphm =", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmNotEqualTo(String value) {
            addCriterion("cphm <>", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmGreaterThan(String value) {
            addCriterion("cphm >", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmGreaterThanOrEqualTo(String value) {
            addCriterion("cphm >=", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmLessThan(String value) {
            addCriterion("cphm <", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmLessThanOrEqualTo(String value) {
            addCriterion("cphm <=", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmLike(String value) {
            addCriterion("cphm like", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmNotLike(String value) {
            addCriterion("cphm not like", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmIn(List<String> values) {
            addCriterion("cphm in", values, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmNotIn(List<String> values) {
            addCriterion("cphm not in", values, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmBetween(String value1, String value2) {
            addCriterion("cphm between", value1, value2, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmNotBetween(String value1, String value2) {
            addCriterion("cphm not between", value1, value2, "cphm");
            return (Criteria) this;
        }

        public Criteria andCllbIsNull() {
            addCriterion("cllb is null");
            return (Criteria) this;
        }

        public Criteria andCllbIsNotNull() {
            addCriterion("cllb is not null");
            return (Criteria) this;
        }

        public Criteria andCllbEqualTo(String value) {
            addCriterion("cllb =", value, "cllb");
            return (Criteria) this;
        }

        public Criteria andCllbNotEqualTo(String value) {
            addCriterion("cllb <>", value, "cllb");
            return (Criteria) this;
        }

        public Criteria andCllbGreaterThan(String value) {
            addCriterion("cllb >", value, "cllb");
            return (Criteria) this;
        }

        public Criteria andCllbGreaterThanOrEqualTo(String value) {
            addCriterion("cllb >=", value, "cllb");
            return (Criteria) this;
        }

        public Criteria andCllbLessThan(String value) {
            addCriterion("cllb <", value, "cllb");
            return (Criteria) this;
        }

        public Criteria andCllbLessThanOrEqualTo(String value) {
            addCriterion("cllb <=", value, "cllb");
            return (Criteria) this;
        }

        public Criteria andCllbLike(String value) {
            addCriterion("cllb like", value, "cllb");
            return (Criteria) this;
        }

        public Criteria andCllbNotLike(String value) {
            addCriterion("cllb not like", value, "cllb");
            return (Criteria) this;
        }

        public Criteria andCllbIn(List<String> values) {
            addCriterion("cllb in", values, "cllb");
            return (Criteria) this;
        }

        public Criteria andCllbNotIn(List<String> values) {
            addCriterion("cllb not in", values, "cllb");
            return (Criteria) this;
        }

        public Criteria andCllbBetween(String value1, String value2) {
            addCriterion("cllb between", value1, value2, "cllb");
            return (Criteria) this;
        }

        public Criteria andCllbNotBetween(String value1, String value2) {
            addCriterion("cllb not between", value1, value2, "cllb");
            return (Criteria) this;
        }

        public Criteria andLcbdsIsNull() {
            addCriterion("lcbds is null");
            return (Criteria) this;
        }

        public Criteria andLcbdsIsNotNull() {
            addCriterion("lcbds is not null");
            return (Criteria) this;
        }

        public Criteria andLcbdsEqualTo(String value) {
            addCriterion("lcbds =", value, "lcbds");
            return (Criteria) this;
        }

        public Criteria andLcbdsNotEqualTo(String value) {
            addCriterion("lcbds <>", value, "lcbds");
            return (Criteria) this;
        }

        public Criteria andLcbdsGreaterThan(String value) {
            addCriterion("lcbds >", value, "lcbds");
            return (Criteria) this;
        }

        public Criteria andLcbdsGreaterThanOrEqualTo(String value) {
            addCriterion("lcbds >=", value, "lcbds");
            return (Criteria) this;
        }

        public Criteria andLcbdsLessThan(String value) {
            addCriterion("lcbds <", value, "lcbds");
            return (Criteria) this;
        }

        public Criteria andLcbdsLessThanOrEqualTo(String value) {
            addCriterion("lcbds <=", value, "lcbds");
            return (Criteria) this;
        }

        public Criteria andLcbdsLike(String value) {
            addCriterion("lcbds like", value, "lcbds");
            return (Criteria) this;
        }

        public Criteria andLcbdsNotLike(String value) {
            addCriterion("lcbds not like", value, "lcbds");
            return (Criteria) this;
        }

        public Criteria andLcbdsIn(List<String> values) {
            addCriterion("lcbds in", values, "lcbds");
            return (Criteria) this;
        }

        public Criteria andLcbdsNotIn(List<String> values) {
            addCriterion("lcbds not in", values, "lcbds");
            return (Criteria) this;
        }

        public Criteria andLcbdsBetween(String value1, String value2) {
            addCriterion("lcbds between", value1, value2, "lcbds");
            return (Criteria) this;
        }

        public Criteria andLcbdsNotBetween(String value1, String value2) {
            addCriterion("lcbds not between", value1, value2, "lcbds");
            return (Criteria) this;
        }

        public Criteria andSyxzIsNull() {
            addCriterion("syxz is null");
            return (Criteria) this;
        }

        public Criteria andSyxzIsNotNull() {
            addCriterion("syxz is not null");
            return (Criteria) this;
        }

        public Criteria andSyxzEqualTo(String value) {
            addCriterion("syxz =", value, "syxz");
            return (Criteria) this;
        }

        public Criteria andSyxzNotEqualTo(String value) {
            addCriterion("syxz <>", value, "syxz");
            return (Criteria) this;
        }

        public Criteria andSyxzGreaterThan(String value) {
            addCriterion("syxz >", value, "syxz");
            return (Criteria) this;
        }

        public Criteria andSyxzGreaterThanOrEqualTo(String value) {
            addCriterion("syxz >=", value, "syxz");
            return (Criteria) this;
        }

        public Criteria andSyxzLessThan(String value) {
            addCriterion("syxz <", value, "syxz");
            return (Criteria) this;
        }

        public Criteria andSyxzLessThanOrEqualTo(String value) {
            addCriterion("syxz <=", value, "syxz");
            return (Criteria) this;
        }

        public Criteria andSyxzLike(String value) {
            addCriterion("syxz like", value, "syxz");
            return (Criteria) this;
        }

        public Criteria andSyxzNotLike(String value) {
            addCriterion("syxz not like", value, "syxz");
            return (Criteria) this;
        }

        public Criteria andSyxzIn(List<String> values) {
            addCriterion("syxz in", values, "syxz");
            return (Criteria) this;
        }

        public Criteria andSyxzNotIn(List<String> values) {
            addCriterion("syxz not in", values, "syxz");
            return (Criteria) this;
        }

        public Criteria andSyxzBetween(String value1, String value2) {
            addCriterion("syxz between", value1, value2, "syxz");
            return (Criteria) this;
        }

        public Criteria andSyxzNotBetween(String value1, String value2) {
            addCriterion("syxz not between", value1, value2, "syxz");
            return (Criteria) this;
        }

        public Criteria andDlyszhIsNull() {
            addCriterion("dlyszh is null");
            return (Criteria) this;
        }

        public Criteria andDlyszhIsNotNull() {
            addCriterion("dlyszh is not null");
            return (Criteria) this;
        }

        public Criteria andDlyszhEqualTo(String value) {
            addCriterion("dlyszh =", value, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andDlyszhNotEqualTo(String value) {
            addCriterion("dlyszh <>", value, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andDlyszhGreaterThan(String value) {
            addCriterion("dlyszh >", value, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andDlyszhGreaterThanOrEqualTo(String value) {
            addCriterion("dlyszh >=", value, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andDlyszhLessThan(String value) {
            addCriterion("dlyszh <", value, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andDlyszhLessThanOrEqualTo(String value) {
            addCriterion("dlyszh <=", value, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andDlyszhLike(String value) {
            addCriterion("dlyszh like", value, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andDlyszhNotLike(String value) {
            addCriterion("dlyszh not like", value, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andDlyszhIn(List<String> values) {
            addCriterion("dlyszh in", values, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andDlyszhNotIn(List<String> values) {
            addCriterion("dlyszh not in", values, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andDlyszhBetween(String value1, String value2) {
            addCriterion("dlyszh between", value1, value2, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andDlyszhNotBetween(String value1, String value2) {
            addCriterion("dlyszh not between", value1, value2, "dlyszh");
            return (Criteria) this;
        }

        public Criteria andClccrqIsNull() {
            addCriterion("clccrq is null");
            return (Criteria) this;
        }

        public Criteria andClccrqIsNotNull() {
            addCriterion("clccrq is not null");
            return (Criteria) this;
        }

        public Criteria andClccrqEqualTo(Date value) {
            addCriterionForJDBCDate("clccrq =", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("clccrq <>", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqGreaterThan(Date value) {
            addCriterionForJDBCDate("clccrq >", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("clccrq >=", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqLessThan(Date value) {
            addCriterionForJDBCDate("clccrq <", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("clccrq <=", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqIn(List<Date> values) {
            addCriterionForJDBCDate("clccrq in", values, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("clccrq not in", values, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("clccrq between", value1, value2, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("clccrq not between", value1, value2, "clccrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqIsNull() {
            addCriterion("ccdjrq is null");
            return (Criteria) this;
        }

        public Criteria andCcdjrqIsNotNull() {
            addCriterion("ccdjrq is not null");
            return (Criteria) this;
        }

        public Criteria andCcdjrqEqualTo(Date value) {
            addCriterionForJDBCDate("ccdjrq =", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("ccdjrq <>", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqGreaterThan(Date value) {
            addCriterionForJDBCDate("ccdjrq >", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ccdjrq >=", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqLessThan(Date value) {
            addCriterionForJDBCDate("ccdjrq <", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ccdjrq <=", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqIn(List<Date> values) {
            addCriterionForJDBCDate("ccdjrq in", values, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("ccdjrq not in", values, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ccdjrq between", value1, value2, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ccdjrq not between", value1, value2, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andJyrqIsNull() {
            addCriterion("jyrq is null");
            return (Criteria) this;
        }

        public Criteria andJyrqIsNotNull() {
            addCriterion("jyrq is not null");
            return (Criteria) this;
        }

        public Criteria andJyrqEqualTo(Date value) {
            addCriterionForJDBCDate("jyrq =", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("jyrq <>", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqGreaterThan(Date value) {
            addCriterionForJDBCDate("jyrq >", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jyrq >=", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqLessThan(Date value) {
            addCriterionForJDBCDate("jyrq <", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jyrq <=", value, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqIn(List<Date> values) {
            addCriterionForJDBCDate("jyrq in", values, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("jyrq not in", values, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jyrq between", value1, value2, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJyrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jyrq not between", value1, value2, "jyrq");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzIsNull() {
            addCriterion("jdcsyrsyxz is null");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzIsNotNull() {
            addCriterion("jdcsyrsyxz is not null");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzEqualTo(String value) {
            addCriterion("jdcsyrsyxz =", value, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzNotEqualTo(String value) {
            addCriterion("jdcsyrsyxz <>", value, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzGreaterThan(String value) {
            addCriterion("jdcsyrsyxz >", value, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzGreaterThanOrEqualTo(String value) {
            addCriterion("jdcsyrsyxz >=", value, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzLessThan(String value) {
            addCriterion("jdcsyrsyxz <", value, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzLessThanOrEqualTo(String value) {
            addCriterion("jdcsyrsyxz <=", value, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzLike(String value) {
            addCriterion("jdcsyrsyxz like", value, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzNotLike(String value) {
            addCriterion("jdcsyrsyxz not like", value, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzIn(List<String> values) {
            addCriterion("jdcsyrsyxz in", values, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzNotIn(List<String> values) {
            addCriterion("jdcsyrsyxz not in", values, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzBetween(String value1, String value2) {
            addCriterion("jdcsyrsyxz between", value1, value2, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andJdcsyrsyxzNotBetween(String value1, String value2) {
            addCriterion("jdcsyrsyxz not between", value1, value2, "jdcsyrsyxz");
            return (Criteria) this;
        }

        public Criteria andQssssqIsNull() {
            addCriterion("qssssq is null");
            return (Criteria) this;
        }

        public Criteria andQssssqIsNotNull() {
            addCriterion("qssssq is not null");
            return (Criteria) this;
        }

        public Criteria andQssssqEqualTo(String value) {
            addCriterion("qssssq =", value, "qssssq");
            return (Criteria) this;
        }

        public Criteria andQssssqNotEqualTo(String value) {
            addCriterion("qssssq <>", value, "qssssq");
            return (Criteria) this;
        }

        public Criteria andQssssqGreaterThan(String value) {
            addCriterion("qssssq >", value, "qssssq");
            return (Criteria) this;
        }

        public Criteria andQssssqGreaterThanOrEqualTo(String value) {
            addCriterion("qssssq >=", value, "qssssq");
            return (Criteria) this;
        }

        public Criteria andQssssqLessThan(String value) {
            addCriterion("qssssq <", value, "qssssq");
            return (Criteria) this;
        }

        public Criteria andQssssqLessThanOrEqualTo(String value) {
            addCriterion("qssssq <=", value, "qssssq");
            return (Criteria) this;
        }

        public Criteria andQssssqLike(String value) {
            addCriterion("qssssq like", value, "qssssq");
            return (Criteria) this;
        }

        public Criteria andQssssqNotLike(String value) {
            addCriterion("qssssq not like", value, "qssssq");
            return (Criteria) this;
        }

        public Criteria andQssssqIn(List<String> values) {
            addCriterion("qssssq in", values, "qssssq");
            return (Criteria) this;
        }

        public Criteria andQssssqNotIn(List<String> values) {
            addCriterion("qssssq not in", values, "qssssq");
            return (Criteria) this;
        }

        public Criteria andQssssqBetween(String value1, String value2) {
            addCriterion("qssssq between", value1, value2, "qssssq");
            return (Criteria) this;
        }

        public Criteria andQssssqNotBetween(String value1, String value2) {
            addCriterion("qssssq not between", value1, value2, "qssssq");
            return (Criteria) this;
        }

        public Criteria andZxzslIsNull() {
            addCriterion("zxzsl is null");
            return (Criteria) this;
        }

        public Criteria andZxzslIsNotNull() {
            addCriterion("zxzsl is not null");
            return (Criteria) this;
        }

        public Criteria andZxzslEqualTo(String value) {
            addCriterion("zxzsl =", value, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andZxzslNotEqualTo(String value) {
            addCriterion("zxzsl <>", value, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andZxzslGreaterThan(String value) {
            addCriterion("zxzsl >", value, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andZxzslGreaterThanOrEqualTo(String value) {
            addCriterion("zxzsl >=", value, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andZxzslLessThan(String value) {
            addCriterion("zxzsl <", value, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andZxzslLessThanOrEqualTo(String value) {
            addCriterion("zxzsl <=", value, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andZxzslLike(String value) {
            addCriterion("zxzsl like", value, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andZxzslNotLike(String value) {
            addCriterion("zxzsl not like", value, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andZxzslIn(List<String> values) {
            addCriterion("zxzsl in", values, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andZxzslNotIn(List<String> values) {
            addCriterion("zxzsl not in", values, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andZxzslBetween(String value1, String value2) {
            addCriterion("zxzsl between", value1, value2, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andZxzslNotBetween(String value1, String value2) {
            addCriterion("zxzsl not between", value1, value2, "zxzsl");
            return (Criteria) this;
        }

        public Criteria andPzkxxjIsNull() {
            addCriterion("pzkxxj is null");
            return (Criteria) this;
        }

        public Criteria andPzkxxjIsNotNull() {
            addCriterion("pzkxxj is not null");
            return (Criteria) this;
        }

        public Criteria andPzkxxjEqualTo(String value) {
            addCriterion("pzkxxj =", value, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andPzkxxjNotEqualTo(String value) {
            addCriterion("pzkxxj <>", value, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andPzkxxjGreaterThan(String value) {
            addCriterion("pzkxxj >", value, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andPzkxxjGreaterThanOrEqualTo(String value) {
            addCriterion("pzkxxj >=", value, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andPzkxxjLessThan(String value) {
            addCriterion("pzkxxj <", value, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andPzkxxjLessThanOrEqualTo(String value) {
            addCriterion("pzkxxj <=", value, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andPzkxxjLike(String value) {
            addCriterion("pzkxxj like", value, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andPzkxxjNotLike(String value) {
            addCriterion("pzkxxj not like", value, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andPzkxxjIn(List<String> values) {
            addCriterion("pzkxxj in", values, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andPzkxxjNotIn(List<String> values) {
            addCriterion("pzkxxj not in", values, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andPzkxxjBetween(String value1, String value2) {
            addCriterion("pzkxxj between", value1, value2, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andPzkxxjNotBetween(String value1, String value2) {
            addCriterion("pzkxxj not between", value1, value2, "pzkxxj");
            return (Criteria) this;
        }

        public Criteria andLwcx1IsNull() {
            addCriterion("lwcx1 is null");
            return (Criteria) this;
        }

        public Criteria andLwcx1IsNotNull() {
            addCriterion("lwcx1 is not null");
            return (Criteria) this;
        }

        public Criteria andLwcx1EqualTo(String value) {
            addCriterion("lwcx1 =", value, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx1NotEqualTo(String value) {
            addCriterion("lwcx1 <>", value, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx1GreaterThan(String value) {
            addCriterion("lwcx1 >", value, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx1GreaterThanOrEqualTo(String value) {
            addCriterion("lwcx1 >=", value, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx1LessThan(String value) {
            addCriterion("lwcx1 <", value, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx1LessThanOrEqualTo(String value) {
            addCriterion("lwcx1 <=", value, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx1Like(String value) {
            addCriterion("lwcx1 like", value, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx1NotLike(String value) {
            addCriterion("lwcx1 not like", value, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx1In(List<String> values) {
            addCriterion("lwcx1 in", values, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx1NotIn(List<String> values) {
            addCriterion("lwcx1 not in", values, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx1Between(String value1, String value2) {
            addCriterion("lwcx1 between", value1, value2, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx1NotBetween(String value1, String value2) {
            addCriterion("lwcx1 not between", value1, value2, "lwcx1");
            return (Criteria) this;
        }

        public Criteria andLwcx2IsNull() {
            addCriterion("lwcx2 is null");
            return (Criteria) this;
        }

        public Criteria andLwcx2IsNotNull() {
            addCriterion("lwcx2 is not null");
            return (Criteria) this;
        }

        public Criteria andLwcx2EqualTo(String value) {
            addCriterion("lwcx2 =", value, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcx2NotEqualTo(String value) {
            addCriterion("lwcx2 <>", value, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcx2GreaterThan(String value) {
            addCriterion("lwcx2 >", value, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcx2GreaterThanOrEqualTo(String value) {
            addCriterion("lwcx2 >=", value, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcx2LessThan(String value) {
            addCriterion("lwcx2 <", value, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcx2LessThanOrEqualTo(String value) {
            addCriterion("lwcx2 <=", value, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcx2Like(String value) {
            addCriterion("lwcx2 like", value, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcx2NotLike(String value) {
            addCriterion("lwcx2 not like", value, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcx2In(List<String> values) {
            addCriterion("lwcx2 in", values, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcx2NotIn(List<String> values) {
            addCriterion("lwcx2 not in", values, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcx2Between(String value1, String value2) {
            addCriterion("lwcx2 between", value1, value2, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcx2NotBetween(String value1, String value2) {
            addCriterion("lwcx2 not between", value1, value2, "lwcx2");
            return (Criteria) this;
        }

        public Criteria andLwcxpdIsNull() {
            addCriterion("lwcxpd is null");
            return (Criteria) this;
        }

        public Criteria andLwcxpdIsNotNull() {
            addCriterion("lwcxpd is not null");
            return (Criteria) this;
        }

        public Criteria andLwcxpdEqualTo(String value) {
            addCriterion("lwcxpd =", value, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andLwcxpdNotEqualTo(String value) {
            addCriterion("lwcxpd <>", value, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andLwcxpdGreaterThan(String value) {
            addCriterion("lwcxpd >", value, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andLwcxpdGreaterThanOrEqualTo(String value) {
            addCriterion("lwcxpd >=", value, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andLwcxpdLessThan(String value) {
            addCriterion("lwcxpd <", value, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andLwcxpdLessThanOrEqualTo(String value) {
            addCriterion("lwcxpd <=", value, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andLwcxpdLike(String value) {
            addCriterion("lwcxpd like", value, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andLwcxpdNotLike(String value) {
            addCriterion("lwcxpd not like", value, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andLwcxpdIn(List<String> values) {
            addCriterion("lwcxpd in", values, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andLwcxpdNotIn(List<String> values) {
            addCriterion("lwcxpd not in", values, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andLwcxpdBetween(String value1, String value2) {
            addCriterion("lwcxpd between", value1, value2, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andLwcxpdNotBetween(String value1, String value2) {
            addCriterion("lwcxpd not between", value1, value2, "lwcxpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdIsNull() {
            addCriterion("hphmhflpd is null");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdIsNotNull() {
            addCriterion("hphmhflpd is not null");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdEqualTo(String value) {
            addCriterion("hphmhflpd =", value, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdNotEqualTo(String value) {
            addCriterion("hphmhflpd <>", value, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdGreaterThan(String value) {
            addCriterion("hphmhflpd >", value, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdGreaterThanOrEqualTo(String value) {
            addCriterion("hphmhflpd >=", value, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdLessThan(String value) {
            addCriterion("hphmhflpd <", value, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdLessThanOrEqualTo(String value) {
            addCriterion("hphmhflpd <=", value, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdLike(String value) {
            addCriterion("hphmhflpd like", value, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdNotLike(String value) {
            addCriterion("hphmhflpd not like", value, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdIn(List<String> values) {
            addCriterion("hphmhflpd in", values, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdNotIn(List<String> values) {
            addCriterion("hphmhflpd not in", values, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdBetween(String value1, String value2) {
            addCriterion("hphmhflpd between", value1, value2, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andHphmhflpdNotBetween(String value1, String value2) {
            addCriterion("hphmhflpd not between", value1, value2, "hphmhflpd");
            return (Criteria) this;
        }

        public Criteria andClpppdIsNull() {
            addCriterion("clpppd is null");
            return (Criteria) this;
        }

        public Criteria andClpppdIsNotNull() {
            addCriterion("clpppd is not null");
            return (Criteria) this;
        }

        public Criteria andClpppdEqualTo(String value) {
            addCriterion("clpppd =", value, "clpppd");
            return (Criteria) this;
        }

        public Criteria andClpppdNotEqualTo(String value) {
            addCriterion("clpppd <>", value, "clpppd");
            return (Criteria) this;
        }

        public Criteria andClpppdGreaterThan(String value) {
            addCriterion("clpppd >", value, "clpppd");
            return (Criteria) this;
        }

        public Criteria andClpppdGreaterThanOrEqualTo(String value) {
            addCriterion("clpppd >=", value, "clpppd");
            return (Criteria) this;
        }

        public Criteria andClpppdLessThan(String value) {
            addCriterion("clpppd <", value, "clpppd");
            return (Criteria) this;
        }

        public Criteria andClpppdLessThanOrEqualTo(String value) {
            addCriterion("clpppd <=", value, "clpppd");
            return (Criteria) this;
        }

        public Criteria andClpppdLike(String value) {
            addCriterion("clpppd like", value, "clpppd");
            return (Criteria) this;
        }

        public Criteria andClpppdNotLike(String value) {
            addCriterion("clpppd not like", value, "clpppd");
            return (Criteria) this;
        }

        public Criteria andClpppdIn(List<String> values) {
            addCriterion("clpppd in", values, "clpppd");
            return (Criteria) this;
        }

        public Criteria andClpppdNotIn(List<String> values) {
            addCriterion("clpppd not in", values, "clpppd");
            return (Criteria) this;
        }

        public Criteria andClpppdBetween(String value1, String value2) {
            addCriterion("clpppd between", value1, value2, "clpppd");
            return (Criteria) this;
        }

        public Criteria andClpppdNotBetween(String value1, String value2) {
            addCriterion("clpppd not between", value1, value2, "clpppd");
            return (Criteria) this;
        }

        public Criteria andVinpdIsNull() {
            addCriterion("vinpd is null");
            return (Criteria) this;
        }

        public Criteria andVinpdIsNotNull() {
            addCriterion("vinpd is not null");
            return (Criteria) this;
        }

        public Criteria andVinpdEqualTo(String value) {
            addCriterion("vinpd =", value, "vinpd");
            return (Criteria) this;
        }

        public Criteria andVinpdNotEqualTo(String value) {
            addCriterion("vinpd <>", value, "vinpd");
            return (Criteria) this;
        }

        public Criteria andVinpdGreaterThan(String value) {
            addCriterion("vinpd >", value, "vinpd");
            return (Criteria) this;
        }

        public Criteria andVinpdGreaterThanOrEqualTo(String value) {
            addCriterion("vinpd >=", value, "vinpd");
            return (Criteria) this;
        }

        public Criteria andVinpdLessThan(String value) {
            addCriterion("vinpd <", value, "vinpd");
            return (Criteria) this;
        }

        public Criteria andVinpdLessThanOrEqualTo(String value) {
            addCriterion("vinpd <=", value, "vinpd");
            return (Criteria) this;
        }

        public Criteria andVinpdLike(String value) {
            addCriterion("vinpd like", value, "vinpd");
            return (Criteria) this;
        }

        public Criteria andVinpdNotLike(String value) {
            addCriterion("vinpd not like", value, "vinpd");
            return (Criteria) this;
        }

        public Criteria andVinpdIn(List<String> values) {
            addCriterion("vinpd in", values, "vinpd");
            return (Criteria) this;
        }

        public Criteria andVinpdNotIn(List<String> values) {
            addCriterion("vinpd not in", values, "vinpd");
            return (Criteria) this;
        }

        public Criteria andVinpdBetween(String value1, String value2) {
            addCriterion("vinpd between", value1, value2, "vinpd");
            return (Criteria) this;
        }

        public Criteria andVinpdNotBetween(String value1, String value2) {
            addCriterion("vinpd not between", value1, value2, "vinpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdIsNull() {
            addCriterion("fdjhmpd is null");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdIsNotNull() {
            addCriterion("fdjhmpd is not null");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdEqualTo(String value) {
            addCriterion("fdjhmpd =", value, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdNotEqualTo(String value) {
            addCriterion("fdjhmpd <>", value, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdGreaterThan(String value) {
            addCriterion("fdjhmpd >", value, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdGreaterThanOrEqualTo(String value) {
            addCriterion("fdjhmpd >=", value, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdLessThan(String value) {
            addCriterion("fdjhmpd <", value, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdLessThanOrEqualTo(String value) {
            addCriterion("fdjhmpd <=", value, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdLike(String value) {
            addCriterion("fdjhmpd like", value, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdNotLike(String value) {
            addCriterion("fdjhmpd not like", value, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdIn(List<String> values) {
            addCriterion("fdjhmpd in", values, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdNotIn(List<String> values) {
            addCriterion("fdjhmpd not in", values, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdBetween(String value1, String value2) {
            addCriterion("fdjhmpd between", value1, value2, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andFdjhmpdNotBetween(String value1, String value2) {
            addCriterion("fdjhmpd not between", value1, value2, "fdjhmpd");
            return (Criteria) this;
        }

        public Criteria andCsyspdIsNull() {
            addCriterion("csyspd is null");
            return (Criteria) this;
        }

        public Criteria andCsyspdIsNotNull() {
            addCriterion("csyspd is not null");
            return (Criteria) this;
        }

        public Criteria andCsyspdEqualTo(String value) {
            addCriterion("csyspd =", value, "csyspd");
            return (Criteria) this;
        }

        public Criteria andCsyspdNotEqualTo(String value) {
            addCriterion("csyspd <>", value, "csyspd");
            return (Criteria) this;
        }

        public Criteria andCsyspdGreaterThan(String value) {
            addCriterion("csyspd >", value, "csyspd");
            return (Criteria) this;
        }

        public Criteria andCsyspdGreaterThanOrEqualTo(String value) {
            addCriterion("csyspd >=", value, "csyspd");
            return (Criteria) this;
        }

        public Criteria andCsyspdLessThan(String value) {
            addCriterion("csyspd <", value, "csyspd");
            return (Criteria) this;
        }

        public Criteria andCsyspdLessThanOrEqualTo(String value) {
            addCriterion("csyspd <=", value, "csyspd");
            return (Criteria) this;
        }

        public Criteria andCsyspdLike(String value) {
            addCriterion("csyspd like", value, "csyspd");
            return (Criteria) this;
        }

        public Criteria andCsyspdNotLike(String value) {
            addCriterion("csyspd not like", value, "csyspd");
            return (Criteria) this;
        }

        public Criteria andCsyspdIn(List<String> values) {
            addCriterion("csyspd in", values, "csyspd");
            return (Criteria) this;
        }

        public Criteria andCsyspdNotIn(List<String> values) {
            addCriterion("csyspd not in", values, "csyspd");
            return (Criteria) this;
        }

        public Criteria andCsyspdBetween(String value1, String value2) {
            addCriterion("csyspd between", value1, value2, "csyspd");
            return (Criteria) this;
        }

        public Criteria andCsyspdNotBetween(String value1, String value2) {
            addCriterion("csyspd not between", value1, value2, "csyspd");
            return (Criteria) this;
        }

        public Criteria andWkccpdIsNull() {
            addCriterion("wkccpd is null");
            return (Criteria) this;
        }

        public Criteria andWkccpdIsNotNull() {
            addCriterion("wkccpd is not null");
            return (Criteria) this;
        }

        public Criteria andWkccpdEqualTo(String value) {
            addCriterion("wkccpd =", value, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andWkccpdNotEqualTo(String value) {
            addCriterion("wkccpd <>", value, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andWkccpdGreaterThan(String value) {
            addCriterion("wkccpd >", value, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andWkccpdGreaterThanOrEqualTo(String value) {
            addCriterion("wkccpd >=", value, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andWkccpdLessThan(String value) {
            addCriterion("wkccpd <", value, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andWkccpdLessThanOrEqualTo(String value) {
            addCriterion("wkccpd <=", value, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andWkccpdLike(String value) {
            addCriterion("wkccpd like", value, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andWkccpdNotLike(String value) {
            addCriterion("wkccpd not like", value, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andWkccpdIn(List<String> values) {
            addCriterion("wkccpd in", values, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andWkccpdNotIn(List<String> values) {
            addCriterion("wkccpd not in", values, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andWkccpdBetween(String value1, String value2) {
            addCriterion("wkccpd between", value1, value2, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andWkccpdNotBetween(String value1, String value2) {
            addCriterion("wkccpd not between", value1, value2, "wkccpd");
            return (Criteria) this;
        }

        public Criteria andZjpdIsNull() {
            addCriterion("zjpd is null");
            return (Criteria) this;
        }

        public Criteria andZjpdIsNotNull() {
            addCriterion("zjpd is not null");
            return (Criteria) this;
        }

        public Criteria andZjpdEqualTo(String value) {
            addCriterion("zjpd =", value, "zjpd");
            return (Criteria) this;
        }

        public Criteria andZjpdNotEqualTo(String value) {
            addCriterion("zjpd <>", value, "zjpd");
            return (Criteria) this;
        }

        public Criteria andZjpdGreaterThan(String value) {
            addCriterion("zjpd >", value, "zjpd");
            return (Criteria) this;
        }

        public Criteria andZjpdGreaterThanOrEqualTo(String value) {
            addCriterion("zjpd >=", value, "zjpd");
            return (Criteria) this;
        }

        public Criteria andZjpdLessThan(String value) {
            addCriterion("zjpd <", value, "zjpd");
            return (Criteria) this;
        }

        public Criteria andZjpdLessThanOrEqualTo(String value) {
            addCriterion("zjpd <=", value, "zjpd");
            return (Criteria) this;
        }

        public Criteria andZjpdLike(String value) {
            addCriterion("zjpd like", value, "zjpd");
            return (Criteria) this;
        }

        public Criteria andZjpdNotLike(String value) {
            addCriterion("zjpd not like", value, "zjpd");
            return (Criteria) this;
        }

        public Criteria andZjpdIn(List<String> values) {
            addCriterion("zjpd in", values, "zjpd");
            return (Criteria) this;
        }

        public Criteria andZjpdNotIn(List<String> values) {
            addCriterion("zjpd not in", values, "zjpd");
            return (Criteria) this;
        }

        public Criteria andZjpdBetween(String value1, String value2) {
            addCriterion("zjpd between", value1, value2, "zjpd");
            return (Criteria) this;
        }

        public Criteria andZjpdNotBetween(String value1, String value2) {
            addCriterion("zjpd not between", value1, value2, "zjpd");
            return (Criteria) this;
        }

        public Criteria andHdrspdIsNull() {
            addCriterion("hdrspd is null");
            return (Criteria) this;
        }

        public Criteria andHdrspdIsNotNull() {
            addCriterion("hdrspd is not null");
            return (Criteria) this;
        }

        public Criteria andHdrspdEqualTo(String value) {
            addCriterion("hdrspd =", value, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andHdrspdNotEqualTo(String value) {
            addCriterion("hdrspd <>", value, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andHdrspdGreaterThan(String value) {
            addCriterion("hdrspd >", value, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andHdrspdGreaterThanOrEqualTo(String value) {
            addCriterion("hdrspd >=", value, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andHdrspdLessThan(String value) {
            addCriterion("hdrspd <", value, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andHdrspdLessThanOrEqualTo(String value) {
            addCriterion("hdrspd <=", value, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andHdrspdLike(String value) {
            addCriterion("hdrspd like", value, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andHdrspdNotLike(String value) {
            addCriterion("hdrspd not like", value, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andHdrspdIn(List<String> values) {
            addCriterion("hdrspd in", values, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andHdrspdNotIn(List<String> values) {
            addCriterion("hdrspd not in", values, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andHdrspdBetween(String value1, String value2) {
            addCriterion("hdrspd between", value1, value2, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andHdrspdNotBetween(String value1, String value2) {
            addCriterion("hdrspd not between", value1, value2, "hdrspd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdIsNull() {
            addCriterion("lbgdpd is null");
            return (Criteria) this;
        }

        public Criteria andLbgdpdIsNotNull() {
            addCriterion("lbgdpd is not null");
            return (Criteria) this;
        }

        public Criteria andLbgdpdEqualTo(String value) {
            addCriterion("lbgdpd =", value, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdNotEqualTo(String value) {
            addCriterion("lbgdpd <>", value, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdGreaterThan(String value) {
            addCriterion("lbgdpd >", value, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdGreaterThanOrEqualTo(String value) {
            addCriterion("lbgdpd >=", value, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdLessThan(String value) {
            addCriterion("lbgdpd <", value, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdLessThanOrEqualTo(String value) {
            addCriterion("lbgdpd <=", value, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdLike(String value) {
            addCriterion("lbgdpd like", value, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdNotLike(String value) {
            addCriterion("lbgdpd not like", value, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdIn(List<String> values) {
            addCriterion("lbgdpd in", values, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdNotIn(List<String> values) {
            addCriterion("lbgdpd not in", values, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdBetween(String value1, String value2) {
            addCriterion("lbgdpd between", value1, value2, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andLbgdpdNotBetween(String value1, String value2) {
            addCriterion("lbgdpd not between", value1, value2, "lbgdpd");
            return (Criteria) this;
        }

        public Criteria andXjpdIsNull() {
            addCriterion("xjpd is null");
            return (Criteria) this;
        }

        public Criteria andXjpdIsNotNull() {
            addCriterion("xjpd is not null");
            return (Criteria) this;
        }

        public Criteria andXjpdEqualTo(String value) {
            addCriterion("xjpd =", value, "xjpd");
            return (Criteria) this;
        }

        public Criteria andXjpdNotEqualTo(String value) {
            addCriterion("xjpd <>", value, "xjpd");
            return (Criteria) this;
        }

        public Criteria andXjpdGreaterThan(String value) {
            addCriterion("xjpd >", value, "xjpd");
            return (Criteria) this;
        }

        public Criteria andXjpdGreaterThanOrEqualTo(String value) {
            addCriterion("xjpd >=", value, "xjpd");
            return (Criteria) this;
        }

        public Criteria andXjpdLessThan(String value) {
            addCriterion("xjpd <", value, "xjpd");
            return (Criteria) this;
        }

        public Criteria andXjpdLessThanOrEqualTo(String value) {
            addCriterion("xjpd <=", value, "xjpd");
            return (Criteria) this;
        }

        public Criteria andXjpdLike(String value) {
            addCriterion("xjpd like", value, "xjpd");
            return (Criteria) this;
        }

        public Criteria andXjpdNotLike(String value) {
            addCriterion("xjpd not like", value, "xjpd");
            return (Criteria) this;
        }

        public Criteria andXjpdIn(List<String> values) {
            addCriterion("xjpd in", values, "xjpd");
            return (Criteria) this;
        }

        public Criteria andXjpdNotIn(List<String> values) {
            addCriterion("xjpd not in", values, "xjpd");
            return (Criteria) this;
        }

        public Criteria andXjpdBetween(String value1, String value2) {
            addCriterion("xjpd between", value1, value2, "xjpd");
            return (Criteria) this;
        }

        public Criteria andXjpdNotBetween(String value1, String value2) {
            addCriterion("xjpd not between", value1, value2, "xjpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdIsNull() {
            addCriterion("kcckpd is null");
            return (Criteria) this;
        }

        public Criteria andKcckpdIsNotNull() {
            addCriterion("kcckpd is not null");
            return (Criteria) this;
        }

        public Criteria andKcckpdEqualTo(String value) {
            addCriterion("kcckpd =", value, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdNotEqualTo(String value) {
            addCriterion("kcckpd <>", value, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdGreaterThan(String value) {
            addCriterion("kcckpd >", value, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdGreaterThanOrEqualTo(String value) {
            addCriterion("kcckpd >=", value, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdLessThan(String value) {
            addCriterion("kcckpd <", value, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdLessThanOrEqualTo(String value) {
            addCriterion("kcckpd <=", value, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdLike(String value) {
            addCriterion("kcckpd like", value, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdNotLike(String value) {
            addCriterion("kcckpd not like", value, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdIn(List<String> values) {
            addCriterion("kcckpd in", values, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdNotIn(List<String> values) {
            addCriterion("kcckpd not in", values, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdBetween(String value1, String value2) {
            addCriterion("kcckpd between", value1, value2, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKcckpdNotBetween(String value1, String value2) {
            addCriterion("kcckpd not between", value1, value2, "kcckpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdIsNull() {
            addCriterion("kccktdpd is null");
            return (Criteria) this;
        }

        public Criteria andKccktdpdIsNotNull() {
            addCriterion("kccktdpd is not null");
            return (Criteria) this;
        }

        public Criteria andKccktdpdEqualTo(String value) {
            addCriterion("kccktdpd =", value, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdNotEqualTo(String value) {
            addCriterion("kccktdpd <>", value, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdGreaterThan(String value) {
            addCriterion("kccktdpd >", value, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdGreaterThanOrEqualTo(String value) {
            addCriterion("kccktdpd >=", value, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdLessThan(String value) {
            addCriterion("kccktdpd <", value, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdLessThanOrEqualTo(String value) {
            addCriterion("kccktdpd <=", value, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdLike(String value) {
            addCriterion("kccktdpd like", value, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdNotLike(String value) {
            addCriterion("kccktdpd not like", value, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdIn(List<String> values) {
            addCriterion("kccktdpd in", values, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdNotIn(List<String> values) {
            addCriterion("kccktdpd not in", values, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdBetween(String value1, String value2) {
            addCriterion("kccktdpd between", value1, value2, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andKccktdpdNotBetween(String value1, String value2) {
            addCriterion("kccktdpd not between", value1, value2, "kccktdpd");
            return (Criteria) this;
        }

        public Criteria andHxpdIsNull() {
            addCriterion("hxpd is null");
            return (Criteria) this;
        }

        public Criteria andHxpdIsNotNull() {
            addCriterion("hxpd is not null");
            return (Criteria) this;
        }

        public Criteria andHxpdEqualTo(String value) {
            addCriterion("hxpd =", value, "hxpd");
            return (Criteria) this;
        }

        public Criteria andHxpdNotEqualTo(String value) {
            addCriterion("hxpd <>", value, "hxpd");
            return (Criteria) this;
        }

        public Criteria andHxpdGreaterThan(String value) {
            addCriterion("hxpd >", value, "hxpd");
            return (Criteria) this;
        }

        public Criteria andHxpdGreaterThanOrEqualTo(String value) {
            addCriterion("hxpd >=", value, "hxpd");
            return (Criteria) this;
        }

        public Criteria andHxpdLessThan(String value) {
            addCriterion("hxpd <", value, "hxpd");
            return (Criteria) this;
        }

        public Criteria andHxpdLessThanOrEqualTo(String value) {
            addCriterion("hxpd <=", value, "hxpd");
            return (Criteria) this;
        }

        public Criteria andHxpdLike(String value) {
            addCriterion("hxpd like", value, "hxpd");
            return (Criteria) this;
        }

        public Criteria andHxpdNotLike(String value) {
            addCriterion("hxpd not like", value, "hxpd");
            return (Criteria) this;
        }

        public Criteria andHxpdIn(List<String> values) {
            addCriterion("hxpd in", values, "hxpd");
            return (Criteria) this;
        }

        public Criteria andHxpdNotIn(List<String> values) {
            addCriterion("hxpd not in", values, "hxpd");
            return (Criteria) this;
        }

        public Criteria andHxpdBetween(String value1, String value2) {
            addCriterion("hxpd between", value1, value2, "hxpd");
            return (Criteria) this;
        }

        public Criteria andHxpdNotBetween(String value1, String value2) {
            addCriterion("hxpd not between", value1, value2, "hxpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdIsNull() {
            addCriterion("cswgpd is null");
            return (Criteria) this;
        }

        public Criteria andCswgpdIsNotNull() {
            addCriterion("cswgpd is not null");
            return (Criteria) this;
        }

        public Criteria andCswgpdEqualTo(String value) {
            addCriterion("cswgpd =", value, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdNotEqualTo(String value) {
            addCriterion("cswgpd <>", value, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdGreaterThan(String value) {
            addCriterion("cswgpd >", value, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdGreaterThanOrEqualTo(String value) {
            addCriterion("cswgpd >=", value, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdLessThan(String value) {
            addCriterion("cswgpd <", value, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdLessThanOrEqualTo(String value) {
            addCriterion("cswgpd <=", value, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdLike(String value) {
            addCriterion("cswgpd like", value, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdNotLike(String value) {
            addCriterion("cswgpd not like", value, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdIn(List<String> values) {
            addCriterion("cswgpd in", values, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdNotIn(List<String> values) {
            addCriterion("cswgpd not in", values, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdBetween(String value1, String value2) {
            addCriterion("cswgpd between", value1, value2, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andCswgpdNotBetween(String value1, String value2) {
            addCriterion("cswgpd not between", value1, value2, "cswgpd");
            return (Criteria) this;
        }

        public Criteria andWgbspdIsNull() {
            addCriterion("wgbspd is null");
            return (Criteria) this;
        }

        public Criteria andWgbspdIsNotNull() {
            addCriterion("wgbspd is not null");
            return (Criteria) this;
        }

        public Criteria andWgbspdEqualTo(String value) {
            addCriterion("wgbspd =", value, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWgbspdNotEqualTo(String value) {
            addCriterion("wgbspd <>", value, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWgbspdGreaterThan(String value) {
            addCriterion("wgbspd >", value, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWgbspdGreaterThanOrEqualTo(String value) {
            addCriterion("wgbspd >=", value, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWgbspdLessThan(String value) {
            addCriterion("wgbspd <", value, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWgbspdLessThanOrEqualTo(String value) {
            addCriterion("wgbspd <=", value, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWgbspdLike(String value) {
            addCriterion("wgbspd like", value, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWgbspdNotLike(String value) {
            addCriterion("wgbspd not like", value, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWgbspdIn(List<String> values) {
            addCriterion("wgbspd in", values, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWgbspdNotIn(List<String> values) {
            addCriterion("wgbspd not in", values, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWgbspdBetween(String value1, String value2) {
            addCriterion("wgbspd between", value1, value2, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWgbspdNotBetween(String value1, String value2) {
            addCriterion("wgbspd not between", value1, value2, "wgbspd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdIsNull() {
            addCriterion("wbzmpd is null");
            return (Criteria) this;
        }

        public Criteria andWbzmpdIsNotNull() {
            addCriterion("wbzmpd is not null");
            return (Criteria) this;
        }

        public Criteria andWbzmpdEqualTo(String value) {
            addCriterion("wbzmpd =", value, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdNotEqualTo(String value) {
            addCriterion("wbzmpd <>", value, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdGreaterThan(String value) {
            addCriterion("wbzmpd >", value, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdGreaterThanOrEqualTo(String value) {
            addCriterion("wbzmpd >=", value, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdLessThan(String value) {
            addCriterion("wbzmpd <", value, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdLessThanOrEqualTo(String value) {
            addCriterion("wbzmpd <=", value, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdLike(String value) {
            addCriterion("wbzmpd like", value, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdNotLike(String value) {
            addCriterion("wbzmpd not like", value, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdIn(List<String> values) {
            addCriterion("wbzmpd in", values, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdNotIn(List<String> values) {
            addCriterion("wbzmpd not in", values, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdBetween(String value1, String value2) {
            addCriterion("wbzmpd between", value1, value2, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andWbzmpdNotBetween(String value1, String value2) {
            addCriterion("wbzmpd not between", value1, value2, "wbzmpd");
            return (Criteria) this;
        }

        public Criteria andLtpdIsNull() {
            addCriterion("ltpd is null");
            return (Criteria) this;
        }

        public Criteria andLtpdIsNotNull() {
            addCriterion("ltpd is not null");
            return (Criteria) this;
        }

        public Criteria andLtpdEqualTo(String value) {
            addCriterion("ltpd =", value, "ltpd");
            return (Criteria) this;
        }

        public Criteria andLtpdNotEqualTo(String value) {
            addCriterion("ltpd <>", value, "ltpd");
            return (Criteria) this;
        }

        public Criteria andLtpdGreaterThan(String value) {
            addCriterion("ltpd >", value, "ltpd");
            return (Criteria) this;
        }

        public Criteria andLtpdGreaterThanOrEqualTo(String value) {
            addCriterion("ltpd >=", value, "ltpd");
            return (Criteria) this;
        }

        public Criteria andLtpdLessThan(String value) {
            addCriterion("ltpd <", value, "ltpd");
            return (Criteria) this;
        }

        public Criteria andLtpdLessThanOrEqualTo(String value) {
            addCriterion("ltpd <=", value, "ltpd");
            return (Criteria) this;
        }

        public Criteria andLtpdLike(String value) {
            addCriterion("ltpd like", value, "ltpd");
            return (Criteria) this;
        }

        public Criteria andLtpdNotLike(String value) {
            addCriterion("ltpd not like", value, "ltpd");
            return (Criteria) this;
        }

        public Criteria andLtpdIn(List<String> values) {
            addCriterion("ltpd in", values, "ltpd");
            return (Criteria) this;
        }

        public Criteria andLtpdNotIn(List<String> values) {
            addCriterion("ltpd not in", values, "ltpd");
            return (Criteria) this;
        }

        public Criteria andLtpdBetween(String value1, String value2) {
            addCriterion("ltpd between", value1, value2, "ltpd");
            return (Criteria) this;
        }

        public Criteria andLtpdNotBetween(String value1, String value2) {
            addCriterion("ltpd not between", value1, value2, "ltpd");
            return (Criteria) this;
        }

        public Criteria andHppdIsNull() {
            addCriterion("hppd is null");
            return (Criteria) this;
        }

        public Criteria andHppdIsNotNull() {
            addCriterion("hppd is not null");
            return (Criteria) this;
        }

        public Criteria andHppdEqualTo(String value) {
            addCriterion("hppd =", value, "hppd");
            return (Criteria) this;
        }

        public Criteria andHppdNotEqualTo(String value) {
            addCriterion("hppd <>", value, "hppd");
            return (Criteria) this;
        }

        public Criteria andHppdGreaterThan(String value) {
            addCriterion("hppd >", value, "hppd");
            return (Criteria) this;
        }

        public Criteria andHppdGreaterThanOrEqualTo(String value) {
            addCriterion("hppd >=", value, "hppd");
            return (Criteria) this;
        }

        public Criteria andHppdLessThan(String value) {
            addCriterion("hppd <", value, "hppd");
            return (Criteria) this;
        }

        public Criteria andHppdLessThanOrEqualTo(String value) {
            addCriterion("hppd <=", value, "hppd");
            return (Criteria) this;
        }

        public Criteria andHppdLike(String value) {
            addCriterion("hppd like", value, "hppd");
            return (Criteria) this;
        }

        public Criteria andHppdNotLike(String value) {
            addCriterion("hppd not like", value, "hppd");
            return (Criteria) this;
        }

        public Criteria andHppdIn(List<String> values) {
            addCriterion("hppd in", values, "hppd");
            return (Criteria) this;
        }

        public Criteria andHppdNotIn(List<String> values) {
            addCriterion("hppd not in", values, "hppd");
            return (Criteria) this;
        }

        public Criteria andHppdBetween(String value1, String value2) {
            addCriterion("hppd between", value1, value2, "hppd");
            return (Criteria) this;
        }

        public Criteria andHppdNotBetween(String value1, String value2) {
            addCriterion("hppd not between", value1, value2, "hppd");
            return (Criteria) this;
        }

        public Criteria andJzpdIsNull() {
            addCriterion("jzpd is null");
            return (Criteria) this;
        }

        public Criteria andJzpdIsNotNull() {
            addCriterion("jzpd is not null");
            return (Criteria) this;
        }

        public Criteria andJzpdEqualTo(String value) {
            addCriterion("jzpd =", value, "jzpd");
            return (Criteria) this;
        }

        public Criteria andJzpdNotEqualTo(String value) {
            addCriterion("jzpd <>", value, "jzpd");
            return (Criteria) this;
        }

        public Criteria andJzpdGreaterThan(String value) {
            addCriterion("jzpd >", value, "jzpd");
            return (Criteria) this;
        }

        public Criteria andJzpdGreaterThanOrEqualTo(String value) {
            addCriterion("jzpd >=", value, "jzpd");
            return (Criteria) this;
        }

        public Criteria andJzpdLessThan(String value) {
            addCriterion("jzpd <", value, "jzpd");
            return (Criteria) this;
        }

        public Criteria andJzpdLessThanOrEqualTo(String value) {
            addCriterion("jzpd <=", value, "jzpd");
            return (Criteria) this;
        }

        public Criteria andJzpdLike(String value) {
            addCriterion("jzpd like", value, "jzpd");
            return (Criteria) this;
        }

        public Criteria andJzpdNotLike(String value) {
            addCriterion("jzpd not like", value, "jzpd");
            return (Criteria) this;
        }

        public Criteria andJzpdIn(List<String> values) {
            addCriterion("jzpd in", values, "jzpd");
            return (Criteria) this;
        }

        public Criteria andJzpdNotIn(List<String> values) {
            addCriterion("jzpd not in", values, "jzpd");
            return (Criteria) this;
        }

        public Criteria andJzpdBetween(String value1, String value2) {
            addCriterion("jzpd between", value1, value2, "jzpd");
            return (Criteria) this;
        }

        public Criteria andJzpdNotBetween(String value1, String value2) {
            addCriterion("jzpd not between", value1, value2, "jzpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdIsNull() {
            addCriterion("qcaqdpd is null");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdIsNotNull() {
            addCriterion("qcaqdpd is not null");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdEqualTo(String value) {
            addCriterion("qcaqdpd =", value, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdNotEqualTo(String value) {
            addCriterion("qcaqdpd <>", value, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdGreaterThan(String value) {
            addCriterion("qcaqdpd >", value, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdGreaterThanOrEqualTo(String value) {
            addCriterion("qcaqdpd >=", value, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdLessThan(String value) {
            addCriterion("qcaqdpd <", value, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdLessThanOrEqualTo(String value) {
            addCriterion("qcaqdpd <=", value, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdLike(String value) {
            addCriterion("qcaqdpd like", value, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdNotLike(String value) {
            addCriterion("qcaqdpd not like", value, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdIn(List<String> values) {
            addCriterion("qcaqdpd in", values, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdNotIn(List<String> values) {
            addCriterion("qcaqdpd not in", values, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdBetween(String value1, String value2) {
            addCriterion("qcaqdpd between", value1, value2, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andQcaqdpdNotBetween(String value1, String value2) {
            addCriterion("qcaqdpd not between", value1, value2, "qcaqdpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdIsNull() {
            addCriterion("yjtcaqftpd is null");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdIsNotNull() {
            addCriterion("yjtcaqftpd is not null");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdEqualTo(String value) {
            addCriterion("yjtcaqftpd =", value, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdNotEqualTo(String value) {
            addCriterion("yjtcaqftpd <>", value, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdGreaterThan(String value) {
            addCriterion("yjtcaqftpd >", value, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdGreaterThanOrEqualTo(String value) {
            addCriterion("yjtcaqftpd >=", value, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdLessThan(String value) {
            addCriterion("yjtcaqftpd <", value, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdLessThanOrEqualTo(String value) {
            addCriterion("yjtcaqftpd <=", value, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdLike(String value) {
            addCriterion("yjtcaqftpd like", value, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdNotLike(String value) {
            addCriterion("yjtcaqftpd not like", value, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdIn(List<String> values) {
            addCriterion("yjtcaqftpd in", values, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdNotIn(List<String> values) {
            addCriterion("yjtcaqftpd not in", values, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdBetween(String value1, String value2) {
            addCriterion("yjtcaqftpd between", value1, value2, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andYjtcaqftpdNotBetween(String value1, String value2) {
            addCriterion("yjtcaqftpd not between", value1, value2, "yjtcaqftpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdIsNull() {
            addCriterion("mhqpd is null");
            return (Criteria) this;
        }

        public Criteria andMhqpdIsNotNull() {
            addCriterion("mhqpd is not null");
            return (Criteria) this;
        }

        public Criteria andMhqpdEqualTo(String value) {
            addCriterion("mhqpd =", value, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdNotEqualTo(String value) {
            addCriterion("mhqpd <>", value, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdGreaterThan(String value) {
            addCriterion("mhqpd >", value, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdGreaterThanOrEqualTo(String value) {
            addCriterion("mhqpd >=", value, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdLessThan(String value) {
            addCriterion("mhqpd <", value, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdLessThanOrEqualTo(String value) {
            addCriterion("mhqpd <=", value, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdLike(String value) {
            addCriterion("mhqpd like", value, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdNotLike(String value) {
            addCriterion("mhqpd not like", value, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdIn(List<String> values) {
            addCriterion("mhqpd in", values, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdNotIn(List<String> values) {
            addCriterion("mhqpd not in", values, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdBetween(String value1, String value2) {
            addCriterion("mhqpd between", value1, value2, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andMhqpdNotBetween(String value1, String value2) {
            addCriterion("mhqpd not between", value1, value2, "mhqpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdIsNull() {
            addCriterion("xsjlzzpd is null");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdIsNotNull() {
            addCriterion("xsjlzzpd is not null");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdEqualTo(String value) {
            addCriterion("xsjlzzpd =", value, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdNotEqualTo(String value) {
            addCriterion("xsjlzzpd <>", value, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdGreaterThan(String value) {
            addCriterion("xsjlzzpd >", value, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdGreaterThanOrEqualTo(String value) {
            addCriterion("xsjlzzpd >=", value, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdLessThan(String value) {
            addCriterion("xsjlzzpd <", value, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdLessThanOrEqualTo(String value) {
            addCriterion("xsjlzzpd <=", value, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdLike(String value) {
            addCriterion("xsjlzzpd like", value, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdNotLike(String value) {
            addCriterion("xsjlzzpd not like", value, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdIn(List<String> values) {
            addCriterion("xsjlzzpd in", values, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdNotIn(List<String> values) {
            addCriterion("xsjlzzpd not in", values, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdBetween(String value1, String value2) {
            addCriterion("xsjlzzpd between", value1, value2, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andXsjlzzpdNotBetween(String value1, String value2) {
            addCriterion("xsjlzzpd not between", value1, value2, "xsjlzzpd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdIsNull() {
            addCriterion("csfgbspd is null");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdIsNotNull() {
            addCriterion("csfgbspd is not null");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdEqualTo(String value) {
            addCriterion("csfgbspd =", value, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdNotEqualTo(String value) {
            addCriterion("csfgbspd <>", value, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdGreaterThan(String value) {
            addCriterion("csfgbspd >", value, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdGreaterThanOrEqualTo(String value) {
            addCriterion("csfgbspd >=", value, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdLessThan(String value) {
            addCriterion("csfgbspd <", value, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdLessThanOrEqualTo(String value) {
            addCriterion("csfgbspd <=", value, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdLike(String value) {
            addCriterion("csfgbspd like", value, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdNotLike(String value) {
            addCriterion("csfgbspd not like", value, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdIn(List<String> values) {
            addCriterion("csfgbspd in", values, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdNotIn(List<String> values) {
            addCriterion("csfgbspd not in", values, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdBetween(String value1, String value2) {
            addCriterion("csfgbspd between", value1, value2, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andCsfgbspdNotBetween(String value1, String value2) {
            addCriterion("csfgbspd not between", value1, value2, "csfgbspd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdIsNull() {
            addCriterion("clwbbzbpd is null");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdIsNotNull() {
            addCriterion("clwbbzbpd is not null");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdEqualTo(String value) {
            addCriterion("clwbbzbpd =", value, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdNotEqualTo(String value) {
            addCriterion("clwbbzbpd <>", value, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdGreaterThan(String value) {
            addCriterion("clwbbzbpd >", value, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdGreaterThanOrEqualTo(String value) {
            addCriterion("clwbbzbpd >=", value, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdLessThan(String value) {
            addCriterion("clwbbzbpd <", value, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdLessThanOrEqualTo(String value) {
            addCriterion("clwbbzbpd <=", value, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdLike(String value) {
            addCriterion("clwbbzbpd like", value, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdNotLike(String value) {
            addCriterion("clwbbzbpd not like", value, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdIn(List<String> values) {
            addCriterion("clwbbzbpd in", values, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdNotIn(List<String> values) {
            addCriterion("clwbbzbpd not in", values, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdBetween(String value1, String value2) {
            addCriterion("clwbbzbpd between", value1, value2, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andClwbbzbpdNotBetween(String value1, String value2) {
            addCriterion("clwbbzbpd not between", value1, value2, "clwbbzbpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdIsNull() {
            addCriterion("chqxbfhpd is null");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdIsNotNull() {
            addCriterion("chqxbfhpd is not null");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdEqualTo(String value) {
            addCriterion("chqxbfhpd =", value, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdNotEqualTo(String value) {
            addCriterion("chqxbfhpd <>", value, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdGreaterThan(String value) {
            addCriterion("chqxbfhpd >", value, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdGreaterThanOrEqualTo(String value) {
            addCriterion("chqxbfhpd >=", value, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdLessThan(String value) {
            addCriterion("chqxbfhpd <", value, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdLessThanOrEqualTo(String value) {
            addCriterion("chqxbfhpd <=", value, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdLike(String value) {
            addCriterion("chqxbfhpd like", value, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdNotLike(String value) {
            addCriterion("chqxbfhpd not like", value, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdIn(List<String> values) {
            addCriterion("chqxbfhpd in", values, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdNotIn(List<String> values) {
            addCriterion("chqxbfhpd not in", values, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdBetween(String value1, String value2) {
            addCriterion("chqxbfhpd between", value1, value2, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andChqxbfhpdNotBetween(String value1, String value2) {
            addCriterion("chqxbfhpd not between", value1, value2, "chqxbfhpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdIsNull() {
            addCriterion("yjcpd is null");
            return (Criteria) this;
        }

        public Criteria andYjcpdIsNotNull() {
            addCriterion("yjcpd is not null");
            return (Criteria) this;
        }

        public Criteria andYjcpdEqualTo(String value) {
            addCriterion("yjcpd =", value, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdNotEqualTo(String value) {
            addCriterion("yjcpd <>", value, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdGreaterThan(String value) {
            addCriterion("yjcpd >", value, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdGreaterThanOrEqualTo(String value) {
            addCriterion("yjcpd >=", value, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdLessThan(String value) {
            addCriterion("yjcpd <", value, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdLessThanOrEqualTo(String value) {
            addCriterion("yjcpd <=", value, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdLike(String value) {
            addCriterion("yjcpd like", value, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdNotLike(String value) {
            addCriterion("yjcpd not like", value, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdIn(List<String> values) {
            addCriterion("yjcpd in", values, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdNotIn(List<String> values) {
            addCriterion("yjcpd not in", values, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdBetween(String value1, String value2) {
            addCriterion("yjcpd between", value1, value2, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andYjcpdNotBetween(String value1, String value2) {
            addCriterion("yjcpd not between", value1, value2, "yjcpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdIsNull() {
            addCriterion("csxzpd is null");
            return (Criteria) this;
        }

        public Criteria andCsxzpdIsNotNull() {
            addCriterion("csxzpd is not null");
            return (Criteria) this;
        }

        public Criteria andCsxzpdEqualTo(String value) {
            addCriterion("csxzpd =", value, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdNotEqualTo(String value) {
            addCriterion("csxzpd <>", value, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdGreaterThan(String value) {
            addCriterion("csxzpd >", value, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdGreaterThanOrEqualTo(String value) {
            addCriterion("csxzpd >=", value, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdLessThan(String value) {
            addCriterion("csxzpd <", value, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdLessThanOrEqualTo(String value) {
            addCriterion("csxzpd <=", value, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdLike(String value) {
            addCriterion("csxzpd like", value, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdNotLike(String value) {
            addCriterion("csxzpd not like", value, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdIn(List<String> values) {
            addCriterion("csxzpd in", values, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdNotIn(List<String> values) {
            addCriterion("csxzpd not in", values, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdBetween(String value1, String value2) {
            addCriterion("csxzpd between", value1, value2, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andCsxzpdNotBetween(String value1, String value2) {
            addCriterion("csxzpd not between", value1, value2, "csxzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdIsNull() {
            addCriterion("fbzdzzpd is null");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdIsNotNull() {
            addCriterion("fbzdzzpd is not null");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdEqualTo(String value) {
            addCriterion("fbzdzzpd =", value, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdNotEqualTo(String value) {
            addCriterion("fbzdzzpd <>", value, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdGreaterThan(String value) {
            addCriterion("fbzdzzpd >", value, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdGreaterThanOrEqualTo(String value) {
            addCriterion("fbzdzzpd >=", value, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdLessThan(String value) {
            addCriterion("fbzdzzpd <", value, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdLessThanOrEqualTo(String value) {
            addCriterion("fbzdzzpd <=", value, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdLike(String value) {
            addCriterion("fbzdzzpd like", value, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdNotLike(String value) {
            addCriterion("fbzdzzpd not like", value, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdIn(List<String> values) {
            addCriterion("fbzdzzpd in", values, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdNotIn(List<String> values) {
            addCriterion("fbzdzzpd not in", values, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdBetween(String value1, String value2) {
            addCriterion("fbzdzzpd between", value1, value2, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFbzdzzpdNotBetween(String value1, String value2) {
            addCriterion("fbzdzzpd not between", value1, value2, "fbzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdIsNull() {
            addCriterion("fzzdzzpd is null");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdIsNotNull() {
            addCriterion("fzzdzzpd is not null");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdEqualTo(String value) {
            addCriterion("fzzdzzpd =", value, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdNotEqualTo(String value) {
            addCriterion("fzzdzzpd <>", value, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdGreaterThan(String value) {
            addCriterion("fzzdzzpd >", value, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdGreaterThanOrEqualTo(String value) {
            addCriterion("fzzdzzpd >=", value, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdLessThan(String value) {
            addCriterion("fzzdzzpd <", value, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdLessThanOrEqualTo(String value) {
            addCriterion("fzzdzzpd <=", value, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdLike(String value) {
            addCriterion("fzzdzzpd like", value, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdNotLike(String value) {
            addCriterion("fzzdzzpd not like", value, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdIn(List<String> values) {
            addCriterion("fzzdzzpd in", values, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdNotIn(List<String> values) {
            addCriterion("fzzdzzpd not in", values, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdBetween(String value1, String value2) {
            addCriterion("fzzdzzpd between", value1, value2, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andFzzdzzpdNotBetween(String value1, String value2) {
            addCriterion("fzzdzzpd not between", value1, value2, "fzzdzzpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdIsNull() {
            addCriterion("pszdqpd is null");
            return (Criteria) this;
        }

        public Criteria andPszdqpdIsNotNull() {
            addCriterion("pszdqpd is not null");
            return (Criteria) this;
        }

        public Criteria andPszdqpdEqualTo(String value) {
            addCriterion("pszdqpd =", value, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdNotEqualTo(String value) {
            addCriterion("pszdqpd <>", value, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdGreaterThan(String value) {
            addCriterion("pszdqpd >", value, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdGreaterThanOrEqualTo(String value) {
            addCriterion("pszdqpd >=", value, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdLessThan(String value) {
            addCriterion("pszdqpd <", value, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdLessThanOrEqualTo(String value) {
            addCriterion("pszdqpd <=", value, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdLike(String value) {
            addCriterion("pszdqpd like", value, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdNotLike(String value) {
            addCriterion("pszdqpd not like", value, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdIn(List<String> values) {
            addCriterion("pszdqpd in", values, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdNotIn(List<String> values) {
            addCriterion("pszdqpd not in", values, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdBetween(String value1, String value2) {
            addCriterion("pszdqpd between", value1, value2, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andPszdqpdNotBetween(String value1, String value2) {
            addCriterion("pszdqpd not between", value1, value2, "pszdqpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdIsNull() {
            addCriterion("zdjxzdtzzzpd is null");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdIsNotNull() {
            addCriterion("zdjxzdtzzzpd is not null");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdEqualTo(String value) {
            addCriterion("zdjxzdtzzzpd =", value, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdNotEqualTo(String value) {
            addCriterion("zdjxzdtzzzpd <>", value, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdGreaterThan(String value) {
            addCriterion("zdjxzdtzzzpd >", value, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdGreaterThanOrEqualTo(String value) {
            addCriterion("zdjxzdtzzzpd >=", value, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdLessThan(String value) {
            addCriterion("zdjxzdtzzzpd <", value, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdLessThanOrEqualTo(String value) {
            addCriterion("zdjxzdtzzzpd <=", value, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdLike(String value) {
            addCriterion("zdjxzdtzzzpd like", value, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdNotLike(String value) {
            addCriterion("zdjxzdtzzzpd not like", value, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdIn(List<String> values) {
            addCriterion("zdjxzdtzzzpd in", values, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdNotIn(List<String> values) {
            addCriterion("zdjxzdtzzzpd not in", values, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdBetween(String value1, String value2) {
            addCriterion("zdjxzdtzzzpd between", value1, value2, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andZdjxzdtzzzpdNotBetween(String value1, String value2) {
            addCriterion("zdjxzdtzzzpd not between", value1, value2, "zdjxzdtzzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdIsNull() {
            addCriterion("jjqdzzpd is null");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdIsNotNull() {
            addCriterion("jjqdzzpd is not null");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdEqualTo(String value) {
            addCriterion("jjqdzzpd =", value, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdNotEqualTo(String value) {
            addCriterion("jjqdzzpd <>", value, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdGreaterThan(String value) {
            addCriterion("jjqdzzpd >", value, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdGreaterThanOrEqualTo(String value) {
            addCriterion("jjqdzzpd >=", value, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdLessThan(String value) {
            addCriterion("jjqdzzpd <", value, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdLessThanOrEqualTo(String value) {
            addCriterion("jjqdzzpd <=", value, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdLike(String value) {
            addCriterion("jjqdzzpd like", value, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdNotLike(String value) {
            addCriterion("jjqdzzpd not like", value, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdIn(List<String> values) {
            addCriterion("jjqdzzpd in", values, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdNotIn(List<String> values) {
            addCriterion("jjqdzzpd not in", values, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdBetween(String value1, String value2) {
            addCriterion("jjqdzzpd between", value1, value2, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andJjqdzzpdNotBetween(String value1, String value2) {
            addCriterion("jjqdzzpd not between", value1, value2, "jjqdzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdIsNull() {
            addCriterion("fdjczdmhzzpd is null");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdIsNotNull() {
            addCriterion("fdjczdmhzzpd is not null");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdEqualTo(String value) {
            addCriterion("fdjczdmhzzpd =", value, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdNotEqualTo(String value) {
            addCriterion("fdjczdmhzzpd <>", value, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdGreaterThan(String value) {
            addCriterion("fdjczdmhzzpd >", value, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdGreaterThanOrEqualTo(String value) {
            addCriterion("fdjczdmhzzpd >=", value, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdLessThan(String value) {
            addCriterion("fdjczdmhzzpd <", value, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdLessThanOrEqualTo(String value) {
            addCriterion("fdjczdmhzzpd <=", value, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdLike(String value) {
            addCriterion("fdjczdmhzzpd like", value, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdNotLike(String value) {
            addCriterion("fdjczdmhzzpd not like", value, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdIn(List<String> values) {
            addCriterion("fdjczdmhzzpd in", values, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdNotIn(List<String> values) {
            addCriterion("fdjczdmhzzpd not in", values, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdBetween(String value1, String value2) {
            addCriterion("fdjczdmhzzpd between", value1, value2, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andFdjczdmhzzpdNotBetween(String value1, String value2) {
            addCriterion("fdjczdmhzzpd not between", value1, value2, "fdjczdmhzzpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdIsNull() {
            addCriterion("sdjxddkgpd is null");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdIsNotNull() {
            addCriterion("sdjxddkgpd is not null");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdEqualTo(String value) {
            addCriterion("sdjxddkgpd =", value, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdNotEqualTo(String value) {
            addCriterion("sdjxddkgpd <>", value, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdGreaterThan(String value) {
            addCriterion("sdjxddkgpd >", value, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdGreaterThanOrEqualTo(String value) {
            addCriterion("sdjxddkgpd >=", value, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdLessThan(String value) {
            addCriterion("sdjxddkgpd <", value, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdLessThanOrEqualTo(String value) {
            addCriterion("sdjxddkgpd <=", value, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdLike(String value) {
            addCriterion("sdjxddkgpd like", value, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdNotLike(String value) {
            addCriterion("sdjxddkgpd not like", value, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdIn(List<String> values) {
            addCriterion("sdjxddkgpd in", values, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdNotIn(List<String> values) {
            addCriterion("sdjxddkgpd not in", values, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdBetween(String value1, String value2) {
            addCriterion("sdjxddkgpd between", value1, value2, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andSdjxddkgpdNotBetween(String value1, String value2) {
            addCriterion("sdjxddkgpd not between", value1, value2, "sdjxddkgpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdIsNull() {
            addCriterion("fzdtbpd is null");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdIsNotNull() {
            addCriterion("fzdtbpd is not null");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdEqualTo(String value) {
            addCriterion("fzdtbpd =", value, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdNotEqualTo(String value) {
            addCriterion("fzdtbpd <>", value, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdGreaterThan(String value) {
            addCriterion("fzdtbpd >", value, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdGreaterThanOrEqualTo(String value) {
            addCriterion("fzdtbpd >=", value, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdLessThan(String value) {
            addCriterion("fzdtbpd <", value, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdLessThanOrEqualTo(String value) {
            addCriterion("fzdtbpd <=", value, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdLike(String value) {
            addCriterion("fzdtbpd like", value, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdNotLike(String value) {
            addCriterion("fzdtbpd not like", value, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdIn(List<String> values) {
            addCriterion("fzdtbpd in", values, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdNotIn(List<String> values) {
            addCriterion("fzdtbpd not in", values, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdBetween(String value1, String value2) {
            addCriterion("fzdtbpd between", value1, value2, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andFzdtbpdNotBetween(String value1, String value2) {
            addCriterion("fzdtbpd not between", value1, value2, "fzdtbpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdIsNull() {
            addCriterion("xcbzdpd is null");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdIsNotNull() {
            addCriterion("xcbzdpd is not null");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdEqualTo(String value) {
            addCriterion("xcbzdpd =", value, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdNotEqualTo(String value) {
            addCriterion("xcbzdpd <>", value, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdGreaterThan(String value) {
            addCriterion("xcbzdpd >", value, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdGreaterThanOrEqualTo(String value) {
            addCriterion("xcbzdpd >=", value, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdLessThan(String value) {
            addCriterion("xcbzdpd <", value, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdLessThanOrEqualTo(String value) {
            addCriterion("xcbzdpd <=", value, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdLike(String value) {
            addCriterion("xcbzdpd like", value, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdNotLike(String value) {
            addCriterion("xcbzdpd not like", value, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdIn(List<String> values) {
            addCriterion("xcbzdpd in", values, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdNotIn(List<String> values) {
            addCriterion("xcbzdpd not in", values, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdBetween(String value1, String value2) {
            addCriterion("xcbzdpd between", value1, value2, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andXcbzdpdNotBetween(String value1, String value2) {
            addCriterion("xcbzdpd not between", value1, value2, "xcbzdpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdIsNull() {
            addCriterion("wxhwysclbzpd is null");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdIsNotNull() {
            addCriterion("wxhwysclbzpd is not null");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdEqualTo(String value) {
            addCriterion("wxhwysclbzpd =", value, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdNotEqualTo(String value) {
            addCriterion("wxhwysclbzpd <>", value, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdGreaterThan(String value) {
            addCriterion("wxhwysclbzpd >", value, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdGreaterThanOrEqualTo(String value) {
            addCriterion("wxhwysclbzpd >=", value, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdLessThan(String value) {
            addCriterion("wxhwysclbzpd <", value, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdLessThanOrEqualTo(String value) {
            addCriterion("wxhwysclbzpd <=", value, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdLike(String value) {
            addCriterion("wxhwysclbzpd like", value, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdNotLike(String value) {
            addCriterion("wxhwysclbzpd not like", value, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdIn(List<String> values) {
            addCriterion("wxhwysclbzpd in", values, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdNotIn(List<String> values) {
            addCriterion("wxhwysclbzpd not in", values, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdBetween(String value1, String value2) {
            addCriterion("wxhwysclbzpd between", value1, value2, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andWxhwysclbzpdNotBetween(String value1, String value2) {
            addCriterion("wxhwysclbzpd not between", value1, value2, "wxhwysclbzpd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdIsNull() {
            addCriterion("jsqglsspd is null");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdIsNotNull() {
            addCriterion("jsqglsspd is not null");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdEqualTo(String value) {
            addCriterion("jsqglsspd =", value, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdNotEqualTo(String value) {
            addCriterion("jsqglsspd <>", value, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdGreaterThan(String value) {
            addCriterion("jsqglsspd >", value, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdGreaterThanOrEqualTo(String value) {
            addCriterion("jsqglsspd >=", value, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdLessThan(String value) {
            addCriterion("jsqglsspd <", value, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdLessThanOrEqualTo(String value) {
            addCriterion("jsqglsspd <=", value, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdLike(String value) {
            addCriterion("jsqglsspd like", value, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdNotLike(String value) {
            addCriterion("jsqglsspd not like", value, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdIn(List<String> values) {
            addCriterion("jsqglsspd in", values, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdNotIn(List<String> values) {
            addCriterion("jsqglsspd not in", values, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdBetween(String value1, String value2) {
            addCriterion("jsqglsspd between", value1, value2, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andJsqglsspdNotBetween(String value1, String value2) {
            addCriterion("jsqglsspd not between", value1, value2, "jsqglsspd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdIsNull() {
            addCriterion("ztcjrpd is null");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdIsNotNull() {
            addCriterion("ztcjrpd is not null");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdEqualTo(String value) {
            addCriterion("ztcjrpd =", value, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdNotEqualTo(String value) {
            addCriterion("ztcjrpd <>", value, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdGreaterThan(String value) {
            addCriterion("ztcjrpd >", value, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdGreaterThanOrEqualTo(String value) {
            addCriterion("ztcjrpd >=", value, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdLessThan(String value) {
            addCriterion("ztcjrpd <", value, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdLessThanOrEqualTo(String value) {
            addCriterion("ztcjrpd <=", value, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdLike(String value) {
            addCriterion("ztcjrpd like", value, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdNotLike(String value) {
            addCriterion("ztcjrpd not like", value, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdIn(List<String> values) {
            addCriterion("ztcjrpd in", values, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdNotIn(List<String> values) {
            addCriterion("ztcjrpd not in", values, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdBetween(String value1, String value2) {
            addCriterion("ztcjrpd between", value1, value2, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZtcjrpdNotBetween(String value1, String value2) {
            addCriterion("ztcjrpd not between", value1, value2, "ztcjrpd");
            return (Criteria) this;
        }

        public Criteria andZxpdIsNull() {
            addCriterion("zxpd is null");
            return (Criteria) this;
        }

        public Criteria andZxpdIsNotNull() {
            addCriterion("zxpd is not null");
            return (Criteria) this;
        }

        public Criteria andZxpdEqualTo(String value) {
            addCriterion("zxpd =", value, "zxpd");
            return (Criteria) this;
        }

        public Criteria andZxpdNotEqualTo(String value) {
            addCriterion("zxpd <>", value, "zxpd");
            return (Criteria) this;
        }

        public Criteria andZxpdGreaterThan(String value) {
            addCriterion("zxpd >", value, "zxpd");
            return (Criteria) this;
        }

        public Criteria andZxpdGreaterThanOrEqualTo(String value) {
            addCriterion("zxpd >=", value, "zxpd");
            return (Criteria) this;
        }

        public Criteria andZxpdLessThan(String value) {
            addCriterion("zxpd <", value, "zxpd");
            return (Criteria) this;
        }

        public Criteria andZxpdLessThanOrEqualTo(String value) {
            addCriterion("zxpd <=", value, "zxpd");
            return (Criteria) this;
        }

        public Criteria andZxpdLike(String value) {
            addCriterion("zxpd like", value, "zxpd");
            return (Criteria) this;
        }

        public Criteria andZxpdNotLike(String value) {
            addCriterion("zxpd not like", value, "zxpd");
            return (Criteria) this;
        }

        public Criteria andZxpdIn(List<String> values) {
            addCriterion("zxpd in", values, "zxpd");
            return (Criteria) this;
        }

        public Criteria andZxpdNotIn(List<String> values) {
            addCriterion("zxpd not in", values, "zxpd");
            return (Criteria) this;
        }

        public Criteria andZxpdBetween(String value1, String value2) {
            addCriterion("zxpd between", value1, value2, "zxpd");
            return (Criteria) this;
        }

        public Criteria andZxpdNotBetween(String value1, String value2) {
            addCriterion("zxpd not between", value1, value2, "zxpd");
            return (Criteria) this;
        }

        public Criteria andCspdIsNull() {
            addCriterion("cspd is null");
            return (Criteria) this;
        }

        public Criteria andCspdIsNotNull() {
            addCriterion("cspd is not null");
            return (Criteria) this;
        }

        public Criteria andCspdEqualTo(String value) {
            addCriterion("cspd =", value, "cspd");
            return (Criteria) this;
        }

        public Criteria andCspdNotEqualTo(String value) {
            addCriterion("cspd <>", value, "cspd");
            return (Criteria) this;
        }

        public Criteria andCspdGreaterThan(String value) {
            addCriterion("cspd >", value, "cspd");
            return (Criteria) this;
        }

        public Criteria andCspdGreaterThanOrEqualTo(String value) {
            addCriterion("cspd >=", value, "cspd");
            return (Criteria) this;
        }

        public Criteria andCspdLessThan(String value) {
            addCriterion("cspd <", value, "cspd");
            return (Criteria) this;
        }

        public Criteria andCspdLessThanOrEqualTo(String value) {
            addCriterion("cspd <=", value, "cspd");
            return (Criteria) this;
        }

        public Criteria andCspdLike(String value) {
            addCriterion("cspd like", value, "cspd");
            return (Criteria) this;
        }

        public Criteria andCspdNotLike(String value) {
            addCriterion("cspd not like", value, "cspd");
            return (Criteria) this;
        }

        public Criteria andCspdIn(List<String> values) {
            addCriterion("cspd in", values, "cspd");
            return (Criteria) this;
        }

        public Criteria andCspdNotIn(List<String> values) {
            addCriterion("cspd not in", values, "cspd");
            return (Criteria) this;
        }

        public Criteria andCspdBetween(String value1, String value2) {
            addCriterion("cspd between", value1, value2, "cspd");
            return (Criteria) this;
        }

        public Criteria andCspdNotBetween(String value1, String value2) {
            addCriterion("cspd not between", value1, value2, "cspd");
            return (Criteria) this;
        }

        public Criteria andZdpdIsNull() {
            addCriterion("zdpd is null");
            return (Criteria) this;
        }

        public Criteria andZdpdIsNotNull() {
            addCriterion("zdpd is not null");
            return (Criteria) this;
        }

        public Criteria andZdpdEqualTo(String value) {
            addCriterion("zdpd =", value, "zdpd");
            return (Criteria) this;
        }

        public Criteria andZdpdNotEqualTo(String value) {
            addCriterion("zdpd <>", value, "zdpd");
            return (Criteria) this;
        }

        public Criteria andZdpdGreaterThan(String value) {
            addCriterion("zdpd >", value, "zdpd");
            return (Criteria) this;
        }

        public Criteria andZdpdGreaterThanOrEqualTo(String value) {
            addCriterion("zdpd >=", value, "zdpd");
            return (Criteria) this;
        }

        public Criteria andZdpdLessThan(String value) {
            addCriterion("zdpd <", value, "zdpd");
            return (Criteria) this;
        }

        public Criteria andZdpdLessThanOrEqualTo(String value) {
            addCriterion("zdpd <=", value, "zdpd");
            return (Criteria) this;
        }

        public Criteria andZdpdLike(String value) {
            addCriterion("zdpd like", value, "zdpd");
            return (Criteria) this;
        }

        public Criteria andZdpdNotLike(String value) {
            addCriterion("zdpd not like", value, "zdpd");
            return (Criteria) this;
        }

        public Criteria andZdpdIn(List<String> values) {
            addCriterion("zdpd in", values, "zdpd");
            return (Criteria) this;
        }

        public Criteria andZdpdNotIn(List<String> values) {
            addCriterion("zdpd not in", values, "zdpd");
            return (Criteria) this;
        }

        public Criteria andZdpdBetween(String value1, String value2) {
            addCriterion("zdpd between", value1, value2, "zdpd");
            return (Criteria) this;
        }

        public Criteria andZdpdNotBetween(String value1, String value2) {
            addCriterion("zdpd not between", value1, value2, "zdpd");
            return (Criteria) this;
        }

        public Criteria andYbpdIsNull() {
            addCriterion("ybpd is null");
            return (Criteria) this;
        }

        public Criteria andYbpdIsNotNull() {
            addCriterion("ybpd is not null");
            return (Criteria) this;
        }

        public Criteria andYbpdEqualTo(String value) {
            addCriterion("ybpd =", value, "ybpd");
            return (Criteria) this;
        }

        public Criteria andYbpdNotEqualTo(String value) {
            addCriterion("ybpd <>", value, "ybpd");
            return (Criteria) this;
        }

        public Criteria andYbpdGreaterThan(String value) {
            addCriterion("ybpd >", value, "ybpd");
            return (Criteria) this;
        }

        public Criteria andYbpdGreaterThanOrEqualTo(String value) {
            addCriterion("ybpd >=", value, "ybpd");
            return (Criteria) this;
        }

        public Criteria andYbpdLessThan(String value) {
            addCriterion("ybpd <", value, "ybpd");
            return (Criteria) this;
        }

        public Criteria andYbpdLessThanOrEqualTo(String value) {
            addCriterion("ybpd <=", value, "ybpd");
            return (Criteria) this;
        }

        public Criteria andYbpdLike(String value) {
            addCriterion("ybpd like", value, "ybpd");
            return (Criteria) this;
        }

        public Criteria andYbpdNotLike(String value) {
            addCriterion("ybpd not like", value, "ybpd");
            return (Criteria) this;
        }

        public Criteria andYbpdIn(List<String> values) {
            addCriterion("ybpd in", values, "ybpd");
            return (Criteria) this;
        }

        public Criteria andYbpdNotIn(List<String> values) {
            addCriterion("ybpd not in", values, "ybpd");
            return (Criteria) this;
        }

        public Criteria andYbpdBetween(String value1, String value2) {
            addCriterion("ybpd between", value1, value2, "ybpd");
            return (Criteria) this;
        }

        public Criteria andYbpdNotBetween(String value1, String value2) {
            addCriterion("ybpd not between", value1, value2, "ybpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdIsNull() {
            addCriterion("zxxbjpd is null");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdIsNotNull() {
            addCriterion("zxxbjpd is not null");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdEqualTo(String value) {
            addCriterion("zxxbjpd =", value, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdNotEqualTo(String value) {
            addCriterion("zxxbjpd <>", value, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdGreaterThan(String value) {
            addCriterion("zxxbjpd >", value, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdGreaterThanOrEqualTo(String value) {
            addCriterion("zxxbjpd >=", value, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdLessThan(String value) {
            addCriterion("zxxbjpd <", value, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdLessThanOrEqualTo(String value) {
            addCriterion("zxxbjpd <=", value, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdLike(String value) {
            addCriterion("zxxbjpd like", value, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdNotLike(String value) {
            addCriterion("zxxbjpd not like", value, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdIn(List<String> values) {
            addCriterion("zxxbjpd in", values, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdNotIn(List<String> values) {
            addCriterion("zxxbjpd not in", values, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdBetween(String value1, String value2) {
            addCriterion("zxxbjpd between", value1, value2, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andZxxbjpdNotBetween(String value1, String value2) {
            addCriterion("zxxbjpd not between", value1, value2, "zxxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdIsNull() {
            addCriterion("cdxbjpd is null");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdIsNotNull() {
            addCriterion("cdxbjpd is not null");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdEqualTo(String value) {
            addCriterion("cdxbjpd =", value, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdNotEqualTo(String value) {
            addCriterion("cdxbjpd <>", value, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdGreaterThan(String value) {
            addCriterion("cdxbjpd >", value, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdGreaterThanOrEqualTo(String value) {
            addCriterion("cdxbjpd >=", value, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdLessThan(String value) {
            addCriterion("cdxbjpd <", value, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdLessThanOrEqualTo(String value) {
            addCriterion("cdxbjpd <=", value, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdLike(String value) {
            addCriterion("cdxbjpd like", value, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdNotLike(String value) {
            addCriterion("cdxbjpd not like", value, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdIn(List<String> values) {
            addCriterion("cdxbjpd in", values, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdNotIn(List<String> values) {
            addCriterion("cdxbjpd not in", values, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdBetween(String value1, String value2) {
            addCriterion("cdxbjpd between", value1, value2, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andCdxbjpdNotBetween(String value1, String value2) {
            addCriterion("cdxbjpd not between", value1, value2, "cdxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdIsNull() {
            addCriterion("xsxbjpd is null");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdIsNotNull() {
            addCriterion("xsxbjpd is not null");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdEqualTo(String value) {
            addCriterion("xsxbjpd =", value, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdNotEqualTo(String value) {
            addCriterion("xsxbjpd <>", value, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdGreaterThan(String value) {
            addCriterion("xsxbjpd >", value, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdGreaterThanOrEqualTo(String value) {
            addCriterion("xsxbjpd >=", value, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdLessThan(String value) {
            addCriterion("xsxbjpd <", value, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdLessThanOrEqualTo(String value) {
            addCriterion("xsxbjpd <=", value, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdLike(String value) {
            addCriterion("xsxbjpd like", value, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdNotLike(String value) {
            addCriterion("xsxbjpd not like", value, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdIn(List<String> values) {
            addCriterion("xsxbjpd in", values, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdNotIn(List<String> values) {
            addCriterion("xsxbjpd not in", values, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdBetween(String value1, String value2) {
            addCriterion("xsxbjpd between", value1, value2, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andXsxbjpdNotBetween(String value1, String value2) {
            addCriterion("xsxbjpd not between", value1, value2, "xsxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdIsNull() {
            addCriterion("zdxbjpd is null");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdIsNotNull() {
            addCriterion("zdxbjpd is not null");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdEqualTo(String value) {
            addCriterion("zdxbjpd =", value, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdNotEqualTo(String value) {
            addCriterion("zdxbjpd <>", value, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdGreaterThan(String value) {
            addCriterion("zdxbjpd >", value, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdGreaterThanOrEqualTo(String value) {
            addCriterion("zdxbjpd >=", value, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdLessThan(String value) {
            addCriterion("zdxbjpd <", value, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdLessThanOrEqualTo(String value) {
            addCriterion("zdxbjpd <=", value, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdLike(String value) {
            addCriterion("zdxbjpd like", value, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdNotLike(String value) {
            addCriterion("zdxbjpd not like", value, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdIn(List<String> values) {
            addCriterion("zdxbjpd in", values, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdNotIn(List<String> values) {
            addCriterion("zdxbjpd not in", values, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdBetween(String value1, String value2) {
            addCriterion("zdxbjpd between", value1, value2, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andZdxbjpdNotBetween(String value1, String value2) {
            addCriterion("zdxbjpd not between", value1, value2, "zdxbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdIsNull() {
            addCriterion("qtbjpd is null");
            return (Criteria) this;
        }

        public Criteria andQtbjpdIsNotNull() {
            addCriterion("qtbjpd is not null");
            return (Criteria) this;
        }

        public Criteria andQtbjpdEqualTo(String value) {
            addCriterion("qtbjpd =", value, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdNotEqualTo(String value) {
            addCriterion("qtbjpd <>", value, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdGreaterThan(String value) {
            addCriterion("qtbjpd >", value, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdGreaterThanOrEqualTo(String value) {
            addCriterion("qtbjpd >=", value, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdLessThan(String value) {
            addCriterion("qtbjpd <", value, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdLessThanOrEqualTo(String value) {
            addCriterion("qtbjpd <=", value, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdLike(String value) {
            addCriterion("qtbjpd like", value, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdNotLike(String value) {
            addCriterion("qtbjpd not like", value, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdIn(List<String> values) {
            addCriterion("qtbjpd in", values, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdNotIn(List<String> values) {
            addCriterion("qtbjpd not in", values, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdBetween(String value1, String value2) {
            addCriterion("qtbjpd between", value1, value2, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andQtbjpdNotBetween(String value1, String value2) {
            addCriterion("qtbjpd not between", value1, value2, "qtbjpd");
            return (Criteria) this;
        }

        public Criteria andClwkccIsNull() {
            addCriterion("clwkcc is null");
            return (Criteria) this;
        }

        public Criteria andClwkccIsNotNull() {
            addCriterion("clwkcc is not null");
            return (Criteria) this;
        }

        public Criteria andClwkccEqualTo(String value) {
            addCriterion("clwkcc =", value, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andClwkccNotEqualTo(String value) {
            addCriterion("clwkcc <>", value, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andClwkccGreaterThan(String value) {
            addCriterion("clwkcc >", value, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andClwkccGreaterThanOrEqualTo(String value) {
            addCriterion("clwkcc >=", value, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andClwkccLessThan(String value) {
            addCriterion("clwkcc <", value, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andClwkccLessThanOrEqualTo(String value) {
            addCriterion("clwkcc <=", value, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andClwkccLike(String value) {
            addCriterion("clwkcc like", value, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andClwkccNotLike(String value) {
            addCriterion("clwkcc not like", value, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andClwkccIn(List<String> values) {
            addCriterion("clwkcc in", values, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andClwkccNotIn(List<String> values) {
            addCriterion("clwkcc not in", values, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andClwkccBetween(String value1, String value2) {
            addCriterion("clwkcc between", value1, value2, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andClwkccNotBetween(String value1, String value2) {
            addCriterion("clwkcc not between", value1, value2, "clwkcc");
            return (Criteria) this;
        }

        public Criteria andZjIsNull() {
            addCriterion("zj is null");
            return (Criteria) this;
        }

        public Criteria andZjIsNotNull() {
            addCriterion("zj is not null");
            return (Criteria) this;
        }

        public Criteria andZjEqualTo(String value) {
            addCriterion("zj =", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotEqualTo(String value) {
            addCriterion("zj <>", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThan(String value) {
            addCriterion("zj >", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThanOrEqualTo(String value) {
            addCriterion("zj >=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThan(String value) {
            addCriterion("zj <", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThanOrEqualTo(String value) {
            addCriterion("zj <=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLike(String value) {
            addCriterion("zj like", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotLike(String value) {
            addCriterion("zj not like", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjIn(List<String> values) {
            addCriterion("zj in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotIn(List<String> values) {
            addCriterion("zj not in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjBetween(String value1, String value2) {
            addCriterion("zj between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotBetween(String value1, String value2) {
            addCriterion("zj not between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdIsNull() {
            addCriterion("zxtlthwsd is null");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdIsNotNull() {
            addCriterion("zxtlthwsd is not null");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdEqualTo(String value) {
            addCriterion("zxtlthwsd =", value, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdNotEqualTo(String value) {
            addCriterion("zxtlthwsd <>", value, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdGreaterThan(String value) {
            addCriterion("zxtlthwsd >", value, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdGreaterThanOrEqualTo(String value) {
            addCriterion("zxtlthwsd >=", value, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdLessThan(String value) {
            addCriterion("zxtlthwsd <", value, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdLessThanOrEqualTo(String value) {
            addCriterion("zxtlthwsd <=", value, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdLike(String value) {
            addCriterion("zxtlthwsd like", value, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdNotLike(String value) {
            addCriterion("zxtlthwsd not like", value, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdIn(List<String> values) {
            addCriterion("zxtlthwsd in", values, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdNotIn(List<String> values) {
            addCriterion("zxtlthwsd not in", values, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdBetween(String value1, String value2) {
            addCriterion("zxtlthwsd between", value1, value2, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andZxtlthwsdNotBetween(String value1, String value2) {
            addCriterion("zxtlthwsd not between", value1, value2, "zxtlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdIsNull() {
            addCriterion("qttlthwsd is null");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdIsNotNull() {
            addCriterion("qttlthwsd is not null");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdEqualTo(String value) {
            addCriterion("qttlthwsd =", value, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdNotEqualTo(String value) {
            addCriterion("qttlthwsd <>", value, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdGreaterThan(String value) {
            addCriterion("qttlthwsd >", value, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdGreaterThanOrEqualTo(String value) {
            addCriterion("qttlthwsd >=", value, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdLessThan(String value) {
            addCriterion("qttlthwsd <", value, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdLessThanOrEqualTo(String value) {
            addCriterion("qttlthwsd <=", value, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdLike(String value) {
            addCriterion("qttlthwsd like", value, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdNotLike(String value) {
            addCriterion("qttlthwsd not like", value, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdIn(List<String> values) {
            addCriterion("qttlthwsd in", values, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdNotIn(List<String> values) {
            addCriterion("qttlthwsd not in", values, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdBetween(String value1, String value2) {
            addCriterion("qttlthwsd between", value1, value2, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andQttlthwsdNotBetween(String value1, String value2) {
            addCriterion("qttlthwsd not between", value1, value2, "qttlthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdIsNull() {
            addCriterion("gclthwsd is null");
            return (Criteria) this;
        }

        public Criteria andGclthwsdIsNotNull() {
            addCriterion("gclthwsd is not null");
            return (Criteria) this;
        }

        public Criteria andGclthwsdEqualTo(String value) {
            addCriterion("gclthwsd =", value, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdNotEqualTo(String value) {
            addCriterion("gclthwsd <>", value, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdGreaterThan(String value) {
            addCriterion("gclthwsd >", value, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdGreaterThanOrEqualTo(String value) {
            addCriterion("gclthwsd >=", value, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdLessThan(String value) {
            addCriterion("gclthwsd <", value, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdLessThanOrEqualTo(String value) {
            addCriterion("gclthwsd <=", value, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdLike(String value) {
            addCriterion("gclthwsd like", value, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdNotLike(String value) {
            addCriterion("gclthwsd not like", value, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdIn(List<String> values) {
            addCriterion("gclthwsd in", values, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdNotIn(List<String> values) {
            addCriterion("gclthwsd not in", values, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdBetween(String value1, String value2) {
            addCriterion("gclthwsd between", value1, value2, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andGclthwsdNotBetween(String value1, String value2) {
            addCriterion("gclthwsd not between", value1, value2, "gclthwsd");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcIsNull() {
            addCriterion("zqdccsdc is null");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcIsNotNull() {
            addCriterion("zqdccsdc is not null");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcEqualTo(String value) {
            addCriterion("zqdccsdc =", value, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcNotEqualTo(String value) {
            addCriterion("zqdccsdc <>", value, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcGreaterThan(String value) {
            addCriterion("zqdccsdc >", value, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcGreaterThanOrEqualTo(String value) {
            addCriterion("zqdccsdc >=", value, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcLessThan(String value) {
            addCriterion("zqdccsdc <", value, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcLessThanOrEqualTo(String value) {
            addCriterion("zqdccsdc <=", value, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcLike(String value) {
            addCriterion("zqdccsdc like", value, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcNotLike(String value) {
            addCriterion("zqdccsdc not like", value, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcIn(List<String> values) {
            addCriterion("zqdccsdc in", values, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcNotIn(List<String> values) {
            addCriterion("zqdccsdc not in", values, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcBetween(String value1, String value2) {
            addCriterion("zqdccsdc between", value1, value2, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andZqdccsdcNotBetween(String value1, String value2) {
            addCriterion("zqdccsdc not between", value1, value2, "zqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcIsNull() {
            addCriterion("yqdccsdc is null");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcIsNotNull() {
            addCriterion("yqdccsdc is not null");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcEqualTo(String value) {
            addCriterion("yqdccsdc =", value, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcNotEqualTo(String value) {
            addCriterion("yqdccsdc <>", value, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcGreaterThan(String value) {
            addCriterion("yqdccsdc >", value, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcGreaterThanOrEqualTo(String value) {
            addCriterion("yqdccsdc >=", value, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcLessThan(String value) {
            addCriterion("yqdccsdc <", value, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcLessThanOrEqualTo(String value) {
            addCriterion("yqdccsdc <=", value, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcLike(String value) {
            addCriterion("yqdccsdc like", value, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcNotLike(String value) {
            addCriterion("yqdccsdc not like", value, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcIn(List<String> values) {
            addCriterion("yqdccsdc in", values, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcNotIn(List<String> values) {
            addCriterion("yqdccsdc not in", values, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcBetween(String value1, String value2) {
            addCriterion("yqdccsdc between", value1, value2, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andYqdccsdcNotBetween(String value1, String value2) {
            addCriterion("yqdccsdc not between", value1, value2, "yqdccsdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcIsNull() {
            addCriterion("qdccsdcbwgdc is null");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcIsNotNull() {
            addCriterion("qdccsdcbwgdc is not null");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcEqualTo(String value) {
            addCriterion("qdccsdcbwgdc =", value, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcNotEqualTo(String value) {
            addCriterion("qdccsdcbwgdc <>", value, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcGreaterThan(String value) {
            addCriterion("qdccsdcbwgdc >", value, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcGreaterThanOrEqualTo(String value) {
            addCriterion("qdccsdcbwgdc >=", value, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcLessThan(String value) {
            addCriterion("qdccsdcbwgdc <", value, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcLessThanOrEqualTo(String value) {
            addCriterion("qdccsdcbwgdc <=", value, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcLike(String value) {
            addCriterion("qdccsdcbwgdc like", value, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcNotLike(String value) {
            addCriterion("qdccsdcbwgdc not like", value, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcIn(List<String> values) {
            addCriterion("qdccsdcbwgdc in", values, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcNotIn(List<String> values) {
            addCriterion("qdccsdcbwgdc not in", values, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcBetween(String value1, String value2) {
            addCriterion("qdccsdcbwgdc between", value1, value2, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andQdccsdcbwgdcNotBetween(String value1, String value2) {
            addCriterion("qdccsdcbwgdc not between", value1, value2, "qdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcIsNull() {
            addCriterion("zhdccsdc is null");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcIsNotNull() {
            addCriterion("zhdccsdc is not null");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcEqualTo(String value) {
            addCriterion("zhdccsdc =", value, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcNotEqualTo(String value) {
            addCriterion("zhdccsdc <>", value, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcGreaterThan(String value) {
            addCriterion("zhdccsdc >", value, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcGreaterThanOrEqualTo(String value) {
            addCriterion("zhdccsdc >=", value, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcLessThan(String value) {
            addCriterion("zhdccsdc <", value, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcLessThanOrEqualTo(String value) {
            addCriterion("zhdccsdc <=", value, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcLike(String value) {
            addCriterion("zhdccsdc like", value, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcNotLike(String value) {
            addCriterion("zhdccsdc not like", value, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcIn(List<String> values) {
            addCriterion("zhdccsdc in", values, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcNotIn(List<String> values) {
            addCriterion("zhdccsdc not in", values, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcBetween(String value1, String value2) {
            addCriterion("zhdccsdc between", value1, value2, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andZhdccsdcNotBetween(String value1, String value2) {
            addCriterion("zhdccsdc not between", value1, value2, "zhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcIsNull() {
            addCriterion("yhdccsdc is null");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcIsNotNull() {
            addCriterion("yhdccsdc is not null");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcEqualTo(String value) {
            addCriterion("yhdccsdc =", value, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcNotEqualTo(String value) {
            addCriterion("yhdccsdc <>", value, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcGreaterThan(String value) {
            addCriterion("yhdccsdc >", value, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcGreaterThanOrEqualTo(String value) {
            addCriterion("yhdccsdc >=", value, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcLessThan(String value) {
            addCriterion("yhdccsdc <", value, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcLessThanOrEqualTo(String value) {
            addCriterion("yhdccsdc <=", value, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcLike(String value) {
            addCriterion("yhdccsdc like", value, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcNotLike(String value) {
            addCriterion("yhdccsdc not like", value, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcIn(List<String> values) {
            addCriterion("yhdccsdc in", values, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcNotIn(List<String> values) {
            addCriterion("yhdccsdc not in", values, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcBetween(String value1, String value2) {
            addCriterion("yhdccsdc between", value1, value2, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andYhdccsdcNotBetween(String value1, String value2) {
            addCriterion("yhdccsdc not between", value1, value2, "yhdccsdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcIsNull() {
            addCriterion("hdccsdcbwgdc is null");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcIsNotNull() {
            addCriterion("hdccsdcbwgdc is not null");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcEqualTo(String value) {
            addCriterion("hdccsdcbwgdc =", value, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcNotEqualTo(String value) {
            addCriterion("hdccsdcbwgdc <>", value, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcGreaterThan(String value) {
            addCriterion("hdccsdcbwgdc >", value, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcGreaterThanOrEqualTo(String value) {
            addCriterion("hdccsdcbwgdc >=", value, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcLessThan(String value) {
            addCriterion("hdccsdcbwgdc <", value, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcLessThanOrEqualTo(String value) {
            addCriterion("hdccsdcbwgdc <=", value, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcLike(String value) {
            addCriterion("hdccsdcbwgdc like", value, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcNotLike(String value) {
            addCriterion("hdccsdcbwgdc not like", value, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcIn(List<String> values) {
            addCriterion("hdccsdcbwgdc in", values, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcNotIn(List<String> values) {
            addCriterion("hdccsdcbwgdc not in", values, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcBetween(String value1, String value2) {
            addCriterion("hdccsdcbwgdc between", value1, value2, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andHdccsdcbwgdcNotBetween(String value1, String value2) {
            addCriterion("hdccsdcbwgdc not between", value1, value2, "hdccsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcIsNull() {
            addCriterion("zgccsdc is null");
            return (Criteria) this;
        }

        public Criteria andZgccsdcIsNotNull() {
            addCriterion("zgccsdc is not null");
            return (Criteria) this;
        }

        public Criteria andZgccsdcEqualTo(String value) {
            addCriterion("zgccsdc =", value, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcNotEqualTo(String value) {
            addCriterion("zgccsdc <>", value, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcGreaterThan(String value) {
            addCriterion("zgccsdc >", value, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcGreaterThanOrEqualTo(String value) {
            addCriterion("zgccsdc >=", value, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcLessThan(String value) {
            addCriterion("zgccsdc <", value, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcLessThanOrEqualTo(String value) {
            addCriterion("zgccsdc <=", value, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcLike(String value) {
            addCriterion("zgccsdc like", value, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcNotLike(String value) {
            addCriterion("zgccsdc not like", value, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcIn(List<String> values) {
            addCriterion("zgccsdc in", values, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcNotIn(List<String> values) {
            addCriterion("zgccsdc not in", values, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcBetween(String value1, String value2) {
            addCriterion("zgccsdc between", value1, value2, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andZgccsdcNotBetween(String value1, String value2) {
            addCriterion("zgccsdc not between", value1, value2, "zgccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcIsNull() {
            addCriterion("ygccsdc is null");
            return (Criteria) this;
        }

        public Criteria andYgccsdcIsNotNull() {
            addCriterion("ygccsdc is not null");
            return (Criteria) this;
        }

        public Criteria andYgccsdcEqualTo(String value) {
            addCriterion("ygccsdc =", value, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcNotEqualTo(String value) {
            addCriterion("ygccsdc <>", value, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcGreaterThan(String value) {
            addCriterion("ygccsdc >", value, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcGreaterThanOrEqualTo(String value) {
            addCriterion("ygccsdc >=", value, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcLessThan(String value) {
            addCriterion("ygccsdc <", value, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcLessThanOrEqualTo(String value) {
            addCriterion("ygccsdc <=", value, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcLike(String value) {
            addCriterion("ygccsdc like", value, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcNotLike(String value) {
            addCriterion("ygccsdc not like", value, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcIn(List<String> values) {
            addCriterion("ygccsdc in", values, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcNotIn(List<String> values) {
            addCriterion("ygccsdc not in", values, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcBetween(String value1, String value2) {
            addCriterion("ygccsdc between", value1, value2, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andYgccsdcNotBetween(String value1, String value2) {
            addCriterion("ygccsdc not between", value1, value2, "ygccsdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcIsNull() {
            addCriterion("gcgsdcbwgdc is null");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcIsNotNull() {
            addCriterion("gcgsdcbwgdc is not null");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcEqualTo(String value) {
            addCriterion("gcgsdcbwgdc =", value, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcNotEqualTo(String value) {
            addCriterion("gcgsdcbwgdc <>", value, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcGreaterThan(String value) {
            addCriterion("gcgsdcbwgdc >", value, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcGreaterThanOrEqualTo(String value) {
            addCriterion("gcgsdcbwgdc >=", value, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcLessThan(String value) {
            addCriterion("gcgsdcbwgdc <", value, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcLessThanOrEqualTo(String value) {
            addCriterion("gcgsdcbwgdc <=", value, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcLike(String value) {
            addCriterion("gcgsdcbwgdc like", value, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcNotLike(String value) {
            addCriterion("gcgsdcbwgdc not like", value, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcIn(List<String> values) {
            addCriterion("gcgsdcbwgdc in", values, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcNotIn(List<String> values) {
            addCriterion("gcgsdcbwgdc not in", values, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcBetween(String value1, String value2) {
            addCriterion("gcgsdcbwgdc between", value1, value2, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andGcgsdcbwgdcNotBetween(String value1, String value2) {
            addCriterion("gcgsdcbwgdc not between", value1, value2, "gcgsdcbwgdc");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdIsNull() {
            addCriterion("dccxlbgd is null");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdIsNotNull() {
            addCriterion("dccxlbgd is not null");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdEqualTo(String value) {
            addCriterion("dccxlbgd =", value, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdNotEqualTo(String value) {
            addCriterion("dccxlbgd <>", value, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdGreaterThan(String value) {
            addCriterion("dccxlbgd >", value, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdGreaterThanOrEqualTo(String value) {
            addCriterion("dccxlbgd >=", value, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdLessThan(String value) {
            addCriterion("dccxlbgd <", value, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdLessThanOrEqualTo(String value) {
            addCriterion("dccxlbgd <=", value, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdLike(String value) {
            addCriterion("dccxlbgd like", value, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdNotLike(String value) {
            addCriterion("dccxlbgd not like", value, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdIn(List<String> values) {
            addCriterion("dccxlbgd in", values, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdNotIn(List<String> values) {
            addCriterion("dccxlbgd not in", values, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdBetween(String value1, String value2) {
            addCriterion("dccxlbgd between", value1, value2, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andDccxlbgdNotBetween(String value1, String value2) {
            addCriterion("dccxlbgd not between", value1, value2, "dccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdIsNull() {
            addCriterion("gccxlbgd is null");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdIsNotNull() {
            addCriterion("gccxlbgd is not null");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdEqualTo(String value) {
            addCriterion("gccxlbgd =", value, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdNotEqualTo(String value) {
            addCriterion("gccxlbgd <>", value, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdGreaterThan(String value) {
            addCriterion("gccxlbgd >", value, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdGreaterThanOrEqualTo(String value) {
            addCriterion("gccxlbgd >=", value, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdLessThan(String value) {
            addCriterion("gccxlbgd <", value, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdLessThanOrEqualTo(String value) {
            addCriterion("gccxlbgd <=", value, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdLike(String value) {
            addCriterion("gccxlbgd like", value, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdNotLike(String value) {
            addCriterion("gccxlbgd not like", value, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdIn(List<String> values) {
            addCriterion("gccxlbgd in", values, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdNotIn(List<String> values) {
            addCriterion("gccxlbgd not in", values, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdBetween(String value1, String value2) {
            addCriterion("gccxlbgd between", value1, value2, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andGccxlbgdNotBetween(String value1, String value2) {
            addCriterion("gccxlbgd not between", value1, value2, "gccxlbgd");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlIsNull() {
            addCriterion("fxpzdzyzdl is null");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlIsNotNull() {
            addCriterion("fxpzdzyzdl is not null");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlEqualTo(String value) {
            addCriterion("fxpzdzyzdl =", value, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlNotEqualTo(String value) {
            addCriterion("fxpzdzyzdl <>", value, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlGreaterThan(String value) {
            addCriterion("fxpzdzyzdl >", value, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlGreaterThanOrEqualTo(String value) {
            addCriterion("fxpzdzyzdl >=", value, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlLessThan(String value) {
            addCriterion("fxpzdzyzdl <", value, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlLessThanOrEqualTo(String value) {
            addCriterion("fxpzdzyzdl <=", value, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlLike(String value) {
            addCriterion("fxpzdzyzdl like", value, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlNotLike(String value) {
            addCriterion("fxpzdzyzdl not like", value, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlIn(List<String> values) {
            addCriterion("fxpzdzyzdl in", values, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlNotIn(List<String> values) {
            addCriterion("fxpzdzyzdl not in", values, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlBetween(String value1, String value2) {
            addCriterion("fxpzdzyzdl between", value1, value2, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andFxpzdzyzdlNotBetween(String value1, String value2) {
            addCriterion("fxpzdzyzdl not between", value1, value2, "fxpzdzyzdl");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyIsNull() {
            addCriterion("wgjyyjy is null");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyIsNotNull() {
            addCriterion("wgjyyjy is not null");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyEqualTo(String value) {
            addCriterion("wgjyyjy =", value, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyNotEqualTo(String value) {
            addCriterion("wgjyyjy <>", value, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyGreaterThan(String value) {
            addCriterion("wgjyyjy >", value, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyGreaterThanOrEqualTo(String value) {
            addCriterion("wgjyyjy >=", value, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyLessThan(String value) {
            addCriterion("wgjyyjy <", value, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyLessThanOrEqualTo(String value) {
            addCriterion("wgjyyjy <=", value, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyLike(String value) {
            addCriterion("wgjyyjy like", value, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyNotLike(String value) {
            addCriterion("wgjyyjy not like", value, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyIn(List<String> values) {
            addCriterion("wgjyyjy in", values, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyNotIn(List<String> values) {
            addCriterion("wgjyyjy not in", values, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyBetween(String value1, String value2) {
            addCriterion("wgjyyjy between", value1, value2, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjyNotBetween(String value1, String value2) {
            addCriterion("wgjyyjy not between", value1, value2, "wgjyyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyIsNull() {
            addCriterion("dpdtjjyjy is null");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyIsNotNull() {
            addCriterion("dpdtjjyjy is not null");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyEqualTo(String value) {
            addCriterion("dpdtjjyjy =", value, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyNotEqualTo(String value) {
            addCriterion("dpdtjjyjy <>", value, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyGreaterThan(String value) {
            addCriterion("dpdtjjyjy >", value, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyGreaterThanOrEqualTo(String value) {
            addCriterion("dpdtjjyjy >=", value, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyLessThan(String value) {
            addCriterion("dpdtjjyjy <", value, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyLessThanOrEqualTo(String value) {
            addCriterion("dpdtjjyjy <=", value, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyLike(String value) {
            addCriterion("dpdtjjyjy like", value, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyNotLike(String value) {
            addCriterion("dpdtjjyjy not like", value, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyIn(List<String> values) {
            addCriterion("dpdtjjyjy in", values, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyNotIn(List<String> values) {
            addCriterion("dpdtjjyjy not in", values, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyBetween(String value1, String value2) {
            addCriterion("dpdtjjyjy between", value1, value2, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjyNotBetween(String value1, String value2) {
            addCriterion("dpdtjjyjy not between", value1, value2, "dpdtjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyIsNull() {
            addCriterion("dpbjjjyjy is null");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyIsNotNull() {
            addCriterion("dpbjjjyjy is not null");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyEqualTo(String value) {
            addCriterion("dpbjjjyjy =", value, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyNotEqualTo(String value) {
            addCriterion("dpbjjjyjy <>", value, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyGreaterThan(String value) {
            addCriterion("dpbjjjyjy >", value, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyGreaterThanOrEqualTo(String value) {
            addCriterion("dpbjjjyjy >=", value, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyLessThan(String value) {
            addCriterion("dpbjjjyjy <", value, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyLessThanOrEqualTo(String value) {
            addCriterion("dpbjjjyjy <=", value, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyLike(String value) {
            addCriterion("dpbjjjyjy like", value, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyNotLike(String value) {
            addCriterion("dpbjjjyjy not like", value, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyIn(List<String> values) {
            addCriterion("dpbjjjyjy in", values, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyNotIn(List<String> values) {
            addCriterion("dpbjjjyjy not in", values, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyBetween(String value1, String value2) {
            addCriterion("dpbjjjyjy between", value1, value2, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjyNotBetween(String value1, String value2) {
            addCriterion("dpbjjjyjy not between", value1, value2, "dpbjjjyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyIsNull() {
            addCriterion("ycyjy is null");
            return (Criteria) this;
        }

        public Criteria andYcyjyIsNotNull() {
            addCriterion("ycyjy is not null");
            return (Criteria) this;
        }

        public Criteria andYcyjyEqualTo(String value) {
            addCriterion("ycyjy =", value, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyNotEqualTo(String value) {
            addCriterion("ycyjy <>", value, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyGreaterThan(String value) {
            addCriterion("ycyjy >", value, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyGreaterThanOrEqualTo(String value) {
            addCriterion("ycyjy >=", value, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyLessThan(String value) {
            addCriterion("ycyjy <", value, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyLessThanOrEqualTo(String value) {
            addCriterion("ycyjy <=", value, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyLike(String value) {
            addCriterion("ycyjy like", value, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyNotLike(String value) {
            addCriterion("ycyjy not like", value, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyIn(List<String> values) {
            addCriterion("ycyjy in", values, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyNotIn(List<String> values) {
            addCriterion("ycyjy not in", values, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyBetween(String value1, String value2) {
            addCriterion("ycyjy between", value1, value2, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andYcyjyNotBetween(String value1, String value2) {
            addCriterion("ycyjy not between", value1, value2, "ycyjy");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjIsNull() {
            addCriterion("wgjyyjysj is null");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjIsNotNull() {
            addCriterion("wgjyyjysj is not null");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjEqualTo(String value) {
            addCriterion("wgjyyjysj =", value, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjNotEqualTo(String value) {
            addCriterion("wgjyyjysj <>", value, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjGreaterThan(String value) {
            addCriterion("wgjyyjysj >", value, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjGreaterThanOrEqualTo(String value) {
            addCriterion("wgjyyjysj >=", value, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjLessThan(String value) {
            addCriterion("wgjyyjysj <", value, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjLessThanOrEqualTo(String value) {
            addCriterion("wgjyyjysj <=", value, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjLike(String value) {
            addCriterion("wgjyyjysj like", value, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjNotLike(String value) {
            addCriterion("wgjyyjysj not like", value, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjIn(List<String> values) {
            addCriterion("wgjyyjysj in", values, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjNotIn(List<String> values) {
            addCriterion("wgjyyjysj not in", values, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjBetween(String value1, String value2) {
            addCriterion("wgjyyjysj between", value1, value2, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andWgjyyjysjNotBetween(String value1, String value2) {
            addCriterion("wgjyyjysj not between", value1, value2, "wgjyyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjIsNull() {
            addCriterion("dpdtjjyjysj is null");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjIsNotNull() {
            addCriterion("dpdtjjyjysj is not null");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjEqualTo(String value) {
            addCriterion("dpdtjjyjysj =", value, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjNotEqualTo(String value) {
            addCriterion("dpdtjjyjysj <>", value, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjGreaterThan(String value) {
            addCriterion("dpdtjjyjysj >", value, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjGreaterThanOrEqualTo(String value) {
            addCriterion("dpdtjjyjysj >=", value, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjLessThan(String value) {
            addCriterion("dpdtjjyjysj <", value, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjLessThanOrEqualTo(String value) {
            addCriterion("dpdtjjyjysj <=", value, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjLike(String value) {
            addCriterion("dpdtjjyjysj like", value, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjNotLike(String value) {
            addCriterion("dpdtjjyjysj not like", value, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjIn(List<String> values) {
            addCriterion("dpdtjjyjysj in", values, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjNotIn(List<String> values) {
            addCriterion("dpdtjjyjysj not in", values, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjBetween(String value1, String value2) {
            addCriterion("dpdtjjyjysj between", value1, value2, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpdtjjyjysjNotBetween(String value1, String value2) {
            addCriterion("dpdtjjyjysj not between", value1, value2, "dpdtjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjIsNull() {
            addCriterion("dpbjjjyjysj is null");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjIsNotNull() {
            addCriterion("dpbjjjyjysj is not null");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjEqualTo(String value) {
            addCriterion("dpbjjjyjysj =", value, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjNotEqualTo(String value) {
            addCriterion("dpbjjjyjysj <>", value, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjGreaterThan(String value) {
            addCriterion("dpbjjjyjysj >", value, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjGreaterThanOrEqualTo(String value) {
            addCriterion("dpbjjjyjysj >=", value, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjLessThan(String value) {
            addCriterion("dpbjjjyjysj <", value, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjLessThanOrEqualTo(String value) {
            addCriterion("dpbjjjyjysj <=", value, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjLike(String value) {
            addCriterion("dpbjjjyjysj like", value, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjNotLike(String value) {
            addCriterion("dpbjjjyjysj not like", value, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjIn(List<String> values) {
            addCriterion("dpbjjjyjysj in", values, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjNotIn(List<String> values) {
            addCriterion("dpbjjjyjysj not in", values, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjBetween(String value1, String value2) {
            addCriterion("dpbjjjyjysj between", value1, value2, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andDpbjjjyjysjNotBetween(String value1, String value2) {
            addCriterion("dpbjjjyjysj not between", value1, value2, "dpbjjjyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjIsNull() {
            addCriterion("ycyjysj is null");
            return (Criteria) this;
        }

        public Criteria andYcyjysjIsNotNull() {
            addCriterion("ycyjysj is not null");
            return (Criteria) this;
        }

        public Criteria andYcyjysjEqualTo(String value) {
            addCriterion("ycyjysj =", value, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjNotEqualTo(String value) {
            addCriterion("ycyjysj <>", value, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjGreaterThan(String value) {
            addCriterion("ycyjysj >", value, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjGreaterThanOrEqualTo(String value) {
            addCriterion("ycyjysj >=", value, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjLessThan(String value) {
            addCriterion("ycyjysj <", value, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjLessThanOrEqualTo(String value) {
            addCriterion("ycyjysj <=", value, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjLike(String value) {
            addCriterion("ycyjysj like", value, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjNotLike(String value) {
            addCriterion("ycyjysj not like", value, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjIn(List<String> values) {
            addCriterion("ycyjysj in", values, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjNotIn(List<String> values) {
            addCriterion("ycyjysj not in", values, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjBetween(String value1, String value2) {
            addCriterion("ycyjysj between", value1, value2, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andYcyjysjNotBetween(String value1, String value2) {
            addCriterion("ycyjysj not between", value1, value2, "ycyjysj");
            return (Criteria) this;
        }

        public Criteria andJdcsyrIsNull() {
            addCriterion("jdcsyr is null");
            return (Criteria) this;
        }

        public Criteria andJdcsyrIsNotNull() {
            addCriterion("jdcsyr is not null");
            return (Criteria) this;
        }

        public Criteria andJdcsyrEqualTo(String value) {
            addCriterion("jdcsyr =", value, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andJdcsyrNotEqualTo(String value) {
            addCriterion("jdcsyr <>", value, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andJdcsyrGreaterThan(String value) {
            addCriterion("jdcsyr >", value, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andJdcsyrGreaterThanOrEqualTo(String value) {
            addCriterion("jdcsyr >=", value, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andJdcsyrLessThan(String value) {
            addCriterion("jdcsyr <", value, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andJdcsyrLessThanOrEqualTo(String value) {
            addCriterion("jdcsyr <=", value, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andJdcsyrLike(String value) {
            addCriterion("jdcsyr like", value, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andJdcsyrNotLike(String value) {
            addCriterion("jdcsyr not like", value, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andJdcsyrIn(List<String> values) {
            addCriterion("jdcsyr in", values, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andJdcsyrNotIn(List<String> values) {
            addCriterion("jdcsyr not in", values, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andJdcsyrBetween(String value1, String value2) {
            addCriterion("jdcsyr between", value1, value2, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andJdcsyrNotBetween(String value1, String value2) {
            addCriterion("jdcsyr not between", value1, value2, "jdcsyr");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNull() {
            addCriterion("sjhm is null");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNotNull() {
            addCriterion("sjhm is not null");
            return (Criteria) this;
        }

        public Criteria andSjhmEqualTo(String value) {
            addCriterion("sjhm =", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotEqualTo(String value) {
            addCriterion("sjhm <>", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThan(String value) {
            addCriterion("sjhm >", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThanOrEqualTo(String value) {
            addCriterion("sjhm >=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThan(String value) {
            addCriterion("sjhm <", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThanOrEqualTo(String value) {
            addCriterion("sjhm <=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLike(String value) {
            addCriterion("sjhm like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotLike(String value) {
            addCriterion("sjhm not like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmIn(List<String> values) {
            addCriterion("sjhm in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotIn(List<String> values) {
            addCriterion("sjhm not in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmBetween(String value1, String value2) {
            addCriterion("sjhm between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotBetween(String value1, String value2) {
            addCriterion("sjhm not between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andDzybIsNull() {
            addCriterion("dzyb is null");
            return (Criteria) this;
        }

        public Criteria andDzybIsNotNull() {
            addCriterion("dzyb is not null");
            return (Criteria) this;
        }

        public Criteria andDzybEqualTo(String value) {
            addCriterion("dzyb =", value, "dzyb");
            return (Criteria) this;
        }

        public Criteria andDzybNotEqualTo(String value) {
            addCriterion("dzyb <>", value, "dzyb");
            return (Criteria) this;
        }

        public Criteria andDzybGreaterThan(String value) {
            addCriterion("dzyb >", value, "dzyb");
            return (Criteria) this;
        }

        public Criteria andDzybGreaterThanOrEqualTo(String value) {
            addCriterion("dzyb >=", value, "dzyb");
            return (Criteria) this;
        }

        public Criteria andDzybLessThan(String value) {
            addCriterion("dzyb <", value, "dzyb");
            return (Criteria) this;
        }

        public Criteria andDzybLessThanOrEqualTo(String value) {
            addCriterion("dzyb <=", value, "dzyb");
            return (Criteria) this;
        }

        public Criteria andDzybLike(String value) {
            addCriterion("dzyb like", value, "dzyb");
            return (Criteria) this;
        }

        public Criteria andDzybNotLike(String value) {
            addCriterion("dzyb not like", value, "dzyb");
            return (Criteria) this;
        }

        public Criteria andDzybIn(List<String> values) {
            addCriterion("dzyb in", values, "dzyb");
            return (Criteria) this;
        }

        public Criteria andDzybNotIn(List<String> values) {
            addCriterion("dzyb not in", values, "dzyb");
            return (Criteria) this;
        }

        public Criteria andDzybBetween(String value1, String value2) {
            addCriterion("dzyb between", value1, value2, "dzyb");
            return (Criteria) this;
        }

        public Criteria andDzybNotBetween(String value1, String value2) {
            addCriterion("dzyb not between", value1, value2, "dzyb");
            return (Criteria) this;
        }

        public Criteria andBhgxIsNull() {
            addCriterion("bhgx is null");
            return (Criteria) this;
        }

        public Criteria andBhgxIsNotNull() {
            addCriterion("bhgx is not null");
            return (Criteria) this;
        }

        public Criteria andBhgxEqualTo(String value) {
            addCriterion("bhgx =", value, "bhgx");
            return (Criteria) this;
        }

        public Criteria andBhgxNotEqualTo(String value) {
            addCriterion("bhgx <>", value, "bhgx");
            return (Criteria) this;
        }

        public Criteria andBhgxGreaterThan(String value) {
            addCriterion("bhgx >", value, "bhgx");
            return (Criteria) this;
        }

        public Criteria andBhgxGreaterThanOrEqualTo(String value) {
            addCriterion("bhgx >=", value, "bhgx");
            return (Criteria) this;
        }

        public Criteria andBhgxLessThan(String value) {
            addCriterion("bhgx <", value, "bhgx");
            return (Criteria) this;
        }

        public Criteria andBhgxLessThanOrEqualTo(String value) {
            addCriterion("bhgx <=", value, "bhgx");
            return (Criteria) this;
        }

        public Criteria andBhgxLike(String value) {
            addCriterion("bhgx like", value, "bhgx");
            return (Criteria) this;
        }

        public Criteria andBhgxNotLike(String value) {
            addCriterion("bhgx not like", value, "bhgx");
            return (Criteria) this;
        }

        public Criteria andBhgxIn(List<String> values) {
            addCriterion("bhgx in", values, "bhgx");
            return (Criteria) this;
        }

        public Criteria andBhgxNotIn(List<String> values) {
            addCriterion("bhgx not in", values, "bhgx");
            return (Criteria) this;
        }

        public Criteria andBhgxBetween(String value1, String value2) {
            addCriterion("bhgx between", value1, value2, "bhgx");
            return (Criteria) this;
        }

        public Criteria andBhgxNotBetween(String value1, String value2) {
            addCriterion("bhgx not between", value1, value2, "bhgx");
            return (Criteria) this;
        }

        public Criteria andTDetailIsNull() {
            addCriterion("t_detail is null");
            return (Criteria) this;
        }

        public Criteria andTDetailIsNotNull() {
            addCriterion("t_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTDetailEqualTo(String value) {
            addCriterion("t_detail =", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailNotEqualTo(String value) {
            addCriterion("t_detail <>", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailGreaterThan(String value) {
            addCriterion("t_detail >", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailGreaterThanOrEqualTo(String value) {
            addCriterion("t_detail >=", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailLessThan(String value) {
            addCriterion("t_detail <", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailLessThanOrEqualTo(String value) {
            addCriterion("t_detail <=", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailLike(String value) {
            addCriterion("t_detail like", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailNotLike(String value) {
            addCriterion("t_detail not like", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailIn(List<String> values) {
            addCriterion("t_detail in", values, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailNotIn(List<String> values) {
            addCriterion("t_detail not in", values, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailBetween(String value1, String value2) {
            addCriterion("t_detail between", value1, value2, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailNotBetween(String value1, String value2) {
            addCriterion("t_detail not between", value1, value2, "tDetail");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxIsNull() {
            addCriterion("yzzdlqx is null");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxIsNotNull() {
            addCriterion("yzzdlqx is not null");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxEqualTo(String value) {
            addCriterion("yzzdlqx =", value, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxNotEqualTo(String value) {
            addCriterion("yzzdlqx <>", value, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxGreaterThan(String value) {
            addCriterion("yzzdlqx >", value, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxGreaterThanOrEqualTo(String value) {
            addCriterion("yzzdlqx >=", value, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxLessThan(String value) {
            addCriterion("yzzdlqx <", value, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxLessThanOrEqualTo(String value) {
            addCriterion("yzzdlqx <=", value, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxLike(String value) {
            addCriterion("yzzdlqx like", value, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxNotLike(String value) {
            addCriterion("yzzdlqx not like", value, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxIn(List<String> values) {
            addCriterion("yzzdlqx in", values, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxNotIn(List<String> values) {
            addCriterion("yzzdlqx not in", values, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxBetween(String value1, String value2) {
            addCriterion("yzzdlqx between", value1, value2, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andYzzdlqxNotBetween(String value1, String value2) {
            addCriterion("yzzdlqx not between", value1, value2, "yzzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxIsNull() {
            addCriterion("ezzdlqx is null");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxIsNotNull() {
            addCriterion("ezzdlqx is not null");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxEqualTo(String value) {
            addCriterion("ezzdlqx =", value, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxNotEqualTo(String value) {
            addCriterion("ezzdlqx <>", value, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxGreaterThan(String value) {
            addCriterion("ezzdlqx >", value, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxGreaterThanOrEqualTo(String value) {
            addCriterion("ezzdlqx >=", value, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxLessThan(String value) {
            addCriterion("ezzdlqx <", value, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxLessThanOrEqualTo(String value) {
            addCriterion("ezzdlqx <=", value, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxLike(String value) {
            addCriterion("ezzdlqx like", value, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxNotLike(String value) {
            addCriterion("ezzdlqx not like", value, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxIn(List<String> values) {
            addCriterion("ezzdlqx in", values, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxNotIn(List<String> values) {
            addCriterion("ezzdlqx not in", values, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxBetween(String value1, String value2) {
            addCriterion("ezzdlqx between", value1, value2, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andEzzdlqxNotBetween(String value1, String value2) {
            addCriterion("ezzdlqx not between", value1, value2, "ezzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxIsNull() {
            addCriterion("tzzdlqx is null");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxIsNotNull() {
            addCriterion("tzzdlqx is not null");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxEqualTo(String value) {
            addCriterion("tzzdlqx =", value, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxNotEqualTo(String value) {
            addCriterion("tzzdlqx <>", value, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxGreaterThan(String value) {
            addCriterion("tzzdlqx >", value, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxGreaterThanOrEqualTo(String value) {
            addCriterion("tzzdlqx >=", value, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxLessThan(String value) {
            addCriterion("tzzdlqx <", value, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxLessThanOrEqualTo(String value) {
            addCriterion("tzzdlqx <=", value, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxLike(String value) {
            addCriterion("tzzdlqx like", value, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxNotLike(String value) {
            addCriterion("tzzdlqx not like", value, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxIn(List<String> values) {
            addCriterion("tzzdlqx in", values, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxNotIn(List<String> values) {
            addCriterion("tzzdlqx not in", values, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxBetween(String value1, String value2) {
            addCriterion("tzzdlqx between", value1, value2, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andTzzdlqxNotBetween(String value1, String value2) {
            addCriterion("tzzdlqx not between", value1, value2, "tzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxIsNull() {
            addCriterion("fzzdlqx is null");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxIsNotNull() {
            addCriterion("fzzdlqx is not null");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxEqualTo(String value) {
            addCriterion("fzzdlqx =", value, "fzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxNotEqualTo(String value) {
            addCriterion("fzzdlqx <>", value, "fzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxGreaterThan(String value) {
            addCriterion("fzzdlqx >", value, "fzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxGreaterThanOrEqualTo(String value) {
            addCriterion("fzzdlqx >=", value, "fzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxLessThan(String value) {
            addCriterion("fzzdlqx <", value, "fzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxLessThanOrEqualTo(String value) {
            addCriterion("fzzdlqx <=", value, "fzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxLike(String value) {
            addCriterion("fzzdlqx like", value, "fzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxNotLike(String value) {
            addCriterion("fzzdlqx not like", value, "fzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxIn(List<String> values) {
            addCriterion("fzzdlqx in", values, "fzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxNotIn(List<String> values) {
            addCriterion("fzzdlqx not in", values, "fzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxBetween(String value1, String value2) {
            addCriterion("fzzdlqx between", value1, value2, "fzzdlqx");
            return (Criteria) this;
        }

        public Criteria andFzzdlqxNotBetween(String value1, String value2) {
            addCriterion("fzzdlqx not between", value1, value2, "fzzdlqx");
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