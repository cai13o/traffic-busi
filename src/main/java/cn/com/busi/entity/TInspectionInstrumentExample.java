package cn.com.busi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TInspectionInstrumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInspectionInstrumentExample() {
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

        public Criteria andJgdhIsNull() {
            addCriterion("jgdh is null");
            return (Criteria) this;
        }

        public Criteria andJgdhIsNotNull() {
            addCriterion("jgdh is not null");
            return (Criteria) this;
        }

        public Criteria andJgdhEqualTo(String value) {
            addCriterion("jgdh =", value, "jgdh");
            return (Criteria) this;
        }

        public Criteria andJgdhNotEqualTo(String value) {
            addCriterion("jgdh <>", value, "jgdh");
            return (Criteria) this;
        }

        public Criteria andJgdhGreaterThan(String value) {
            addCriterion("jgdh >", value, "jgdh");
            return (Criteria) this;
        }

        public Criteria andJgdhGreaterThanOrEqualTo(String value) {
            addCriterion("jgdh >=", value, "jgdh");
            return (Criteria) this;
        }

        public Criteria andJgdhLessThan(String value) {
            addCriterion("jgdh <", value, "jgdh");
            return (Criteria) this;
        }

        public Criteria andJgdhLessThanOrEqualTo(String value) {
            addCriterion("jgdh <=", value, "jgdh");
            return (Criteria) this;
        }

        public Criteria andJgdhLike(String value) {
            addCriterion("jgdh like", value, "jgdh");
            return (Criteria) this;
        }

        public Criteria andJgdhNotLike(String value) {
            addCriterion("jgdh not like", value, "jgdh");
            return (Criteria) this;
        }

        public Criteria andJgdhIn(List<String> values) {
            addCriterion("jgdh in", values, "jgdh");
            return (Criteria) this;
        }

        public Criteria andJgdhNotIn(List<String> values) {
            addCriterion("jgdh not in", values, "jgdh");
            return (Criteria) this;
        }

        public Criteria andJgdhBetween(String value1, String value2) {
            addCriterion("jgdh between", value1, value2, "jgdh");
            return (Criteria) this;
        }

        public Criteria andJgdhNotBetween(String value1, String value2) {
            addCriterion("jgdh not between", value1, value2, "jgdh");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("xh is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("xh is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("xh =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("xh <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("xh >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("xh >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("xh <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("xh <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("xh like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("xh not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("xh in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("xh not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("xh between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("xh not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andJgmcIsNull() {
            addCriterion("jgmc is null");
            return (Criteria) this;
        }

        public Criteria andJgmcIsNotNull() {
            addCriterion("jgmc is not null");
            return (Criteria) this;
        }

        public Criteria andJgmcEqualTo(String value) {
            addCriterion("jgmc =", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotEqualTo(String value) {
            addCriterion("jgmc <>", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcGreaterThan(String value) {
            addCriterion("jgmc >", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcGreaterThanOrEqualTo(String value) {
            addCriterion("jgmc >=", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcLessThan(String value) {
            addCriterion("jgmc <", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcLessThanOrEqualTo(String value) {
            addCriterion("jgmc <=", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcLike(String value) {
            addCriterion("jgmc like", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotLike(String value) {
            addCriterion("jgmc not like", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcIn(List<String> values) {
            addCriterion("jgmc in", values, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotIn(List<String> values) {
            addCriterion("jgmc not in", values, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcBetween(String value1, String value2) {
            addCriterion("jgmc between", value1, value2, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotBetween(String value1, String value2) {
            addCriterion("jgmc not between", value1, value2, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgdzIsNull() {
            addCriterion("jgdz is null");
            return (Criteria) this;
        }

        public Criteria andJgdzIsNotNull() {
            addCriterion("jgdz is not null");
            return (Criteria) this;
        }

        public Criteria andJgdzEqualTo(String value) {
            addCriterion("jgdz =", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzNotEqualTo(String value) {
            addCriterion("jgdz <>", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzGreaterThan(String value) {
            addCriterion("jgdz >", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzGreaterThanOrEqualTo(String value) {
            addCriterion("jgdz >=", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzLessThan(String value) {
            addCriterion("jgdz <", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzLessThanOrEqualTo(String value) {
            addCriterion("jgdz <=", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzLike(String value) {
            addCriterion("jgdz like", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzNotLike(String value) {
            addCriterion("jgdz not like", value, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzIn(List<String> values) {
            addCriterion("jgdz in", values, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzNotIn(List<String> values) {
            addCriterion("jgdz not in", values, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzBetween(String value1, String value2) {
            addCriterion("jgdz between", value1, value2, "jgdz");
            return (Criteria) this;
        }

        public Criteria andJgdzNotBetween(String value1, String value2) {
            addCriterion("jgdz not between", value1, value2, "jgdz");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("lxdh is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("lxdh is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("lxdh =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("lxdh <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("lxdh >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("lxdh >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("lxdh <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("lxdh <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("lxdh like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("lxdh not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("lxdh in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("lxdh not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("lxdh between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("lxdh not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andJylshIsNull() {
            addCriterion("jylsh is null");
            return (Criteria) this;
        }

        public Criteria andJylshIsNotNull() {
            addCriterion("jylsh is not null");
            return (Criteria) this;
        }

        public Criteria andJylshEqualTo(String value) {
            addCriterion("jylsh =", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshNotEqualTo(String value) {
            addCriterion("jylsh <>", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshGreaterThan(String value) {
            addCriterion("jylsh >", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshGreaterThanOrEqualTo(String value) {
            addCriterion("jylsh >=", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshLessThan(String value) {
            addCriterion("jylsh <", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshLessThanOrEqualTo(String value) {
            addCriterion("jylsh <=", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshLike(String value) {
            addCriterion("jylsh like", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshNotLike(String value) {
            addCriterion("jylsh not like", value, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshIn(List<String> values) {
            addCriterion("jylsh in", values, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshNotIn(List<String> values) {
            addCriterion("jylsh not in", values, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshBetween(String value1, String value2) {
            addCriterion("jylsh between", value1, value2, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylshNotBetween(String value1, String value2) {
            addCriterion("jylsh not between", value1, value2, "jylsh");
            return (Criteria) this;
        }

        public Criteria andJylbIsNull() {
            addCriterion("jylb is null");
            return (Criteria) this;
        }

        public Criteria andJylbIsNotNull() {
            addCriterion("jylb is not null");
            return (Criteria) this;
        }

        public Criteria andJylbEqualTo(String value) {
            addCriterion("jylb =", value, "jylb");
            return (Criteria) this;
        }

        public Criteria andJylbNotEqualTo(String value) {
            addCriterion("jylb <>", value, "jylb");
            return (Criteria) this;
        }

        public Criteria andJylbGreaterThan(String value) {
            addCriterion("jylb >", value, "jylb");
            return (Criteria) this;
        }

        public Criteria andJylbGreaterThanOrEqualTo(String value) {
            addCriterion("jylb >=", value, "jylb");
            return (Criteria) this;
        }

        public Criteria andJylbLessThan(String value) {
            addCriterion("jylb <", value, "jylb");
            return (Criteria) this;
        }

        public Criteria andJylbLessThanOrEqualTo(String value) {
            addCriterion("jylb <=", value, "jylb");
            return (Criteria) this;
        }

        public Criteria andJylbLike(String value) {
            addCriterion("jylb like", value, "jylb");
            return (Criteria) this;
        }

        public Criteria andJylbNotLike(String value) {
            addCriterion("jylb not like", value, "jylb");
            return (Criteria) this;
        }

        public Criteria andJylbIn(List<String> values) {
            addCriterion("jylb in", values, "jylb");
            return (Criteria) this;
        }

        public Criteria andJylbNotIn(List<String> values) {
            addCriterion("jylb not in", values, "jylb");
            return (Criteria) this;
        }

        public Criteria andJylbBetween(String value1, String value2) {
            addCriterion("jylb between", value1, value2, "jylb");
            return (Criteria) this;
        }

        public Criteria andJylbNotBetween(String value1, String value2) {
            addCriterion("jylb not between", value1, value2, "jylb");
            return (Criteria) this;
        }

        public Criteria andJyxmIsNull() {
            addCriterion("jyxm is null");
            return (Criteria) this;
        }

        public Criteria andJyxmIsNotNull() {
            addCriterion("jyxm is not null");
            return (Criteria) this;
        }

        public Criteria andJyxmEqualTo(String value) {
            addCriterion("jyxm =", value, "jyxm");
            return (Criteria) this;
        }

        public Criteria andJyxmNotEqualTo(String value) {
            addCriterion("jyxm <>", value, "jyxm");
            return (Criteria) this;
        }

        public Criteria andJyxmGreaterThan(String value) {
            addCriterion("jyxm >", value, "jyxm");
            return (Criteria) this;
        }

        public Criteria andJyxmGreaterThanOrEqualTo(String value) {
            addCriterion("jyxm >=", value, "jyxm");
            return (Criteria) this;
        }

        public Criteria andJyxmLessThan(String value) {
            addCriterion("jyxm <", value, "jyxm");
            return (Criteria) this;
        }

        public Criteria andJyxmLessThanOrEqualTo(String value) {
            addCriterion("jyxm <=", value, "jyxm");
            return (Criteria) this;
        }

        public Criteria andJyxmLike(String value) {
            addCriterion("jyxm like", value, "jyxm");
            return (Criteria) this;
        }

        public Criteria andJyxmNotLike(String value) {
            addCriterion("jyxm not like", value, "jyxm");
            return (Criteria) this;
        }

        public Criteria andJyxmIn(List<String> values) {
            addCriterion("jyxm in", values, "jyxm");
            return (Criteria) this;
        }

        public Criteria andJyxmNotIn(List<String> values) {
            addCriterion("jyxm not in", values, "jyxm");
            return (Criteria) this;
        }

        public Criteria andJyxmBetween(String value1, String value2) {
            addCriterion("jyxm between", value1, value2, "jyxm");
            return (Criteria) this;
        }

        public Criteria andJyxmNotBetween(String value1, String value2) {
            addCriterion("jyxm not between", value1, value2, "jyxm");
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

        public Criteria andCcrqIsNull() {
            addCriterion("ccrq is null");
            return (Criteria) this;
        }

        public Criteria andCcrqIsNotNull() {
            addCriterion("ccrq is not null");
            return (Criteria) this;
        }

        public Criteria andCcrqEqualTo(Date value) {
            addCriterionForJDBCDate("ccrq =", value, "ccrq");
            return (Criteria) this;
        }

        public Criteria andCcrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("ccrq <>", value, "ccrq");
            return (Criteria) this;
        }

        public Criteria andCcrqGreaterThan(Date value) {
            addCriterionForJDBCDate("ccrq >", value, "ccrq");
            return (Criteria) this;
        }

        public Criteria andCcrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ccrq >=", value, "ccrq");
            return (Criteria) this;
        }

        public Criteria andCcrqLessThan(Date value) {
            addCriterionForJDBCDate("ccrq <", value, "ccrq");
            return (Criteria) this;
        }

        public Criteria andCcrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ccrq <=", value, "ccrq");
            return (Criteria) this;
        }

        public Criteria andCcrqIn(List<Date> values) {
            addCriterionForJDBCDate("ccrq in", values, "ccrq");
            return (Criteria) this;
        }

        public Criteria andCcrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("ccrq not in", values, "ccrq");
            return (Criteria) this;
        }

        public Criteria andCcrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ccrq between", value1, value2, "ccrq");
            return (Criteria) this;
        }

        public Criteria andCcrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ccrq not between", value1, value2, "ccrq");
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

        public Criteria andHpzlIsNull() {
            addCriterion("hpzl is null");
            return (Criteria) this;
        }

        public Criteria andHpzlIsNotNull() {
            addCriterion("hpzl is not null");
            return (Criteria) this;
        }

        public Criteria andHpzlEqualTo(String value) {
            addCriterion("hpzl =", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotEqualTo(String value) {
            addCriterion("hpzl <>", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlGreaterThan(String value) {
            addCriterion("hpzl >", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlGreaterThanOrEqualTo(String value) {
            addCriterion("hpzl >=", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlLessThan(String value) {
            addCriterion("hpzl <", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlLessThanOrEqualTo(String value) {
            addCriterion("hpzl <=", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlLike(String value) {
            addCriterion("hpzl like", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotLike(String value) {
            addCriterion("hpzl not like", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlIn(List<String> values) {
            addCriterion("hpzl in", values, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotIn(List<String> values) {
            addCriterion("hpzl not in", values, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlBetween(String value1, String value2) {
            addCriterion("hpzl between", value1, value2, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotBetween(String value1, String value2) {
            addCriterion("hpzl not between", value1, value2, "hpzl");
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

        public Criteria andPpxhIsNull() {
            addCriterion("ppxh is null");
            return (Criteria) this;
        }

        public Criteria andPpxhIsNotNull() {
            addCriterion("ppxh is not null");
            return (Criteria) this;
        }

        public Criteria andPpxhEqualTo(String value) {
            addCriterion("ppxh =", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhNotEqualTo(String value) {
            addCriterion("ppxh <>", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhGreaterThan(String value) {
            addCriterion("ppxh >", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhGreaterThanOrEqualTo(String value) {
            addCriterion("ppxh >=", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhLessThan(String value) {
            addCriterion("ppxh <", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhLessThanOrEqualTo(String value) {
            addCriterion("ppxh <=", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhLike(String value) {
            addCriterion("ppxh like", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhNotLike(String value) {
            addCriterion("ppxh not like", value, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhIn(List<String> values) {
            addCriterion("ppxh in", values, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhNotIn(List<String> values) {
            addCriterion("ppxh not in", values, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhBetween(String value1, String value2) {
            addCriterion("ppxh between", value1, value2, "ppxh");
            return (Criteria) this;
        }

        public Criteria andPpxhNotBetween(String value1, String value2) {
            addCriterion("ppxh not between", value1, value2, "ppxh");
            return (Criteria) this;
        }

        public Criteria andRllbIsNull() {
            addCriterion("rllb is null");
            return (Criteria) this;
        }

        public Criteria andRllbIsNotNull() {
            addCriterion("rllb is not null");
            return (Criteria) this;
        }

        public Criteria andRllbEqualTo(String value) {
            addCriterion("rllb =", value, "rllb");
            return (Criteria) this;
        }

        public Criteria andRllbNotEqualTo(String value) {
            addCriterion("rllb <>", value, "rllb");
            return (Criteria) this;
        }

        public Criteria andRllbGreaterThan(String value) {
            addCriterion("rllb >", value, "rllb");
            return (Criteria) this;
        }

        public Criteria andRllbGreaterThanOrEqualTo(String value) {
            addCriterion("rllb >=", value, "rllb");
            return (Criteria) this;
        }

        public Criteria andRllbLessThan(String value) {
            addCriterion("rllb <", value, "rllb");
            return (Criteria) this;
        }

        public Criteria andRllbLessThanOrEqualTo(String value) {
            addCriterion("rllb <=", value, "rllb");
            return (Criteria) this;
        }

        public Criteria andRllbLike(String value) {
            addCriterion("rllb like", value, "rllb");
            return (Criteria) this;
        }

        public Criteria andRllbNotLike(String value) {
            addCriterion("rllb not like", value, "rllb");
            return (Criteria) this;
        }

        public Criteria andRllbIn(List<String> values) {
            addCriterion("rllb in", values, "rllb");
            return (Criteria) this;
        }

        public Criteria andRllbNotIn(List<String> values) {
            addCriterion("rllb not in", values, "rllb");
            return (Criteria) this;
        }

        public Criteria andRllbBetween(String value1, String value2) {
            addCriterion("rllb between", value1, value2, "rllb");
            return (Criteria) this;
        }

        public Criteria andRllbNotBetween(String value1, String value2) {
            addCriterion("rllb not between", value1, value2, "rllb");
            return (Criteria) this;
        }

        public Criteria andZbzlIsNull() {
            addCriterion("zbzl is null");
            return (Criteria) this;
        }

        public Criteria andZbzlIsNotNull() {
            addCriterion("zbzl is not null");
            return (Criteria) this;
        }

        public Criteria andZbzlEqualTo(String value) {
            addCriterion("zbzl =", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotEqualTo(String value) {
            addCriterion("zbzl <>", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlGreaterThan(String value) {
            addCriterion("zbzl >", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlGreaterThanOrEqualTo(String value) {
            addCriterion("zbzl >=", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlLessThan(String value) {
            addCriterion("zbzl <", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlLessThanOrEqualTo(String value) {
            addCriterion("zbzl <=", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlLike(String value) {
            addCriterion("zbzl like", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotLike(String value) {
            addCriterion("zbzl not like", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlIn(List<String> values) {
            addCriterion("zbzl in", values, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotIn(List<String> values) {
            addCriterion("zbzl not in", values, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlBetween(String value1, String value2) {
            addCriterion("zbzl between", value1, value2, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotBetween(String value1, String value2) {
            addCriterion("zbzl not between", value1, value2, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZzlIsNull() {
            addCriterion("zzl is null");
            return (Criteria) this;
        }

        public Criteria andZzlIsNotNull() {
            addCriterion("zzl is not null");
            return (Criteria) this;
        }

        public Criteria andZzlEqualTo(String value) {
            addCriterion("zzl =", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotEqualTo(String value) {
            addCriterion("zzl <>", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlGreaterThan(String value) {
            addCriterion("zzl >", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlGreaterThanOrEqualTo(String value) {
            addCriterion("zzl >=", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlLessThan(String value) {
            addCriterion("zzl <", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlLessThanOrEqualTo(String value) {
            addCriterion("zzl <=", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlLike(String value) {
            addCriterion("zzl like", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotLike(String value) {
            addCriterion("zzl not like", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlIn(List<String> values) {
            addCriterion("zzl in", values, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotIn(List<String> values) {
            addCriterion("zzl not in", values, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlBetween(String value1, String value2) {
            addCriterion("zzl between", value1, value2, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotBetween(String value1, String value2) {
            addCriterion("zzl not between", value1, value2, "zzl");
            return (Criteria) this;
        }

        public Criteria andQdxsIsNull() {
            addCriterion("qdxs is null");
            return (Criteria) this;
        }

        public Criteria andQdxsIsNotNull() {
            addCriterion("qdxs is not null");
            return (Criteria) this;
        }

        public Criteria andQdxsEqualTo(String value) {
            addCriterion("qdxs =", value, "qdxs");
            return (Criteria) this;
        }

        public Criteria andQdxsNotEqualTo(String value) {
            addCriterion("qdxs <>", value, "qdxs");
            return (Criteria) this;
        }

        public Criteria andQdxsGreaterThan(String value) {
            addCriterion("qdxs >", value, "qdxs");
            return (Criteria) this;
        }

        public Criteria andQdxsGreaterThanOrEqualTo(String value) {
            addCriterion("qdxs >=", value, "qdxs");
            return (Criteria) this;
        }

        public Criteria andQdxsLessThan(String value) {
            addCriterion("qdxs <", value, "qdxs");
            return (Criteria) this;
        }

        public Criteria andQdxsLessThanOrEqualTo(String value) {
            addCriterion("qdxs <=", value, "qdxs");
            return (Criteria) this;
        }

        public Criteria andQdxsLike(String value) {
            addCriterion("qdxs like", value, "qdxs");
            return (Criteria) this;
        }

        public Criteria andQdxsNotLike(String value) {
            addCriterion("qdxs not like", value, "qdxs");
            return (Criteria) this;
        }

        public Criteria andQdxsIn(List<String> values) {
            addCriterion("qdxs in", values, "qdxs");
            return (Criteria) this;
        }

        public Criteria andQdxsNotIn(List<String> values) {
            addCriterion("qdxs not in", values, "qdxs");
            return (Criteria) this;
        }

        public Criteria andQdxsBetween(String value1, String value2) {
            addCriterion("qdxs between", value1, value2, "qdxs");
            return (Criteria) this;
        }

        public Criteria andQdxsNotBetween(String value1, String value2) {
            addCriterion("qdxs not between", value1, value2, "qdxs");
            return (Criteria) this;
        }

        public Criteria andZczIsNull() {
            addCriterion("zcz is null");
            return (Criteria) this;
        }

        public Criteria andZczIsNotNull() {
            addCriterion("zcz is not null");
            return (Criteria) this;
        }

        public Criteria andZczEqualTo(String value) {
            addCriterion("zcz =", value, "zcz");
            return (Criteria) this;
        }

        public Criteria andZczNotEqualTo(String value) {
            addCriterion("zcz <>", value, "zcz");
            return (Criteria) this;
        }

        public Criteria andZczGreaterThan(String value) {
            addCriterion("zcz >", value, "zcz");
            return (Criteria) this;
        }

        public Criteria andZczGreaterThanOrEqualTo(String value) {
            addCriterion("zcz >=", value, "zcz");
            return (Criteria) this;
        }

        public Criteria andZczLessThan(String value) {
            addCriterion("zcz <", value, "zcz");
            return (Criteria) this;
        }

        public Criteria andZczLessThanOrEqualTo(String value) {
            addCriterion("zcz <=", value, "zcz");
            return (Criteria) this;
        }

        public Criteria andZczLike(String value) {
            addCriterion("zcz like", value, "zcz");
            return (Criteria) this;
        }

        public Criteria andZczNotLike(String value) {
            addCriterion("zcz not like", value, "zcz");
            return (Criteria) this;
        }

        public Criteria andZczIn(List<String> values) {
            addCriterion("zcz in", values, "zcz");
            return (Criteria) this;
        }

        public Criteria andZczNotIn(List<String> values) {
            addCriterion("zcz not in", values, "zcz");
            return (Criteria) this;
        }

        public Criteria andZczBetween(String value1, String value2) {
            addCriterion("zcz between", value1, value2, "zcz");
            return (Criteria) this;
        }

        public Criteria andZczNotBetween(String value1, String value2) {
            addCriterion("zcz not between", value1, value2, "zcz");
            return (Criteria) this;
        }

        public Criteria andYcyIsNull() {
            addCriterion("ycy is null");
            return (Criteria) this;
        }

        public Criteria andYcyIsNotNull() {
            addCriterion("ycy is not null");
            return (Criteria) this;
        }

        public Criteria andYcyEqualTo(String value) {
            addCriterion("ycy =", value, "ycy");
            return (Criteria) this;
        }

        public Criteria andYcyNotEqualTo(String value) {
            addCriterion("ycy <>", value, "ycy");
            return (Criteria) this;
        }

        public Criteria andYcyGreaterThan(String value) {
            addCriterion("ycy >", value, "ycy");
            return (Criteria) this;
        }

        public Criteria andYcyGreaterThanOrEqualTo(String value) {
            addCriterion("ycy >=", value, "ycy");
            return (Criteria) this;
        }

        public Criteria andYcyLessThan(String value) {
            addCriterion("ycy <", value, "ycy");
            return (Criteria) this;
        }

        public Criteria andYcyLessThanOrEqualTo(String value) {
            addCriterion("ycy <=", value, "ycy");
            return (Criteria) this;
        }

        public Criteria andYcyLike(String value) {
            addCriterion("ycy like", value, "ycy");
            return (Criteria) this;
        }

        public Criteria andYcyNotLike(String value) {
            addCriterion("ycy not like", value, "ycy");
            return (Criteria) this;
        }

        public Criteria andYcyIn(List<String> values) {
            addCriterion("ycy in", values, "ycy");
            return (Criteria) this;
        }

        public Criteria andYcyNotIn(List<String> values) {
            addCriterion("ycy not in", values, "ycy");
            return (Criteria) this;
        }

        public Criteria andYcyBetween(String value1, String value2) {
            addCriterion("ycy between", value1, value2, "ycy");
            return (Criteria) this;
        }

        public Criteria andYcyNotBetween(String value1, String value2) {
            addCriterion("ycy not between", value1, value2, "ycy");
            return (Criteria) this;
        }

        public Criteria andDlyIsNull() {
            addCriterion("dly is null");
            return (Criteria) this;
        }

        public Criteria andDlyIsNotNull() {
            addCriterion("dly is not null");
            return (Criteria) this;
        }

        public Criteria andDlyEqualTo(String value) {
            addCriterion("dly =", value, "dly");
            return (Criteria) this;
        }

        public Criteria andDlyNotEqualTo(String value) {
            addCriterion("dly <>", value, "dly");
            return (Criteria) this;
        }

        public Criteria andDlyGreaterThan(String value) {
            addCriterion("dly >", value, "dly");
            return (Criteria) this;
        }

        public Criteria andDlyGreaterThanOrEqualTo(String value) {
            addCriterion("dly >=", value, "dly");
            return (Criteria) this;
        }

        public Criteria andDlyLessThan(String value) {
            addCriterion("dly <", value, "dly");
            return (Criteria) this;
        }

        public Criteria andDlyLessThanOrEqualTo(String value) {
            addCriterion("dly <=", value, "dly");
            return (Criteria) this;
        }

        public Criteria andDlyLike(String value) {
            addCriterion("dly like", value, "dly");
            return (Criteria) this;
        }

        public Criteria andDlyNotLike(String value) {
            addCriterion("dly not like", value, "dly");
            return (Criteria) this;
        }

        public Criteria andDlyIn(List<String> values) {
            addCriterion("dly in", values, "dly");
            return (Criteria) this;
        }

        public Criteria andDlyNotIn(List<String> values) {
            addCriterion("dly not in", values, "dly");
            return (Criteria) this;
        }

        public Criteria andDlyBetween(String value1, String value2) {
            addCriterion("dly between", value1, value2, "dly");
            return (Criteria) this;
        }

        public Criteria andDlyNotBetween(String value1, String value2) {
            addCriterion("dly not between", value1, value2, "dly");
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

        public Criteria andVinIsNull() {
            addCriterion("vin is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vin is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vin =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vin <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vin >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vin >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vin <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vin <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vin like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vin not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vin in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vin not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vin between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vin not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andFdjhmIsNull() {
            addCriterion("fdjhm is null");
            return (Criteria) this;
        }

        public Criteria andFdjhmIsNotNull() {
            addCriterion("fdjhm is not null");
            return (Criteria) this;
        }

        public Criteria andFdjhmEqualTo(String value) {
            addCriterion("fdjhm =", value, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andFdjhmNotEqualTo(String value) {
            addCriterion("fdjhm <>", value, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andFdjhmGreaterThan(String value) {
            addCriterion("fdjhm >", value, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andFdjhmGreaterThanOrEqualTo(String value) {
            addCriterion("fdjhm >=", value, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andFdjhmLessThan(String value) {
            addCriterion("fdjhm <", value, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andFdjhmLessThanOrEqualTo(String value) {
            addCriterion("fdjhm <=", value, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andFdjhmLike(String value) {
            addCriterion("fdjhm like", value, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andFdjhmNotLike(String value) {
            addCriterion("fdjhm not like", value, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andFdjhmIn(List<String> values) {
            addCriterion("fdjhm in", values, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andFdjhmNotIn(List<String> values) {
            addCriterion("fdjhm not in", values, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andFdjhmBetween(String value1, String value2) {
            addCriterion("fdjhm between", value1, value2, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andFdjhmNotBetween(String value1, String value2) {
            addCriterion("fdjhm not between", value1, value2, "fdjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmIsNull() {
            addCriterion("qddjhm is null");
            return (Criteria) this;
        }

        public Criteria andQddjhmIsNotNull() {
            addCriterion("qddjhm is not null");
            return (Criteria) this;
        }

        public Criteria andQddjhmEqualTo(String value) {
            addCriterion("qddjhm =", value, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmNotEqualTo(String value) {
            addCriterion("qddjhm <>", value, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmGreaterThan(String value) {
            addCriterion("qddjhm >", value, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmGreaterThanOrEqualTo(String value) {
            addCriterion("qddjhm >=", value, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmLessThan(String value) {
            addCriterion("qddjhm <", value, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmLessThanOrEqualTo(String value) {
            addCriterion("qddjhm <=", value, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmLike(String value) {
            addCriterion("qddjhm like", value, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmNotLike(String value) {
            addCriterion("qddjhm not like", value, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmIn(List<String> values) {
            addCriterion("qddjhm in", values, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmNotIn(List<String> values) {
            addCriterion("qddjhm not in", values, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmBetween(String value1, String value2) {
            addCriterion("qddjhm between", value1, value2, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQddjhmNotBetween(String value1, String value2) {
            addCriterion("qddjhm not between", value1, value2, "qddjhm");
            return (Criteria) this;
        }

        public Criteria andQzdzIsNull() {
            addCriterion("qzdz is null");
            return (Criteria) this;
        }

        public Criteria andQzdzIsNotNull() {
            addCriterion("qzdz is not null");
            return (Criteria) this;
        }

        public Criteria andQzdzEqualTo(String value) {
            addCriterion("qzdz =", value, "qzdz");
            return (Criteria) this;
        }

        public Criteria andQzdzNotEqualTo(String value) {
            addCriterion("qzdz <>", value, "qzdz");
            return (Criteria) this;
        }

        public Criteria andQzdzGreaterThan(String value) {
            addCriterion("qzdz >", value, "qzdz");
            return (Criteria) this;
        }

        public Criteria andQzdzGreaterThanOrEqualTo(String value) {
            addCriterion("qzdz >=", value, "qzdz");
            return (Criteria) this;
        }

        public Criteria andQzdzLessThan(String value) {
            addCriterion("qzdz <", value, "qzdz");
            return (Criteria) this;
        }

        public Criteria andQzdzLessThanOrEqualTo(String value) {
            addCriterion("qzdz <=", value, "qzdz");
            return (Criteria) this;
        }

        public Criteria andQzdzLike(String value) {
            addCriterion("qzdz like", value, "qzdz");
            return (Criteria) this;
        }

        public Criteria andQzdzNotLike(String value) {
            addCriterion("qzdz not like", value, "qzdz");
            return (Criteria) this;
        }

        public Criteria andQzdzIn(List<String> values) {
            addCriterion("qzdz in", values, "qzdz");
            return (Criteria) this;
        }

        public Criteria andQzdzNotIn(List<String> values) {
            addCriterion("qzdz not in", values, "qzdz");
            return (Criteria) this;
        }

        public Criteria andQzdzBetween(String value1, String value2) {
            addCriterion("qzdz between", value1, value2, "qzdz");
            return (Criteria) this;
        }

        public Criteria andQzdzNotBetween(String value1, String value2) {
            addCriterion("qzdz not between", value1, value2, "qzdz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzIsNull() {
            addCriterion("zczddzkz is null");
            return (Criteria) this;
        }

        public Criteria andZczddzkzIsNotNull() {
            addCriterion("zczddzkz is not null");
            return (Criteria) this;
        }

        public Criteria andZczddzkzEqualTo(String value) {
            addCriterion("zczddzkz =", value, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzNotEqualTo(String value) {
            addCriterion("zczddzkz <>", value, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzGreaterThan(String value) {
            addCriterion("zczddzkz >", value, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzGreaterThanOrEqualTo(String value) {
            addCriterion("zczddzkz >=", value, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzLessThan(String value) {
            addCriterion("zczddzkz <", value, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzLessThanOrEqualTo(String value) {
            addCriterion("zczddzkz <=", value, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzLike(String value) {
            addCriterion("zczddzkz like", value, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzNotLike(String value) {
            addCriterion("zczddzkz not like", value, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzIn(List<String> values) {
            addCriterion("zczddzkz in", values, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzNotIn(List<String> values) {
            addCriterion("zczddzkz not in", values, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzBetween(String value1, String value2) {
            addCriterion("zczddzkz between", value1, value2, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZczddzkzNotBetween(String value1, String value2) {
            addCriterion("zczddzkz not between", value1, value2, "zczddzkz");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsIsNull() {
            addCriterion("zxzxjxs is null");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsIsNotNull() {
            addCriterion("zxzxjxs is not null");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsEqualTo(String value) {
            addCriterion("zxzxjxs =", value, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsNotEqualTo(String value) {
            addCriterion("zxzxjxs <>", value, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsGreaterThan(String value) {
            addCriterion("zxzxjxs >", value, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsGreaterThanOrEqualTo(String value) {
            addCriterion("zxzxjxs >=", value, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsLessThan(String value) {
            addCriterion("zxzxjxs <", value, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsLessThanOrEqualTo(String value) {
            addCriterion("zxzxjxs <=", value, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsLike(String value) {
            addCriterion("zxzxjxs like", value, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsNotLike(String value) {
            addCriterion("zxzxjxs not like", value, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsIn(List<String> values) {
            addCriterion("zxzxjxs in", values, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsNotIn(List<String> values) {
            addCriterion("zxzxjxs not in", values, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsBetween(String value1, String value2) {
            addCriterion("zxzxjxs between", value1, value2, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andZxzxjxsNotBetween(String value1, String value2) {
            addCriterion("zxzxjxs not between", value1, value2, "zxzxjxs");
            return (Criteria) this;
        }

        public Criteria andQzslIsNull() {
            addCriterion("qzsl is null");
            return (Criteria) this;
        }

        public Criteria andQzslIsNotNull() {
            addCriterion("qzsl is not null");
            return (Criteria) this;
        }

        public Criteria andQzslEqualTo(String value) {
            addCriterion("qzsl =", value, "qzsl");
            return (Criteria) this;
        }

        public Criteria andQzslNotEqualTo(String value) {
            addCriterion("qzsl <>", value, "qzsl");
            return (Criteria) this;
        }

        public Criteria andQzslGreaterThan(String value) {
            addCriterion("qzsl >", value, "qzsl");
            return (Criteria) this;
        }

        public Criteria andQzslGreaterThanOrEqualTo(String value) {
            addCriterion("qzsl >=", value, "qzsl");
            return (Criteria) this;
        }

        public Criteria andQzslLessThan(String value) {
            addCriterion("qzsl <", value, "qzsl");
            return (Criteria) this;
        }

        public Criteria andQzslLessThanOrEqualTo(String value) {
            addCriterion("qzsl <=", value, "qzsl");
            return (Criteria) this;
        }

        public Criteria andQzslLike(String value) {
            addCriterion("qzsl like", value, "qzsl");
            return (Criteria) this;
        }

        public Criteria andQzslNotLike(String value) {
            addCriterion("qzsl not like", value, "qzsl");
            return (Criteria) this;
        }

        public Criteria andQzslIn(List<String> values) {
            addCriterion("qzsl in", values, "qzsl");
            return (Criteria) this;
        }

        public Criteria andQzslNotIn(List<String> values) {
            addCriterion("qzsl not in", values, "qzsl");
            return (Criteria) this;
        }

        public Criteria andQzslBetween(String value1, String value2) {
            addCriterion("qzsl between", value1, value2, "qzsl");
            return (Criteria) this;
        }

        public Criteria andQzslNotBetween(String value1, String value2) {
            addCriterion("qzsl not between", value1, value2, "qzsl");
            return (Criteria) this;
        }

        public Criteria andZxzIsNull() {
            addCriterion("zxz is null");
            return (Criteria) this;
        }

        public Criteria andZxzIsNotNull() {
            addCriterion("zxz is not null");
            return (Criteria) this;
        }

        public Criteria andZxzEqualTo(String value) {
            addCriterion("zxz =", value, "zxz");
            return (Criteria) this;
        }

        public Criteria andZxzNotEqualTo(String value) {
            addCriterion("zxz <>", value, "zxz");
            return (Criteria) this;
        }

        public Criteria andZxzGreaterThan(String value) {
            addCriterion("zxz >", value, "zxz");
            return (Criteria) this;
        }

        public Criteria andZxzGreaterThanOrEqualTo(String value) {
            addCriterion("zxz >=", value, "zxz");
            return (Criteria) this;
        }

        public Criteria andZxzLessThan(String value) {
            addCriterion("zxz <", value, "zxz");
            return (Criteria) this;
        }

        public Criteria andZxzLessThanOrEqualTo(String value) {
            addCriterion("zxz <=", value, "zxz");
            return (Criteria) this;
        }

        public Criteria andZxzLike(String value) {
            addCriterion("zxz like", value, "zxz");
            return (Criteria) this;
        }

        public Criteria andZxzNotLike(String value) {
            addCriterion("zxz not like", value, "zxz");
            return (Criteria) this;
        }

        public Criteria andZxzIn(List<String> values) {
            addCriterion("zxz in", values, "zxz");
            return (Criteria) this;
        }

        public Criteria andZxzNotIn(List<String> values) {
            addCriterion("zxz not in", values, "zxz");
            return (Criteria) this;
        }

        public Criteria andZxzBetween(String value1, String value2) {
            addCriterion("zxz between", value1, value2, "zxz");
            return (Criteria) this;
        }

        public Criteria andZxzNotBetween(String value1, String value2) {
            addCriterion("zxz not between", value1, value2, "zxz");
            return (Criteria) this;
        }

        public Criteria andKqxjzIsNull() {
            addCriterion("kqxjz is null");
            return (Criteria) this;
        }

        public Criteria andKqxjzIsNotNull() {
            addCriterion("kqxjz is not null");
            return (Criteria) this;
        }

        public Criteria andKqxjzEqualTo(String value) {
            addCriterion("kqxjz =", value, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKqxjzNotEqualTo(String value) {
            addCriterion("kqxjz <>", value, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKqxjzGreaterThan(String value) {
            addCriterion("kqxjz >", value, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKqxjzGreaterThanOrEqualTo(String value) {
            addCriterion("kqxjz >=", value, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKqxjzLessThan(String value) {
            addCriterion("kqxjz <", value, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKqxjzLessThanOrEqualTo(String value) {
            addCriterion("kqxjz <=", value, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKqxjzLike(String value) {
            addCriterion("kqxjz like", value, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKqxjzNotLike(String value) {
            addCriterion("kqxjz not like", value, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKqxjzIn(List<String> values) {
            addCriterion("kqxjz in", values, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKqxjzNotIn(List<String> values) {
            addCriterion("kqxjz not in", values, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKqxjzBetween(String value1, String value2) {
            addCriterion("kqxjz between", value1, value2, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKqxjzNotBetween(String value1, String value2) {
            addCriterion("kqxjz not between", value1, value2, "kqxjz");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1IsNull() {
            addCriterion("kzzdzh1 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1IsNotNull() {
            addCriterion("kzzdzh1 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1EqualTo(String value) {
            addCriterion("kzzdzh1 =", value, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1NotEqualTo(String value) {
            addCriterion("kzzdzh1 <>", value, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1GreaterThan(String value) {
            addCriterion("kzzdzh1 >", value, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdzh1 >=", value, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1LessThan(String value) {
            addCriterion("kzzdzh1 <", value, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1LessThanOrEqualTo(String value) {
            addCriterion("kzzdzh1 <=", value, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1Like(String value) {
            addCriterion("kzzdzh1 like", value, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1NotLike(String value) {
            addCriterion("kzzdzh1 not like", value, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1In(List<String> values) {
            addCriterion("kzzdzh1 in", values, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1NotIn(List<String> values) {
            addCriterion("kzzdzh1 not in", values, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1Between(String value1, String value2) {
            addCriterion("kzzdzh1 between", value1, value2, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh1NotBetween(String value1, String value2) {
            addCriterion("kzzdzh1 not between", value1, value2, "kzzdzh1");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2IsNull() {
            addCriterion("kzzdzh2 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2IsNotNull() {
            addCriterion("kzzdzh2 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2EqualTo(String value) {
            addCriterion("kzzdzh2 =", value, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2NotEqualTo(String value) {
            addCriterion("kzzdzh2 <>", value, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2GreaterThan(String value) {
            addCriterion("kzzdzh2 >", value, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdzh2 >=", value, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2LessThan(String value) {
            addCriterion("kzzdzh2 <", value, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2LessThanOrEqualTo(String value) {
            addCriterion("kzzdzh2 <=", value, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2Like(String value) {
            addCriterion("kzzdzh2 like", value, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2NotLike(String value) {
            addCriterion("kzzdzh2 not like", value, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2In(List<String> values) {
            addCriterion("kzzdzh2 in", values, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2NotIn(List<String> values) {
            addCriterion("kzzdzh2 not in", values, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2Between(String value1, String value2) {
            addCriterion("kzzdzh2 between", value1, value2, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh2NotBetween(String value1, String value2) {
            addCriterion("kzzdzh2 not between", value1, value2, "kzzdzh2");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3IsNull() {
            addCriterion("kzzdzh3 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3IsNotNull() {
            addCriterion("kzzdzh3 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3EqualTo(String value) {
            addCriterion("kzzdzh3 =", value, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3NotEqualTo(String value) {
            addCriterion("kzzdzh3 <>", value, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3GreaterThan(String value) {
            addCriterion("kzzdzh3 >", value, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdzh3 >=", value, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3LessThan(String value) {
            addCriterion("kzzdzh3 <", value, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3LessThanOrEqualTo(String value) {
            addCriterion("kzzdzh3 <=", value, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3Like(String value) {
            addCriterion("kzzdzh3 like", value, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3NotLike(String value) {
            addCriterion("kzzdzh3 not like", value, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3In(List<String> values) {
            addCriterion("kzzdzh3 in", values, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3NotIn(List<String> values) {
            addCriterion("kzzdzh3 not in", values, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3Between(String value1, String value2) {
            addCriterion("kzzdzh3 between", value1, value2, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh3NotBetween(String value1, String value2) {
            addCriterion("kzzdzh3 not between", value1, value2, "kzzdzh3");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4IsNull() {
            addCriterion("kzzdzh4 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4IsNotNull() {
            addCriterion("kzzdzh4 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4EqualTo(String value) {
            addCriterion("kzzdzh4 =", value, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4NotEqualTo(String value) {
            addCriterion("kzzdzh4 <>", value, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4GreaterThan(String value) {
            addCriterion("kzzdzh4 >", value, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdzh4 >=", value, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4LessThan(String value) {
            addCriterion("kzzdzh4 <", value, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4LessThanOrEqualTo(String value) {
            addCriterion("kzzdzh4 <=", value, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4Like(String value) {
            addCriterion("kzzdzh4 like", value, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4NotLike(String value) {
            addCriterion("kzzdzh4 not like", value, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4In(List<String> values) {
            addCriterion("kzzdzh4 in", values, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4NotIn(List<String> values) {
            addCriterion("kzzdzh4 not in", values, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4Between(String value1, String value2) {
            addCriterion("kzzdzh4 between", value1, value2, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh4NotBetween(String value1, String value2) {
            addCriterion("kzzdzh4 not between", value1, value2, "kzzdzh4");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5IsNull() {
            addCriterion("kzzdzh5 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5IsNotNull() {
            addCriterion("kzzdzh5 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5EqualTo(String value) {
            addCriterion("kzzdzh5 =", value, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5NotEqualTo(String value) {
            addCriterion("kzzdzh5 <>", value, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5GreaterThan(String value) {
            addCriterion("kzzdzh5 >", value, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdzh5 >=", value, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5LessThan(String value) {
            addCriterion("kzzdzh5 <", value, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5LessThanOrEqualTo(String value) {
            addCriterion("kzzdzh5 <=", value, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5Like(String value) {
            addCriterion("kzzdzh5 like", value, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5NotLike(String value) {
            addCriterion("kzzdzh5 not like", value, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5In(List<String> values) {
            addCriterion("kzzdzh5 in", values, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5NotIn(List<String> values) {
            addCriterion("kzzdzh5 not in", values, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5Between(String value1, String value2) {
            addCriterion("kzzdzh5 between", value1, value2, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andKzzdzh5NotBetween(String value1, String value2) {
            addCriterion("kzzdzh5 not between", value1, value2, "kzzdzh5");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1IsNull() {
            addCriterion("jzzdzh1 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1IsNotNull() {
            addCriterion("jzzdzh1 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1EqualTo(String value) {
            addCriterion("jzzdzh1 =", value, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1NotEqualTo(String value) {
            addCriterion("jzzdzh1 <>", value, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1GreaterThan(String value) {
            addCriterion("jzzdzh1 >", value, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdzh1 >=", value, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1LessThan(String value) {
            addCriterion("jzzdzh1 <", value, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1LessThanOrEqualTo(String value) {
            addCriterion("jzzdzh1 <=", value, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1Like(String value) {
            addCriterion("jzzdzh1 like", value, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1NotLike(String value) {
            addCriterion("jzzdzh1 not like", value, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1In(List<String> values) {
            addCriterion("jzzdzh1 in", values, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1NotIn(List<String> values) {
            addCriterion("jzzdzh1 not in", values, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1Between(String value1, String value2) {
            addCriterion("jzzdzh1 between", value1, value2, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh1NotBetween(String value1, String value2) {
            addCriterion("jzzdzh1 not between", value1, value2, "jzzdzh1");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2IsNull() {
            addCriterion("jzzdzh2 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2IsNotNull() {
            addCriterion("jzzdzh2 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2EqualTo(String value) {
            addCriterion("jzzdzh2 =", value, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2NotEqualTo(String value) {
            addCriterion("jzzdzh2 <>", value, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2GreaterThan(String value) {
            addCriterion("jzzdzh2 >", value, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdzh2 >=", value, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2LessThan(String value) {
            addCriterion("jzzdzh2 <", value, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2LessThanOrEqualTo(String value) {
            addCriterion("jzzdzh2 <=", value, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2Like(String value) {
            addCriterion("jzzdzh2 like", value, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2NotLike(String value) {
            addCriterion("jzzdzh2 not like", value, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2In(List<String> values) {
            addCriterion("jzzdzh2 in", values, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2NotIn(List<String> values) {
            addCriterion("jzzdzh2 not in", values, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2Between(String value1, String value2) {
            addCriterion("jzzdzh2 between", value1, value2, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh2NotBetween(String value1, String value2) {
            addCriterion("jzzdzh2 not between", value1, value2, "jzzdzh2");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3IsNull() {
            addCriterion("jzzdzh3 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3IsNotNull() {
            addCriterion("jzzdzh3 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3EqualTo(String value) {
            addCriterion("jzzdzh3 =", value, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3NotEqualTo(String value) {
            addCriterion("jzzdzh3 <>", value, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3GreaterThan(String value) {
            addCriterion("jzzdzh3 >", value, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdzh3 >=", value, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3LessThan(String value) {
            addCriterion("jzzdzh3 <", value, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3LessThanOrEqualTo(String value) {
            addCriterion("jzzdzh3 <=", value, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3Like(String value) {
            addCriterion("jzzdzh3 like", value, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3NotLike(String value) {
            addCriterion("jzzdzh3 not like", value, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3In(List<String> values) {
            addCriterion("jzzdzh3 in", values, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3NotIn(List<String> values) {
            addCriterion("jzzdzh3 not in", values, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3Between(String value1, String value2) {
            addCriterion("jzzdzh3 between", value1, value2, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh3NotBetween(String value1, String value2) {
            addCriterion("jzzdzh3 not between", value1, value2, "jzzdzh3");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4IsNull() {
            addCriterion("jzzdzh4 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4IsNotNull() {
            addCriterion("jzzdzh4 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4EqualTo(String value) {
            addCriterion("jzzdzh4 =", value, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4NotEqualTo(String value) {
            addCriterion("jzzdzh4 <>", value, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4GreaterThan(String value) {
            addCriterion("jzzdzh4 >", value, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdzh4 >=", value, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4LessThan(String value) {
            addCriterion("jzzdzh4 <", value, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4LessThanOrEqualTo(String value) {
            addCriterion("jzzdzh4 <=", value, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4Like(String value) {
            addCriterion("jzzdzh4 like", value, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4NotLike(String value) {
            addCriterion("jzzdzh4 not like", value, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4In(List<String> values) {
            addCriterion("jzzdzh4 in", values, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4NotIn(List<String> values) {
            addCriterion("jzzdzh4 not in", values, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4Between(String value1, String value2) {
            addCriterion("jzzdzh4 between", value1, value2, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andJzzdzh4NotBetween(String value1, String value2) {
            addCriterion("jzzdzh4 not between", value1, value2, "jzzdzh4");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhIsNull() {
            addCriterion("zheckzjzzh is null");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhIsNotNull() {
            addCriterion("zheckzjzzh is not null");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhEqualTo(String value) {
            addCriterion("zheckzjzzh =", value, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhNotEqualTo(String value) {
            addCriterion("zheckzjzzh <>", value, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhGreaterThan(String value) {
            addCriterion("zheckzjzzh >", value, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhGreaterThanOrEqualTo(String value) {
            addCriterion("zheckzjzzh >=", value, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhLessThan(String value) {
            addCriterion("zheckzjzzh <", value, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhLessThanOrEqualTo(String value) {
            addCriterion("zheckzjzzh <=", value, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhLike(String value) {
            addCriterion("zheckzjzzh like", value, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhNotLike(String value) {
            addCriterion("zheckzjzzh not like", value, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhIn(List<String> values) {
            addCriterion("zheckzjzzh in", values, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhNotIn(List<String> values) {
            addCriterion("zheckzjzzh not in", values, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhBetween(String value1, String value2) {
            addCriterion("zheckzjzzh between", value1, value2, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZheckzjzzhNotBetween(String value1, String value2) {
            addCriterion("zheckzjzzh not between", value1, value2, "zheckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhIsNull() {
            addCriterion("zhuckzjzzh is null");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhIsNotNull() {
            addCriterion("zhuckzjzzh is not null");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhEqualTo(String value) {
            addCriterion("zhuckzjzzh =", value, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhNotEqualTo(String value) {
            addCriterion("zhuckzjzzh <>", value, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhGreaterThan(String value) {
            addCriterion("zhuckzjzzh >", value, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhGreaterThanOrEqualTo(String value) {
            addCriterion("zhuckzjzzh >=", value, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhLessThan(String value) {
            addCriterion("zhuckzjzzh <", value, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhLessThanOrEqualTo(String value) {
            addCriterion("zhuckzjzzh <=", value, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhLike(String value) {
            addCriterion("zhuckzjzzh like", value, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhNotLike(String value) {
            addCriterion("zhuckzjzzh not like", value, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhIn(List<String> values) {
            addCriterion("zhuckzjzzh in", values, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhNotIn(List<String> values) {
            addCriterion("zhuckzjzzh not in", values, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhBetween(String value1, String value2) {
            addCriterion("zhuckzjzzh between", value1, value2, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZhuckzjzzhNotBetween(String value1, String value2) {
            addCriterion("zhuckzjzzh not between", value1, value2, "zhuckzjzzh");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1IsNull() {
            addCriterion("zkzzdzdxczdl1 is null");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1IsNotNull() {
            addCriterion("zkzzdzdxczdl1 is not null");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1EqualTo(String value) {
            addCriterion("zkzzdzdxczdl1 =", value, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1NotEqualTo(String value) {
            addCriterion("zkzzdzdxczdl1 <>", value, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1GreaterThan(String value) {
            addCriterion("zkzzdzdxczdl1 >", value, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1GreaterThanOrEqualTo(String value) {
            addCriterion("zkzzdzdxczdl1 >=", value, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1LessThan(String value) {
            addCriterion("zkzzdzdxczdl1 <", value, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1LessThanOrEqualTo(String value) {
            addCriterion("zkzzdzdxczdl1 <=", value, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1Like(String value) {
            addCriterion("zkzzdzdxczdl1 like", value, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1NotLike(String value) {
            addCriterion("zkzzdzdxczdl1 not like", value, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1In(List<String> values) {
            addCriterion("zkzzdzdxczdl1 in", values, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1NotIn(List<String> values) {
            addCriterion("zkzzdzdxczdl1 not in", values, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1Between(String value1, String value2) {
            addCriterion("zkzzdzdxczdl1 between", value1, value2, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl1NotBetween(String value1, String value2) {
            addCriterion("zkzzdzdxczdl1 not between", value1, value2, "zkzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2IsNull() {
            addCriterion("zkzzdzdxczdl2 is null");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2IsNotNull() {
            addCriterion("zkzzdzdxczdl2 is not null");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2EqualTo(String value) {
            addCriterion("zkzzdzdxczdl2 =", value, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2NotEqualTo(String value) {
            addCriterion("zkzzdzdxczdl2 <>", value, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2GreaterThan(String value) {
            addCriterion("zkzzdzdxczdl2 >", value, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2GreaterThanOrEqualTo(String value) {
            addCriterion("zkzzdzdxczdl2 >=", value, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2LessThan(String value) {
            addCriterion("zkzzdzdxczdl2 <", value, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2LessThanOrEqualTo(String value) {
            addCriterion("zkzzdzdxczdl2 <=", value, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2Like(String value) {
            addCriterion("zkzzdzdxczdl2 like", value, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2NotLike(String value) {
            addCriterion("zkzzdzdxczdl2 not like", value, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2In(List<String> values) {
            addCriterion("zkzzdzdxczdl2 in", values, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2NotIn(List<String> values) {
            addCriterion("zkzzdzdxczdl2 not in", values, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2Between(String value1, String value2) {
            addCriterion("zkzzdzdxczdl2 between", value1, value2, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl2NotBetween(String value1, String value2) {
            addCriterion("zkzzdzdxczdl2 not between", value1, value2, "zkzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3IsNull() {
            addCriterion("zkzzdzdxczdl3 is null");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3IsNotNull() {
            addCriterion("zkzzdzdxczdl3 is not null");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3EqualTo(String value) {
            addCriterion("zkzzdzdxczdl3 =", value, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3NotEqualTo(String value) {
            addCriterion("zkzzdzdxczdl3 <>", value, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3GreaterThan(String value) {
            addCriterion("zkzzdzdxczdl3 >", value, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3GreaterThanOrEqualTo(String value) {
            addCriterion("zkzzdzdxczdl3 >=", value, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3LessThan(String value) {
            addCriterion("zkzzdzdxczdl3 <", value, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3LessThanOrEqualTo(String value) {
            addCriterion("zkzzdzdxczdl3 <=", value, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3Like(String value) {
            addCriterion("zkzzdzdxczdl3 like", value, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3NotLike(String value) {
            addCriterion("zkzzdzdxczdl3 not like", value, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3In(List<String> values) {
            addCriterion("zkzzdzdxczdl3 in", values, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3NotIn(List<String> values) {
            addCriterion("zkzzdzdxczdl3 not in", values, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3Between(String value1, String value2) {
            addCriterion("zkzzdzdxczdl3 between", value1, value2, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl3NotBetween(String value1, String value2) {
            addCriterion("zkzzdzdxczdl3 not between", value1, value2, "zkzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4IsNull() {
            addCriterion("zkzzdzdxczdl4 is null");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4IsNotNull() {
            addCriterion("zkzzdzdxczdl4 is not null");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4EqualTo(String value) {
            addCriterion("zkzzdzdxczdl4 =", value, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4NotEqualTo(String value) {
            addCriterion("zkzzdzdxczdl4 <>", value, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4GreaterThan(String value) {
            addCriterion("zkzzdzdxczdl4 >", value, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4GreaterThanOrEqualTo(String value) {
            addCriterion("zkzzdzdxczdl4 >=", value, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4LessThan(String value) {
            addCriterion("zkzzdzdxczdl4 <", value, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4LessThanOrEqualTo(String value) {
            addCriterion("zkzzdzdxczdl4 <=", value, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4Like(String value) {
            addCriterion("zkzzdzdxczdl4 like", value, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4NotLike(String value) {
            addCriterion("zkzzdzdxczdl4 not like", value, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4In(List<String> values) {
            addCriterion("zkzzdzdxczdl4 in", values, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4NotIn(List<String> values) {
            addCriterion("zkzzdzdxczdl4 not in", values, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4Between(String value1, String value2) {
            addCriterion("zkzzdzdxczdl4 between", value1, value2, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl4NotBetween(String value1, String value2) {
            addCriterion("zkzzdzdxczdl4 not between", value1, value2, "zkzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5IsNull() {
            addCriterion("zkzzdzdxczdl5 is null");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5IsNotNull() {
            addCriterion("zkzzdzdxczdl5 is not null");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5EqualTo(String value) {
            addCriterion("zkzzdzdxczdl5 =", value, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5NotEqualTo(String value) {
            addCriterion("zkzzdzdxczdl5 <>", value, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5GreaterThan(String value) {
            addCriterion("zkzzdzdxczdl5 >", value, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5GreaterThanOrEqualTo(String value) {
            addCriterion("zkzzdzdxczdl5 >=", value, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5LessThan(String value) {
            addCriterion("zkzzdzdxczdl5 <", value, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5LessThanOrEqualTo(String value) {
            addCriterion("zkzzdzdxczdl5 <=", value, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5Like(String value) {
            addCriterion("zkzzdzdxczdl5 like", value, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5NotLike(String value) {
            addCriterion("zkzzdzdxczdl5 not like", value, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5In(List<String> values) {
            addCriterion("zkzzdzdxczdl5 in", values, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5NotIn(List<String> values) {
            addCriterion("zkzzdzdxczdl5 not in", values, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5Between(String value1, String value2) {
            addCriterion("zkzzdzdxczdl5 between", value1, value2, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZkzzdzdxczdl5NotBetween(String value1, String value2) {
            addCriterion("zkzzdzdxczdl5 not between", value1, value2, "zkzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1IsNull() {
            addCriterion("zjzzdzdxczdl1 is null");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1IsNotNull() {
            addCriterion("zjzzdzdxczdl1 is not null");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1EqualTo(String value) {
            addCriterion("zjzzdzdxczdl1 =", value, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1NotEqualTo(String value) {
            addCriterion("zjzzdzdxczdl1 <>", value, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1GreaterThan(String value) {
            addCriterion("zjzzdzdxczdl1 >", value, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1GreaterThanOrEqualTo(String value) {
            addCriterion("zjzzdzdxczdl1 >=", value, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1LessThan(String value) {
            addCriterion("zjzzdzdxczdl1 <", value, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1LessThanOrEqualTo(String value) {
            addCriterion("zjzzdzdxczdl1 <=", value, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1Like(String value) {
            addCriterion("zjzzdzdxczdl1 like", value, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1NotLike(String value) {
            addCriterion("zjzzdzdxczdl1 not like", value, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1In(List<String> values) {
            addCriterion("zjzzdzdxczdl1 in", values, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1NotIn(List<String> values) {
            addCriterion("zjzzdzdxczdl1 not in", values, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1Between(String value1, String value2) {
            addCriterion("zjzzdzdxczdl1 between", value1, value2, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl1NotBetween(String value1, String value2) {
            addCriterion("zjzzdzdxczdl1 not between", value1, value2, "zjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2IsNull() {
            addCriterion("zjzzdzdxczdl2 is null");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2IsNotNull() {
            addCriterion("zjzzdzdxczdl2 is not null");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2EqualTo(String value) {
            addCriterion("zjzzdzdxczdl2 =", value, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2NotEqualTo(String value) {
            addCriterion("zjzzdzdxczdl2 <>", value, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2GreaterThan(String value) {
            addCriterion("zjzzdzdxczdl2 >", value, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2GreaterThanOrEqualTo(String value) {
            addCriterion("zjzzdzdxczdl2 >=", value, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2LessThan(String value) {
            addCriterion("zjzzdzdxczdl2 <", value, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2LessThanOrEqualTo(String value) {
            addCriterion("zjzzdzdxczdl2 <=", value, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2Like(String value) {
            addCriterion("zjzzdzdxczdl2 like", value, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2NotLike(String value) {
            addCriterion("zjzzdzdxczdl2 not like", value, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2In(List<String> values) {
            addCriterion("zjzzdzdxczdl2 in", values, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2NotIn(List<String> values) {
            addCriterion("zjzzdzdxczdl2 not in", values, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2Between(String value1, String value2) {
            addCriterion("zjzzdzdxczdl2 between", value1, value2, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl2NotBetween(String value1, String value2) {
            addCriterion("zjzzdzdxczdl2 not between", value1, value2, "zjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3IsNull() {
            addCriterion("zjzzdzdxczdl3 is null");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3IsNotNull() {
            addCriterion("zjzzdzdxczdl3 is not null");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3EqualTo(String value) {
            addCriterion("zjzzdzdxczdl3 =", value, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3NotEqualTo(String value) {
            addCriterion("zjzzdzdxczdl3 <>", value, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3GreaterThan(String value) {
            addCriterion("zjzzdzdxczdl3 >", value, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3GreaterThanOrEqualTo(String value) {
            addCriterion("zjzzdzdxczdl3 >=", value, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3LessThan(String value) {
            addCriterion("zjzzdzdxczdl3 <", value, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3LessThanOrEqualTo(String value) {
            addCriterion("zjzzdzdxczdl3 <=", value, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3Like(String value) {
            addCriterion("zjzzdzdxczdl3 like", value, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3NotLike(String value) {
            addCriterion("zjzzdzdxczdl3 not like", value, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3In(List<String> values) {
            addCriterion("zjzzdzdxczdl3 in", values, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3NotIn(List<String> values) {
            addCriterion("zjzzdzdxczdl3 not in", values, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3Between(String value1, String value2) {
            addCriterion("zjzzdzdxczdl3 between", value1, value2, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl3NotBetween(String value1, String value2) {
            addCriterion("zjzzdzdxczdl3 not between", value1, value2, "zjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4IsNull() {
            addCriterion("zjzzdzdxczdl4 is null");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4IsNotNull() {
            addCriterion("zjzzdzdxczdl4 is not null");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4EqualTo(String value) {
            addCriterion("zjzzdzdxczdl4 =", value, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4NotEqualTo(String value) {
            addCriterion("zjzzdzdxczdl4 <>", value, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4GreaterThan(String value) {
            addCriterion("zjzzdzdxczdl4 >", value, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4GreaterThanOrEqualTo(String value) {
            addCriterion("zjzzdzdxczdl4 >=", value, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4LessThan(String value) {
            addCriterion("zjzzdzdxczdl4 <", value, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4LessThanOrEqualTo(String value) {
            addCriterion("zjzzdzdxczdl4 <=", value, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4Like(String value) {
            addCriterion("zjzzdzdxczdl4 like", value, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4NotLike(String value) {
            addCriterion("zjzzdzdxczdl4 not like", value, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4In(List<String> values) {
            addCriterion("zjzzdzdxczdl4 in", values, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4NotIn(List<String> values) {
            addCriterion("zjzzdzdxczdl4 not in", values, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4Between(String value1, String value2) {
            addCriterion("zjzzdzdxczdl4 between", value1, value2, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZjzzdzdxczdl4NotBetween(String value1, String value2) {
            addCriterion("zjzzdzdxczdl4 not between", value1, value2, "zjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlIsNull() {
            addCriterion("zhekzjzzdxczdl is null");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlIsNotNull() {
            addCriterion("zhekzjzzdxczdl is not null");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlEqualTo(String value) {
            addCriterion("zhekzjzzdxczdl =", value, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlNotEqualTo(String value) {
            addCriterion("zhekzjzzdxczdl <>", value, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlGreaterThan(String value) {
            addCriterion("zhekzjzzdxczdl >", value, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlGreaterThanOrEqualTo(String value) {
            addCriterion("zhekzjzzdxczdl >=", value, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlLessThan(String value) {
            addCriterion("zhekzjzzdxczdl <", value, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlLessThanOrEqualTo(String value) {
            addCriterion("zhekzjzzdxczdl <=", value, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlLike(String value) {
            addCriterion("zhekzjzzdxczdl like", value, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlNotLike(String value) {
            addCriterion("zhekzjzzdxczdl not like", value, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlIn(List<String> values) {
            addCriterion("zhekzjzzdxczdl in", values, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlNotIn(List<String> values) {
            addCriterion("zhekzjzzdxczdl not in", values, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlBetween(String value1, String value2) {
            addCriterion("zhekzjzzdxczdl between", value1, value2, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhekzjzzdxczdlNotBetween(String value1, String value2) {
            addCriterion("zhekzjzzdxczdl not between", value1, value2, "zhekzjzzdxczdl");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1IsNull() {
            addCriterion("ykzzdzdxczdl1 is null");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1IsNotNull() {
            addCriterion("ykzzdzdxczdl1 is not null");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1EqualTo(String value) {
            addCriterion("ykzzdzdxczdl1 =", value, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1NotEqualTo(String value) {
            addCriterion("ykzzdzdxczdl1 <>", value, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1GreaterThan(String value) {
            addCriterion("ykzzdzdxczdl1 >", value, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1GreaterThanOrEqualTo(String value) {
            addCriterion("ykzzdzdxczdl1 >=", value, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1LessThan(String value) {
            addCriterion("ykzzdzdxczdl1 <", value, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1LessThanOrEqualTo(String value) {
            addCriterion("ykzzdzdxczdl1 <=", value, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1Like(String value) {
            addCriterion("ykzzdzdxczdl1 like", value, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1NotLike(String value) {
            addCriterion("ykzzdzdxczdl1 not like", value, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1In(List<String> values) {
            addCriterion("ykzzdzdxczdl1 in", values, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1NotIn(List<String> values) {
            addCriterion("ykzzdzdxczdl1 not in", values, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1Between(String value1, String value2) {
            addCriterion("ykzzdzdxczdl1 between", value1, value2, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl1NotBetween(String value1, String value2) {
            addCriterion("ykzzdzdxczdl1 not between", value1, value2, "ykzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2IsNull() {
            addCriterion("ykzzdzdxczdl2 is null");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2IsNotNull() {
            addCriterion("ykzzdzdxczdl2 is not null");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2EqualTo(String value) {
            addCriterion("ykzzdzdxczdl2 =", value, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2NotEqualTo(String value) {
            addCriterion("ykzzdzdxczdl2 <>", value, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2GreaterThan(String value) {
            addCriterion("ykzzdzdxczdl2 >", value, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2GreaterThanOrEqualTo(String value) {
            addCriterion("ykzzdzdxczdl2 >=", value, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2LessThan(String value) {
            addCriterion("ykzzdzdxczdl2 <", value, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2LessThanOrEqualTo(String value) {
            addCriterion("ykzzdzdxczdl2 <=", value, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2Like(String value) {
            addCriterion("ykzzdzdxczdl2 like", value, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2NotLike(String value) {
            addCriterion("ykzzdzdxczdl2 not like", value, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2In(List<String> values) {
            addCriterion("ykzzdzdxczdl2 in", values, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2NotIn(List<String> values) {
            addCriterion("ykzzdzdxczdl2 not in", values, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2Between(String value1, String value2) {
            addCriterion("ykzzdzdxczdl2 between", value1, value2, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl2NotBetween(String value1, String value2) {
            addCriterion("ykzzdzdxczdl2 not between", value1, value2, "ykzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3IsNull() {
            addCriterion("ykzzdzdxczdl3 is null");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3IsNotNull() {
            addCriterion("ykzzdzdxczdl3 is not null");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3EqualTo(String value) {
            addCriterion("ykzzdzdxczdl3 =", value, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3NotEqualTo(String value) {
            addCriterion("ykzzdzdxczdl3 <>", value, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3GreaterThan(String value) {
            addCriterion("ykzzdzdxczdl3 >", value, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3GreaterThanOrEqualTo(String value) {
            addCriterion("ykzzdzdxczdl3 >=", value, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3LessThan(String value) {
            addCriterion("ykzzdzdxczdl3 <", value, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3LessThanOrEqualTo(String value) {
            addCriterion("ykzzdzdxczdl3 <=", value, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3Like(String value) {
            addCriterion("ykzzdzdxczdl3 like", value, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3NotLike(String value) {
            addCriterion("ykzzdzdxczdl3 not like", value, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3In(List<String> values) {
            addCriterion("ykzzdzdxczdl3 in", values, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3NotIn(List<String> values) {
            addCriterion("ykzzdzdxczdl3 not in", values, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3Between(String value1, String value2) {
            addCriterion("ykzzdzdxczdl3 between", value1, value2, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl3NotBetween(String value1, String value2) {
            addCriterion("ykzzdzdxczdl3 not between", value1, value2, "ykzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4IsNull() {
            addCriterion("ykzzdzdxczdl4 is null");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4IsNotNull() {
            addCriterion("ykzzdzdxczdl4 is not null");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4EqualTo(String value) {
            addCriterion("ykzzdzdxczdl4 =", value, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4NotEqualTo(String value) {
            addCriterion("ykzzdzdxczdl4 <>", value, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4GreaterThan(String value) {
            addCriterion("ykzzdzdxczdl4 >", value, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4GreaterThanOrEqualTo(String value) {
            addCriterion("ykzzdzdxczdl4 >=", value, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4LessThan(String value) {
            addCriterion("ykzzdzdxczdl4 <", value, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4LessThanOrEqualTo(String value) {
            addCriterion("ykzzdzdxczdl4 <=", value, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4Like(String value) {
            addCriterion("ykzzdzdxczdl4 like", value, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4NotLike(String value) {
            addCriterion("ykzzdzdxczdl4 not like", value, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4In(List<String> values) {
            addCriterion("ykzzdzdxczdl4 in", values, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4NotIn(List<String> values) {
            addCriterion("ykzzdzdxczdl4 not in", values, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4Between(String value1, String value2) {
            addCriterion("ykzzdzdxczdl4 between", value1, value2, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl4NotBetween(String value1, String value2) {
            addCriterion("ykzzdzdxczdl4 not between", value1, value2, "ykzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5IsNull() {
            addCriterion("ykzzdzdxczdl5 is null");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5IsNotNull() {
            addCriterion("ykzzdzdxczdl5 is not null");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5EqualTo(String value) {
            addCriterion("ykzzdzdxczdl5 =", value, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5NotEqualTo(String value) {
            addCriterion("ykzzdzdxczdl5 <>", value, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5GreaterThan(String value) {
            addCriterion("ykzzdzdxczdl5 >", value, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5GreaterThanOrEqualTo(String value) {
            addCriterion("ykzzdzdxczdl5 >=", value, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5LessThan(String value) {
            addCriterion("ykzzdzdxczdl5 <", value, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5LessThanOrEqualTo(String value) {
            addCriterion("ykzzdzdxczdl5 <=", value, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5Like(String value) {
            addCriterion("ykzzdzdxczdl5 like", value, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5NotLike(String value) {
            addCriterion("ykzzdzdxczdl5 not like", value, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5In(List<String> values) {
            addCriterion("ykzzdzdxczdl5 in", values, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5NotIn(List<String> values) {
            addCriterion("ykzzdzdxczdl5 not in", values, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5Between(String value1, String value2) {
            addCriterion("ykzzdzdxczdl5 between", value1, value2, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYkzzdzdxczdl5NotBetween(String value1, String value2) {
            addCriterion("ykzzdzdxczdl5 not between", value1, value2, "ykzzdzdxczdl5");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1IsNull() {
            addCriterion("yjzzdzdxczdl1 is null");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1IsNotNull() {
            addCriterion("yjzzdzdxczdl1 is not null");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1EqualTo(String value) {
            addCriterion("yjzzdzdxczdl1 =", value, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1NotEqualTo(String value) {
            addCriterion("yjzzdzdxczdl1 <>", value, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1GreaterThan(String value) {
            addCriterion("yjzzdzdxczdl1 >", value, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1GreaterThanOrEqualTo(String value) {
            addCriterion("yjzzdzdxczdl1 >=", value, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1LessThan(String value) {
            addCriterion("yjzzdzdxczdl1 <", value, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1LessThanOrEqualTo(String value) {
            addCriterion("yjzzdzdxczdl1 <=", value, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1Like(String value) {
            addCriterion("yjzzdzdxczdl1 like", value, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1NotLike(String value) {
            addCriterion("yjzzdzdxczdl1 not like", value, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1In(List<String> values) {
            addCriterion("yjzzdzdxczdl1 in", values, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1NotIn(List<String> values) {
            addCriterion("yjzzdzdxczdl1 not in", values, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1Between(String value1, String value2) {
            addCriterion("yjzzdzdxczdl1 between", value1, value2, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl1NotBetween(String value1, String value2) {
            addCriterion("yjzzdzdxczdl1 not between", value1, value2, "yjzzdzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2IsNull() {
            addCriterion("yjzzdzdxczdl2 is null");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2IsNotNull() {
            addCriterion("yjzzdzdxczdl2 is not null");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2EqualTo(String value) {
            addCriterion("yjzzdzdxczdl2 =", value, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2NotEqualTo(String value) {
            addCriterion("yjzzdzdxczdl2 <>", value, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2GreaterThan(String value) {
            addCriterion("yjzzdzdxczdl2 >", value, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2GreaterThanOrEqualTo(String value) {
            addCriterion("yjzzdzdxczdl2 >=", value, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2LessThan(String value) {
            addCriterion("yjzzdzdxczdl2 <", value, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2LessThanOrEqualTo(String value) {
            addCriterion("yjzzdzdxczdl2 <=", value, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2Like(String value) {
            addCriterion("yjzzdzdxczdl2 like", value, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2NotLike(String value) {
            addCriterion("yjzzdzdxczdl2 not like", value, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2In(List<String> values) {
            addCriterion("yjzzdzdxczdl2 in", values, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2NotIn(List<String> values) {
            addCriterion("yjzzdzdxczdl2 not in", values, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2Between(String value1, String value2) {
            addCriterion("yjzzdzdxczdl2 between", value1, value2, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl2NotBetween(String value1, String value2) {
            addCriterion("yjzzdzdxczdl2 not between", value1, value2, "yjzzdzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3IsNull() {
            addCriterion("yjzzdzdxczdl3 is null");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3IsNotNull() {
            addCriterion("yjzzdzdxczdl3 is not null");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3EqualTo(String value) {
            addCriterion("yjzzdzdxczdl3 =", value, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3NotEqualTo(String value) {
            addCriterion("yjzzdzdxczdl3 <>", value, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3GreaterThan(String value) {
            addCriterion("yjzzdzdxczdl3 >", value, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3GreaterThanOrEqualTo(String value) {
            addCriterion("yjzzdzdxczdl3 >=", value, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3LessThan(String value) {
            addCriterion("yjzzdzdxczdl3 <", value, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3LessThanOrEqualTo(String value) {
            addCriterion("yjzzdzdxczdl3 <=", value, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3Like(String value) {
            addCriterion("yjzzdzdxczdl3 like", value, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3NotLike(String value) {
            addCriterion("yjzzdzdxczdl3 not like", value, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3In(List<String> values) {
            addCriterion("yjzzdzdxczdl3 in", values, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3NotIn(List<String> values) {
            addCriterion("yjzzdzdxczdl3 not in", values, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3Between(String value1, String value2) {
            addCriterion("yjzzdzdxczdl3 between", value1, value2, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl3NotBetween(String value1, String value2) {
            addCriterion("yjzzdzdxczdl3 not between", value1, value2, "yjzzdzdxczdl3");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4IsNull() {
            addCriterion("yjzzdzdxczdl4 is null");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4IsNotNull() {
            addCriterion("yjzzdzdxczdl4 is not null");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4EqualTo(String value) {
            addCriterion("yjzzdzdxczdl4 =", value, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4NotEqualTo(String value) {
            addCriterion("yjzzdzdxczdl4 <>", value, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4GreaterThan(String value) {
            addCriterion("yjzzdzdxczdl4 >", value, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4GreaterThanOrEqualTo(String value) {
            addCriterion("yjzzdzdxczdl4 >=", value, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4LessThan(String value) {
            addCriterion("yjzzdzdxczdl4 <", value, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4LessThanOrEqualTo(String value) {
            addCriterion("yjzzdzdxczdl4 <=", value, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4Like(String value) {
            addCriterion("yjzzdzdxczdl4 like", value, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4NotLike(String value) {
            addCriterion("yjzzdzdxczdl4 not like", value, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4In(List<String> values) {
            addCriterion("yjzzdzdxczdl4 in", values, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4NotIn(List<String> values) {
            addCriterion("yjzzdzdxczdl4 not in", values, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4Between(String value1, String value2) {
            addCriterion("yjzzdzdxczdl4 between", value1, value2, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andYjzzdzdxczdl4NotBetween(String value1, String value2) {
            addCriterion("yjzzdzdxczdl4 not between", value1, value2, "yjzzdzdxczdl4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1IsNull() {
            addCriterion("zkzzdgcczdczd1 is null");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1IsNotNull() {
            addCriterion("zkzzdgcczdczd1 is not null");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1EqualTo(String value) {
            addCriterion("zkzzdgcczdczd1 =", value, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1NotEqualTo(String value) {
            addCriterion("zkzzdgcczdczd1 <>", value, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1GreaterThan(String value) {
            addCriterion("zkzzdgcczdczd1 >", value, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1GreaterThanOrEqualTo(String value) {
            addCriterion("zkzzdgcczdczd1 >=", value, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1LessThan(String value) {
            addCriterion("zkzzdgcczdczd1 <", value, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1LessThanOrEqualTo(String value) {
            addCriterion("zkzzdgcczdczd1 <=", value, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1Like(String value) {
            addCriterion("zkzzdgcczdczd1 like", value, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1NotLike(String value) {
            addCriterion("zkzzdgcczdczd1 not like", value, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1In(List<String> values) {
            addCriterion("zkzzdgcczdczd1 in", values, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1NotIn(List<String> values) {
            addCriterion("zkzzdgcczdczd1 not in", values, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1Between(String value1, String value2) {
            addCriterion("zkzzdgcczdczd1 between", value1, value2, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd1NotBetween(String value1, String value2) {
            addCriterion("zkzzdgcczdczd1 not between", value1, value2, "zkzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2IsNull() {
            addCriterion("zkzzdgcczdczd2 is null");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2IsNotNull() {
            addCriterion("zkzzdgcczdczd2 is not null");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2EqualTo(String value) {
            addCriterion("zkzzdgcczdczd2 =", value, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2NotEqualTo(String value) {
            addCriterion("zkzzdgcczdczd2 <>", value, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2GreaterThan(String value) {
            addCriterion("zkzzdgcczdczd2 >", value, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2GreaterThanOrEqualTo(String value) {
            addCriterion("zkzzdgcczdczd2 >=", value, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2LessThan(String value) {
            addCriterion("zkzzdgcczdczd2 <", value, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2LessThanOrEqualTo(String value) {
            addCriterion("zkzzdgcczdczd2 <=", value, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2Like(String value) {
            addCriterion("zkzzdgcczdczd2 like", value, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2NotLike(String value) {
            addCriterion("zkzzdgcczdczd2 not like", value, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2In(List<String> values) {
            addCriterion("zkzzdgcczdczd2 in", values, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2NotIn(List<String> values) {
            addCriterion("zkzzdgcczdczd2 not in", values, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2Between(String value1, String value2) {
            addCriterion("zkzzdgcczdczd2 between", value1, value2, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd2NotBetween(String value1, String value2) {
            addCriterion("zkzzdgcczdczd2 not between", value1, value2, "zkzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3IsNull() {
            addCriterion("zkzzdgcczdczd3 is null");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3IsNotNull() {
            addCriterion("zkzzdgcczdczd3 is not null");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3EqualTo(String value) {
            addCriterion("zkzzdgcczdczd3 =", value, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3NotEqualTo(String value) {
            addCriterion("zkzzdgcczdczd3 <>", value, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3GreaterThan(String value) {
            addCriterion("zkzzdgcczdczd3 >", value, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3GreaterThanOrEqualTo(String value) {
            addCriterion("zkzzdgcczdczd3 >=", value, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3LessThan(String value) {
            addCriterion("zkzzdgcczdczd3 <", value, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3LessThanOrEqualTo(String value) {
            addCriterion("zkzzdgcczdczd3 <=", value, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3Like(String value) {
            addCriterion("zkzzdgcczdczd3 like", value, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3NotLike(String value) {
            addCriterion("zkzzdgcczdczd3 not like", value, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3In(List<String> values) {
            addCriterion("zkzzdgcczdczd3 in", values, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3NotIn(List<String> values) {
            addCriterion("zkzzdgcczdczd3 not in", values, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3Between(String value1, String value2) {
            addCriterion("zkzzdgcczdczd3 between", value1, value2, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd3NotBetween(String value1, String value2) {
            addCriterion("zkzzdgcczdczd3 not between", value1, value2, "zkzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4IsNull() {
            addCriterion("zkzzdgcczdczd4 is null");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4IsNotNull() {
            addCriterion("zkzzdgcczdczd4 is not null");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4EqualTo(String value) {
            addCriterion("zkzzdgcczdczd4 =", value, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4NotEqualTo(String value) {
            addCriterion("zkzzdgcczdczd4 <>", value, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4GreaterThan(String value) {
            addCriterion("zkzzdgcczdczd4 >", value, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4GreaterThanOrEqualTo(String value) {
            addCriterion("zkzzdgcczdczd4 >=", value, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4LessThan(String value) {
            addCriterion("zkzzdgcczdczd4 <", value, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4LessThanOrEqualTo(String value) {
            addCriterion("zkzzdgcczdczd4 <=", value, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4Like(String value) {
            addCriterion("zkzzdgcczdczd4 like", value, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4NotLike(String value) {
            addCriterion("zkzzdgcczdczd4 not like", value, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4In(List<String> values) {
            addCriterion("zkzzdgcczdczd4 in", values, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4NotIn(List<String> values) {
            addCriterion("zkzzdgcczdczd4 not in", values, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4Between(String value1, String value2) {
            addCriterion("zkzzdgcczdczd4 between", value1, value2, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd4NotBetween(String value1, String value2) {
            addCriterion("zkzzdgcczdczd4 not between", value1, value2, "zkzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5IsNull() {
            addCriterion("zkzzdgcczdczd5 is null");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5IsNotNull() {
            addCriterion("zkzzdgcczdczd5 is not null");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5EqualTo(String value) {
            addCriterion("zkzzdgcczdczd5 =", value, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5NotEqualTo(String value) {
            addCriterion("zkzzdgcczdczd5 <>", value, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5GreaterThan(String value) {
            addCriterion("zkzzdgcczdczd5 >", value, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5GreaterThanOrEqualTo(String value) {
            addCriterion("zkzzdgcczdczd5 >=", value, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5LessThan(String value) {
            addCriterion("zkzzdgcczdczd5 <", value, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5LessThanOrEqualTo(String value) {
            addCriterion("zkzzdgcczdczd5 <=", value, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5Like(String value) {
            addCriterion("zkzzdgcczdczd5 like", value, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5NotLike(String value) {
            addCriterion("zkzzdgcczdczd5 not like", value, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5In(List<String> values) {
            addCriterion("zkzzdgcczdczd5 in", values, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5NotIn(List<String> values) {
            addCriterion("zkzzdgcczdczd5 not in", values, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5Between(String value1, String value2) {
            addCriterion("zkzzdgcczdczd5 between", value1, value2, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZkzzdgcczdczd5NotBetween(String value1, String value2) {
            addCriterion("zkzzdgcczdczd5 not between", value1, value2, "zkzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1IsNull() {
            addCriterion("zjzzdgcczdczd1 is null");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1IsNotNull() {
            addCriterion("zjzzdgcczdczd1 is not null");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1EqualTo(String value) {
            addCriterion("zjzzdgcczdczd1 =", value, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1NotEqualTo(String value) {
            addCriterion("zjzzdgcczdczd1 <>", value, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1GreaterThan(String value) {
            addCriterion("zjzzdgcczdczd1 >", value, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1GreaterThanOrEqualTo(String value) {
            addCriterion("zjzzdgcczdczd1 >=", value, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1LessThan(String value) {
            addCriterion("zjzzdgcczdczd1 <", value, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1LessThanOrEqualTo(String value) {
            addCriterion("zjzzdgcczdczd1 <=", value, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1Like(String value) {
            addCriterion("zjzzdgcczdczd1 like", value, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1NotLike(String value) {
            addCriterion("zjzzdgcczdczd1 not like", value, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1In(List<String> values) {
            addCriterion("zjzzdgcczdczd1 in", values, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1NotIn(List<String> values) {
            addCriterion("zjzzdgcczdczd1 not in", values, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1Between(String value1, String value2) {
            addCriterion("zjzzdgcczdczd1 between", value1, value2, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd1NotBetween(String value1, String value2) {
            addCriterion("zjzzdgcczdczd1 not between", value1, value2, "zjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2IsNull() {
            addCriterion("zjzzdgcczdczd2 is null");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2IsNotNull() {
            addCriterion("zjzzdgcczdczd2 is not null");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2EqualTo(String value) {
            addCriterion("zjzzdgcczdczd2 =", value, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2NotEqualTo(String value) {
            addCriterion("zjzzdgcczdczd2 <>", value, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2GreaterThan(String value) {
            addCriterion("zjzzdgcczdczd2 >", value, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2GreaterThanOrEqualTo(String value) {
            addCriterion("zjzzdgcczdczd2 >=", value, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2LessThan(String value) {
            addCriterion("zjzzdgcczdczd2 <", value, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2LessThanOrEqualTo(String value) {
            addCriterion("zjzzdgcczdczd2 <=", value, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2Like(String value) {
            addCriterion("zjzzdgcczdczd2 like", value, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2NotLike(String value) {
            addCriterion("zjzzdgcczdczd2 not like", value, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2In(List<String> values) {
            addCriterion("zjzzdgcczdczd2 in", values, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2NotIn(List<String> values) {
            addCriterion("zjzzdgcczdczd2 not in", values, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2Between(String value1, String value2) {
            addCriterion("zjzzdgcczdczd2 between", value1, value2, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd2NotBetween(String value1, String value2) {
            addCriterion("zjzzdgcczdczd2 not between", value1, value2, "zjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3IsNull() {
            addCriterion("zjzzdgcczdczd3 is null");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3IsNotNull() {
            addCriterion("zjzzdgcczdczd3 is not null");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3EqualTo(String value) {
            addCriterion("zjzzdgcczdczd3 =", value, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3NotEqualTo(String value) {
            addCriterion("zjzzdgcczdczd3 <>", value, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3GreaterThan(String value) {
            addCriterion("zjzzdgcczdczd3 >", value, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3GreaterThanOrEqualTo(String value) {
            addCriterion("zjzzdgcczdczd3 >=", value, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3LessThan(String value) {
            addCriterion("zjzzdgcczdczd3 <", value, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3LessThanOrEqualTo(String value) {
            addCriterion("zjzzdgcczdczd3 <=", value, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3Like(String value) {
            addCriterion("zjzzdgcczdczd3 like", value, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3NotLike(String value) {
            addCriterion("zjzzdgcczdczd3 not like", value, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3In(List<String> values) {
            addCriterion("zjzzdgcczdczd3 in", values, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3NotIn(List<String> values) {
            addCriterion("zjzzdgcczdczd3 not in", values, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3Between(String value1, String value2) {
            addCriterion("zjzzdgcczdczd3 between", value1, value2, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd3NotBetween(String value1, String value2) {
            addCriterion("zjzzdgcczdczd3 not between", value1, value2, "zjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4IsNull() {
            addCriterion("zjzzdgcczdczd4 is null");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4IsNotNull() {
            addCriterion("zjzzdgcczdczd4 is not null");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4EqualTo(String value) {
            addCriterion("zjzzdgcczdczd4 =", value, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4NotEqualTo(String value) {
            addCriterion("zjzzdgcczdczd4 <>", value, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4GreaterThan(String value) {
            addCriterion("zjzzdgcczdczd4 >", value, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4GreaterThanOrEqualTo(String value) {
            addCriterion("zjzzdgcczdczd4 >=", value, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4LessThan(String value) {
            addCriterion("zjzzdgcczdczd4 <", value, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4LessThanOrEqualTo(String value) {
            addCriterion("zjzzdgcczdczd4 <=", value, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4Like(String value) {
            addCriterion("zjzzdgcczdczd4 like", value, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4NotLike(String value) {
            addCriterion("zjzzdgcczdczd4 not like", value, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4In(List<String> values) {
            addCriterion("zjzzdgcczdczd4 in", values, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4NotIn(List<String> values) {
            addCriterion("zjzzdgcczdczd4 not in", values, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4Between(String value1, String value2) {
            addCriterion("zjzzdgcczdczd4 between", value1, value2, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andZjzzdgcczdczd4NotBetween(String value1, String value2) {
            addCriterion("zjzzdgcczdczd4 not between", value1, value2, "zjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1IsNull() {
            addCriterion("ykzzdgcczdczd1 is null");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1IsNotNull() {
            addCriterion("ykzzdgcczdczd1 is not null");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1EqualTo(String value) {
            addCriterion("ykzzdgcczdczd1 =", value, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1NotEqualTo(String value) {
            addCriterion("ykzzdgcczdczd1 <>", value, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1GreaterThan(String value) {
            addCriterion("ykzzdgcczdczd1 >", value, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1GreaterThanOrEqualTo(String value) {
            addCriterion("ykzzdgcczdczd1 >=", value, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1LessThan(String value) {
            addCriterion("ykzzdgcczdczd1 <", value, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1LessThanOrEqualTo(String value) {
            addCriterion("ykzzdgcczdczd1 <=", value, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1Like(String value) {
            addCriterion("ykzzdgcczdczd1 like", value, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1NotLike(String value) {
            addCriterion("ykzzdgcczdczd1 not like", value, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1In(List<String> values) {
            addCriterion("ykzzdgcczdczd1 in", values, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1NotIn(List<String> values) {
            addCriterion("ykzzdgcczdczd1 not in", values, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1Between(String value1, String value2) {
            addCriterion("ykzzdgcczdczd1 between", value1, value2, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd1NotBetween(String value1, String value2) {
            addCriterion("ykzzdgcczdczd1 not between", value1, value2, "ykzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2IsNull() {
            addCriterion("ykzzdgcczdczd2 is null");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2IsNotNull() {
            addCriterion("ykzzdgcczdczd2 is not null");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2EqualTo(String value) {
            addCriterion("ykzzdgcczdczd2 =", value, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2NotEqualTo(String value) {
            addCriterion("ykzzdgcczdczd2 <>", value, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2GreaterThan(String value) {
            addCriterion("ykzzdgcczdczd2 >", value, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2GreaterThanOrEqualTo(String value) {
            addCriterion("ykzzdgcczdczd2 >=", value, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2LessThan(String value) {
            addCriterion("ykzzdgcczdczd2 <", value, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2LessThanOrEqualTo(String value) {
            addCriterion("ykzzdgcczdczd2 <=", value, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2Like(String value) {
            addCriterion("ykzzdgcczdczd2 like", value, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2NotLike(String value) {
            addCriterion("ykzzdgcczdczd2 not like", value, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2In(List<String> values) {
            addCriterion("ykzzdgcczdczd2 in", values, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2NotIn(List<String> values) {
            addCriterion("ykzzdgcczdczd2 not in", values, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2Between(String value1, String value2) {
            addCriterion("ykzzdgcczdczd2 between", value1, value2, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd2NotBetween(String value1, String value2) {
            addCriterion("ykzzdgcczdczd2 not between", value1, value2, "ykzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3IsNull() {
            addCriterion("ykzzdgcczdczd3 is null");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3IsNotNull() {
            addCriterion("ykzzdgcczdczd3 is not null");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3EqualTo(String value) {
            addCriterion("ykzzdgcczdczd3 =", value, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3NotEqualTo(String value) {
            addCriterion("ykzzdgcczdczd3 <>", value, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3GreaterThan(String value) {
            addCriterion("ykzzdgcczdczd3 >", value, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3GreaterThanOrEqualTo(String value) {
            addCriterion("ykzzdgcczdczd3 >=", value, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3LessThan(String value) {
            addCriterion("ykzzdgcczdczd3 <", value, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3LessThanOrEqualTo(String value) {
            addCriterion("ykzzdgcczdczd3 <=", value, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3Like(String value) {
            addCriterion("ykzzdgcczdczd3 like", value, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3NotLike(String value) {
            addCriterion("ykzzdgcczdczd3 not like", value, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3In(List<String> values) {
            addCriterion("ykzzdgcczdczd3 in", values, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3NotIn(List<String> values) {
            addCriterion("ykzzdgcczdczd3 not in", values, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3Between(String value1, String value2) {
            addCriterion("ykzzdgcczdczd3 between", value1, value2, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd3NotBetween(String value1, String value2) {
            addCriterion("ykzzdgcczdczd3 not between", value1, value2, "ykzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4IsNull() {
            addCriterion("ykzzdgcczdczd4 is null");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4IsNotNull() {
            addCriterion("ykzzdgcczdczd4 is not null");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4EqualTo(String value) {
            addCriterion("ykzzdgcczdczd4 =", value, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4NotEqualTo(String value) {
            addCriterion("ykzzdgcczdczd4 <>", value, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4GreaterThan(String value) {
            addCriterion("ykzzdgcczdczd4 >", value, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4GreaterThanOrEqualTo(String value) {
            addCriterion("ykzzdgcczdczd4 >=", value, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4LessThan(String value) {
            addCriterion("ykzzdgcczdczd4 <", value, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4LessThanOrEqualTo(String value) {
            addCriterion("ykzzdgcczdczd4 <=", value, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4Like(String value) {
            addCriterion("ykzzdgcczdczd4 like", value, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4NotLike(String value) {
            addCriterion("ykzzdgcczdczd4 not like", value, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4In(List<String> values) {
            addCriterion("ykzzdgcczdczd4 in", values, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4NotIn(List<String> values) {
            addCriterion("ykzzdgcczdczd4 not in", values, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4Between(String value1, String value2) {
            addCriterion("ykzzdgcczdczd4 between", value1, value2, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd4NotBetween(String value1, String value2) {
            addCriterion("ykzzdgcczdczd4 not between", value1, value2, "ykzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5IsNull() {
            addCriterion("ykzzdgcczdczd5 is null");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5IsNotNull() {
            addCriterion("ykzzdgcczdczd5 is not null");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5EqualTo(String value) {
            addCriterion("ykzzdgcczdczd5 =", value, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5NotEqualTo(String value) {
            addCriterion("ykzzdgcczdczd5 <>", value, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5GreaterThan(String value) {
            addCriterion("ykzzdgcczdczd5 >", value, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5GreaterThanOrEqualTo(String value) {
            addCriterion("ykzzdgcczdczd5 >=", value, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5LessThan(String value) {
            addCriterion("ykzzdgcczdczd5 <", value, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5LessThanOrEqualTo(String value) {
            addCriterion("ykzzdgcczdczd5 <=", value, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5Like(String value) {
            addCriterion("ykzzdgcczdczd5 like", value, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5NotLike(String value) {
            addCriterion("ykzzdgcczdczd5 not like", value, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5In(List<String> values) {
            addCriterion("ykzzdgcczdczd5 in", values, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5NotIn(List<String> values) {
            addCriterion("ykzzdgcczdczd5 not in", values, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5Between(String value1, String value2) {
            addCriterion("ykzzdgcczdczd5 between", value1, value2, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYkzzdgcczdczd5NotBetween(String value1, String value2) {
            addCriterion("ykzzdgcczdczd5 not between", value1, value2, "ykzzdgcczdczd5");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1IsNull() {
            addCriterion("yjzzdgcczdczd1 is null");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1IsNotNull() {
            addCriterion("yjzzdgcczdczd1 is not null");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1EqualTo(String value) {
            addCriterion("yjzzdgcczdczd1 =", value, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1NotEqualTo(String value) {
            addCriterion("yjzzdgcczdczd1 <>", value, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1GreaterThan(String value) {
            addCriterion("yjzzdgcczdczd1 >", value, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1GreaterThanOrEqualTo(String value) {
            addCriterion("yjzzdgcczdczd1 >=", value, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1LessThan(String value) {
            addCriterion("yjzzdgcczdczd1 <", value, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1LessThanOrEqualTo(String value) {
            addCriterion("yjzzdgcczdczd1 <=", value, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1Like(String value) {
            addCriterion("yjzzdgcczdczd1 like", value, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1NotLike(String value) {
            addCriterion("yjzzdgcczdczd1 not like", value, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1In(List<String> values) {
            addCriterion("yjzzdgcczdczd1 in", values, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1NotIn(List<String> values) {
            addCriterion("yjzzdgcczdczd1 not in", values, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1Between(String value1, String value2) {
            addCriterion("yjzzdgcczdczd1 between", value1, value2, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd1NotBetween(String value1, String value2) {
            addCriterion("yjzzdgcczdczd1 not between", value1, value2, "yjzzdgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2IsNull() {
            addCriterion("yjzzdgcczdczd2 is null");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2IsNotNull() {
            addCriterion("yjzzdgcczdczd2 is not null");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2EqualTo(String value) {
            addCriterion("yjzzdgcczdczd2 =", value, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2NotEqualTo(String value) {
            addCriterion("yjzzdgcczdczd2 <>", value, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2GreaterThan(String value) {
            addCriterion("yjzzdgcczdczd2 >", value, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2GreaterThanOrEqualTo(String value) {
            addCriterion("yjzzdgcczdczd2 >=", value, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2LessThan(String value) {
            addCriterion("yjzzdgcczdczd2 <", value, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2LessThanOrEqualTo(String value) {
            addCriterion("yjzzdgcczdczd2 <=", value, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2Like(String value) {
            addCriterion("yjzzdgcczdczd2 like", value, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2NotLike(String value) {
            addCriterion("yjzzdgcczdczd2 not like", value, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2In(List<String> values) {
            addCriterion("yjzzdgcczdczd2 in", values, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2NotIn(List<String> values) {
            addCriterion("yjzzdgcczdczd2 not in", values, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2Between(String value1, String value2) {
            addCriterion("yjzzdgcczdczd2 between", value1, value2, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd2NotBetween(String value1, String value2) {
            addCriterion("yjzzdgcczdczd2 not between", value1, value2, "yjzzdgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3IsNull() {
            addCriterion("yjzzdgcczdczd3 is null");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3IsNotNull() {
            addCriterion("yjzzdgcczdczd3 is not null");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3EqualTo(String value) {
            addCriterion("yjzzdgcczdczd3 =", value, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3NotEqualTo(String value) {
            addCriterion("yjzzdgcczdczd3 <>", value, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3GreaterThan(String value) {
            addCriterion("yjzzdgcczdczd3 >", value, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3GreaterThanOrEqualTo(String value) {
            addCriterion("yjzzdgcczdczd3 >=", value, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3LessThan(String value) {
            addCriterion("yjzzdgcczdczd3 <", value, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3LessThanOrEqualTo(String value) {
            addCriterion("yjzzdgcczdczd3 <=", value, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3Like(String value) {
            addCriterion("yjzzdgcczdczd3 like", value, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3NotLike(String value) {
            addCriterion("yjzzdgcczdczd3 not like", value, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3In(List<String> values) {
            addCriterion("yjzzdgcczdczd3 in", values, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3NotIn(List<String> values) {
            addCriterion("yjzzdgcczdczd3 not in", values, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3Between(String value1, String value2) {
            addCriterion("yjzzdgcczdczd3 between", value1, value2, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd3NotBetween(String value1, String value2) {
            addCriterion("yjzzdgcczdczd3 not between", value1, value2, "yjzzdgcczdczd3");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4IsNull() {
            addCriterion("yjzzdgcczdczd4 is null");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4IsNotNull() {
            addCriterion("yjzzdgcczdczd4 is not null");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4EqualTo(String value) {
            addCriterion("yjzzdgcczdczd4 =", value, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4NotEqualTo(String value) {
            addCriterion("yjzzdgcczdczd4 <>", value, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4GreaterThan(String value) {
            addCriterion("yjzzdgcczdczd4 >", value, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4GreaterThanOrEqualTo(String value) {
            addCriterion("yjzzdgcczdczd4 >=", value, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4LessThan(String value) {
            addCriterion("yjzzdgcczdczd4 <", value, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4LessThanOrEqualTo(String value) {
            addCriterion("yjzzdgcczdczd4 <=", value, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4Like(String value) {
            addCriterion("yjzzdgcczdczd4 like", value, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4NotLike(String value) {
            addCriterion("yjzzdgcczdczd4 not like", value, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4In(List<String> values) {
            addCriterion("yjzzdgcczdczd4 in", values, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4NotIn(List<String> values) {
            addCriterion("yjzzdgcczdczd4 not in", values, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4Between(String value1, String value2) {
            addCriterion("yjzzdgcczdczd4 between", value1, value2, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andYjzzdgcczdczd4NotBetween(String value1, String value2) {
            addCriterion("yjzzdgcczdczd4 not between", value1, value2, "yjzzdgcczdczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1IsNull() {
            addCriterion("kzzdxczd1 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1IsNotNull() {
            addCriterion("kzzdxczd1 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1EqualTo(String value) {
            addCriterion("kzzdxczd1 =", value, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1NotEqualTo(String value) {
            addCriterion("kzzdxczd1 <>", value, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1GreaterThan(String value) {
            addCriterion("kzzdxczd1 >", value, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdxczd1 >=", value, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1LessThan(String value) {
            addCriterion("kzzdxczd1 <", value, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1LessThanOrEqualTo(String value) {
            addCriterion("kzzdxczd1 <=", value, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1Like(String value) {
            addCriterion("kzzdxczd1 like", value, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1NotLike(String value) {
            addCriterion("kzzdxczd1 not like", value, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1In(List<String> values) {
            addCriterion("kzzdxczd1 in", values, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1NotIn(List<String> values) {
            addCriterion("kzzdxczd1 not in", values, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1Between(String value1, String value2) {
            addCriterion("kzzdxczd1 between", value1, value2, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd1NotBetween(String value1, String value2) {
            addCriterion("kzzdxczd1 not between", value1, value2, "kzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2IsNull() {
            addCriterion("kzzdxczd2 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2IsNotNull() {
            addCriterion("kzzdxczd2 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2EqualTo(String value) {
            addCriterion("kzzdxczd2 =", value, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2NotEqualTo(String value) {
            addCriterion("kzzdxczd2 <>", value, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2GreaterThan(String value) {
            addCriterion("kzzdxczd2 >", value, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdxczd2 >=", value, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2LessThan(String value) {
            addCriterion("kzzdxczd2 <", value, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2LessThanOrEqualTo(String value) {
            addCriterion("kzzdxczd2 <=", value, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2Like(String value) {
            addCriterion("kzzdxczd2 like", value, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2NotLike(String value) {
            addCriterion("kzzdxczd2 not like", value, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2In(List<String> values) {
            addCriterion("kzzdxczd2 in", values, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2NotIn(List<String> values) {
            addCriterion("kzzdxczd2 not in", values, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2Between(String value1, String value2) {
            addCriterion("kzzdxczd2 between", value1, value2, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd2NotBetween(String value1, String value2) {
            addCriterion("kzzdxczd2 not between", value1, value2, "kzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3IsNull() {
            addCriterion("kzzdxczd3 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3IsNotNull() {
            addCriterion("kzzdxczd3 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3EqualTo(String value) {
            addCriterion("kzzdxczd3 =", value, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3NotEqualTo(String value) {
            addCriterion("kzzdxczd3 <>", value, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3GreaterThan(String value) {
            addCriterion("kzzdxczd3 >", value, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdxczd3 >=", value, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3LessThan(String value) {
            addCriterion("kzzdxczd3 <", value, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3LessThanOrEqualTo(String value) {
            addCriterion("kzzdxczd3 <=", value, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3Like(String value) {
            addCriterion("kzzdxczd3 like", value, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3NotLike(String value) {
            addCriterion("kzzdxczd3 not like", value, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3In(List<String> values) {
            addCriterion("kzzdxczd3 in", values, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3NotIn(List<String> values) {
            addCriterion("kzzdxczd3 not in", values, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3Between(String value1, String value2) {
            addCriterion("kzzdxczd3 between", value1, value2, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd3NotBetween(String value1, String value2) {
            addCriterion("kzzdxczd3 not between", value1, value2, "kzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4IsNull() {
            addCriterion("kzzdxczd4 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4IsNotNull() {
            addCriterion("kzzdxczd4 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4EqualTo(String value) {
            addCriterion("kzzdxczd4 =", value, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4NotEqualTo(String value) {
            addCriterion("kzzdxczd4 <>", value, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4GreaterThan(String value) {
            addCriterion("kzzdxczd4 >", value, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdxczd4 >=", value, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4LessThan(String value) {
            addCriterion("kzzdxczd4 <", value, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4LessThanOrEqualTo(String value) {
            addCriterion("kzzdxczd4 <=", value, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4Like(String value) {
            addCriterion("kzzdxczd4 like", value, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4NotLike(String value) {
            addCriterion("kzzdxczd4 not like", value, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4In(List<String> values) {
            addCriterion("kzzdxczd4 in", values, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4NotIn(List<String> values) {
            addCriterion("kzzdxczd4 not in", values, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4Between(String value1, String value2) {
            addCriterion("kzzdxczd4 between", value1, value2, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd4NotBetween(String value1, String value2) {
            addCriterion("kzzdxczd4 not between", value1, value2, "kzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5IsNull() {
            addCriterion("kzzdxczd5 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5IsNotNull() {
            addCriterion("kzzdxczd5 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5EqualTo(String value) {
            addCriterion("kzzdxczd5 =", value, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5NotEqualTo(String value) {
            addCriterion("kzzdxczd5 <>", value, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5GreaterThan(String value) {
            addCriterion("kzzdxczd5 >", value, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdxczd5 >=", value, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5LessThan(String value) {
            addCriterion("kzzdxczd5 <", value, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5LessThanOrEqualTo(String value) {
            addCriterion("kzzdxczd5 <=", value, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5Like(String value) {
            addCriterion("kzzdxczd5 like", value, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5NotLike(String value) {
            addCriterion("kzzdxczd5 not like", value, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5In(List<String> values) {
            addCriterion("kzzdxczd5 in", values, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5NotIn(List<String> values) {
            addCriterion("kzzdxczd5 not in", values, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5Between(String value1, String value2) {
            addCriterion("kzzdxczd5 between", value1, value2, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andKzzdxczd5NotBetween(String value1, String value2) {
            addCriterion("kzzdxczd5 not between", value1, value2, "kzzdxczd5");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1IsNull() {
            addCriterion("jzzdxczd1 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1IsNotNull() {
            addCriterion("jzzdxczd1 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1EqualTo(String value) {
            addCriterion("jzzdxczd1 =", value, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1NotEqualTo(String value) {
            addCriterion("jzzdxczd1 <>", value, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1GreaterThan(String value) {
            addCriterion("jzzdxczd1 >", value, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdxczd1 >=", value, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1LessThan(String value) {
            addCriterion("jzzdxczd1 <", value, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1LessThanOrEqualTo(String value) {
            addCriterion("jzzdxczd1 <=", value, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1Like(String value) {
            addCriterion("jzzdxczd1 like", value, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1NotLike(String value) {
            addCriterion("jzzdxczd1 not like", value, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1In(List<String> values) {
            addCriterion("jzzdxczd1 in", values, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1NotIn(List<String> values) {
            addCriterion("jzzdxczd1 not in", values, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1Between(String value1, String value2) {
            addCriterion("jzzdxczd1 between", value1, value2, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd1NotBetween(String value1, String value2) {
            addCriterion("jzzdxczd1 not between", value1, value2, "jzzdxczd1");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2IsNull() {
            addCriterion("jzzdxczd2 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2IsNotNull() {
            addCriterion("jzzdxczd2 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2EqualTo(String value) {
            addCriterion("jzzdxczd2 =", value, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2NotEqualTo(String value) {
            addCriterion("jzzdxczd2 <>", value, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2GreaterThan(String value) {
            addCriterion("jzzdxczd2 >", value, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdxczd2 >=", value, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2LessThan(String value) {
            addCriterion("jzzdxczd2 <", value, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2LessThanOrEqualTo(String value) {
            addCriterion("jzzdxczd2 <=", value, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2Like(String value) {
            addCriterion("jzzdxczd2 like", value, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2NotLike(String value) {
            addCriterion("jzzdxczd2 not like", value, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2In(List<String> values) {
            addCriterion("jzzdxczd2 in", values, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2NotIn(List<String> values) {
            addCriterion("jzzdxczd2 not in", values, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2Between(String value1, String value2) {
            addCriterion("jzzdxczd2 between", value1, value2, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd2NotBetween(String value1, String value2) {
            addCriterion("jzzdxczd2 not between", value1, value2, "jzzdxczd2");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3IsNull() {
            addCriterion("jzzdxczd3 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3IsNotNull() {
            addCriterion("jzzdxczd3 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3EqualTo(String value) {
            addCriterion("jzzdxczd3 =", value, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3NotEqualTo(String value) {
            addCriterion("jzzdxczd3 <>", value, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3GreaterThan(String value) {
            addCriterion("jzzdxczd3 >", value, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdxczd3 >=", value, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3LessThan(String value) {
            addCriterion("jzzdxczd3 <", value, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3LessThanOrEqualTo(String value) {
            addCriterion("jzzdxczd3 <=", value, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3Like(String value) {
            addCriterion("jzzdxczd3 like", value, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3NotLike(String value) {
            addCriterion("jzzdxczd3 not like", value, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3In(List<String> values) {
            addCriterion("jzzdxczd3 in", values, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3NotIn(List<String> values) {
            addCriterion("jzzdxczd3 not in", values, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3Between(String value1, String value2) {
            addCriterion("jzzdxczd3 between", value1, value2, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd3NotBetween(String value1, String value2) {
            addCriterion("jzzdxczd3 not between", value1, value2, "jzzdxczd3");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4IsNull() {
            addCriterion("jzzdxczd4 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4IsNotNull() {
            addCriterion("jzzdxczd4 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4EqualTo(String value) {
            addCriterion("jzzdxczd4 =", value, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4NotEqualTo(String value) {
            addCriterion("jzzdxczd4 <>", value, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4GreaterThan(String value) {
            addCriterion("jzzdxczd4 >", value, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdxczd4 >=", value, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4LessThan(String value) {
            addCriterion("jzzdxczd4 <", value, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4LessThanOrEqualTo(String value) {
            addCriterion("jzzdxczd4 <=", value, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4Like(String value) {
            addCriterion("jzzdxczd4 like", value, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4NotLike(String value) {
            addCriterion("jzzdxczd4 not like", value, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4In(List<String> values) {
            addCriterion("jzzdxczd4 in", values, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4NotIn(List<String> values) {
            addCriterion("jzzdxczd4 not in", values, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4Between(String value1, String value2) {
            addCriterion("jzzdxczd4 between", value1, value2, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andJzzdxczd4NotBetween(String value1, String value2) {
            addCriterion("jzzdxczd4 not between", value1, value2, "jzzdxczd4");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdIsNull() {
            addCriterion("zhekzjzxczd is null");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdIsNotNull() {
            addCriterion("zhekzjzxczd is not null");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdEqualTo(String value) {
            addCriterion("zhekzjzxczd =", value, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdNotEqualTo(String value) {
            addCriterion("zhekzjzxczd <>", value, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdGreaterThan(String value) {
            addCriterion("zhekzjzxczd >", value, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdGreaterThanOrEqualTo(String value) {
            addCriterion("zhekzjzxczd >=", value, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdLessThan(String value) {
            addCriterion("zhekzjzxczd <", value, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdLessThanOrEqualTo(String value) {
            addCriterion("zhekzjzxczd <=", value, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdLike(String value) {
            addCriterion("zhekzjzxczd like", value, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdNotLike(String value) {
            addCriterion("zhekzjzxczd not like", value, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdIn(List<String> values) {
            addCriterion("zhekzjzxczd in", values, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdNotIn(List<String> values) {
            addCriterion("zhekzjzxczd not in", values, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdBetween(String value1, String value2) {
            addCriterion("zhekzjzxczd between", value1, value2, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andZhekzjzxczdNotBetween(String value1, String value2) {
            addCriterion("zhekzjzxczd not between", value1, value2, "zhekzjzxczd");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1IsNull() {
            addCriterion("kzzdbphl1 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1IsNotNull() {
            addCriterion("kzzdbphl1 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1EqualTo(String value) {
            addCriterion("kzzdbphl1 =", value, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1NotEqualTo(String value) {
            addCriterion("kzzdbphl1 <>", value, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1GreaterThan(String value) {
            addCriterion("kzzdbphl1 >", value, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdbphl1 >=", value, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1LessThan(String value) {
            addCriterion("kzzdbphl1 <", value, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1LessThanOrEqualTo(String value) {
            addCriterion("kzzdbphl1 <=", value, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1Like(String value) {
            addCriterion("kzzdbphl1 like", value, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1NotLike(String value) {
            addCriterion("kzzdbphl1 not like", value, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1In(List<String> values) {
            addCriterion("kzzdbphl1 in", values, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1NotIn(List<String> values) {
            addCriterion("kzzdbphl1 not in", values, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1Between(String value1, String value2) {
            addCriterion("kzzdbphl1 between", value1, value2, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl1NotBetween(String value1, String value2) {
            addCriterion("kzzdbphl1 not between", value1, value2, "kzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2IsNull() {
            addCriterion("kzzdbphl2 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2IsNotNull() {
            addCriterion("kzzdbphl2 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2EqualTo(String value) {
            addCriterion("kzzdbphl2 =", value, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2NotEqualTo(String value) {
            addCriterion("kzzdbphl2 <>", value, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2GreaterThan(String value) {
            addCriterion("kzzdbphl2 >", value, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdbphl2 >=", value, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2LessThan(String value) {
            addCriterion("kzzdbphl2 <", value, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2LessThanOrEqualTo(String value) {
            addCriterion("kzzdbphl2 <=", value, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2Like(String value) {
            addCriterion("kzzdbphl2 like", value, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2NotLike(String value) {
            addCriterion("kzzdbphl2 not like", value, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2In(List<String> values) {
            addCriterion("kzzdbphl2 in", values, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2NotIn(List<String> values) {
            addCriterion("kzzdbphl2 not in", values, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2Between(String value1, String value2) {
            addCriterion("kzzdbphl2 between", value1, value2, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl2NotBetween(String value1, String value2) {
            addCriterion("kzzdbphl2 not between", value1, value2, "kzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3IsNull() {
            addCriterion("kzzdbphl3 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3IsNotNull() {
            addCriterion("kzzdbphl3 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3EqualTo(String value) {
            addCriterion("kzzdbphl3 =", value, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3NotEqualTo(String value) {
            addCriterion("kzzdbphl3 <>", value, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3GreaterThan(String value) {
            addCriterion("kzzdbphl3 >", value, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdbphl3 >=", value, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3LessThan(String value) {
            addCriterion("kzzdbphl3 <", value, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3LessThanOrEqualTo(String value) {
            addCriterion("kzzdbphl3 <=", value, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3Like(String value) {
            addCriterion("kzzdbphl3 like", value, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3NotLike(String value) {
            addCriterion("kzzdbphl3 not like", value, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3In(List<String> values) {
            addCriterion("kzzdbphl3 in", values, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3NotIn(List<String> values) {
            addCriterion("kzzdbphl3 not in", values, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3Between(String value1, String value2) {
            addCriterion("kzzdbphl3 between", value1, value2, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl3NotBetween(String value1, String value2) {
            addCriterion("kzzdbphl3 not between", value1, value2, "kzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4IsNull() {
            addCriterion("kzzdbphl4 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4IsNotNull() {
            addCriterion("kzzdbphl4 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4EqualTo(String value) {
            addCriterion("kzzdbphl4 =", value, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4NotEqualTo(String value) {
            addCriterion("kzzdbphl4 <>", value, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4GreaterThan(String value) {
            addCriterion("kzzdbphl4 >", value, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdbphl4 >=", value, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4LessThan(String value) {
            addCriterion("kzzdbphl4 <", value, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4LessThanOrEqualTo(String value) {
            addCriterion("kzzdbphl4 <=", value, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4Like(String value) {
            addCriterion("kzzdbphl4 like", value, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4NotLike(String value) {
            addCriterion("kzzdbphl4 not like", value, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4In(List<String> values) {
            addCriterion("kzzdbphl4 in", values, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4NotIn(List<String> values) {
            addCriterion("kzzdbphl4 not in", values, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4Between(String value1, String value2) {
            addCriterion("kzzdbphl4 between", value1, value2, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl4NotBetween(String value1, String value2) {
            addCriterion("kzzdbphl4 not between", value1, value2, "kzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5IsNull() {
            addCriterion("kzzdbphl5 is null");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5IsNotNull() {
            addCriterion("kzzdbphl5 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5EqualTo(String value) {
            addCriterion("kzzdbphl5 =", value, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5NotEqualTo(String value) {
            addCriterion("kzzdbphl5 <>", value, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5GreaterThan(String value) {
            addCriterion("kzzdbphl5 >", value, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5GreaterThanOrEqualTo(String value) {
            addCriterion("kzzdbphl5 >=", value, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5LessThan(String value) {
            addCriterion("kzzdbphl5 <", value, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5LessThanOrEqualTo(String value) {
            addCriterion("kzzdbphl5 <=", value, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5Like(String value) {
            addCriterion("kzzdbphl5 like", value, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5NotLike(String value) {
            addCriterion("kzzdbphl5 not like", value, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5In(List<String> values) {
            addCriterion("kzzdbphl5 in", values, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5NotIn(List<String> values) {
            addCriterion("kzzdbphl5 not in", values, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5Between(String value1, String value2) {
            addCriterion("kzzdbphl5 between", value1, value2, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andKzzdbphl5NotBetween(String value1, String value2) {
            addCriterion("kzzdbphl5 not between", value1, value2, "kzzdbphl5");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1IsNull() {
            addCriterion("jzzdbphl1 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1IsNotNull() {
            addCriterion("jzzdbphl1 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1EqualTo(String value) {
            addCriterion("jzzdbphl1 =", value, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1NotEqualTo(String value) {
            addCriterion("jzzdbphl1 <>", value, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1GreaterThan(String value) {
            addCriterion("jzzdbphl1 >", value, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdbphl1 >=", value, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1LessThan(String value) {
            addCriterion("jzzdbphl1 <", value, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1LessThanOrEqualTo(String value) {
            addCriterion("jzzdbphl1 <=", value, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1Like(String value) {
            addCriterion("jzzdbphl1 like", value, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1NotLike(String value) {
            addCriterion("jzzdbphl1 not like", value, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1In(List<String> values) {
            addCriterion("jzzdbphl1 in", values, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1NotIn(List<String> values) {
            addCriterion("jzzdbphl1 not in", values, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1Between(String value1, String value2) {
            addCriterion("jzzdbphl1 between", value1, value2, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl1NotBetween(String value1, String value2) {
            addCriterion("jzzdbphl1 not between", value1, value2, "jzzdbphl1");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2IsNull() {
            addCriterion("jzzdbphl2 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2IsNotNull() {
            addCriterion("jzzdbphl2 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2EqualTo(String value) {
            addCriterion("jzzdbphl2 =", value, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2NotEqualTo(String value) {
            addCriterion("jzzdbphl2 <>", value, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2GreaterThan(String value) {
            addCriterion("jzzdbphl2 >", value, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdbphl2 >=", value, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2LessThan(String value) {
            addCriterion("jzzdbphl2 <", value, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2LessThanOrEqualTo(String value) {
            addCriterion("jzzdbphl2 <=", value, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2Like(String value) {
            addCriterion("jzzdbphl2 like", value, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2NotLike(String value) {
            addCriterion("jzzdbphl2 not like", value, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2In(List<String> values) {
            addCriterion("jzzdbphl2 in", values, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2NotIn(List<String> values) {
            addCriterion("jzzdbphl2 not in", values, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2Between(String value1, String value2) {
            addCriterion("jzzdbphl2 between", value1, value2, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl2NotBetween(String value1, String value2) {
            addCriterion("jzzdbphl2 not between", value1, value2, "jzzdbphl2");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3IsNull() {
            addCriterion("jzzdbphl3 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3IsNotNull() {
            addCriterion("jzzdbphl3 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3EqualTo(String value) {
            addCriterion("jzzdbphl3 =", value, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3NotEqualTo(String value) {
            addCriterion("jzzdbphl3 <>", value, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3GreaterThan(String value) {
            addCriterion("jzzdbphl3 >", value, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdbphl3 >=", value, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3LessThan(String value) {
            addCriterion("jzzdbphl3 <", value, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3LessThanOrEqualTo(String value) {
            addCriterion("jzzdbphl3 <=", value, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3Like(String value) {
            addCriterion("jzzdbphl3 like", value, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3NotLike(String value) {
            addCriterion("jzzdbphl3 not like", value, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3In(List<String> values) {
            addCriterion("jzzdbphl3 in", values, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3NotIn(List<String> values) {
            addCriterion("jzzdbphl3 not in", values, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3Between(String value1, String value2) {
            addCriterion("jzzdbphl3 between", value1, value2, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl3NotBetween(String value1, String value2) {
            addCriterion("jzzdbphl3 not between", value1, value2, "jzzdbphl3");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4IsNull() {
            addCriterion("jzzdbphl4 is null");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4IsNotNull() {
            addCriterion("jzzdbphl4 is not null");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4EqualTo(String value) {
            addCriterion("jzzdbphl4 =", value, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4NotEqualTo(String value) {
            addCriterion("jzzdbphl4 <>", value, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4GreaterThan(String value) {
            addCriterion("jzzdbphl4 >", value, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4GreaterThanOrEqualTo(String value) {
            addCriterion("jzzdbphl4 >=", value, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4LessThan(String value) {
            addCriterion("jzzdbphl4 <", value, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4LessThanOrEqualTo(String value) {
            addCriterion("jzzdbphl4 <=", value, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4Like(String value) {
            addCriterion("jzzdbphl4 like", value, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4NotLike(String value) {
            addCriterion("jzzdbphl4 not like", value, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4In(List<String> values) {
            addCriterion("jzzdbphl4 in", values, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4NotIn(List<String> values) {
            addCriterion("jzzdbphl4 not in", values, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4Between(String value1, String value2) {
            addCriterion("jzzdbphl4 between", value1, value2, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andJzzdbphl4NotBetween(String value1, String value2) {
            addCriterion("jzzdbphl4 not between", value1, value2, "jzzdbphl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1IsNull() {
            addCriterion("kzzhuzdl1 is null");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1IsNotNull() {
            addCriterion("kzzhuzdl1 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1EqualTo(String value) {
            addCriterion("kzzhuzdl1 =", value, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1NotEqualTo(String value) {
            addCriterion("kzzhuzdl1 <>", value, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1GreaterThan(String value) {
            addCriterion("kzzhuzdl1 >", value, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1GreaterThanOrEqualTo(String value) {
            addCriterion("kzzhuzdl1 >=", value, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1LessThan(String value) {
            addCriterion("kzzhuzdl1 <", value, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1LessThanOrEqualTo(String value) {
            addCriterion("kzzhuzdl1 <=", value, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1Like(String value) {
            addCriterion("kzzhuzdl1 like", value, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1NotLike(String value) {
            addCriterion("kzzhuzdl1 not like", value, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1In(List<String> values) {
            addCriterion("kzzhuzdl1 in", values, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1NotIn(List<String> values) {
            addCriterion("kzzhuzdl1 not in", values, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1Between(String value1, String value2) {
            addCriterion("kzzhuzdl1 between", value1, value2, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl1NotBetween(String value1, String value2) {
            addCriterion("kzzhuzdl1 not between", value1, value2, "kzzhuzdl1");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2IsNull() {
            addCriterion("kzzhuzdl2 is null");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2IsNotNull() {
            addCriterion("kzzhuzdl2 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2EqualTo(String value) {
            addCriterion("kzzhuzdl2 =", value, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2NotEqualTo(String value) {
            addCriterion("kzzhuzdl2 <>", value, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2GreaterThan(String value) {
            addCriterion("kzzhuzdl2 >", value, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2GreaterThanOrEqualTo(String value) {
            addCriterion("kzzhuzdl2 >=", value, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2LessThan(String value) {
            addCriterion("kzzhuzdl2 <", value, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2LessThanOrEqualTo(String value) {
            addCriterion("kzzhuzdl2 <=", value, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2Like(String value) {
            addCriterion("kzzhuzdl2 like", value, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2NotLike(String value) {
            addCriterion("kzzhuzdl2 not like", value, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2In(List<String> values) {
            addCriterion("kzzhuzdl2 in", values, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2NotIn(List<String> values) {
            addCriterion("kzzhuzdl2 not in", values, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2Between(String value1, String value2) {
            addCriterion("kzzhuzdl2 between", value1, value2, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl2NotBetween(String value1, String value2) {
            addCriterion("kzzhuzdl2 not between", value1, value2, "kzzhuzdl2");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3IsNull() {
            addCriterion("kzzhuzdl3 is null");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3IsNotNull() {
            addCriterion("kzzhuzdl3 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3EqualTo(String value) {
            addCriterion("kzzhuzdl3 =", value, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3NotEqualTo(String value) {
            addCriterion("kzzhuzdl3 <>", value, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3GreaterThan(String value) {
            addCriterion("kzzhuzdl3 >", value, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3GreaterThanOrEqualTo(String value) {
            addCriterion("kzzhuzdl3 >=", value, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3LessThan(String value) {
            addCriterion("kzzhuzdl3 <", value, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3LessThanOrEqualTo(String value) {
            addCriterion("kzzhuzdl3 <=", value, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3Like(String value) {
            addCriterion("kzzhuzdl3 like", value, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3NotLike(String value) {
            addCriterion("kzzhuzdl3 not like", value, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3In(List<String> values) {
            addCriterion("kzzhuzdl3 in", values, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3NotIn(List<String> values) {
            addCriterion("kzzhuzdl3 not in", values, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3Between(String value1, String value2) {
            addCriterion("kzzhuzdl3 between", value1, value2, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl3NotBetween(String value1, String value2) {
            addCriterion("kzzhuzdl3 not between", value1, value2, "kzzhuzdl3");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4IsNull() {
            addCriterion("kzzhuzdl4 is null");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4IsNotNull() {
            addCriterion("kzzhuzdl4 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4EqualTo(String value) {
            addCriterion("kzzhuzdl4 =", value, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4NotEqualTo(String value) {
            addCriterion("kzzhuzdl4 <>", value, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4GreaterThan(String value) {
            addCriterion("kzzhuzdl4 >", value, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4GreaterThanOrEqualTo(String value) {
            addCriterion("kzzhuzdl4 >=", value, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4LessThan(String value) {
            addCriterion("kzzhuzdl4 <", value, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4LessThanOrEqualTo(String value) {
            addCriterion("kzzhuzdl4 <=", value, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4Like(String value) {
            addCriterion("kzzhuzdl4 like", value, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4NotLike(String value) {
            addCriterion("kzzhuzdl4 not like", value, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4In(List<String> values) {
            addCriterion("kzzhuzdl4 in", values, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4NotIn(List<String> values) {
            addCriterion("kzzhuzdl4 not in", values, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4Between(String value1, String value2) {
            addCriterion("kzzhuzdl4 between", value1, value2, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl4NotBetween(String value1, String value2) {
            addCriterion("kzzhuzdl4 not between", value1, value2, "kzzhuzdl4");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5IsNull() {
            addCriterion("kzzhuzdl5 is null");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5IsNotNull() {
            addCriterion("kzzhuzdl5 is not null");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5EqualTo(String value) {
            addCriterion("kzzhuzdl5 =", value, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5NotEqualTo(String value) {
            addCriterion("kzzhuzdl5 <>", value, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5GreaterThan(String value) {
            addCriterion("kzzhuzdl5 >", value, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5GreaterThanOrEqualTo(String value) {
            addCriterion("kzzhuzdl5 >=", value, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5LessThan(String value) {
            addCriterion("kzzhuzdl5 <", value, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5LessThanOrEqualTo(String value) {
            addCriterion("kzzhuzdl5 <=", value, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5Like(String value) {
            addCriterion("kzzhuzdl5 like", value, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5NotLike(String value) {
            addCriterion("kzzhuzdl5 not like", value, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5In(List<String> values) {
            addCriterion("kzzhuzdl5 in", values, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5NotIn(List<String> values) {
            addCriterion("kzzhuzdl5 not in", values, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5Between(String value1, String value2) {
            addCriterion("kzzhuzdl5 between", value1, value2, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andKzzhuzdl5NotBetween(String value1, String value2) {
            addCriterion("kzzhuzdl5 not between", value1, value2, "kzzhuzdl5");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlIsNull() {
            addCriterion("zhukzzhuzdl is null");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlIsNotNull() {
            addCriterion("zhukzzhuzdl is not null");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlEqualTo(String value) {
            addCriterion("zhukzzhuzdl =", value, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlNotEqualTo(String value) {
            addCriterion("zhukzzhuzdl <>", value, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlGreaterThan(String value) {
            addCriterion("zhukzzhuzdl >", value, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlGreaterThanOrEqualTo(String value) {
            addCriterion("zhukzzhuzdl >=", value, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlLessThan(String value) {
            addCriterion("zhukzzhuzdl <", value, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlLessThanOrEqualTo(String value) {
            addCriterion("zhukzzhuzdl <=", value, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlLike(String value) {
            addCriterion("zhukzzhuzdl like", value, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlNotLike(String value) {
            addCriterion("zhukzzhuzdl not like", value, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlIn(List<String> values) {
            addCriterion("zhukzzhuzdl in", values, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlNotIn(List<String> values) {
            addCriterion("zhukzzhuzdl not in", values, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlBetween(String value1, String value2) {
            addCriterion("zhukzzhuzdl between", value1, value2, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdlNotBetween(String value1, String value2) {
            addCriterion("zhukzzhuzdl not between", value1, value2, "zhukzzhuzdl");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvIsNull() {
            addCriterion("zhukzzhuzdv is null");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvIsNotNull() {
            addCriterion("zhukzzhuzdv is not null");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvEqualTo(String value) {
            addCriterion("zhukzzhuzdv =", value, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvNotEqualTo(String value) {
            addCriterion("zhukzzhuzdv <>", value, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvGreaterThan(String value) {
            addCriterion("zhukzzhuzdv >", value, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvGreaterThanOrEqualTo(String value) {
            addCriterion("zhukzzhuzdv >=", value, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvLessThan(String value) {
            addCriterion("zhukzzhuzdv <", value, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvLessThanOrEqualTo(String value) {
            addCriterion("zhukzzhuzdv <=", value, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvLike(String value) {
            addCriterion("zhukzzhuzdv like", value, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvNotLike(String value) {
            addCriterion("zhukzzhuzdv not like", value, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvIn(List<String> values) {
            addCriterion("zhukzzhuzdv in", values, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvNotIn(List<String> values) {
            addCriterion("zhukzzhuzdv not in", values, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvBetween(String value1, String value2) {
            addCriterion("zhukzzhuzdv between", value1, value2, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andZhukzzhuzdvNotBetween(String value1, String value2) {
            addCriterion("zhukzzhuzdv not between", value1, value2, "zhukzzhuzdv");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1IsNull() {
            addCriterion("kzxmpd1 is null");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1IsNotNull() {
            addCriterion("kzxmpd1 is not null");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1EqualTo(String value) {
            addCriterion("kzxmpd1 =", value, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1NotEqualTo(String value) {
            addCriterion("kzxmpd1 <>", value, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1GreaterThan(String value) {
            addCriterion("kzxmpd1 >", value, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1GreaterThanOrEqualTo(String value) {
            addCriterion("kzxmpd1 >=", value, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1LessThan(String value) {
            addCriterion("kzxmpd1 <", value, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1LessThanOrEqualTo(String value) {
            addCriterion("kzxmpd1 <=", value, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1Like(String value) {
            addCriterion("kzxmpd1 like", value, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1NotLike(String value) {
            addCriterion("kzxmpd1 not like", value, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1In(List<String> values) {
            addCriterion("kzxmpd1 in", values, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1NotIn(List<String> values) {
            addCriterion("kzxmpd1 not in", values, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1Between(String value1, String value2) {
            addCriterion("kzxmpd1 between", value1, value2, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd1NotBetween(String value1, String value2) {
            addCriterion("kzxmpd1 not between", value1, value2, "kzxmpd1");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2IsNull() {
            addCriterion("kzxmpd2 is null");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2IsNotNull() {
            addCriterion("kzxmpd2 is not null");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2EqualTo(String value) {
            addCriterion("kzxmpd2 =", value, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2NotEqualTo(String value) {
            addCriterion("kzxmpd2 <>", value, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2GreaterThan(String value) {
            addCriterion("kzxmpd2 >", value, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2GreaterThanOrEqualTo(String value) {
            addCriterion("kzxmpd2 >=", value, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2LessThan(String value) {
            addCriterion("kzxmpd2 <", value, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2LessThanOrEqualTo(String value) {
            addCriterion("kzxmpd2 <=", value, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2Like(String value) {
            addCriterion("kzxmpd2 like", value, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2NotLike(String value) {
            addCriterion("kzxmpd2 not like", value, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2In(List<String> values) {
            addCriterion("kzxmpd2 in", values, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2NotIn(List<String> values) {
            addCriterion("kzxmpd2 not in", values, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2Between(String value1, String value2) {
            addCriterion("kzxmpd2 between", value1, value2, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd2NotBetween(String value1, String value2) {
            addCriterion("kzxmpd2 not between", value1, value2, "kzxmpd2");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3IsNull() {
            addCriterion("kzxmpd3 is null");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3IsNotNull() {
            addCriterion("kzxmpd3 is not null");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3EqualTo(String value) {
            addCriterion("kzxmpd3 =", value, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3NotEqualTo(String value) {
            addCriterion("kzxmpd3 <>", value, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3GreaterThan(String value) {
            addCriterion("kzxmpd3 >", value, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3GreaterThanOrEqualTo(String value) {
            addCriterion("kzxmpd3 >=", value, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3LessThan(String value) {
            addCriterion("kzxmpd3 <", value, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3LessThanOrEqualTo(String value) {
            addCriterion("kzxmpd3 <=", value, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3Like(String value) {
            addCriterion("kzxmpd3 like", value, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3NotLike(String value) {
            addCriterion("kzxmpd3 not like", value, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3In(List<String> values) {
            addCriterion("kzxmpd3 in", values, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3NotIn(List<String> values) {
            addCriterion("kzxmpd3 not in", values, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3Between(String value1, String value2) {
            addCriterion("kzxmpd3 between", value1, value2, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd3NotBetween(String value1, String value2) {
            addCriterion("kzxmpd3 not between", value1, value2, "kzxmpd3");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4IsNull() {
            addCriterion("kzxmpd4 is null");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4IsNotNull() {
            addCriterion("kzxmpd4 is not null");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4EqualTo(String value) {
            addCriterion("kzxmpd4 =", value, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4NotEqualTo(String value) {
            addCriterion("kzxmpd4 <>", value, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4GreaterThan(String value) {
            addCriterion("kzxmpd4 >", value, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4GreaterThanOrEqualTo(String value) {
            addCriterion("kzxmpd4 >=", value, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4LessThan(String value) {
            addCriterion("kzxmpd4 <", value, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4LessThanOrEqualTo(String value) {
            addCriterion("kzxmpd4 <=", value, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4Like(String value) {
            addCriterion("kzxmpd4 like", value, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4NotLike(String value) {
            addCriterion("kzxmpd4 not like", value, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4In(List<String> values) {
            addCriterion("kzxmpd4 in", values, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4NotIn(List<String> values) {
            addCriterion("kzxmpd4 not in", values, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4Between(String value1, String value2) {
            addCriterion("kzxmpd4 between", value1, value2, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd4NotBetween(String value1, String value2) {
            addCriterion("kzxmpd4 not between", value1, value2, "kzxmpd4");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5IsNull() {
            addCriterion("kzxmpd5 is null");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5IsNotNull() {
            addCriterion("kzxmpd5 is not null");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5EqualTo(String value) {
            addCriterion("kzxmpd5 =", value, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5NotEqualTo(String value) {
            addCriterion("kzxmpd5 <>", value, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5GreaterThan(String value) {
            addCriterion("kzxmpd5 >", value, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5GreaterThanOrEqualTo(String value) {
            addCriterion("kzxmpd5 >=", value, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5LessThan(String value) {
            addCriterion("kzxmpd5 <", value, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5LessThanOrEqualTo(String value) {
            addCriterion("kzxmpd5 <=", value, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5Like(String value) {
            addCriterion("kzxmpd5 like", value, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5NotLike(String value) {
            addCriterion("kzxmpd5 not like", value, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5In(List<String> values) {
            addCriterion("kzxmpd5 in", values, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5NotIn(List<String> values) {
            addCriterion("kzxmpd5 not in", values, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5Between(String value1, String value2) {
            addCriterion("kzxmpd5 between", value1, value2, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andKzxmpd5NotBetween(String value1, String value2) {
            addCriterion("kzxmpd5 not between", value1, value2, "kzxmpd5");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1IsNull() {
            addCriterion("jzxmpd1 is null");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1IsNotNull() {
            addCriterion("jzxmpd1 is not null");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1EqualTo(String value) {
            addCriterion("jzxmpd1 =", value, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1NotEqualTo(String value) {
            addCriterion("jzxmpd1 <>", value, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1GreaterThan(String value) {
            addCriterion("jzxmpd1 >", value, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1GreaterThanOrEqualTo(String value) {
            addCriterion("jzxmpd1 >=", value, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1LessThan(String value) {
            addCriterion("jzxmpd1 <", value, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1LessThanOrEqualTo(String value) {
            addCriterion("jzxmpd1 <=", value, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1Like(String value) {
            addCriterion("jzxmpd1 like", value, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1NotLike(String value) {
            addCriterion("jzxmpd1 not like", value, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1In(List<String> values) {
            addCriterion("jzxmpd1 in", values, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1NotIn(List<String> values) {
            addCriterion("jzxmpd1 not in", values, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1Between(String value1, String value2) {
            addCriterion("jzxmpd1 between", value1, value2, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd1NotBetween(String value1, String value2) {
            addCriterion("jzxmpd1 not between", value1, value2, "jzxmpd1");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2IsNull() {
            addCriterion("jzxmpd2 is null");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2IsNotNull() {
            addCriterion("jzxmpd2 is not null");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2EqualTo(String value) {
            addCriterion("jzxmpd2 =", value, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2NotEqualTo(String value) {
            addCriterion("jzxmpd2 <>", value, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2GreaterThan(String value) {
            addCriterion("jzxmpd2 >", value, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2GreaterThanOrEqualTo(String value) {
            addCriterion("jzxmpd2 >=", value, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2LessThan(String value) {
            addCriterion("jzxmpd2 <", value, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2LessThanOrEqualTo(String value) {
            addCriterion("jzxmpd2 <=", value, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2Like(String value) {
            addCriterion("jzxmpd2 like", value, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2NotLike(String value) {
            addCriterion("jzxmpd2 not like", value, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2In(List<String> values) {
            addCriterion("jzxmpd2 in", values, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2NotIn(List<String> values) {
            addCriterion("jzxmpd2 not in", values, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2Between(String value1, String value2) {
            addCriterion("jzxmpd2 between", value1, value2, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd2NotBetween(String value1, String value2) {
            addCriterion("jzxmpd2 not between", value1, value2, "jzxmpd2");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3IsNull() {
            addCriterion("jzxmpd3 is null");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3IsNotNull() {
            addCriterion("jzxmpd3 is not null");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3EqualTo(String value) {
            addCriterion("jzxmpd3 =", value, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3NotEqualTo(String value) {
            addCriterion("jzxmpd3 <>", value, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3GreaterThan(String value) {
            addCriterion("jzxmpd3 >", value, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3GreaterThanOrEqualTo(String value) {
            addCriterion("jzxmpd3 >=", value, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3LessThan(String value) {
            addCriterion("jzxmpd3 <", value, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3LessThanOrEqualTo(String value) {
            addCriterion("jzxmpd3 <=", value, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3Like(String value) {
            addCriterion("jzxmpd3 like", value, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3NotLike(String value) {
            addCriterion("jzxmpd3 not like", value, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3In(List<String> values) {
            addCriterion("jzxmpd3 in", values, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3NotIn(List<String> values) {
            addCriterion("jzxmpd3 not in", values, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3Between(String value1, String value2) {
            addCriterion("jzxmpd3 between", value1, value2, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd3NotBetween(String value1, String value2) {
            addCriterion("jzxmpd3 not between", value1, value2, "jzxmpd3");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4IsNull() {
            addCriterion("jzxmpd4 is null");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4IsNotNull() {
            addCriterion("jzxmpd4 is not null");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4EqualTo(String value) {
            addCriterion("jzxmpd4 =", value, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4NotEqualTo(String value) {
            addCriterion("jzxmpd4 <>", value, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4GreaterThan(String value) {
            addCriterion("jzxmpd4 >", value, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4GreaterThanOrEqualTo(String value) {
            addCriterion("jzxmpd4 >=", value, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4LessThan(String value) {
            addCriterion("jzxmpd4 <", value, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4LessThanOrEqualTo(String value) {
            addCriterion("jzxmpd4 <=", value, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4Like(String value) {
            addCriterion("jzxmpd4 like", value, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4NotLike(String value) {
            addCriterion("jzxmpd4 not like", value, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4In(List<String> values) {
            addCriterion("jzxmpd4 in", values, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4NotIn(List<String> values) {
            addCriterion("jzxmpd4 not in", values, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4Between(String value1, String value2) {
            addCriterion("jzxmpd4 between", value1, value2, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andJzxmpd4NotBetween(String value1, String value2) {
            addCriterion("jzxmpd4 not between", value1, value2, "jzxmpd4");
            return (Criteria) this;
        }

        public Criteria andZhexmpdIsNull() {
            addCriterion("zhexmpd is null");
            return (Criteria) this;
        }

        public Criteria andZhexmpdIsNotNull() {
            addCriterion("zhexmpd is not null");
            return (Criteria) this;
        }

        public Criteria andZhexmpdEqualTo(String value) {
            addCriterion("zhexmpd =", value, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhexmpdNotEqualTo(String value) {
            addCriterion("zhexmpd <>", value, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhexmpdGreaterThan(String value) {
            addCriterion("zhexmpd >", value, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhexmpdGreaterThanOrEqualTo(String value) {
            addCriterion("zhexmpd >=", value, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhexmpdLessThan(String value) {
            addCriterion("zhexmpd <", value, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhexmpdLessThanOrEqualTo(String value) {
            addCriterion("zhexmpd <=", value, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhexmpdLike(String value) {
            addCriterion("zhexmpd like", value, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhexmpdNotLike(String value) {
            addCriterion("zhexmpd not like", value, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhexmpdIn(List<String> values) {
            addCriterion("zhexmpd in", values, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhexmpdNotIn(List<String> values) {
            addCriterion("zhexmpd not in", values, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhexmpdBetween(String value1, String value2) {
            addCriterion("zhexmpd between", value1, value2, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhexmpdNotBetween(String value1, String value2) {
            addCriterion("zhexmpd not between", value1, value2, "zhexmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdIsNull() {
            addCriterion("zhuxmpd is null");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdIsNotNull() {
            addCriterion("zhuxmpd is not null");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdEqualTo(String value) {
            addCriterion("zhuxmpd =", value, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdNotEqualTo(String value) {
            addCriterion("zhuxmpd <>", value, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdGreaterThan(String value) {
            addCriterion("zhuxmpd >", value, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdGreaterThanOrEqualTo(String value) {
            addCriterion("zhuxmpd >=", value, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdLessThan(String value) {
            addCriterion("zhuxmpd <", value, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdLessThanOrEqualTo(String value) {
            addCriterion("zhuxmpd <=", value, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdLike(String value) {
            addCriterion("zhuxmpd like", value, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdNotLike(String value) {
            addCriterion("zhuxmpd not like", value, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdIn(List<String> values) {
            addCriterion("zhuxmpd in", values, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdNotIn(List<String> values) {
            addCriterion("zhuxmpd not in", values, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdBetween(String value1, String value2) {
            addCriterion("zhuxmpd between", value1, value2, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andZhuxmpdNotBetween(String value1, String value2) {
            addCriterion("zhuxmpd not between", value1, value2, "zhuxmpd");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1IsNull() {
            addCriterion("kzdxcs1 is null");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1IsNotNull() {
            addCriterion("kzdxcs1 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1EqualTo(String value) {
            addCriterion("kzdxcs1 =", value, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1NotEqualTo(String value) {
            addCriterion("kzdxcs1 <>", value, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1GreaterThan(String value) {
            addCriterion("kzdxcs1 >", value, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1GreaterThanOrEqualTo(String value) {
            addCriterion("kzdxcs1 >=", value, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1LessThan(String value) {
            addCriterion("kzdxcs1 <", value, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1LessThanOrEqualTo(String value) {
            addCriterion("kzdxcs1 <=", value, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1Like(String value) {
            addCriterion("kzdxcs1 like", value, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1NotLike(String value) {
            addCriterion("kzdxcs1 not like", value, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1In(List<String> values) {
            addCriterion("kzdxcs1 in", values, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1NotIn(List<String> values) {
            addCriterion("kzdxcs1 not in", values, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1Between(String value1, String value2) {
            addCriterion("kzdxcs1 between", value1, value2, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs1NotBetween(String value1, String value2) {
            addCriterion("kzdxcs1 not between", value1, value2, "kzdxcs1");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2IsNull() {
            addCriterion("kzdxcs2 is null");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2IsNotNull() {
            addCriterion("kzdxcs2 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2EqualTo(String value) {
            addCriterion("kzdxcs2 =", value, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2NotEqualTo(String value) {
            addCriterion("kzdxcs2 <>", value, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2GreaterThan(String value) {
            addCriterion("kzdxcs2 >", value, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2GreaterThanOrEqualTo(String value) {
            addCriterion("kzdxcs2 >=", value, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2LessThan(String value) {
            addCriterion("kzdxcs2 <", value, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2LessThanOrEqualTo(String value) {
            addCriterion("kzdxcs2 <=", value, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2Like(String value) {
            addCriterion("kzdxcs2 like", value, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2NotLike(String value) {
            addCriterion("kzdxcs2 not like", value, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2In(List<String> values) {
            addCriterion("kzdxcs2 in", values, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2NotIn(List<String> values) {
            addCriterion("kzdxcs2 not in", values, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2Between(String value1, String value2) {
            addCriterion("kzdxcs2 between", value1, value2, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs2NotBetween(String value1, String value2) {
            addCriterion("kzdxcs2 not between", value1, value2, "kzdxcs2");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3IsNull() {
            addCriterion("kzdxcs3 is null");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3IsNotNull() {
            addCriterion("kzdxcs3 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3EqualTo(String value) {
            addCriterion("kzdxcs3 =", value, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3NotEqualTo(String value) {
            addCriterion("kzdxcs3 <>", value, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3GreaterThan(String value) {
            addCriterion("kzdxcs3 >", value, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3GreaterThanOrEqualTo(String value) {
            addCriterion("kzdxcs3 >=", value, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3LessThan(String value) {
            addCriterion("kzdxcs3 <", value, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3LessThanOrEqualTo(String value) {
            addCriterion("kzdxcs3 <=", value, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3Like(String value) {
            addCriterion("kzdxcs3 like", value, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3NotLike(String value) {
            addCriterion("kzdxcs3 not like", value, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3In(List<String> values) {
            addCriterion("kzdxcs3 in", values, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3NotIn(List<String> values) {
            addCriterion("kzdxcs3 not in", values, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3Between(String value1, String value2) {
            addCriterion("kzdxcs3 between", value1, value2, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs3NotBetween(String value1, String value2) {
            addCriterion("kzdxcs3 not between", value1, value2, "kzdxcs3");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4IsNull() {
            addCriterion("kzdxcs4 is null");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4IsNotNull() {
            addCriterion("kzdxcs4 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4EqualTo(String value) {
            addCriterion("kzdxcs4 =", value, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4NotEqualTo(String value) {
            addCriterion("kzdxcs4 <>", value, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4GreaterThan(String value) {
            addCriterion("kzdxcs4 >", value, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4GreaterThanOrEqualTo(String value) {
            addCriterion("kzdxcs4 >=", value, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4LessThan(String value) {
            addCriterion("kzdxcs4 <", value, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4LessThanOrEqualTo(String value) {
            addCriterion("kzdxcs4 <=", value, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4Like(String value) {
            addCriterion("kzdxcs4 like", value, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4NotLike(String value) {
            addCriterion("kzdxcs4 not like", value, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4In(List<String> values) {
            addCriterion("kzdxcs4 in", values, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4NotIn(List<String> values) {
            addCriterion("kzdxcs4 not in", values, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4Between(String value1, String value2) {
            addCriterion("kzdxcs4 between", value1, value2, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs4NotBetween(String value1, String value2) {
            addCriterion("kzdxcs4 not between", value1, value2, "kzdxcs4");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5IsNull() {
            addCriterion("kzdxcs5 is null");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5IsNotNull() {
            addCriterion("kzdxcs5 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5EqualTo(String value) {
            addCriterion("kzdxcs5 =", value, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5NotEqualTo(String value) {
            addCriterion("kzdxcs5 <>", value, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5GreaterThan(String value) {
            addCriterion("kzdxcs5 >", value, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5GreaterThanOrEqualTo(String value) {
            addCriterion("kzdxcs5 >=", value, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5LessThan(String value) {
            addCriterion("kzdxcs5 <", value, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5LessThanOrEqualTo(String value) {
            addCriterion("kzdxcs5 <=", value, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5Like(String value) {
            addCriterion("kzdxcs5 like", value, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5NotLike(String value) {
            addCriterion("kzdxcs5 not like", value, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5In(List<String> values) {
            addCriterion("kzdxcs5 in", values, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5NotIn(List<String> values) {
            addCriterion("kzdxcs5 not in", values, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5Between(String value1, String value2) {
            addCriterion("kzdxcs5 between", value1, value2, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andKzdxcs5NotBetween(String value1, String value2) {
            addCriterion("kzdxcs5 not between", value1, value2, "kzdxcs5");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1IsNull() {
            addCriterion("jzdxcs1 is null");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1IsNotNull() {
            addCriterion("jzdxcs1 is not null");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1EqualTo(String value) {
            addCriterion("jzdxcs1 =", value, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1NotEqualTo(String value) {
            addCriterion("jzdxcs1 <>", value, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1GreaterThan(String value) {
            addCriterion("jzdxcs1 >", value, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1GreaterThanOrEqualTo(String value) {
            addCriterion("jzdxcs1 >=", value, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1LessThan(String value) {
            addCriterion("jzdxcs1 <", value, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1LessThanOrEqualTo(String value) {
            addCriterion("jzdxcs1 <=", value, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1Like(String value) {
            addCriterion("jzdxcs1 like", value, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1NotLike(String value) {
            addCriterion("jzdxcs1 not like", value, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1In(List<String> values) {
            addCriterion("jzdxcs1 in", values, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1NotIn(List<String> values) {
            addCriterion("jzdxcs1 not in", values, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1Between(String value1, String value2) {
            addCriterion("jzdxcs1 between", value1, value2, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs1NotBetween(String value1, String value2) {
            addCriterion("jzdxcs1 not between", value1, value2, "jzdxcs1");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2IsNull() {
            addCriterion("jzdxcs2 is null");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2IsNotNull() {
            addCriterion("jzdxcs2 is not null");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2EqualTo(String value) {
            addCriterion("jzdxcs2 =", value, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2NotEqualTo(String value) {
            addCriterion("jzdxcs2 <>", value, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2GreaterThan(String value) {
            addCriterion("jzdxcs2 >", value, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2GreaterThanOrEqualTo(String value) {
            addCriterion("jzdxcs2 >=", value, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2LessThan(String value) {
            addCriterion("jzdxcs2 <", value, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2LessThanOrEqualTo(String value) {
            addCriterion("jzdxcs2 <=", value, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2Like(String value) {
            addCriterion("jzdxcs2 like", value, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2NotLike(String value) {
            addCriterion("jzdxcs2 not like", value, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2In(List<String> values) {
            addCriterion("jzdxcs2 in", values, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2NotIn(List<String> values) {
            addCriterion("jzdxcs2 not in", values, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2Between(String value1, String value2) {
            addCriterion("jzdxcs2 between", value1, value2, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs2NotBetween(String value1, String value2) {
            addCriterion("jzdxcs2 not between", value1, value2, "jzdxcs2");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3IsNull() {
            addCriterion("jzdxcs3 is null");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3IsNotNull() {
            addCriterion("jzdxcs3 is not null");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3EqualTo(String value) {
            addCriterion("jzdxcs3 =", value, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3NotEqualTo(String value) {
            addCriterion("jzdxcs3 <>", value, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3GreaterThan(String value) {
            addCriterion("jzdxcs3 >", value, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3GreaterThanOrEqualTo(String value) {
            addCriterion("jzdxcs3 >=", value, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3LessThan(String value) {
            addCriterion("jzdxcs3 <", value, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3LessThanOrEqualTo(String value) {
            addCriterion("jzdxcs3 <=", value, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3Like(String value) {
            addCriterion("jzdxcs3 like", value, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3NotLike(String value) {
            addCriterion("jzdxcs3 not like", value, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3In(List<String> values) {
            addCriterion("jzdxcs3 in", values, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3NotIn(List<String> values) {
            addCriterion("jzdxcs3 not in", values, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3Between(String value1, String value2) {
            addCriterion("jzdxcs3 between", value1, value2, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs3NotBetween(String value1, String value2) {
            addCriterion("jzdxcs3 not between", value1, value2, "jzdxcs3");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4IsNull() {
            addCriterion("jzdxcs4 is null");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4IsNotNull() {
            addCriterion("jzdxcs4 is not null");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4EqualTo(String value) {
            addCriterion("jzdxcs4 =", value, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4NotEqualTo(String value) {
            addCriterion("jzdxcs4 <>", value, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4GreaterThan(String value) {
            addCriterion("jzdxcs4 >", value, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4GreaterThanOrEqualTo(String value) {
            addCriterion("jzdxcs4 >=", value, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4LessThan(String value) {
            addCriterion("jzdxcs4 <", value, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4LessThanOrEqualTo(String value) {
            addCriterion("jzdxcs4 <=", value, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4Like(String value) {
            addCriterion("jzdxcs4 like", value, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4NotLike(String value) {
            addCriterion("jzdxcs4 not like", value, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4In(List<String> values) {
            addCriterion("jzdxcs4 in", values, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4NotIn(List<String> values) {
            addCriterion("jzdxcs4 not in", values, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4Between(String value1, String value2) {
            addCriterion("jzdxcs4 between", value1, value2, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andJzdxcs4NotBetween(String value1, String value2) {
            addCriterion("jzdxcs4 not between", value1, value2, "jzdxcs4");
            return (Criteria) this;
        }

        public Criteria andZhedxcsIsNull() {
            addCriterion("zhedxcs is null");
            return (Criteria) this;
        }

        public Criteria andZhedxcsIsNotNull() {
            addCriterion("zhedxcs is not null");
            return (Criteria) this;
        }

        public Criteria andZhedxcsEqualTo(String value) {
            addCriterion("zhedxcs =", value, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhedxcsNotEqualTo(String value) {
            addCriterion("zhedxcs <>", value, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhedxcsGreaterThan(String value) {
            addCriterion("zhedxcs >", value, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhedxcsGreaterThanOrEqualTo(String value) {
            addCriterion("zhedxcs >=", value, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhedxcsLessThan(String value) {
            addCriterion("zhedxcs <", value, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhedxcsLessThanOrEqualTo(String value) {
            addCriterion("zhedxcs <=", value, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhedxcsLike(String value) {
            addCriterion("zhedxcs like", value, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhedxcsNotLike(String value) {
            addCriterion("zhedxcs not like", value, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhedxcsIn(List<String> values) {
            addCriterion("zhedxcs in", values, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhedxcsNotIn(List<String> values) {
            addCriterion("zhedxcs not in", values, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhedxcsBetween(String value1, String value2) {
            addCriterion("zhedxcs between", value1, value2, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhedxcsNotBetween(String value1, String value2) {
            addCriterion("zhedxcs not between", value1, value2, "zhedxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsIsNull() {
            addCriterion("zhudxcs is null");
            return (Criteria) this;
        }

        public Criteria andZhudxcsIsNotNull() {
            addCriterion("zhudxcs is not null");
            return (Criteria) this;
        }

        public Criteria andZhudxcsEqualTo(String value) {
            addCriterion("zhudxcs =", value, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsNotEqualTo(String value) {
            addCriterion("zhudxcs <>", value, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsGreaterThan(String value) {
            addCriterion("zhudxcs >", value, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsGreaterThanOrEqualTo(String value) {
            addCriterion("zhudxcs >=", value, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsLessThan(String value) {
            addCriterion("zhudxcs <", value, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsLessThanOrEqualTo(String value) {
            addCriterion("zhudxcs <=", value, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsLike(String value) {
            addCriterion("zhudxcs like", value, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsNotLike(String value) {
            addCriterion("zhudxcs not like", value, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsIn(List<String> values) {
            addCriterion("zhudxcs in", values, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsNotIn(List<String> values) {
            addCriterion("zhudxcs not in", values, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsBetween(String value1, String value2) {
            addCriterion("zhudxcs between", value1, value2, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZhudxcsNotBetween(String value1, String value2) {
            addCriterion("zhudxcs not between", value1, value2, "zhudxcs");
            return (Criteria) this;
        }

        public Criteria andZjtlh1IsNull() {
            addCriterion("zjtlh1 is null");
            return (Criteria) this;
        }

        public Criteria andZjtlh1IsNotNull() {
            addCriterion("zjtlh1 is not null");
            return (Criteria) this;
        }

        public Criteria andZjtlh1EqualTo(String value) {
            addCriterion("zjtlh1 =", value, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh1NotEqualTo(String value) {
            addCriterion("zjtlh1 <>", value, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh1GreaterThan(String value) {
            addCriterion("zjtlh1 >", value, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh1GreaterThanOrEqualTo(String value) {
            addCriterion("zjtlh1 >=", value, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh1LessThan(String value) {
            addCriterion("zjtlh1 <", value, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh1LessThanOrEqualTo(String value) {
            addCriterion("zjtlh1 <=", value, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh1Like(String value) {
            addCriterion("zjtlh1 like", value, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh1NotLike(String value) {
            addCriterion("zjtlh1 not like", value, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh1In(List<String> values) {
            addCriterion("zjtlh1 in", values, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh1NotIn(List<String> values) {
            addCriterion("zjtlh1 not in", values, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh1Between(String value1, String value2) {
            addCriterion("zjtlh1 between", value1, value2, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh1NotBetween(String value1, String value2) {
            addCriterion("zjtlh1 not between", value1, value2, "zjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1IsNull() {
            addCriterion("yjtlh1 is null");
            return (Criteria) this;
        }

        public Criteria andYjtlh1IsNotNull() {
            addCriterion("yjtlh1 is not null");
            return (Criteria) this;
        }

        public Criteria andYjtlh1EqualTo(String value) {
            addCriterion("yjtlh1 =", value, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1NotEqualTo(String value) {
            addCriterion("yjtlh1 <>", value, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1GreaterThan(String value) {
            addCriterion("yjtlh1 >", value, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1GreaterThanOrEqualTo(String value) {
            addCriterion("yjtlh1 >=", value, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1LessThan(String value) {
            addCriterion("yjtlh1 <", value, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1LessThanOrEqualTo(String value) {
            addCriterion("yjtlh1 <=", value, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1Like(String value) {
            addCriterion("yjtlh1 like", value, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1NotLike(String value) {
            addCriterion("yjtlh1 not like", value, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1In(List<String> values) {
            addCriterion("yjtlh1 in", values, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1NotIn(List<String> values) {
            addCriterion("yjtlh1 not in", values, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1Between(String value1, String value2) {
            addCriterion("yjtlh1 between", value1, value2, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andYjtlh1NotBetween(String value1, String value2) {
            addCriterion("yjtlh1 not between", value1, value2, "yjtlh1");
            return (Criteria) this;
        }

        public Criteria andZjtlh2IsNull() {
            addCriterion("zjtlh2 is null");
            return (Criteria) this;
        }

        public Criteria andZjtlh2IsNotNull() {
            addCriterion("zjtlh2 is not null");
            return (Criteria) this;
        }

        public Criteria andZjtlh2EqualTo(String value) {
            addCriterion("zjtlh2 =", value, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh2NotEqualTo(String value) {
            addCriterion("zjtlh2 <>", value, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh2GreaterThan(String value) {
            addCriterion("zjtlh2 >", value, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh2GreaterThanOrEqualTo(String value) {
            addCriterion("zjtlh2 >=", value, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh2LessThan(String value) {
            addCriterion("zjtlh2 <", value, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh2LessThanOrEqualTo(String value) {
            addCriterion("zjtlh2 <=", value, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh2Like(String value) {
            addCriterion("zjtlh2 like", value, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh2NotLike(String value) {
            addCriterion("zjtlh2 not like", value, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh2In(List<String> values) {
            addCriterion("zjtlh2 in", values, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh2NotIn(List<String> values) {
            addCriterion("zjtlh2 not in", values, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh2Between(String value1, String value2) {
            addCriterion("zjtlh2 between", value1, value2, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh2NotBetween(String value1, String value2) {
            addCriterion("zjtlh2 not between", value1, value2, "zjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2IsNull() {
            addCriterion("yjtlh2 is null");
            return (Criteria) this;
        }

        public Criteria andYjtlh2IsNotNull() {
            addCriterion("yjtlh2 is not null");
            return (Criteria) this;
        }

        public Criteria andYjtlh2EqualTo(String value) {
            addCriterion("yjtlh2 =", value, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2NotEqualTo(String value) {
            addCriterion("yjtlh2 <>", value, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2GreaterThan(String value) {
            addCriterion("yjtlh2 >", value, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2GreaterThanOrEqualTo(String value) {
            addCriterion("yjtlh2 >=", value, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2LessThan(String value) {
            addCriterion("yjtlh2 <", value, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2LessThanOrEqualTo(String value) {
            addCriterion("yjtlh2 <=", value, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2Like(String value) {
            addCriterion("yjtlh2 like", value, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2NotLike(String value) {
            addCriterion("yjtlh2 not like", value, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2In(List<String> values) {
            addCriterion("yjtlh2 in", values, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2NotIn(List<String> values) {
            addCriterion("yjtlh2 not in", values, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2Between(String value1, String value2) {
            addCriterion("yjtlh2 between", value1, value2, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andYjtlh2NotBetween(String value1, String value2) {
            addCriterion("yjtlh2 not between", value1, value2, "yjtlh2");
            return (Criteria) this;
        }

        public Criteria andZjtlh3IsNull() {
            addCriterion("zjtlh3 is null");
            return (Criteria) this;
        }

        public Criteria andZjtlh3IsNotNull() {
            addCriterion("zjtlh3 is not null");
            return (Criteria) this;
        }

        public Criteria andZjtlh3EqualTo(String value) {
            addCriterion("zjtlh3 =", value, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh3NotEqualTo(String value) {
            addCriterion("zjtlh3 <>", value, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh3GreaterThan(String value) {
            addCriterion("zjtlh3 >", value, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh3GreaterThanOrEqualTo(String value) {
            addCriterion("zjtlh3 >=", value, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh3LessThan(String value) {
            addCriterion("zjtlh3 <", value, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh3LessThanOrEqualTo(String value) {
            addCriterion("zjtlh3 <=", value, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh3Like(String value) {
            addCriterion("zjtlh3 like", value, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh3NotLike(String value) {
            addCriterion("zjtlh3 not like", value, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh3In(List<String> values) {
            addCriterion("zjtlh3 in", values, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh3NotIn(List<String> values) {
            addCriterion("zjtlh3 not in", values, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh3Between(String value1, String value2) {
            addCriterion("zjtlh3 between", value1, value2, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh3NotBetween(String value1, String value2) {
            addCriterion("zjtlh3 not between", value1, value2, "zjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3IsNull() {
            addCriterion("yjtlh3 is null");
            return (Criteria) this;
        }

        public Criteria andYjtlh3IsNotNull() {
            addCriterion("yjtlh3 is not null");
            return (Criteria) this;
        }

        public Criteria andYjtlh3EqualTo(String value) {
            addCriterion("yjtlh3 =", value, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3NotEqualTo(String value) {
            addCriterion("yjtlh3 <>", value, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3GreaterThan(String value) {
            addCriterion("yjtlh3 >", value, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3GreaterThanOrEqualTo(String value) {
            addCriterion("yjtlh3 >=", value, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3LessThan(String value) {
            addCriterion("yjtlh3 <", value, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3LessThanOrEqualTo(String value) {
            addCriterion("yjtlh3 <=", value, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3Like(String value) {
            addCriterion("yjtlh3 like", value, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3NotLike(String value) {
            addCriterion("yjtlh3 not like", value, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3In(List<String> values) {
            addCriterion("yjtlh3 in", values, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3NotIn(List<String> values) {
            addCriterion("yjtlh3 not in", values, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3Between(String value1, String value2) {
            addCriterion("yjtlh3 between", value1, value2, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andYjtlh3NotBetween(String value1, String value2) {
            addCriterion("yjtlh3 not between", value1, value2, "yjtlh3");
            return (Criteria) this;
        }

        public Criteria andZjtlh4IsNull() {
            addCriterion("zjtlh4 is null");
            return (Criteria) this;
        }

        public Criteria andZjtlh4IsNotNull() {
            addCriterion("zjtlh4 is not null");
            return (Criteria) this;
        }

        public Criteria andZjtlh4EqualTo(String value) {
            addCriterion("zjtlh4 =", value, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh4NotEqualTo(String value) {
            addCriterion("zjtlh4 <>", value, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh4GreaterThan(String value) {
            addCriterion("zjtlh4 >", value, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh4GreaterThanOrEqualTo(String value) {
            addCriterion("zjtlh4 >=", value, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh4LessThan(String value) {
            addCriterion("zjtlh4 <", value, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh4LessThanOrEqualTo(String value) {
            addCriterion("zjtlh4 <=", value, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh4Like(String value) {
            addCriterion("zjtlh4 like", value, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh4NotLike(String value) {
            addCriterion("zjtlh4 not like", value, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh4In(List<String> values) {
            addCriterion("zjtlh4 in", values, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh4NotIn(List<String> values) {
            addCriterion("zjtlh4 not in", values, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh4Between(String value1, String value2) {
            addCriterion("zjtlh4 between", value1, value2, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh4NotBetween(String value1, String value2) {
            addCriterion("zjtlh4 not between", value1, value2, "zjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4IsNull() {
            addCriterion("yjtlh4 is null");
            return (Criteria) this;
        }

        public Criteria andYjtlh4IsNotNull() {
            addCriterion("yjtlh4 is not null");
            return (Criteria) this;
        }

        public Criteria andYjtlh4EqualTo(String value) {
            addCriterion("yjtlh4 =", value, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4NotEqualTo(String value) {
            addCriterion("yjtlh4 <>", value, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4GreaterThan(String value) {
            addCriterion("yjtlh4 >", value, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4GreaterThanOrEqualTo(String value) {
            addCriterion("yjtlh4 >=", value, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4LessThan(String value) {
            addCriterion("yjtlh4 <", value, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4LessThanOrEqualTo(String value) {
            addCriterion("yjtlh4 <=", value, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4Like(String value) {
            addCriterion("yjtlh4 like", value, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4NotLike(String value) {
            addCriterion("yjtlh4 not like", value, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4In(List<String> values) {
            addCriterion("yjtlh4 in", values, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4NotIn(List<String> values) {
            addCriterion("yjtlh4 not in", values, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4Between(String value1, String value2) {
            addCriterion("yjtlh4 between", value1, value2, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andYjtlh4NotBetween(String value1, String value2) {
            addCriterion("yjtlh4 not between", value1, value2, "yjtlh4");
            return (Criteria) this;
        }

        public Criteria andZjtlh5IsNull() {
            addCriterion("zjtlh5 is null");
            return (Criteria) this;
        }

        public Criteria andZjtlh5IsNotNull() {
            addCriterion("zjtlh5 is not null");
            return (Criteria) this;
        }

        public Criteria andZjtlh5EqualTo(String value) {
            addCriterion("zjtlh5 =", value, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andZjtlh5NotEqualTo(String value) {
            addCriterion("zjtlh5 <>", value, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andZjtlh5GreaterThan(String value) {
            addCriterion("zjtlh5 >", value, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andZjtlh5GreaterThanOrEqualTo(String value) {
            addCriterion("zjtlh5 >=", value, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andZjtlh5LessThan(String value) {
            addCriterion("zjtlh5 <", value, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andZjtlh5LessThanOrEqualTo(String value) {
            addCriterion("zjtlh5 <=", value, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andZjtlh5Like(String value) {
            addCriterion("zjtlh5 like", value, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andZjtlh5NotLike(String value) {
            addCriterion("zjtlh5 not like", value, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andZjtlh5In(List<String> values) {
            addCriterion("zjtlh5 in", values, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andZjtlh5NotIn(List<String> values) {
            addCriterion("zjtlh5 not in", values, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andZjtlh5Between(String value1, String value2) {
            addCriterion("zjtlh5 between", value1, value2, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andZjtlh5NotBetween(String value1, String value2) {
            addCriterion("zjtlh5 not between", value1, value2, "zjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5IsNull() {
            addCriterion("yjtlh5 is null");
            return (Criteria) this;
        }

        public Criteria andYjtlh5IsNotNull() {
            addCriterion("yjtlh5 is not null");
            return (Criteria) this;
        }

        public Criteria andYjtlh5EqualTo(String value) {
            addCriterion("yjtlh5 =", value, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5NotEqualTo(String value) {
            addCriterion("yjtlh5 <>", value, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5GreaterThan(String value) {
            addCriterion("yjtlh5 >", value, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5GreaterThanOrEqualTo(String value) {
            addCriterion("yjtlh5 >=", value, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5LessThan(String value) {
            addCriterion("yjtlh5 <", value, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5LessThanOrEqualTo(String value) {
            addCriterion("yjtlh5 <=", value, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5Like(String value) {
            addCriterion("yjtlh5 like", value, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5NotLike(String value) {
            addCriterion("yjtlh5 not like", value, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5In(List<String> values) {
            addCriterion("yjtlh5 in", values, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5NotIn(List<String> values) {
            addCriterion("yjtlh5 not in", values, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5Between(String value1, String value2) {
            addCriterion("yjtlh5 between", value1, value2, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andYjtlh5NotBetween(String value1, String value2) {
            addCriterion("yjtlh5 not between", value1, value2, "yjtlh5");
            return (Criteria) this;
        }

        public Criteria andZdtlh1IsNull() {
            addCriterion("zdtlh1 is null");
            return (Criteria) this;
        }

        public Criteria andZdtlh1IsNotNull() {
            addCriterion("zdtlh1 is not null");
            return (Criteria) this;
        }

        public Criteria andZdtlh1EqualTo(String value) {
            addCriterion("zdtlh1 =", value, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh1NotEqualTo(String value) {
            addCriterion("zdtlh1 <>", value, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh1GreaterThan(String value) {
            addCriterion("zdtlh1 >", value, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh1GreaterThanOrEqualTo(String value) {
            addCriterion("zdtlh1 >=", value, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh1LessThan(String value) {
            addCriterion("zdtlh1 <", value, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh1LessThanOrEqualTo(String value) {
            addCriterion("zdtlh1 <=", value, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh1Like(String value) {
            addCriterion("zdtlh1 like", value, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh1NotLike(String value) {
            addCriterion("zdtlh1 not like", value, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh1In(List<String> values) {
            addCriterion("zdtlh1 in", values, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh1NotIn(List<String> values) {
            addCriterion("zdtlh1 not in", values, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh1Between(String value1, String value2) {
            addCriterion("zdtlh1 between", value1, value2, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh1NotBetween(String value1, String value2) {
            addCriterion("zdtlh1 not between", value1, value2, "zdtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1IsNull() {
            addCriterion("ydtlh1 is null");
            return (Criteria) this;
        }

        public Criteria andYdtlh1IsNotNull() {
            addCriterion("ydtlh1 is not null");
            return (Criteria) this;
        }

        public Criteria andYdtlh1EqualTo(String value) {
            addCriterion("ydtlh1 =", value, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1NotEqualTo(String value) {
            addCriterion("ydtlh1 <>", value, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1GreaterThan(String value) {
            addCriterion("ydtlh1 >", value, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1GreaterThanOrEqualTo(String value) {
            addCriterion("ydtlh1 >=", value, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1LessThan(String value) {
            addCriterion("ydtlh1 <", value, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1LessThanOrEqualTo(String value) {
            addCriterion("ydtlh1 <=", value, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1Like(String value) {
            addCriterion("ydtlh1 like", value, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1NotLike(String value) {
            addCriterion("ydtlh1 not like", value, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1In(List<String> values) {
            addCriterion("ydtlh1 in", values, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1NotIn(List<String> values) {
            addCriterion("ydtlh1 not in", values, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1Between(String value1, String value2) {
            addCriterion("ydtlh1 between", value1, value2, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andYdtlh1NotBetween(String value1, String value2) {
            addCriterion("ydtlh1 not between", value1, value2, "ydtlh1");
            return (Criteria) this;
        }

        public Criteria andZdtlh2IsNull() {
            addCriterion("zdtlh2 is null");
            return (Criteria) this;
        }

        public Criteria andZdtlh2IsNotNull() {
            addCriterion("zdtlh2 is not null");
            return (Criteria) this;
        }

        public Criteria andZdtlh2EqualTo(String value) {
            addCriterion("zdtlh2 =", value, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andZdtlh2NotEqualTo(String value) {
            addCriterion("zdtlh2 <>", value, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andZdtlh2GreaterThan(String value) {
            addCriterion("zdtlh2 >", value, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andZdtlh2GreaterThanOrEqualTo(String value) {
            addCriterion("zdtlh2 >=", value, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andZdtlh2LessThan(String value) {
            addCriterion("zdtlh2 <", value, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andZdtlh2LessThanOrEqualTo(String value) {
            addCriterion("zdtlh2 <=", value, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andZdtlh2Like(String value) {
            addCriterion("zdtlh2 like", value, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andZdtlh2NotLike(String value) {
            addCriterion("zdtlh2 not like", value, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andZdtlh2In(List<String> values) {
            addCriterion("zdtlh2 in", values, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andZdtlh2NotIn(List<String> values) {
            addCriterion("zdtlh2 not in", values, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andZdtlh2Between(String value1, String value2) {
            addCriterion("zdtlh2 between", value1, value2, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andZdtlh2NotBetween(String value1, String value2) {
            addCriterion("zdtlh2 not between", value1, value2, "zdtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2IsNull() {
            addCriterion("ydtlh2 is null");
            return (Criteria) this;
        }

        public Criteria andYdtlh2IsNotNull() {
            addCriterion("ydtlh2 is not null");
            return (Criteria) this;
        }

        public Criteria andYdtlh2EqualTo(String value) {
            addCriterion("ydtlh2 =", value, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2NotEqualTo(String value) {
            addCriterion("ydtlh2 <>", value, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2GreaterThan(String value) {
            addCriterion("ydtlh2 >", value, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2GreaterThanOrEqualTo(String value) {
            addCriterion("ydtlh2 >=", value, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2LessThan(String value) {
            addCriterion("ydtlh2 <", value, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2LessThanOrEqualTo(String value) {
            addCriterion("ydtlh2 <=", value, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2Like(String value) {
            addCriterion("ydtlh2 like", value, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2NotLike(String value) {
            addCriterion("ydtlh2 not like", value, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2In(List<String> values) {
            addCriterion("ydtlh2 in", values, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2NotIn(List<String> values) {
            addCriterion("ydtlh2 not in", values, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2Between(String value1, String value2) {
            addCriterion("ydtlh2 between", value1, value2, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andYdtlh2NotBetween(String value1, String value2) {
            addCriterion("ydtlh2 not between", value1, value2, "ydtlh2");
            return (Criteria) this;
        }

        public Criteria andZhejtlhIsNull() {
            addCriterion("zhejtlh is null");
            return (Criteria) this;
        }

        public Criteria andZhejtlhIsNotNull() {
            addCriterion("zhejtlh is not null");
            return (Criteria) this;
        }

        public Criteria andZhejtlhEqualTo(String value) {
            addCriterion("zhejtlh =", value, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhejtlhNotEqualTo(String value) {
            addCriterion("zhejtlh <>", value, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhejtlhGreaterThan(String value) {
            addCriterion("zhejtlh >", value, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhejtlhGreaterThanOrEqualTo(String value) {
            addCriterion("zhejtlh >=", value, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhejtlhLessThan(String value) {
            addCriterion("zhejtlh <", value, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhejtlhLessThanOrEqualTo(String value) {
            addCriterion("zhejtlh <=", value, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhejtlhLike(String value) {
            addCriterion("zhejtlh like", value, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhejtlhNotLike(String value) {
            addCriterion("zhejtlh not like", value, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhejtlhIn(List<String> values) {
            addCriterion("zhejtlh in", values, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhejtlhNotIn(List<String> values) {
            addCriterion("zhejtlh not in", values, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhejtlhBetween(String value1, String value2) {
            addCriterion("zhejtlh between", value1, value2, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhejtlhNotBetween(String value1, String value2) {
            addCriterion("zhejtlh not between", value1, value2, "zhejtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhIsNull() {
            addCriterion("zhujtlh is null");
            return (Criteria) this;
        }

        public Criteria andZhujtlhIsNotNull() {
            addCriterion("zhujtlh is not null");
            return (Criteria) this;
        }

        public Criteria andZhujtlhEqualTo(String value) {
            addCriterion("zhujtlh =", value, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhNotEqualTo(String value) {
            addCriterion("zhujtlh <>", value, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhGreaterThan(String value) {
            addCriterion("zhujtlh >", value, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhGreaterThanOrEqualTo(String value) {
            addCriterion("zhujtlh >=", value, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhLessThan(String value) {
            addCriterion("zhujtlh <", value, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhLessThanOrEqualTo(String value) {
            addCriterion("zhujtlh <=", value, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhLike(String value) {
            addCriterion("zhujtlh like", value, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhNotLike(String value) {
            addCriterion("zhujtlh not like", value, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhIn(List<String> values) {
            addCriterion("zhujtlh in", values, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhNotIn(List<String> values) {
            addCriterion("zhujtlh not in", values, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhBetween(String value1, String value2) {
            addCriterion("zhujtlh between", value1, value2, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZhujtlhNotBetween(String value1, String value2) {
            addCriterion("zhujtlh not between", value1, value2, "zhujtlh");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1IsNull() {
            addCriterion("zzdxczdl1 is null");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1IsNotNull() {
            addCriterion("zzdxczdl1 is not null");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1EqualTo(String value) {
            addCriterion("zzdxczdl1 =", value, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1NotEqualTo(String value) {
            addCriterion("zzdxczdl1 <>", value, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1GreaterThan(String value) {
            addCriterion("zzdxczdl1 >", value, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1GreaterThanOrEqualTo(String value) {
            addCriterion("zzdxczdl1 >=", value, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1LessThan(String value) {
            addCriterion("zzdxczdl1 <", value, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1LessThanOrEqualTo(String value) {
            addCriterion("zzdxczdl1 <=", value, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1Like(String value) {
            addCriterion("zzdxczdl1 like", value, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1NotLike(String value) {
            addCriterion("zzdxczdl1 not like", value, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1In(List<String> values) {
            addCriterion("zzdxczdl1 in", values, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1NotIn(List<String> values) {
            addCriterion("zzdxczdl1 not in", values, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1Between(String value1, String value2) {
            addCriterion("zzdxczdl1 between", value1, value2, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl1NotBetween(String value1, String value2) {
            addCriterion("zzdxczdl1 not between", value1, value2, "zzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2IsNull() {
            addCriterion("zzdxczdl2 is null");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2IsNotNull() {
            addCriterion("zzdxczdl2 is not null");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2EqualTo(String value) {
            addCriterion("zzdxczdl2 =", value, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2NotEqualTo(String value) {
            addCriterion("zzdxczdl2 <>", value, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2GreaterThan(String value) {
            addCriterion("zzdxczdl2 >", value, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2GreaterThanOrEqualTo(String value) {
            addCriterion("zzdxczdl2 >=", value, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2LessThan(String value) {
            addCriterion("zzdxczdl2 <", value, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2LessThanOrEqualTo(String value) {
            addCriterion("zzdxczdl2 <=", value, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2Like(String value) {
            addCriterion("zzdxczdl2 like", value, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2NotLike(String value) {
            addCriterion("zzdxczdl2 not like", value, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2In(List<String> values) {
            addCriterion("zzdxczdl2 in", values, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2NotIn(List<String> values) {
            addCriterion("zzdxczdl2 not in", values, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2Between(String value1, String value2) {
            addCriterion("zzdxczdl2 between", value1, value2, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZzdxczdl2NotBetween(String value1, String value2) {
            addCriterion("zzdxczdl2 not between", value1, value2, "zzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1IsNull() {
            addCriterion("yzdxczdl1 is null");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1IsNotNull() {
            addCriterion("yzdxczdl1 is not null");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1EqualTo(String value) {
            addCriterion("yzdxczdl1 =", value, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1NotEqualTo(String value) {
            addCriterion("yzdxczdl1 <>", value, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1GreaterThan(String value) {
            addCriterion("yzdxczdl1 >", value, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1GreaterThanOrEqualTo(String value) {
            addCriterion("yzdxczdl1 >=", value, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1LessThan(String value) {
            addCriterion("yzdxczdl1 <", value, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1LessThanOrEqualTo(String value) {
            addCriterion("yzdxczdl1 <=", value, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1Like(String value) {
            addCriterion("yzdxczdl1 like", value, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1NotLike(String value) {
            addCriterion("yzdxczdl1 not like", value, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1In(List<String> values) {
            addCriterion("yzdxczdl1 in", values, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1NotIn(List<String> values) {
            addCriterion("yzdxczdl1 not in", values, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1Between(String value1, String value2) {
            addCriterion("yzdxczdl1 between", value1, value2, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl1NotBetween(String value1, String value2) {
            addCriterion("yzdxczdl1 not between", value1, value2, "yzdxczdl1");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2IsNull() {
            addCriterion("yzdxczdl2 is null");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2IsNotNull() {
            addCriterion("yzdxczdl2 is not null");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2EqualTo(String value) {
            addCriterion("yzdxczdl2 =", value, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2NotEqualTo(String value) {
            addCriterion("yzdxczdl2 <>", value, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2GreaterThan(String value) {
            addCriterion("yzdxczdl2 >", value, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2GreaterThanOrEqualTo(String value) {
            addCriterion("yzdxczdl2 >=", value, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2LessThan(String value) {
            addCriterion("yzdxczdl2 <", value, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2LessThanOrEqualTo(String value) {
            addCriterion("yzdxczdl2 <=", value, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2Like(String value) {
            addCriterion("yzdxczdl2 like", value, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2NotLike(String value) {
            addCriterion("yzdxczdl2 not like", value, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2In(List<String> values) {
            addCriterion("yzdxczdl2 in", values, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2NotIn(List<String> values) {
            addCriterion("yzdxczdl2 not in", values, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2Between(String value1, String value2) {
            addCriterion("yzdxczdl2 between", value1, value2, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andYzdxczdl2NotBetween(String value1, String value2) {
            addCriterion("yzdxczdl2 not between", value1, value2, "yzdxczdl2");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlIsNull() {
            addCriterion("zhezdxczdl is null");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlIsNotNull() {
            addCriterion("zhezdxczdl is not null");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlEqualTo(String value) {
            addCriterion("zhezdxczdl =", value, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlNotEqualTo(String value) {
            addCriterion("zhezdxczdl <>", value, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlGreaterThan(String value) {
            addCriterion("zhezdxczdl >", value, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlGreaterThanOrEqualTo(String value) {
            addCriterion("zhezdxczdl >=", value, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlLessThan(String value) {
            addCriterion("zhezdxczdl <", value, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlLessThanOrEqualTo(String value) {
            addCriterion("zhezdxczdl <=", value, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlLike(String value) {
            addCriterion("zhezdxczdl like", value, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlNotLike(String value) {
            addCriterion("zhezdxczdl not like", value, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlIn(List<String> values) {
            addCriterion("zhezdxczdl in", values, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlNotIn(List<String> values) {
            addCriterion("zhezdxczdl not in", values, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlBetween(String value1, String value2) {
            addCriterion("zhezdxczdl between", value1, value2, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZhezdxczdlNotBetween(String value1, String value2) {
            addCriterion("zhezdxczdl not between", value1, value2, "zhezdxczdl");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1IsNull() {
            addCriterion("zgcczdczd1 is null");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1IsNotNull() {
            addCriterion("zgcczdczd1 is not null");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1EqualTo(String value) {
            addCriterion("zgcczdczd1 =", value, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1NotEqualTo(String value) {
            addCriterion("zgcczdczd1 <>", value, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1GreaterThan(String value) {
            addCriterion("zgcczdczd1 >", value, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1GreaterThanOrEqualTo(String value) {
            addCriterion("zgcczdczd1 >=", value, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1LessThan(String value) {
            addCriterion("zgcczdczd1 <", value, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1LessThanOrEqualTo(String value) {
            addCriterion("zgcczdczd1 <=", value, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1Like(String value) {
            addCriterion("zgcczdczd1 like", value, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1NotLike(String value) {
            addCriterion("zgcczdczd1 not like", value, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1In(List<String> values) {
            addCriterion("zgcczdczd1 in", values, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1NotIn(List<String> values) {
            addCriterion("zgcczdczd1 not in", values, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1Between(String value1, String value2) {
            addCriterion("zgcczdczd1 between", value1, value2, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd1NotBetween(String value1, String value2) {
            addCriterion("zgcczdczd1 not between", value1, value2, "zgcczdczd1");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2IsNull() {
            addCriterion("zgcczdczd2 is null");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2IsNotNull() {
            addCriterion("zgcczdczd2 is not null");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2EqualTo(String value) {
            addCriterion("zgcczdczd2 =", value, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2NotEqualTo(String value) {
            addCriterion("zgcczdczd2 <>", value, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2GreaterThan(String value) {
            addCriterion("zgcczdczd2 >", value, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2GreaterThanOrEqualTo(String value) {
            addCriterion("zgcczdczd2 >=", value, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2LessThan(String value) {
            addCriterion("zgcczdczd2 <", value, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2LessThanOrEqualTo(String value) {
            addCriterion("zgcczdczd2 <=", value, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2Like(String value) {
            addCriterion("zgcczdczd2 like", value, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2NotLike(String value) {
            addCriterion("zgcczdczd2 not like", value, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2In(List<String> values) {
            addCriterion("zgcczdczd2 in", values, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2NotIn(List<String> values) {
            addCriterion("zgcczdczd2 not in", values, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2Between(String value1, String value2) {
            addCriterion("zgcczdczd2 between", value1, value2, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andZgcczdczd2NotBetween(String value1, String value2) {
            addCriterion("zgcczdczd2 not between", value1, value2, "zgcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1IsNull() {
            addCriterion("ygcczdczd1 is null");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1IsNotNull() {
            addCriterion("ygcczdczd1 is not null");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1EqualTo(String value) {
            addCriterion("ygcczdczd1 =", value, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1NotEqualTo(String value) {
            addCriterion("ygcczdczd1 <>", value, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1GreaterThan(String value) {
            addCriterion("ygcczdczd1 >", value, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1GreaterThanOrEqualTo(String value) {
            addCriterion("ygcczdczd1 >=", value, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1LessThan(String value) {
            addCriterion("ygcczdczd1 <", value, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1LessThanOrEqualTo(String value) {
            addCriterion("ygcczdczd1 <=", value, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1Like(String value) {
            addCriterion("ygcczdczd1 like", value, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1NotLike(String value) {
            addCriterion("ygcczdczd1 not like", value, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1In(List<String> values) {
            addCriterion("ygcczdczd1 in", values, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1NotIn(List<String> values) {
            addCriterion("ygcczdczd1 not in", values, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1Between(String value1, String value2) {
            addCriterion("ygcczdczd1 between", value1, value2, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd1NotBetween(String value1, String value2) {
            addCriterion("ygcczdczd1 not between", value1, value2, "ygcczdczd1");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2IsNull() {
            addCriterion("ygcczdczd2 is null");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2IsNotNull() {
            addCriterion("ygcczdczd2 is not null");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2EqualTo(String value) {
            addCriterion("ygcczdczd2 =", value, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2NotEqualTo(String value) {
            addCriterion("ygcczdczd2 <>", value, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2GreaterThan(String value) {
            addCriterion("ygcczdczd2 >", value, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2GreaterThanOrEqualTo(String value) {
            addCriterion("ygcczdczd2 >=", value, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2LessThan(String value) {
            addCriterion("ygcczdczd2 <", value, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2LessThanOrEqualTo(String value) {
            addCriterion("ygcczdczd2 <=", value, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2Like(String value) {
            addCriterion("ygcczdczd2 like", value, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2NotLike(String value) {
            addCriterion("ygcczdczd2 not like", value, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2In(List<String> values) {
            addCriterion("ygcczdczd2 in", values, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2NotIn(List<String> values) {
            addCriterion("ygcczdczd2 not in", values, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2Between(String value1, String value2) {
            addCriterion("ygcczdczd2 between", value1, value2, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andYgcczdczd2NotBetween(String value1, String value2) {
            addCriterion("ygcczdczd2 not between", value1, value2, "ygcczdczd2");
            return (Criteria) this;
        }

        public Criteria andXmpd1IsNull() {
            addCriterion("xmpd1 is null");
            return (Criteria) this;
        }

        public Criteria andXmpd1IsNotNull() {
            addCriterion("xmpd1 is not null");
            return (Criteria) this;
        }

        public Criteria andXmpd1EqualTo(String value) {
            addCriterion("xmpd1 =", value, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd1NotEqualTo(String value) {
            addCriterion("xmpd1 <>", value, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd1GreaterThan(String value) {
            addCriterion("xmpd1 >", value, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd1GreaterThanOrEqualTo(String value) {
            addCriterion("xmpd1 >=", value, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd1LessThan(String value) {
            addCriterion("xmpd1 <", value, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd1LessThanOrEqualTo(String value) {
            addCriterion("xmpd1 <=", value, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd1Like(String value) {
            addCriterion("xmpd1 like", value, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd1NotLike(String value) {
            addCriterion("xmpd1 not like", value, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd1In(List<String> values) {
            addCriterion("xmpd1 in", values, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd1NotIn(List<String> values) {
            addCriterion("xmpd1 not in", values, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd1Between(String value1, String value2) {
            addCriterion("xmpd1 between", value1, value2, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd1NotBetween(String value1, String value2) {
            addCriterion("xmpd1 not between", value1, value2, "xmpd1");
            return (Criteria) this;
        }

        public Criteria andXmpd2IsNull() {
            addCriterion("xmpd2 is null");
            return (Criteria) this;
        }

        public Criteria andXmpd2IsNotNull() {
            addCriterion("xmpd2 is not null");
            return (Criteria) this;
        }

        public Criteria andXmpd2EqualTo(String value) {
            addCriterion("xmpd2 =", value, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andXmpd2NotEqualTo(String value) {
            addCriterion("xmpd2 <>", value, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andXmpd2GreaterThan(String value) {
            addCriterion("xmpd2 >", value, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andXmpd2GreaterThanOrEqualTo(String value) {
            addCriterion("xmpd2 >=", value, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andXmpd2LessThan(String value) {
            addCriterion("xmpd2 <", value, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andXmpd2LessThanOrEqualTo(String value) {
            addCriterion("xmpd2 <=", value, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andXmpd2Like(String value) {
            addCriterion("xmpd2 like", value, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andXmpd2NotLike(String value) {
            addCriterion("xmpd2 not like", value, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andXmpd2In(List<String> values) {
            addCriterion("xmpd2 in", values, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andXmpd2NotIn(List<String> values) {
            addCriterion("xmpd2 not in", values, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andXmpd2Between(String value1, String value2) {
            addCriterion("xmpd2 between", value1, value2, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andXmpd2NotBetween(String value1, String value2) {
            addCriterion("xmpd2 not between", value1, value2, "xmpd2");
            return (Criteria) this;
        }

        public Criteria andDxcs1IsNull() {
            addCriterion("dxcs1 is null");
            return (Criteria) this;
        }

        public Criteria andDxcs1IsNotNull() {
            addCriterion("dxcs1 is not null");
            return (Criteria) this;
        }

        public Criteria andDxcs1EqualTo(String value) {
            addCriterion("dxcs1 =", value, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs1NotEqualTo(String value) {
            addCriterion("dxcs1 <>", value, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs1GreaterThan(String value) {
            addCriterion("dxcs1 >", value, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs1GreaterThanOrEqualTo(String value) {
            addCriterion("dxcs1 >=", value, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs1LessThan(String value) {
            addCriterion("dxcs1 <", value, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs1LessThanOrEqualTo(String value) {
            addCriterion("dxcs1 <=", value, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs1Like(String value) {
            addCriterion("dxcs1 like", value, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs1NotLike(String value) {
            addCriterion("dxcs1 not like", value, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs1In(List<String> values) {
            addCriterion("dxcs1 in", values, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs1NotIn(List<String> values) {
            addCriterion("dxcs1 not in", values, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs1Between(String value1, String value2) {
            addCriterion("dxcs1 between", value1, value2, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs1NotBetween(String value1, String value2) {
            addCriterion("dxcs1 not between", value1, value2, "dxcs1");
            return (Criteria) this;
        }

        public Criteria andDxcs2IsNull() {
            addCriterion("dxcs2 is null");
            return (Criteria) this;
        }

        public Criteria andDxcs2IsNotNull() {
            addCriterion("dxcs2 is not null");
            return (Criteria) this;
        }

        public Criteria andDxcs2EqualTo(String value) {
            addCriterion("dxcs2 =", value, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andDxcs2NotEqualTo(String value) {
            addCriterion("dxcs2 <>", value, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andDxcs2GreaterThan(String value) {
            addCriterion("dxcs2 >", value, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andDxcs2GreaterThanOrEqualTo(String value) {
            addCriterion("dxcs2 >=", value, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andDxcs2LessThan(String value) {
            addCriterion("dxcs2 <", value, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andDxcs2LessThanOrEqualTo(String value) {
            addCriterion("dxcs2 <=", value, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andDxcs2Like(String value) {
            addCriterion("dxcs2 like", value, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andDxcs2NotLike(String value) {
            addCriterion("dxcs2 not like", value, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andDxcs2In(List<String> values) {
            addCriterion("dxcs2 in", values, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andDxcs2NotIn(List<String> values) {
            addCriterion("dxcs2 not in", values, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andDxcs2Between(String value1, String value2) {
            addCriterion("dxcs2 between", value1, value2, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andDxcs2NotBetween(String value1, String value2) {
            addCriterion("dxcs2 not between", value1, value2, "dxcs2");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdIsNull() {
            addCriterion("zwdygfgqd is null");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdIsNotNull() {
            addCriterion("zwdygfgqd is not null");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdEqualTo(String value) {
            addCriterion("zwdygfgqd =", value, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdNotEqualTo(String value) {
            addCriterion("zwdygfgqd <>", value, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdGreaterThan(String value) {
            addCriterion("zwdygfgqd >", value, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdGreaterThanOrEqualTo(String value) {
            addCriterion("zwdygfgqd >=", value, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdLessThan(String value) {
            addCriterion("zwdygfgqd <", value, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdLessThanOrEqualTo(String value) {
            addCriterion("zwdygfgqd <=", value, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdLike(String value) {
            addCriterion("zwdygfgqd like", value, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdNotLike(String value) {
            addCriterion("zwdygfgqd not like", value, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdIn(List<String> values) {
            addCriterion("zwdygfgqd in", values, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdNotIn(List<String> values) {
            addCriterion("zwdygfgqd not in", values, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdBetween(String value1, String value2) {
            addCriterion("zwdygfgqd between", value1, value2, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZwdygfgqdNotBetween(String value1, String value2) {
            addCriterion("zwdygfgqd not between", value1, value2, "zwdygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdIsNull() {
            addCriterion("zndygfgqd is null");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdIsNotNull() {
            addCriterion("zndygfgqd is not null");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdEqualTo(String value) {
            addCriterion("zndygfgqd =", value, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdNotEqualTo(String value) {
            addCriterion("zndygfgqd <>", value, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdGreaterThan(String value) {
            addCriterion("zndygfgqd >", value, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdGreaterThanOrEqualTo(String value) {
            addCriterion("zndygfgqd >=", value, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdLessThan(String value) {
            addCriterion("zndygfgqd <", value, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdLessThanOrEqualTo(String value) {
            addCriterion("zndygfgqd <=", value, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdLike(String value) {
            addCriterion("zndygfgqd like", value, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdNotLike(String value) {
            addCriterion("zndygfgqd not like", value, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdIn(List<String> values) {
            addCriterion("zndygfgqd in", values, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdNotIn(List<String> values) {
            addCriterion("zndygfgqd not in", values, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdBetween(String value1, String value2) {
            addCriterion("zndygfgqd between", value1, value2, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andZndygfgqdNotBetween(String value1, String value2) {
            addCriterion("zndygfgqd not between", value1, value2, "zndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdIsNull() {
            addCriterion("yndygfgqd is null");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdIsNotNull() {
            addCriterion("yndygfgqd is not null");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdEqualTo(String value) {
            addCriterion("yndygfgqd =", value, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdNotEqualTo(String value) {
            addCriterion("yndygfgqd <>", value, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdGreaterThan(String value) {
            addCriterion("yndygfgqd >", value, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdGreaterThanOrEqualTo(String value) {
            addCriterion("yndygfgqd >=", value, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdLessThan(String value) {
            addCriterion("yndygfgqd <", value, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdLessThanOrEqualTo(String value) {
            addCriterion("yndygfgqd <=", value, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdLike(String value) {
            addCriterion("yndygfgqd like", value, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdNotLike(String value) {
            addCriterion("yndygfgqd not like", value, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdIn(List<String> values) {
            addCriterion("yndygfgqd in", values, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdNotIn(List<String> values) {
            addCriterion("yndygfgqd not in", values, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdBetween(String value1, String value2) {
            addCriterion("yndygfgqd between", value1, value2, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYndygfgqdNotBetween(String value1, String value2) {
            addCriterion("yndygfgqd not between", value1, value2, "yndygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdIsNull() {
            addCriterion("ywdygfgqd is null");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdIsNotNull() {
            addCriterion("ywdygfgqd is not null");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdEqualTo(String value) {
            addCriterion("ywdygfgqd =", value, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdNotEqualTo(String value) {
            addCriterion("ywdygfgqd <>", value, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdGreaterThan(String value) {
            addCriterion("ywdygfgqd >", value, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdGreaterThanOrEqualTo(String value) {
            addCriterion("ywdygfgqd >=", value, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdLessThan(String value) {
            addCriterion("ywdygfgqd <", value, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdLessThanOrEqualTo(String value) {
            addCriterion("ywdygfgqd <=", value, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdLike(String value) {
            addCriterion("ywdygfgqd like", value, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdNotLike(String value) {
            addCriterion("ywdygfgqd not like", value, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdIn(List<String> values) {
            addCriterion("ywdygfgqd in", values, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdNotIn(List<String> values) {
            addCriterion("ywdygfgqd not in", values, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdBetween(String value1, String value2) {
            addCriterion("ywdygfgqd between", value1, value2, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andYwdygfgqdNotBetween(String value1, String value2) {
            addCriterion("ywdygfgqd not between", value1, value2, "ywdygfgqd");
            return (Criteria) this;
        }

        public Criteria andCha1IsNull() {
            addCriterion("chA1 is null");
            return (Criteria) this;
        }

        public Criteria andCha1IsNotNull() {
            addCriterion("chA1 is not null");
            return (Criteria) this;
        }

        public Criteria andCha1EqualTo(String value) {
            addCriterion("chA1 =", value, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha1NotEqualTo(String value) {
            addCriterion("chA1 <>", value, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha1GreaterThan(String value) {
            addCriterion("chA1 >", value, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha1GreaterThanOrEqualTo(String value) {
            addCriterion("chA1 >=", value, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha1LessThan(String value) {
            addCriterion("chA1 <", value, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha1LessThanOrEqualTo(String value) {
            addCriterion("chA1 <=", value, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha1Like(String value) {
            addCriterion("chA1 like", value, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha1NotLike(String value) {
            addCriterion("chA1 not like", value, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha1In(List<String> values) {
            addCriterion("chA1 in", values, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha1NotIn(List<String> values) {
            addCriterion("chA1 not in", values, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha1Between(String value1, String value2) {
            addCriterion("chA1 between", value1, value2, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha1NotBetween(String value1, String value2) {
            addCriterion("chA1 not between", value1, value2, "cha1");
            return (Criteria) this;
        }

        public Criteria andCha2IsNull() {
            addCriterion("chA2 is null");
            return (Criteria) this;
        }

        public Criteria andCha2IsNotNull() {
            addCriterion("chA2 is not null");
            return (Criteria) this;
        }

        public Criteria andCha2EqualTo(String value) {
            addCriterion("chA2 =", value, "cha2");
            return (Criteria) this;
        }

        public Criteria andCha2NotEqualTo(String value) {
            addCriterion("chA2 <>", value, "cha2");
            return (Criteria) this;
        }

        public Criteria andCha2GreaterThan(String value) {
            addCriterion("chA2 >", value, "cha2");
            return (Criteria) this;
        }

        public Criteria andCha2GreaterThanOrEqualTo(String value) {
            addCriterion("chA2 >=", value, "cha2");
            return (Criteria) this;
        }

        public Criteria andCha2LessThan(String value) {
            addCriterion("chA2 <", value, "cha2");
            return (Criteria) this;
        }

        public Criteria andCha2LessThanOrEqualTo(String value) {
            addCriterion("chA2 <=", value, "cha2");
            return (Criteria) this;
        }

        public Criteria andCha2Like(String value) {
            addCriterion("chA2 like", value, "cha2");
            return (Criteria) this;
        }

        public Criteria andCha2NotLike(String value) {
            addCriterion("chA2 not like", value, "cha2");
            return (Criteria) this;
        }

        public Criteria andCha2In(List<String> values) {
            addCriterion("chA2 in", values, "cha2");
            return (Criteria) this;
        }

        public Criteria andCha2NotIn(List<String> values) {
            addCriterion("chA2 not in", values, "cha2");
            return (Criteria) this;
        }

        public Criteria andCha2Between(String value1, String value2) {
            addCriterion("chA2 between", value1, value2, "cha2");
            return (Criteria) this;
        }

        public Criteria andCha2NotBetween(String value1, String value2) {
            addCriterion("chA2 not between", value1, value2, "cha2");
            return (Criteria) this;
        }

        public Criteria andLsmfddIsNull() {
            addCriterion("lsMFDD is null");
            return (Criteria) this;
        }

        public Criteria andLsmfddIsNotNull() {
            addCriterion("lsMFDD is not null");
            return (Criteria) this;
        }

        public Criteria andLsmfddEqualTo(String value) {
            addCriterion("lsMFDD =", value, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsmfddNotEqualTo(String value) {
            addCriterion("lsMFDD <>", value, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsmfddGreaterThan(String value) {
            addCriterion("lsMFDD >", value, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsmfddGreaterThanOrEqualTo(String value) {
            addCriterion("lsMFDD >=", value, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsmfddLessThan(String value) {
            addCriterion("lsMFDD <", value, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsmfddLessThanOrEqualTo(String value) {
            addCriterion("lsMFDD <=", value, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsmfddLike(String value) {
            addCriterion("lsMFDD like", value, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsmfddNotLike(String value) {
            addCriterion("lsMFDD not like", value, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsmfddIn(List<String> values) {
            addCriterion("lsMFDD in", values, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsmfddNotIn(List<String> values) {
            addCriterion("lsMFDD not in", values, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsmfddBetween(String value1, String value2) {
            addCriterion("lsMFDD between", value1, value2, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsmfddNotBetween(String value1, String value2) {
            addCriterion("lsMFDD not between", value1, value2, "lsmfdd");
            return (Criteria) this;
        }

        public Criteria andLsxtsjIsNull() {
            addCriterion("lsxtsj is null");
            return (Criteria) this;
        }

        public Criteria andLsxtsjIsNotNull() {
            addCriterion("lsxtsj is not null");
            return (Criteria) this;
        }

        public Criteria andLsxtsjEqualTo(String value) {
            addCriterion("lsxtsj =", value, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLsxtsjNotEqualTo(String value) {
            addCriterion("lsxtsj <>", value, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLsxtsjGreaterThan(String value) {
            addCriterion("lsxtsj >", value, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLsxtsjGreaterThanOrEqualTo(String value) {
            addCriterion("lsxtsj >=", value, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLsxtsjLessThan(String value) {
            addCriterion("lsxtsj <", value, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLsxtsjLessThanOrEqualTo(String value) {
            addCriterion("lsxtsj <=", value, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLsxtsjLike(String value) {
            addCriterion("lsxtsj like", value, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLsxtsjNotLike(String value) {
            addCriterion("lsxtsj not like", value, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLsxtsjIn(List<String> values) {
            addCriterion("lsxtsj in", values, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLsxtsjNotIn(List<String> values) {
            addCriterion("lsxtsj not in", values, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLsxtsjBetween(String value1, String value2) {
            addCriterion("lsxtsj between", value1, value2, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLsxtsjNotBetween(String value1, String value2) {
            addCriterion("lsxtsj not between", value1, value2, "lsxtsj");
            return (Criteria) this;
        }

        public Criteria andLszdwdxIsNull() {
            addCriterion("lszdwdx is null");
            return (Criteria) this;
        }

        public Criteria andLszdwdxIsNotNull() {
            addCriterion("lszdwdx is not null");
            return (Criteria) this;
        }

        public Criteria andLszdwdxEqualTo(String value) {
            addCriterion("lszdwdx =", value, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLszdwdxNotEqualTo(String value) {
            addCriterion("lszdwdx <>", value, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLszdwdxGreaterThan(String value) {
            addCriterion("lszdwdx >", value, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLszdwdxGreaterThanOrEqualTo(String value) {
            addCriterion("lszdwdx >=", value, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLszdwdxLessThan(String value) {
            addCriterion("lszdwdx <", value, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLszdwdxLessThanOrEqualTo(String value) {
            addCriterion("lszdwdx <=", value, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLszdwdxLike(String value) {
            addCriterion("lszdwdx like", value, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLszdwdxNotLike(String value) {
            addCriterion("lszdwdx not like", value, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLszdwdxIn(List<String> values) {
            addCriterion("lszdwdx in", values, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLszdwdxNotIn(List<String> values) {
            addCriterion("lszdwdx not in", values, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLszdwdxBetween(String value1, String value2) {
            addCriterion("lszdwdx between", value1, value2, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLszdwdxNotBetween(String value1, String value2) {
            addCriterion("lszdwdx not between", value1, value2, "lszdwdx");
            return (Criteria) this;
        }

        public Criteria andLsjyyIsNull() {
            addCriterion("lsjyy is null");
            return (Criteria) this;
        }

        public Criteria andLsjyyIsNotNull() {
            addCriterion("lsjyy is not null");
            return (Criteria) this;
        }

        public Criteria andLsjyyEqualTo(String value) {
            addCriterion("lsjyy =", value, "lsjyy");
            return (Criteria) this;
        }

        public Criteria andLsjyyNotEqualTo(String value) {
            addCriterion("lsjyy <>", value, "lsjyy");
            return (Criteria) this;
        }

        public Criteria andLsjyyGreaterThan(String value) {
            addCriterion("lsjyy >", value, "lsjyy");
            return (Criteria) this;
        }

        public Criteria andLsjyyGreaterThanOrEqualTo(String value) {
            addCriterion("lsjyy >=", value, "lsjyy");
            return (Criteria) this;
        }

        public Criteria andLsjyyLessThan(String value) {
            addCriterion("lsjyy <", value, "lsjyy");
            return (Criteria) this;
        }

        public Criteria andLsjyyLessThanOrEqualTo(String value) {
            addCriterion("lsjyy <=", value, "lsjyy");
            return (Criteria) this;
        }

        public Criteria andLsjyyLike(String value) {
            addCriterion("lsjyy like", value, "lsjyy");
            return (Criteria) this;
        }

        public Criteria andLsjyyNotLike(String value) {
            addCriterion("lsjyy not like", value, "lsjyy");
            return (Criteria) this;
        }

        public Criteria andLsjyyIn(List<String> values) {
            addCriterion("lsjyy in", values, "lsjyy");
            return (Criteria) this;
        }

        public Criteria andLsjyyNotIn(List<String> values) {
            addCriterion("lsjyy not in", values, "lsjyy");
            return (Criteria) this;
        }

        public Criteria andLsjyyBetween(String value1, String value2) {
            addCriterion("lsjyy between", value1, value2, "lsjyy");
            return (Criteria) this;
        }

        public Criteria andLsjyyNotBetween(String value1, String value2) {
            addCriterion("lsjyy not between", value1, value2, "lsjyy");
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

        public Criteria andZbzlzIsNull() {
            addCriterion("zbzlz is null");
            return (Criteria) this;
        }

        public Criteria andZbzlzIsNotNull() {
            addCriterion("zbzlz is not null");
            return (Criteria) this;
        }

        public Criteria andZbzlzEqualTo(String value) {
            addCriterion("zbzlz =", value, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andZbzlzNotEqualTo(String value) {
            addCriterion("zbzlz <>", value, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andZbzlzGreaterThan(String value) {
            addCriterion("zbzlz >", value, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andZbzlzGreaterThanOrEqualTo(String value) {
            addCriterion("zbzlz >=", value, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andZbzlzLessThan(String value) {
            addCriterion("zbzlz <", value, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andZbzlzLessThanOrEqualTo(String value) {
            addCriterion("zbzlz <=", value, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andZbzlzLike(String value) {
            addCriterion("zbzlz like", value, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andZbzlzNotLike(String value) {
            addCriterion("zbzlz not like", value, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andZbzlzIn(List<String> values) {
            addCriterion("zbzlz in", values, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andZbzlzNotIn(List<String> values) {
            addCriterion("zbzlz not in", values, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andZbzlzBetween(String value1, String value2) {
            addCriterion("zbzlz between", value1, value2, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andZbzlzNotBetween(String value1, String value2) {
            addCriterion("zbzlz not between", value1, value2, "zbzlz");
            return (Criteria) this;
        }

        public Criteria andKczlIsNull() {
            addCriterion("kczl is null");
            return (Criteria) this;
        }

        public Criteria andKczlIsNotNull() {
            addCriterion("kczl is not null");
            return (Criteria) this;
        }

        public Criteria andKczlEqualTo(String value) {
            addCriterion("kczl =", value, "kczl");
            return (Criteria) this;
        }

        public Criteria andKczlNotEqualTo(String value) {
            addCriterion("kczl <>", value, "kczl");
            return (Criteria) this;
        }

        public Criteria andKczlGreaterThan(String value) {
            addCriterion("kczl >", value, "kczl");
            return (Criteria) this;
        }

        public Criteria andKczlGreaterThanOrEqualTo(String value) {
            addCriterion("kczl >=", value, "kczl");
            return (Criteria) this;
        }

        public Criteria andKczlLessThan(String value) {
            addCriterion("kczl <", value, "kczl");
            return (Criteria) this;
        }

        public Criteria andKczlLessThanOrEqualTo(String value) {
            addCriterion("kczl <=", value, "kczl");
            return (Criteria) this;
        }

        public Criteria andKczlLike(String value) {
            addCriterion("kczl like", value, "kczl");
            return (Criteria) this;
        }

        public Criteria andKczlNotLike(String value) {
            addCriterion("kczl not like", value, "kczl");
            return (Criteria) this;
        }

        public Criteria andKczlIn(List<String> values) {
            addCriterion("kczl in", values, "kczl");
            return (Criteria) this;
        }

        public Criteria andKczlNotIn(List<String> values) {
            addCriterion("kczl not in", values, "kczl");
            return (Criteria) this;
        }

        public Criteria andKczlBetween(String value1, String value2) {
            addCriterion("kczl between", value1, value2, "kczl");
            return (Criteria) this;
        }

        public Criteria andKczlNotBetween(String value1, String value2) {
            addCriterion("kczl not between", value1, value2, "kczl");
            return (Criteria) this;
        }

        public Criteria andZchphmIsNull() {
            addCriterion("zchphm is null");
            return (Criteria) this;
        }

        public Criteria andZchphmIsNotNull() {
            addCriterion("zchphm is not null");
            return (Criteria) this;
        }

        public Criteria andZchphmEqualTo(String value) {
            addCriterion("zchphm =", value, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZchphmNotEqualTo(String value) {
            addCriterion("zchphm <>", value, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZchphmGreaterThan(String value) {
            addCriterion("zchphm >", value, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZchphmGreaterThanOrEqualTo(String value) {
            addCriterion("zchphm >=", value, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZchphmLessThan(String value) {
            addCriterion("zchphm <", value, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZchphmLessThanOrEqualTo(String value) {
            addCriterion("zchphm <=", value, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZchphmLike(String value) {
            addCriterion("zchphm like", value, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZchphmNotLike(String value) {
            addCriterion("zchphm not like", value, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZchphmIn(List<String> values) {
            addCriterion("zchphm in", values, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZchphmNotIn(List<String> values) {
            addCriterion("zchphm not in", values, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZchphmBetween(String value1, String value2) {
            addCriterion("zchphm between", value1, value2, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZchphmNotBetween(String value1, String value2) {
            addCriterion("zchphm not between", value1, value2, "zchphm");
            return (Criteria) this;
        }

        public Criteria andZczqyzlIsNull() {
            addCriterion("zczqyzl is null");
            return (Criteria) this;
        }

        public Criteria andZczqyzlIsNotNull() {
            addCriterion("zczqyzl is not null");
            return (Criteria) this;
        }

        public Criteria andZczqyzlEqualTo(String value) {
            addCriterion("zczqyzl =", value, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZczqyzlNotEqualTo(String value) {
            addCriterion("zczqyzl <>", value, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZczqyzlGreaterThan(String value) {
            addCriterion("zczqyzl >", value, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZczqyzlGreaterThanOrEqualTo(String value) {
            addCriterion("zczqyzl >=", value, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZczqyzlLessThan(String value) {
            addCriterion("zczqyzl <", value, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZczqyzlLessThanOrEqualTo(String value) {
            addCriterion("zczqyzl <=", value, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZczqyzlLike(String value) {
            addCriterion("zczqyzl like", value, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZczqyzlNotLike(String value) {
            addCriterion("zczqyzl not like", value, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZczqyzlIn(List<String> values) {
            addCriterion("zczqyzl in", values, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZczqyzlNotIn(List<String> values) {
            addCriterion("zczqyzl not in", values, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZczqyzlBetween(String value1, String value2) {
            addCriterion("zczqyzl between", value1, value2, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZczqyzlNotBetween(String value1, String value2) {
            addCriterion("zczqyzl not between", value1, value2, "zczqyzl");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdIsNull() {
            addCriterion("zwdxmpd is null");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdIsNotNull() {
            addCriterion("zwdxmpd is not null");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdEqualTo(String value) {
            addCriterion("zwdxmpd =", value, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdNotEqualTo(String value) {
            addCriterion("zwdxmpd <>", value, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdGreaterThan(String value) {
            addCriterion("zwdxmpd >", value, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdGreaterThanOrEqualTo(String value) {
            addCriterion("zwdxmpd >=", value, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdLessThan(String value) {
            addCriterion("zwdxmpd <", value, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdLessThanOrEqualTo(String value) {
            addCriterion("zwdxmpd <=", value, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdLike(String value) {
            addCriterion("zwdxmpd like", value, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdNotLike(String value) {
            addCriterion("zwdxmpd not like", value, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdIn(List<String> values) {
            addCriterion("zwdxmpd in", values, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdNotIn(List<String> values) {
            addCriterion("zwdxmpd not in", values, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdBetween(String value1, String value2) {
            addCriterion("zwdxmpd between", value1, value2, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZwdxmpdNotBetween(String value1, String value2) {
            addCriterion("zwdxmpd not between", value1, value2, "zwdxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdIsNull() {
            addCriterion("zndxmpd is null");
            return (Criteria) this;
        }

        public Criteria andZndxmpdIsNotNull() {
            addCriterion("zndxmpd is not null");
            return (Criteria) this;
        }

        public Criteria andZndxmpdEqualTo(String value) {
            addCriterion("zndxmpd =", value, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdNotEqualTo(String value) {
            addCriterion("zndxmpd <>", value, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdGreaterThan(String value) {
            addCriterion("zndxmpd >", value, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdGreaterThanOrEqualTo(String value) {
            addCriterion("zndxmpd >=", value, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdLessThan(String value) {
            addCriterion("zndxmpd <", value, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdLessThanOrEqualTo(String value) {
            addCriterion("zndxmpd <=", value, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdLike(String value) {
            addCriterion("zndxmpd like", value, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdNotLike(String value) {
            addCriterion("zndxmpd not like", value, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdIn(List<String> values) {
            addCriterion("zndxmpd in", values, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdNotIn(List<String> values) {
            addCriterion("zndxmpd not in", values, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdBetween(String value1, String value2) {
            addCriterion("zndxmpd between", value1, value2, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andZndxmpdNotBetween(String value1, String value2) {
            addCriterion("zndxmpd not between", value1, value2, "zndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdIsNull() {
            addCriterion("yndxmpd is null");
            return (Criteria) this;
        }

        public Criteria andYndxmpdIsNotNull() {
            addCriterion("yndxmpd is not null");
            return (Criteria) this;
        }

        public Criteria andYndxmpdEqualTo(String value) {
            addCriterion("yndxmpd =", value, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdNotEqualTo(String value) {
            addCriterion("yndxmpd <>", value, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdGreaterThan(String value) {
            addCriterion("yndxmpd >", value, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdGreaterThanOrEqualTo(String value) {
            addCriterion("yndxmpd >=", value, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdLessThan(String value) {
            addCriterion("yndxmpd <", value, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdLessThanOrEqualTo(String value) {
            addCriterion("yndxmpd <=", value, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdLike(String value) {
            addCriterion("yndxmpd like", value, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdNotLike(String value) {
            addCriterion("yndxmpd not like", value, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdIn(List<String> values) {
            addCriterion("yndxmpd in", values, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdNotIn(List<String> values) {
            addCriterion("yndxmpd not in", values, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdBetween(String value1, String value2) {
            addCriterion("yndxmpd between", value1, value2, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYndxmpdNotBetween(String value1, String value2) {
            addCriterion("yndxmpd not between", value1, value2, "yndxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdIsNull() {
            addCriterion("ywdxmpd is null");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdIsNotNull() {
            addCriterion("ywdxmpd is not null");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdEqualTo(String value) {
            addCriterion("ywdxmpd =", value, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdNotEqualTo(String value) {
            addCriterion("ywdxmpd <>", value, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdGreaterThan(String value) {
            addCriterion("ywdxmpd >", value, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdGreaterThanOrEqualTo(String value) {
            addCriterion("ywdxmpd >=", value, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdLessThan(String value) {
            addCriterion("ywdxmpd <", value, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdLessThanOrEqualTo(String value) {
            addCriterion("ywdxmpd <=", value, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdLike(String value) {
            addCriterion("ywdxmpd like", value, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdNotLike(String value) {
            addCriterion("ywdxmpd not like", value, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdIn(List<String> values) {
            addCriterion("ywdxmpd in", values, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdNotIn(List<String> values) {
            addCriterion("ywdxmpd not in", values, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdBetween(String value1, String value2) {
            addCriterion("ywdxmpd between", value1, value2, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andYwdxmpdNotBetween(String value1, String value2) {
            addCriterion("ywdxmpd not between", value1, value2, "ywdxmpd");
            return (Criteria) this;
        }

        public Criteria andChxmpd1IsNull() {
            addCriterion("chxmpd1 is null");
            return (Criteria) this;
        }

        public Criteria andChxmpd1IsNotNull() {
            addCriterion("chxmpd1 is not null");
            return (Criteria) this;
        }

        public Criteria andChxmpd1EqualTo(String value) {
            addCriterion("chxmpd1 =", value, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd1NotEqualTo(String value) {
            addCriterion("chxmpd1 <>", value, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd1GreaterThan(String value) {
            addCriterion("chxmpd1 >", value, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd1GreaterThanOrEqualTo(String value) {
            addCriterion("chxmpd1 >=", value, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd1LessThan(String value) {
            addCriterion("chxmpd1 <", value, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd1LessThanOrEqualTo(String value) {
            addCriterion("chxmpd1 <=", value, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd1Like(String value) {
            addCriterion("chxmpd1 like", value, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd1NotLike(String value) {
            addCriterion("chxmpd1 not like", value, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd1In(List<String> values) {
            addCriterion("chxmpd1 in", values, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd1NotIn(List<String> values) {
            addCriterion("chxmpd1 not in", values, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd1Between(String value1, String value2) {
            addCriterion("chxmpd1 between", value1, value2, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd1NotBetween(String value1, String value2) {
            addCriterion("chxmpd1 not between", value1, value2, "chxmpd1");
            return (Criteria) this;
        }

        public Criteria andChxmpd2IsNull() {
            addCriterion("chxmpd2 is null");
            return (Criteria) this;
        }

        public Criteria andChxmpd2IsNotNull() {
            addCriterion("chxmpd2 is not null");
            return (Criteria) this;
        }

        public Criteria andChxmpd2EqualTo(String value) {
            addCriterion("chxmpd2 =", value, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andChxmpd2NotEqualTo(String value) {
            addCriterion("chxmpd2 <>", value, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andChxmpd2GreaterThan(String value) {
            addCriterion("chxmpd2 >", value, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andChxmpd2GreaterThanOrEqualTo(String value) {
            addCriterion("chxmpd2 >=", value, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andChxmpd2LessThan(String value) {
            addCriterion("chxmpd2 <", value, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andChxmpd2LessThanOrEqualTo(String value) {
            addCriterion("chxmpd2 <=", value, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andChxmpd2Like(String value) {
            addCriterion("chxmpd2 like", value, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andChxmpd2NotLike(String value) {
            addCriterion("chxmpd2 not like", value, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andChxmpd2In(List<String> values) {
            addCriterion("chxmpd2 in", values, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andChxmpd2NotIn(List<String> values) {
            addCriterion("chxmpd2 not in", values, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andChxmpd2Between(String value1, String value2) {
            addCriterion("chxmpd2 between", value1, value2, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andChxmpd2NotBetween(String value1, String value2) {
            addCriterion("chxmpd2 not between", value1, value2, "chxmpd2");
            return (Criteria) this;
        }

        public Criteria andLsxmpdIsNull() {
            addCriterion("lsxmpd is null");
            return (Criteria) this;
        }

        public Criteria andLsxmpdIsNotNull() {
            addCriterion("lsxmpd is not null");
            return (Criteria) this;
        }

        public Criteria andLsxmpdEqualTo(String value) {
            addCriterion("lsxmpd =", value, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andLsxmpdNotEqualTo(String value) {
            addCriterion("lsxmpd <>", value, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andLsxmpdGreaterThan(String value) {
            addCriterion("lsxmpd >", value, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andLsxmpdGreaterThanOrEqualTo(String value) {
            addCriterion("lsxmpd >=", value, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andLsxmpdLessThan(String value) {
            addCriterion("lsxmpd <", value, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andLsxmpdLessThanOrEqualTo(String value) {
            addCriterion("lsxmpd <=", value, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andLsxmpdLike(String value) {
            addCriterion("lsxmpd like", value, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andLsxmpdNotLike(String value) {
            addCriterion("lsxmpd not like", value, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andLsxmpdIn(List<String> values) {
            addCriterion("lsxmpd in", values, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andLsxmpdNotIn(List<String> values) {
            addCriterion("lsxmpd not in", values, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andLsxmpdBetween(String value1, String value2) {
            addCriterion("lsxmpd between", value1, value2, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andLsxmpdNotBetween(String value1, String value2) {
            addCriterion("lsxmpd not between", value1, value2, "lsxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdIsNull() {
            addCriterion("clwkccxmpd is null");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdIsNotNull() {
            addCriterion("clwkccxmpd is not null");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdEqualTo(String value) {
            addCriterion("clwkccxmpd =", value, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdNotEqualTo(String value) {
            addCriterion("clwkccxmpd <>", value, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdGreaterThan(String value) {
            addCriterion("clwkccxmpd >", value, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdGreaterThanOrEqualTo(String value) {
            addCriterion("clwkccxmpd >=", value, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdLessThan(String value) {
            addCriterion("clwkccxmpd <", value, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdLessThanOrEqualTo(String value) {
            addCriterion("clwkccxmpd <=", value, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdLike(String value) {
            addCriterion("clwkccxmpd like", value, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdNotLike(String value) {
            addCriterion("clwkccxmpd not like", value, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdIn(List<String> values) {
            addCriterion("clwkccxmpd in", values, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdNotIn(List<String> values) {
            addCriterion("clwkccxmpd not in", values, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdBetween(String value1, String value2) {
            addCriterion("clwkccxmpd between", value1, value2, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andClwkccxmpdNotBetween(String value1, String value2) {
            addCriterion("clwkccxmpd not between", value1, value2, "clwkccxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdIsNull() {
            addCriterion("zbzlkqzlxmpd is null");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdIsNotNull() {
            addCriterion("zbzlkqzlxmpd is not null");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdEqualTo(String value) {
            addCriterion("zbzlkqzlxmpd =", value, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdNotEqualTo(String value) {
            addCriterion("zbzlkqzlxmpd <>", value, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdGreaterThan(String value) {
            addCriterion("zbzlkqzlxmpd >", value, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdGreaterThanOrEqualTo(String value) {
            addCriterion("zbzlkqzlxmpd >=", value, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdLessThan(String value) {
            addCriterion("zbzlkqzlxmpd <", value, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdLessThanOrEqualTo(String value) {
            addCriterion("zbzlkqzlxmpd <=", value, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdLike(String value) {
            addCriterion("zbzlkqzlxmpd like", value, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdNotLike(String value) {
            addCriterion("zbzlkqzlxmpd not like", value, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdIn(List<String> values) {
            addCriterion("zbzlkqzlxmpd in", values, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdNotIn(List<String> values) {
            addCriterion("zbzlkqzlxmpd not in", values, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdBetween(String value1, String value2) {
            addCriterion("zbzlkqzlxmpd between", value1, value2, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzlxmpdNotBetween(String value1, String value2) {
            addCriterion("zbzlkqzlxmpd not between", value1, value2, "zbzlkqzlxmpd");
            return (Criteria) this;
        }

        public Criteria andZwddxcsIsNull() {
            addCriterion("zwddxcs is null");
            return (Criteria) this;
        }

        public Criteria andZwddxcsIsNotNull() {
            addCriterion("zwddxcs is not null");
            return (Criteria) this;
        }

        public Criteria andZwddxcsEqualTo(String value) {
            addCriterion("zwddxcs =", value, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZwddxcsNotEqualTo(String value) {
            addCriterion("zwddxcs <>", value, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZwddxcsGreaterThan(String value) {
            addCriterion("zwddxcs >", value, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZwddxcsGreaterThanOrEqualTo(String value) {
            addCriterion("zwddxcs >=", value, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZwddxcsLessThan(String value) {
            addCriterion("zwddxcs <", value, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZwddxcsLessThanOrEqualTo(String value) {
            addCriterion("zwddxcs <=", value, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZwddxcsLike(String value) {
            addCriterion("zwddxcs like", value, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZwddxcsNotLike(String value) {
            addCriterion("zwddxcs not like", value, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZwddxcsIn(List<String> values) {
            addCriterion("zwddxcs in", values, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZwddxcsNotIn(List<String> values) {
            addCriterion("zwddxcs not in", values, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZwddxcsBetween(String value1, String value2) {
            addCriterion("zwddxcs between", value1, value2, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZwddxcsNotBetween(String value1, String value2) {
            addCriterion("zwddxcs not between", value1, value2, "zwddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsIsNull() {
            addCriterion("znddxcs is null");
            return (Criteria) this;
        }

        public Criteria andZnddxcsIsNotNull() {
            addCriterion("znddxcs is not null");
            return (Criteria) this;
        }

        public Criteria andZnddxcsEqualTo(String value) {
            addCriterion("znddxcs =", value, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsNotEqualTo(String value) {
            addCriterion("znddxcs <>", value, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsGreaterThan(String value) {
            addCriterion("znddxcs >", value, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsGreaterThanOrEqualTo(String value) {
            addCriterion("znddxcs >=", value, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsLessThan(String value) {
            addCriterion("znddxcs <", value, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsLessThanOrEqualTo(String value) {
            addCriterion("znddxcs <=", value, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsLike(String value) {
            addCriterion("znddxcs like", value, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsNotLike(String value) {
            addCriterion("znddxcs not like", value, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsIn(List<String> values) {
            addCriterion("znddxcs in", values, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsNotIn(List<String> values) {
            addCriterion("znddxcs not in", values, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsBetween(String value1, String value2) {
            addCriterion("znddxcs between", value1, value2, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andZnddxcsNotBetween(String value1, String value2) {
            addCriterion("znddxcs not between", value1, value2, "znddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsIsNull() {
            addCriterion("ynddxcs is null");
            return (Criteria) this;
        }

        public Criteria andYnddxcsIsNotNull() {
            addCriterion("ynddxcs is not null");
            return (Criteria) this;
        }

        public Criteria andYnddxcsEqualTo(String value) {
            addCriterion("ynddxcs =", value, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsNotEqualTo(String value) {
            addCriterion("ynddxcs <>", value, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsGreaterThan(String value) {
            addCriterion("ynddxcs >", value, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsGreaterThanOrEqualTo(String value) {
            addCriterion("ynddxcs >=", value, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsLessThan(String value) {
            addCriterion("ynddxcs <", value, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsLessThanOrEqualTo(String value) {
            addCriterion("ynddxcs <=", value, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsLike(String value) {
            addCriterion("ynddxcs like", value, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsNotLike(String value) {
            addCriterion("ynddxcs not like", value, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsIn(List<String> values) {
            addCriterion("ynddxcs in", values, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsNotIn(List<String> values) {
            addCriterion("ynddxcs not in", values, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsBetween(String value1, String value2) {
            addCriterion("ynddxcs between", value1, value2, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYnddxcsNotBetween(String value1, String value2) {
            addCriterion("ynddxcs not between", value1, value2, "ynddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsIsNull() {
            addCriterion("ywddxcs is null");
            return (Criteria) this;
        }

        public Criteria andYwddxcsIsNotNull() {
            addCriterion("ywddxcs is not null");
            return (Criteria) this;
        }

        public Criteria andYwddxcsEqualTo(String value) {
            addCriterion("ywddxcs =", value, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsNotEqualTo(String value) {
            addCriterion("ywddxcs <>", value, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsGreaterThan(String value) {
            addCriterion("ywddxcs >", value, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsGreaterThanOrEqualTo(String value) {
            addCriterion("ywddxcs >=", value, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsLessThan(String value) {
            addCriterion("ywddxcs <", value, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsLessThanOrEqualTo(String value) {
            addCriterion("ywddxcs <=", value, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsLike(String value) {
            addCriterion("ywddxcs like", value, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsNotLike(String value) {
            addCriterion("ywddxcs not like", value, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsIn(List<String> values) {
            addCriterion("ywddxcs in", values, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsNotIn(List<String> values) {
            addCriterion("ywddxcs not in", values, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsBetween(String value1, String value2) {
            addCriterion("ywddxcs between", value1, value2, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andYwddxcsNotBetween(String value1, String value2) {
            addCriterion("ywddxcs not between", value1, value2, "ywddxcs");
            return (Criteria) this;
        }

        public Criteria andChdxcs1IsNull() {
            addCriterion("chdxcs1 is null");
            return (Criteria) this;
        }

        public Criteria andChdxcs1IsNotNull() {
            addCriterion("chdxcs1 is not null");
            return (Criteria) this;
        }

        public Criteria andChdxcs1EqualTo(String value) {
            addCriterion("chdxcs1 =", value, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs1NotEqualTo(String value) {
            addCriterion("chdxcs1 <>", value, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs1GreaterThan(String value) {
            addCriterion("chdxcs1 >", value, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs1GreaterThanOrEqualTo(String value) {
            addCriterion("chdxcs1 >=", value, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs1LessThan(String value) {
            addCriterion("chdxcs1 <", value, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs1LessThanOrEqualTo(String value) {
            addCriterion("chdxcs1 <=", value, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs1Like(String value) {
            addCriterion("chdxcs1 like", value, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs1NotLike(String value) {
            addCriterion("chdxcs1 not like", value, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs1In(List<String> values) {
            addCriterion("chdxcs1 in", values, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs1NotIn(List<String> values) {
            addCriterion("chdxcs1 not in", values, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs1Between(String value1, String value2) {
            addCriterion("chdxcs1 between", value1, value2, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs1NotBetween(String value1, String value2) {
            addCriterion("chdxcs1 not between", value1, value2, "chdxcs1");
            return (Criteria) this;
        }

        public Criteria andChdxcs2IsNull() {
            addCriterion("chdxcs2 is null");
            return (Criteria) this;
        }

        public Criteria andChdxcs2IsNotNull() {
            addCriterion("chdxcs2 is not null");
            return (Criteria) this;
        }

        public Criteria andChdxcs2EqualTo(String value) {
            addCriterion("chdxcs2 =", value, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andChdxcs2NotEqualTo(String value) {
            addCriterion("chdxcs2 <>", value, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andChdxcs2GreaterThan(String value) {
            addCriterion("chdxcs2 >", value, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andChdxcs2GreaterThanOrEqualTo(String value) {
            addCriterion("chdxcs2 >=", value, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andChdxcs2LessThan(String value) {
            addCriterion("chdxcs2 <", value, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andChdxcs2LessThanOrEqualTo(String value) {
            addCriterion("chdxcs2 <=", value, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andChdxcs2Like(String value) {
            addCriterion("chdxcs2 like", value, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andChdxcs2NotLike(String value) {
            addCriterion("chdxcs2 not like", value, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andChdxcs2In(List<String> values) {
            addCriterion("chdxcs2 in", values, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andChdxcs2NotIn(List<String> values) {
            addCriterion("chdxcs2 not in", values, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andChdxcs2Between(String value1, String value2) {
            addCriterion("chdxcs2 between", value1, value2, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andChdxcs2NotBetween(String value1, String value2) {
            addCriterion("chdxcs2 not between", value1, value2, "chdxcs2");
            return (Criteria) this;
        }

        public Criteria andLsdxcsIsNull() {
            addCriterion("lsdxcs is null");
            return (Criteria) this;
        }

        public Criteria andLsdxcsIsNotNull() {
            addCriterion("lsdxcs is not null");
            return (Criteria) this;
        }

        public Criteria andLsdxcsEqualTo(String value) {
            addCriterion("lsdxcs =", value, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andLsdxcsNotEqualTo(String value) {
            addCriterion("lsdxcs <>", value, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andLsdxcsGreaterThan(String value) {
            addCriterion("lsdxcs >", value, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andLsdxcsGreaterThanOrEqualTo(String value) {
            addCriterion("lsdxcs >=", value, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andLsdxcsLessThan(String value) {
            addCriterion("lsdxcs <", value, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andLsdxcsLessThanOrEqualTo(String value) {
            addCriterion("lsdxcs <=", value, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andLsdxcsLike(String value) {
            addCriterion("lsdxcs like", value, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andLsdxcsNotLike(String value) {
            addCriterion("lsdxcs not like", value, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andLsdxcsIn(List<String> values) {
            addCriterion("lsdxcs in", values, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andLsdxcsNotIn(List<String> values) {
            addCriterion("lsdxcs not in", values, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andLsdxcsBetween(String value1, String value2) {
            addCriterion("lsdxcs between", value1, value2, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andLsdxcsNotBetween(String value1, String value2) {
            addCriterion("lsdxcs not between", value1, value2, "lsdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsIsNull() {
            addCriterion("clwkccdxcs is null");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsIsNotNull() {
            addCriterion("clwkccdxcs is not null");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsEqualTo(String value) {
            addCriterion("clwkccdxcs =", value, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsNotEqualTo(String value) {
            addCriterion("clwkccdxcs <>", value, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsGreaterThan(String value) {
            addCriterion("clwkccdxcs >", value, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsGreaterThanOrEqualTo(String value) {
            addCriterion("clwkccdxcs >=", value, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsLessThan(String value) {
            addCriterion("clwkccdxcs <", value, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsLessThanOrEqualTo(String value) {
            addCriterion("clwkccdxcs <=", value, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsLike(String value) {
            addCriterion("clwkccdxcs like", value, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsNotLike(String value) {
            addCriterion("clwkccdxcs not like", value, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsIn(List<String> values) {
            addCriterion("clwkccdxcs in", values, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsNotIn(List<String> values) {
            addCriterion("clwkccdxcs not in", values, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsBetween(String value1, String value2) {
            addCriterion("clwkccdxcs between", value1, value2, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andClwkccdxcsNotBetween(String value1, String value2) {
            addCriterion("clwkccdxcs not between", value1, value2, "clwkccdxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsIsNull() {
            addCriterion("zbzlkqzldxcs is null");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsIsNotNull() {
            addCriterion("zbzlkqzldxcs is not null");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsEqualTo(String value) {
            addCriterion("zbzlkqzldxcs =", value, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsNotEqualTo(String value) {
            addCriterion("zbzlkqzldxcs <>", value, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsGreaterThan(String value) {
            addCriterion("zbzlkqzldxcs >", value, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsGreaterThanOrEqualTo(String value) {
            addCriterion("zbzlkqzldxcs >=", value, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsLessThan(String value) {
            addCriterion("zbzlkqzldxcs <", value, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsLessThanOrEqualTo(String value) {
            addCriterion("zbzlkqzldxcs <=", value, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsLike(String value) {
            addCriterion("zbzlkqzldxcs like", value, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsNotLike(String value) {
            addCriterion("zbzlkqzldxcs not like", value, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsIn(List<String> values) {
            addCriterion("zbzlkqzldxcs in", values, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsNotIn(List<String> values) {
            addCriterion("zbzlkqzldxcs not in", values, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsBetween(String value1, String value2) {
            addCriterion("zbzlkqzldxcs between", value1, value2, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZbzlkqzldxcsNotBetween(String value1, String value2) {
            addCriterion("zbzlkqzldxcs not between", value1, value2, "zbzlkqzldxcs");
            return (Criteria) this;
        }

        public Criteria andZjcsIsNull() {
            addCriterion("zjcs is null");
            return (Criteria) this;
        }

        public Criteria andZjcsIsNotNull() {
            addCriterion("zjcs is not null");
            return (Criteria) this;
        }

        public Criteria andZjcsEqualTo(String value) {
            addCriterion("zjcs =", value, "zjcs");
            return (Criteria) this;
        }

        public Criteria andZjcsNotEqualTo(String value) {
            addCriterion("zjcs <>", value, "zjcs");
            return (Criteria) this;
        }

        public Criteria andZjcsGreaterThan(String value) {
            addCriterion("zjcs >", value, "zjcs");
            return (Criteria) this;
        }

        public Criteria andZjcsGreaterThanOrEqualTo(String value) {
            addCriterion("zjcs >=", value, "zjcs");
            return (Criteria) this;
        }

        public Criteria andZjcsLessThan(String value) {
            addCriterion("zjcs <", value, "zjcs");
            return (Criteria) this;
        }

        public Criteria andZjcsLessThanOrEqualTo(String value) {
            addCriterion("zjcs <=", value, "zjcs");
            return (Criteria) this;
        }

        public Criteria andZjcsLike(String value) {
            addCriterion("zjcs like", value, "zjcs");
            return (Criteria) this;
        }

        public Criteria andZjcsNotLike(String value) {
            addCriterion("zjcs not like", value, "zjcs");
            return (Criteria) this;
        }

        public Criteria andZjcsIn(List<String> values) {
            addCriterion("zjcs in", values, "zjcs");
            return (Criteria) this;
        }

        public Criteria andZjcsNotIn(List<String> values) {
            addCriterion("zjcs not in", values, "zjcs");
            return (Criteria) this;
        }

        public Criteria andZjcsBetween(String value1, String value2) {
            addCriterion("zjcs between", value1, value2, "zjcs");
            return (Criteria) this;
        }

        public Criteria andZjcsNotBetween(String value1, String value2) {
            addCriterion("zjcs not between", value1, value2, "zjcs");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
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