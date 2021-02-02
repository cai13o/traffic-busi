package cn.com.busi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TInspectionReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInspectionReportExample() {
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

        public Criteria andDzIsNull() {
            addCriterion("dz is null");
            return (Criteria) this;
        }

        public Criteria andDzIsNotNull() {
            addCriterion("dz is not null");
            return (Criteria) this;
        }

        public Criteria andDzEqualTo(String value) {
            addCriterion("dz =", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotEqualTo(String value) {
            addCriterion("dz <>", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThan(String value) {
            addCriterion("dz >", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThanOrEqualTo(String value) {
            addCriterion("dz >=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThan(String value) {
            addCriterion("dz <", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThanOrEqualTo(String value) {
            addCriterion("dz <=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLike(String value) {
            addCriterion("dz like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotLike(String value) {
            addCriterion("dz not like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzIn(List<String> values) {
            addCriterion("dz in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotIn(List<String> values) {
            addCriterion("dz not in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzBetween(String value1, String value2) {
            addCriterion("dz between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotBetween(String value1, String value2) {
            addCriterion("dz not between", value1, value2, "dz");
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

        public Criteria andZzrdzsbhIsNull() {
            addCriterion("zzrdzsbh is null");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhIsNotNull() {
            addCriterion("zzrdzsbh is not null");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhEqualTo(String value) {
            addCriterion("zzrdzsbh =", value, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhNotEqualTo(String value) {
            addCriterion("zzrdzsbh <>", value, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhGreaterThan(String value) {
            addCriterion("zzrdzsbh >", value, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhGreaterThanOrEqualTo(String value) {
            addCriterion("zzrdzsbh >=", value, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhLessThan(String value) {
            addCriterion("zzrdzsbh <", value, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhLessThanOrEqualTo(String value) {
            addCriterion("zzrdzsbh <=", value, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhLike(String value) {
            addCriterion("zzrdzsbh like", value, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhNotLike(String value) {
            addCriterion("zzrdzsbh not like", value, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhIn(List<String> values) {
            addCriterion("zzrdzsbh in", values, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhNotIn(List<String> values) {
            addCriterion("zzrdzsbh not in", values, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhBetween(String value1, String value2) {
            addCriterion("zzrdzsbh between", value1, value2, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andZzrdzsbhNotBetween(String value1, String value2) {
            addCriterion("zzrdzsbh not between", value1, value2, "zzrdzsbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhIsNull() {
            addCriterion("jybgbh is null");
            return (Criteria) this;
        }

        public Criteria andJybgbhIsNotNull() {
            addCriterion("jybgbh is not null");
            return (Criteria) this;
        }

        public Criteria andJybgbhEqualTo(String value) {
            addCriterion("jybgbh =", value, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhNotEqualTo(String value) {
            addCriterion("jybgbh <>", value, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhGreaterThan(String value) {
            addCriterion("jybgbh >", value, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhGreaterThanOrEqualTo(String value) {
            addCriterion("jybgbh >=", value, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhLessThan(String value) {
            addCriterion("jybgbh <", value, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhLessThanOrEqualTo(String value) {
            addCriterion("jybgbh <=", value, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhLike(String value) {
            addCriterion("jybgbh like", value, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhNotLike(String value) {
            addCriterion("jybgbh not like", value, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhIn(List<String> values) {
            addCriterion("jybgbh in", values, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhNotIn(List<String> values) {
            addCriterion("jybgbh not in", values, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhBetween(String value1, String value2) {
            addCriterion("jybgbh between", value1, value2, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJybgbhNotBetween(String value1, String value2) {
            addCriterion("jybgbh not between", value1, value2, "jybgbh");
            return (Criteria) this;
        }

        public Criteria andJyjgmcIsNull() {
            addCriterion("jyjgmc is null");
            return (Criteria) this;
        }

        public Criteria andJyjgmcIsNotNull() {
            addCriterion("jyjgmc is not null");
            return (Criteria) this;
        }

        public Criteria andJyjgmcEqualTo(String value) {
            addCriterion("jyjgmc =", value, "jyjgmc");
            return (Criteria) this;
        }

        public Criteria andJyjgmcNotEqualTo(String value) {
            addCriterion("jyjgmc <>", value, "jyjgmc");
            return (Criteria) this;
        }

        public Criteria andJyjgmcGreaterThan(String value) {
            addCriterion("jyjgmc >", value, "jyjgmc");
            return (Criteria) this;
        }

        public Criteria andJyjgmcGreaterThanOrEqualTo(String value) {
            addCriterion("jyjgmc >=", value, "jyjgmc");
            return (Criteria) this;
        }

        public Criteria andJyjgmcLessThan(String value) {
            addCriterion("jyjgmc <", value, "jyjgmc");
            return (Criteria) this;
        }

        public Criteria andJyjgmcLessThanOrEqualTo(String value) {
            addCriterion("jyjgmc <=", value, "jyjgmc");
            return (Criteria) this;
        }

        public Criteria andJyjgmcLike(String value) {
            addCriterion("jyjgmc like", value, "jyjgmc");
            return (Criteria) this;
        }

        public Criteria andJyjgmcNotLike(String value) {
            addCriterion("jyjgmc not like", value, "jyjgmc");
            return (Criteria) this;
        }

        public Criteria andJyjgmcIn(List<String> values) {
            addCriterion("jyjgmc in", values, "jyjgmc");
            return (Criteria) this;
        }

        public Criteria andJyjgmcNotIn(List<String> values) {
            addCriterion("jyjgmc not in", values, "jyjgmc");
            return (Criteria) this;
        }

        public Criteria andJyjgmcBetween(String value1, String value2) {
            addCriterion("jyjgmc between", value1, value2, "jyjgmc");
            return (Criteria) this;
        }

        public Criteria andJyjgmcNotBetween(String value1, String value2) {
            addCriterion("jyjgmc not between", value1, value2, "jyjgmc");
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

        public Criteria andSyrIsNull() {
            addCriterion("syr is null");
            return (Criteria) this;
        }

        public Criteria andSyrIsNotNull() {
            addCriterion("syr is not null");
            return (Criteria) this;
        }

        public Criteria andSyrEqualTo(String value) {
            addCriterion("syr =", value, "syr");
            return (Criteria) this;
        }

        public Criteria andSyrNotEqualTo(String value) {
            addCriterion("syr <>", value, "syr");
            return (Criteria) this;
        }

        public Criteria andSyrGreaterThan(String value) {
            addCriterion("syr >", value, "syr");
            return (Criteria) this;
        }

        public Criteria andSyrGreaterThanOrEqualTo(String value) {
            addCriterion("syr >=", value, "syr");
            return (Criteria) this;
        }

        public Criteria andSyrLessThan(String value) {
            addCriterion("syr <", value, "syr");
            return (Criteria) this;
        }

        public Criteria andSyrLessThanOrEqualTo(String value) {
            addCriterion("syr <=", value, "syr");
            return (Criteria) this;
        }

        public Criteria andSyrLike(String value) {
            addCriterion("syr like", value, "syr");
            return (Criteria) this;
        }

        public Criteria andSyrNotLike(String value) {
            addCriterion("syr not like", value, "syr");
            return (Criteria) this;
        }

        public Criteria andSyrIn(List<String> values) {
            addCriterion("syr in", values, "syr");
            return (Criteria) this;
        }

        public Criteria andSyrNotIn(List<String> values) {
            addCriterion("syr not in", values, "syr");
            return (Criteria) this;
        }

        public Criteria andSyrBetween(String value1, String value2) {
            addCriterion("syr between", value1, value2, "syr");
            return (Criteria) this;
        }

        public Criteria andSyrNotBetween(String value1, String value2) {
            addCriterion("syr not between", value1, value2, "syr");
            return (Criteria) this;
        }

        public Criteria andCllxIsNull() {
            addCriterion("cllx is null");
            return (Criteria) this;
        }

        public Criteria andCllxIsNotNull() {
            addCriterion("cllx is not null");
            return (Criteria) this;
        }

        public Criteria andCllxEqualTo(String value) {
            addCriterion("cllx =", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotEqualTo(String value) {
            addCriterion("cllx <>", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxGreaterThan(String value) {
            addCriterion("cllx >", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxGreaterThanOrEqualTo(String value) {
            addCriterion("cllx >=", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLessThan(String value) {
            addCriterion("cllx <", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLessThanOrEqualTo(String value) {
            addCriterion("cllx <=", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLike(String value) {
            addCriterion("cllx like", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotLike(String value) {
            addCriterion("cllx not like", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxIn(List<String> values) {
            addCriterion("cllx in", values, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotIn(List<String> values) {
            addCriterion("cllx not in", values, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxBetween(String value1, String value2) {
            addCriterion("cllx between", value1, value2, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotBetween(String value1, String value2) {
            addCriterion("cllx not between", value1, value2, "cllx");
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

        public Criteria andZcdjrqIsNull() {
            addCriterion("zcdjrq is null");
            return (Criteria) this;
        }

        public Criteria andZcdjrqIsNotNull() {
            addCriterion("zcdjrq is not null");
            return (Criteria) this;
        }

        public Criteria andZcdjrqEqualTo(Date value) {
            addCriterionForJDBCDate("zcdjrq =", value, "zcdjrq");
            return (Criteria) this;
        }

        public Criteria andZcdjrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("zcdjrq <>", value, "zcdjrq");
            return (Criteria) this;
        }

        public Criteria andZcdjrqGreaterThan(Date value) {
            addCriterionForJDBCDate("zcdjrq >", value, "zcdjrq");
            return (Criteria) this;
        }

        public Criteria andZcdjrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zcdjrq >=", value, "zcdjrq");
            return (Criteria) this;
        }

        public Criteria andZcdjrqLessThan(Date value) {
            addCriterionForJDBCDate("zcdjrq <", value, "zcdjrq");
            return (Criteria) this;
        }

        public Criteria andZcdjrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zcdjrq <=", value, "zcdjrq");
            return (Criteria) this;
        }

        public Criteria andZcdjrqIn(List<Date> values) {
            addCriterionForJDBCDate("zcdjrq in", values, "zcdjrq");
            return (Criteria) this;
        }

        public Criteria andZcdjrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("zcdjrq not in", values, "zcdjrq");
            return (Criteria) this;
        }

        public Criteria andZcdjrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zcdjrq between", value1, value2, "zcdjrq");
            return (Criteria) this;
        }

        public Criteria andZcdjrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zcdjrq not between", value1, value2, "zcdjrq");
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

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andCcbhIsNull() {
            addCriterion("ccbh is null");
            return (Criteria) this;
        }

        public Criteria andCcbhIsNotNull() {
            addCriterion("ccbh is not null");
            return (Criteria) this;
        }

        public Criteria andCcbhEqualTo(String value) {
            addCriterion("ccbh =", value, "ccbh");
            return (Criteria) this;
        }

        public Criteria andCcbhNotEqualTo(String value) {
            addCriterion("ccbh <>", value, "ccbh");
            return (Criteria) this;
        }

        public Criteria andCcbhGreaterThan(String value) {
            addCriterion("ccbh >", value, "ccbh");
            return (Criteria) this;
        }

        public Criteria andCcbhGreaterThanOrEqualTo(String value) {
            addCriterion("ccbh >=", value, "ccbh");
            return (Criteria) this;
        }

        public Criteria andCcbhLessThan(String value) {
            addCriterion("ccbh <", value, "ccbh");
            return (Criteria) this;
        }

        public Criteria andCcbhLessThanOrEqualTo(String value) {
            addCriterion("ccbh <=", value, "ccbh");
            return (Criteria) this;
        }

        public Criteria andCcbhLike(String value) {
            addCriterion("ccbh like", value, "ccbh");
            return (Criteria) this;
        }

        public Criteria andCcbhNotLike(String value) {
            addCriterion("ccbh not like", value, "ccbh");
            return (Criteria) this;
        }

        public Criteria andCcbhIn(List<String> values) {
            addCriterion("ccbh in", values, "ccbh");
            return (Criteria) this;
        }

        public Criteria andCcbhNotIn(List<String> values) {
            addCriterion("ccbh not in", values, "ccbh");
            return (Criteria) this;
        }

        public Criteria andCcbhBetween(String value1, String value2) {
            addCriterion("ccbh between", value1, value2, "ccbh");
            return (Criteria) this;
        }

        public Criteria andCcbhNotBetween(String value1, String value2) {
            addCriterion("ccbh not between", value1, value2, "ccbh");
            return (Criteria) this;
        }

        public Criteria andJyjlIsNull() {
            addCriterion("jyjl is null");
            return (Criteria) this;
        }

        public Criteria andJyjlIsNotNull() {
            addCriterion("jyjl is not null");
            return (Criteria) this;
        }

        public Criteria andJyjlEqualTo(String value) {
            addCriterion("jyjl =", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotEqualTo(String value) {
            addCriterion("jyjl <>", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlGreaterThan(String value) {
            addCriterion("jyjl >", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlGreaterThanOrEqualTo(String value) {
            addCriterion("jyjl >=", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlLessThan(String value) {
            addCriterion("jyjl <", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlLessThanOrEqualTo(String value) {
            addCriterion("jyjl <=", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlLike(String value) {
            addCriterion("jyjl like", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotLike(String value) {
            addCriterion("jyjl not like", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlIn(List<String> values) {
            addCriterion("jyjl in", values, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotIn(List<String> values) {
            addCriterion("jyjl not in", values, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlBetween(String value1, String value2) {
            addCriterion("jyjl between", value1, value2, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotBetween(String value1, String value2) {
            addCriterion("jyjl not between", value1, value2, "jyjl");
            return (Criteria) this;
        }

        public Criteria andSqqzrIsNull() {
            addCriterion("sqqzr is null");
            return (Criteria) this;
        }

        public Criteria andSqqzrIsNotNull() {
            addCriterion("sqqzr is not null");
            return (Criteria) this;
        }

        public Criteria andSqqzrEqualTo(String value) {
            addCriterion("sqqzr =", value, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andSqqzrNotEqualTo(String value) {
            addCriterion("sqqzr <>", value, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andSqqzrGreaterThan(String value) {
            addCriterion("sqqzr >", value, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andSqqzrGreaterThanOrEqualTo(String value) {
            addCriterion("sqqzr >=", value, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andSqqzrLessThan(String value) {
            addCriterion("sqqzr <", value, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andSqqzrLessThanOrEqualTo(String value) {
            addCriterion("sqqzr <=", value, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andSqqzrLike(String value) {
            addCriterion("sqqzr like", value, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andSqqzrNotLike(String value) {
            addCriterion("sqqzr not like", value, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andSqqzrIn(List<String> values) {
            addCriterion("sqqzr in", values, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andSqqzrNotIn(List<String> values) {
            addCriterion("sqqzr not in", values, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andSqqzrBetween(String value1, String value2) {
            addCriterion("sqqzr between", value1, value2, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andSqqzrNotBetween(String value1, String value2) {
            addCriterion("sqqzr not between", value1, value2, "sqqzr");
            return (Criteria) this;
        }

        public Criteria andDwmcIsNull() {
            addCriterion("dwmc is null");
            return (Criteria) this;
        }

        public Criteria andDwmcIsNotNull() {
            addCriterion("dwmc is not null");
            return (Criteria) this;
        }

        public Criteria andDwmcEqualTo(String value) {
            addCriterion("dwmc =", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotEqualTo(String value) {
            addCriterion("dwmc <>", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcGreaterThan(String value) {
            addCriterion("dwmc >", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcGreaterThanOrEqualTo(String value) {
            addCriterion("dwmc >=", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLessThan(String value) {
            addCriterion("dwmc <", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLessThanOrEqualTo(String value) {
            addCriterion("dwmc <=", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLike(String value) {
            addCriterion("dwmc like", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotLike(String value) {
            addCriterion("dwmc not like", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcIn(List<String> values) {
            addCriterion("dwmc in", values, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotIn(List<String> values) {
            addCriterion("dwmc not in", values, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcBetween(String value1, String value2) {
            addCriterion("dwmc between", value1, value2, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotBetween(String value1, String value2) {
            addCriterion("dwmc not between", value1, value2, "dwmc");
            return (Criteria) this;
        }

        public Criteria andSealIsNull() {
            addCriterion("seal is null");
            return (Criteria) this;
        }

        public Criteria andSealIsNotNull() {
            addCriterion("seal is not null");
            return (Criteria) this;
        }

        public Criteria andSealEqualTo(String value) {
            addCriterion("seal =", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealNotEqualTo(String value) {
            addCriterion("seal <>", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealGreaterThan(String value) {
            addCriterion("seal >", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealGreaterThanOrEqualTo(String value) {
            addCriterion("seal >=", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealLessThan(String value) {
            addCriterion("seal <", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealLessThanOrEqualTo(String value) {
            addCriterion("seal <=", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealLike(String value) {
            addCriterion("seal like", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealNotLike(String value) {
            addCriterion("seal not like", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealIn(List<String> values) {
            addCriterion("seal in", values, "seal");
            return (Criteria) this;
        }

        public Criteria andSealNotIn(List<String> values) {
            addCriterion("seal not in", values, "seal");
            return (Criteria) this;
        }

        public Criteria andSealBetween(String value1, String value2) {
            addCriterion("seal between", value1, value2, "seal");
            return (Criteria) this;
        }

        public Criteria andSealNotBetween(String value1, String value2) {
            addCriterion("seal not between", value1, value2, "seal");
            return (Criteria) this;
        }

        public Criteria andJyIsNull() {
            addCriterion("jy is null");
            return (Criteria) this;
        }

        public Criteria andJyIsNotNull() {
            addCriterion("jy is not null");
            return (Criteria) this;
        }

        public Criteria andJyEqualTo(String value) {
            addCriterion("jy =", value, "jy");
            return (Criteria) this;
        }

        public Criteria andJyNotEqualTo(String value) {
            addCriterion("jy <>", value, "jy");
            return (Criteria) this;
        }

        public Criteria andJyGreaterThan(String value) {
            addCriterion("jy >", value, "jy");
            return (Criteria) this;
        }

        public Criteria andJyGreaterThanOrEqualTo(String value) {
            addCriterion("jy >=", value, "jy");
            return (Criteria) this;
        }

        public Criteria andJyLessThan(String value) {
            addCriterion("jy <", value, "jy");
            return (Criteria) this;
        }

        public Criteria andJyLessThanOrEqualTo(String value) {
            addCriterion("jy <=", value, "jy");
            return (Criteria) this;
        }

        public Criteria andJyLike(String value) {
            addCriterion("jy like", value, "jy");
            return (Criteria) this;
        }

        public Criteria andJyNotLike(String value) {
            addCriterion("jy not like", value, "jy");
            return (Criteria) this;
        }

        public Criteria andJyIn(List<String> values) {
            addCriterion("jy in", values, "jy");
            return (Criteria) this;
        }

        public Criteria andJyNotIn(List<String> values) {
            addCriterion("jy not in", values, "jy");
            return (Criteria) this;
        }

        public Criteria andJyBetween(String value1, String value2) {
            addCriterion("jy between", value1, value2, "jy");
            return (Criteria) this;
        }

        public Criteria andJyNotBetween(String value1, String value2) {
            addCriterion("jy not between", value1, value2, "jy");
            return (Criteria) this;
        }

        public Criteria andEwtmIsNull() {
            addCriterion("ewtm is null");
            return (Criteria) this;
        }

        public Criteria andEwtmIsNotNull() {
            addCriterion("ewtm is not null");
            return (Criteria) this;
        }

        public Criteria andEwtmEqualTo(String value) {
            addCriterion("ewtm =", value, "ewtm");
            return (Criteria) this;
        }

        public Criteria andEwtmNotEqualTo(String value) {
            addCriterion("ewtm <>", value, "ewtm");
            return (Criteria) this;
        }

        public Criteria andEwtmGreaterThan(String value) {
            addCriterion("ewtm >", value, "ewtm");
            return (Criteria) this;
        }

        public Criteria andEwtmGreaterThanOrEqualTo(String value) {
            addCriterion("ewtm >=", value, "ewtm");
            return (Criteria) this;
        }

        public Criteria andEwtmLessThan(String value) {
            addCriterion("ewtm <", value, "ewtm");
            return (Criteria) this;
        }

        public Criteria andEwtmLessThanOrEqualTo(String value) {
            addCriterion("ewtm <=", value, "ewtm");
            return (Criteria) this;
        }

        public Criteria andEwtmLike(String value) {
            addCriterion("ewtm like", value, "ewtm");
            return (Criteria) this;
        }

        public Criteria andEwtmNotLike(String value) {
            addCriterion("ewtm not like", value, "ewtm");
            return (Criteria) this;
        }

        public Criteria andEwtmIn(List<String> values) {
            addCriterion("ewtm in", values, "ewtm");
            return (Criteria) this;
        }

        public Criteria andEwtmNotIn(List<String> values) {
            addCriterion("ewtm not in", values, "ewtm");
            return (Criteria) this;
        }

        public Criteria andEwtmBetween(String value1, String value2) {
            addCriterion("ewtm between", value1, value2, "ewtm");
            return (Criteria) this;
        }

        public Criteria andEwtmNotBetween(String value1, String value2) {
            addCriterion("ewtm not between", value1, value2, "ewtm");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgIsNull() {
            addCriterion("yrsfdjedg is null");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgIsNotNull() {
            addCriterion("yrsfdjedg is not null");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgEqualTo(String value) {
            addCriterion("yrsfdjedg =", value, "yrsfdjedg");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgNotEqualTo(String value) {
            addCriterion("yrsfdjedg <>", value, "yrsfdjedg");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgGreaterThan(String value) {
            addCriterion("yrsfdjedg >", value, "yrsfdjedg");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgGreaterThanOrEqualTo(String value) {
            addCriterion("yrsfdjedg >=", value, "yrsfdjedg");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgLessThan(String value) {
            addCriterion("yrsfdjedg <", value, "yrsfdjedg");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgLessThanOrEqualTo(String value) {
            addCriterion("yrsfdjedg <=", value, "yrsfdjedg");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgLike(String value) {
            addCriterion("yrsfdjedg like", value, "yrsfdjedg");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgNotLike(String value) {
            addCriterion("yrsfdjedg not like", value, "yrsfdjedg");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgIn(List<String> values) {
            addCriterion("yrsfdjedg in", values, "yrsfdjedg");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgNotIn(List<String> values) {
            addCriterion("yrsfdjedg not in", values, "yrsfdjedg");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgBetween(String value1, String value2) {
            addCriterion("yrsfdjedg between", value1, value2, "yrsfdjedg");
            return (Criteria) this;
        }

        public Criteria andYrsfdjedgNotBetween(String value1, String value2) {
            addCriterion("yrsfdjedg not between", value1, value2, "yrsfdjedg");
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