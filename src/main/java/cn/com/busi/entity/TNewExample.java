package cn.com.busi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TNewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TNewExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`Type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`Type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`Type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`Type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`Type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`Type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`Type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`Type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`Type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`Type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`Type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`Type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`Type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`Type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("Author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("Author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("Author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("Author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("Author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("Author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("Author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("Author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("Author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("Author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("Author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("Author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("Author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("Author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("Dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("Dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("Dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("Dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("Dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("Dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("Dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("Dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("Dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("Dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("Dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("Dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("Dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("Dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andValidityIsNull() {
            addCriterion("validity is null");
            return (Criteria) this;
        }

        public Criteria andValidityIsNotNull() {
            addCriterion("validity is not null");
            return (Criteria) this;
        }

        public Criteria andValidityEqualTo(Date value) {
            addCriterionForJDBCDate("validity =", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotEqualTo(Date value) {
            addCriterionForJDBCDate("validity <>", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThan(Date value) {
            addCriterionForJDBCDate("validity >", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validity >=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThan(Date value) {
            addCriterionForJDBCDate("validity <", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validity <=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityIn(List<Date> values) {
            addCriterionForJDBCDate("validity in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotIn(List<Date> values) {
            addCriterionForJDBCDate("validity not in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validity between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validity not between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andIssuedateIsNull() {
            addCriterion("issueDate is null");
            return (Criteria) this;
        }

        public Criteria andIssuedateIsNotNull() {
            addCriterion("issueDate is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedateEqualTo(Date value) {
            addCriterion("issueDate =", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotEqualTo(Date value) {
            addCriterion("issueDate <>", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThan(Date value) {
            addCriterion("issueDate >", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThanOrEqualTo(Date value) {
            addCriterion("issueDate >=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThan(Date value) {
            addCriterion("issueDate <", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThanOrEqualTo(Date value) {
            addCriterion("issueDate <=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateIn(List<Date> values) {
            addCriterion("issueDate in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotIn(List<Date> values) {
            addCriterion("issueDate not in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateBetween(Date value1, Date value2) {
            addCriterion("issueDate between", value1, value2, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotBetween(Date value1, Date value2) {
            addCriterion("issueDate not between", value1, value2, "issuedate");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("brief is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("brief is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("brief =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("brief <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("brief >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("brief >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("brief <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("brief <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("brief like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("brief not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("brief in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("brief not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("brief between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("brief not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("`text` is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("`text` is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("`text` =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("`text` <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("`text` >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("`text` >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("`text` <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("`text` <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("`text` like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("`text` not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("`text` in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("`text` not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("`text` between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("`text` not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileIsNull() {
            addCriterion("titlepicfile is null");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileIsNotNull() {
            addCriterion("titlepicfile is not null");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileEqualTo(String value) {
            addCriterion("titlepicfile =", value, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileNotEqualTo(String value) {
            addCriterion("titlepicfile <>", value, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileGreaterThan(String value) {
            addCriterion("titlepicfile >", value, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileGreaterThanOrEqualTo(String value) {
            addCriterion("titlepicfile >=", value, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileLessThan(String value) {
            addCriterion("titlepicfile <", value, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileLessThanOrEqualTo(String value) {
            addCriterion("titlepicfile <=", value, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileLike(String value) {
            addCriterion("titlepicfile like", value, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileNotLike(String value) {
            addCriterion("titlepicfile not like", value, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileIn(List<String> values) {
            addCriterion("titlepicfile in", values, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileNotIn(List<String> values) {
            addCriterion("titlepicfile not in", values, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileBetween(String value1, String value2) {
            addCriterion("titlepicfile between", value1, value2, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andTitlepicfileNotBetween(String value1, String value2) {
            addCriterion("titlepicfile not between", value1, value2, "titlepicfile");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("Audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("Audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("Audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("Audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("Audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("Audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("Audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("Audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("Audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("Audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("Audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("Audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("Audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("Audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("Audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("Audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("Audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("Audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("Audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("Audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("Audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("Audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("Audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("Audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("Audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("Audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("Audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNull() {
            addCriterion("Auditdate is null");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNotNull() {
            addCriterion("Auditdate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdateEqualTo(Date value) {
            addCriterion("Auditdate =", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotEqualTo(Date value) {
            addCriterion("Auditdate <>", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThan(Date value) {
            addCriterion("Auditdate >", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Auditdate >=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThan(Date value) {
            addCriterion("Auditdate <", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThanOrEqualTo(Date value) {
            addCriterion("Auditdate <=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateIn(List<Date> values) {
            addCriterion("Auditdate in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotIn(List<Date> values) {
            addCriterion("Auditdate not in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateBetween(Date value1, Date value2) {
            addCriterion("Auditdate between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotBetween(Date value1, Date value2) {
            addCriterion("Auditdate not between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andImportanceIsNull() {
            addCriterion("importance is null");
            return (Criteria) this;
        }

        public Criteria andImportanceIsNotNull() {
            addCriterion("importance is not null");
            return (Criteria) this;
        }

        public Criteria andImportanceEqualTo(String value) {
            addCriterion("importance =", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceNotEqualTo(String value) {
            addCriterion("importance <>", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceGreaterThan(String value) {
            addCriterion("importance >", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceGreaterThanOrEqualTo(String value) {
            addCriterion("importance >=", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceLessThan(String value) {
            addCriterion("importance <", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceLessThanOrEqualTo(String value) {
            addCriterion("importance <=", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceLike(String value) {
            addCriterion("importance like", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceNotLike(String value) {
            addCriterion("importance not like", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceIn(List<String> values) {
            addCriterion("importance in", values, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceNotIn(List<String> values) {
            addCriterion("importance not in", values, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceBetween(String value1, String value2) {
            addCriterion("importance between", value1, value2, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceNotBetween(String value1, String value2) {
            addCriterion("importance not between", value1, value2, "importance");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIsNull() {
            addCriterion("News_source is null");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIsNotNull() {
            addCriterion("News_source is not null");
            return (Criteria) this;
        }

        public Criteria andNewsSourceEqualTo(String value) {
            addCriterion("News_source =", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotEqualTo(String value) {
            addCriterion("News_source <>", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceGreaterThan(String value) {
            addCriterion("News_source >", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceGreaterThanOrEqualTo(String value) {
            addCriterion("News_source >=", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLessThan(String value) {
            addCriterion("News_source <", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLessThanOrEqualTo(String value) {
            addCriterion("News_source <=", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLike(String value) {
            addCriterion("News_source like", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotLike(String value) {
            addCriterion("News_source not like", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIn(List<String> values) {
            addCriterion("News_source in", values, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotIn(List<String> values) {
            addCriterion("News_source not in", values, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceBetween(String value1, String value2) {
            addCriterion("News_source between", value1, value2, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotBetween(String value1, String value2) {
            addCriterion("News_source not between", value1, value2, "newsSource");
            return (Criteria) this;
        }

        public Criteria andDiscIsNull() {
            addCriterion("Disc is null");
            return (Criteria) this;
        }

        public Criteria andDiscIsNotNull() {
            addCriterion("Disc is not null");
            return (Criteria) this;
        }

        public Criteria andDiscEqualTo(String value) {
            addCriterion("Disc =", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscNotEqualTo(String value) {
            addCriterion("Disc <>", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscGreaterThan(String value) {
            addCriterion("Disc >", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscGreaterThanOrEqualTo(String value) {
            addCriterion("Disc >=", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscLessThan(String value) {
            addCriterion("Disc <", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscLessThanOrEqualTo(String value) {
            addCriterion("Disc <=", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscLike(String value) {
            addCriterion("Disc like", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscNotLike(String value) {
            addCriterion("Disc not like", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscIn(List<String> values) {
            addCriterion("Disc in", values, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscNotIn(List<String> values) {
            addCriterion("Disc not in", values, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscBetween(String value1, String value2) {
            addCriterion("Disc between", value1, value2, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscNotBetween(String value1, String value2) {
            addCriterion("Disc not between", value1, value2, "disc");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTopIsNull() {
            addCriterion("`Top` is null");
            return (Criteria) this;
        }

        public Criteria andTopIsNotNull() {
            addCriterion("`Top` is not null");
            return (Criteria) this;
        }

        public Criteria andTopEqualTo(String value) {
            addCriterion("`Top` =", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotEqualTo(String value) {
            addCriterion("`Top` <>", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThan(String value) {
            addCriterion("`Top` >", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThanOrEqualTo(String value) {
            addCriterion("`Top` >=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThan(String value) {
            addCriterion("`Top` <", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThanOrEqualTo(String value) {
            addCriterion("`Top` <=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLike(String value) {
            addCriterion("`Top` like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotLike(String value) {
            addCriterion("`Top` not like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopIn(List<String> values) {
            addCriterion("`Top` in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotIn(List<String> values) {
            addCriterion("`Top` not in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopBetween(String value1, String value2) {
            addCriterion("`Top` between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotBetween(String value1, String value2) {
            addCriterion("`Top` not between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("`label` is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("`label` is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("`label` =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("`label` <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("`label` >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("`label` >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("`label` <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("`label` <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("`label` like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("`label` not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("`label` in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("`label` not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("`label` between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("`label` not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andCtrIsNull() {
            addCriterion("ctr is null");
            return (Criteria) this;
        }

        public Criteria andCtrIsNotNull() {
            addCriterion("ctr is not null");
            return (Criteria) this;
        }

        public Criteria andCtrEqualTo(Integer value) {
            addCriterion("ctr =", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrNotEqualTo(Integer value) {
            addCriterion("ctr <>", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrGreaterThan(Integer value) {
            addCriterion("ctr >", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctr >=", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrLessThan(Integer value) {
            addCriterion("ctr <", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrLessThanOrEqualTo(Integer value) {
            addCriterion("ctr <=", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrIn(List<Integer> values) {
            addCriterion("ctr in", values, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrNotIn(List<Integer> values) {
            addCriterion("ctr not in", values, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrBetween(Integer value1, Integer value2) {
            addCriterion("ctr between", value1, value2, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrNotBetween(Integer value1, Integer value2) {
            addCriterion("ctr not between", value1, value2, "ctr");
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