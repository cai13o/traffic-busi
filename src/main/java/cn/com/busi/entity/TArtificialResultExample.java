package cn.com.busi.entity;

import java.util.ArrayList;
import java.util.List;

public class TArtificialResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TArtificialResultExample() {
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

        public Criteria andJgpdIsNull() {
            addCriterion("jgpd is null");
            return (Criteria) this;
        }

        public Criteria andJgpdIsNotNull() {
            addCriterion("jgpd is not null");
            return (Criteria) this;
        }

        public Criteria andJgpdEqualTo(String value) {
            addCriterion("jgpd =", value, "jgpd");
            return (Criteria) this;
        }

        public Criteria andJgpdNotEqualTo(String value) {
            addCriterion("jgpd <>", value, "jgpd");
            return (Criteria) this;
        }

        public Criteria andJgpdGreaterThan(String value) {
            addCriterion("jgpd >", value, "jgpd");
            return (Criteria) this;
        }

        public Criteria andJgpdGreaterThanOrEqualTo(String value) {
            addCriterion("jgpd >=", value, "jgpd");
            return (Criteria) this;
        }

        public Criteria andJgpdLessThan(String value) {
            addCriterion("jgpd <", value, "jgpd");
            return (Criteria) this;
        }

        public Criteria andJgpdLessThanOrEqualTo(String value) {
            addCriterion("jgpd <=", value, "jgpd");
            return (Criteria) this;
        }

        public Criteria andJgpdLike(String value) {
            addCriterion("jgpd like", value, "jgpd");
            return (Criteria) this;
        }

        public Criteria andJgpdNotLike(String value) {
            addCriterion("jgpd not like", value, "jgpd");
            return (Criteria) this;
        }

        public Criteria andJgpdIn(List<String> values) {
            addCriterion("jgpd in", values, "jgpd");
            return (Criteria) this;
        }

        public Criteria andJgpdNotIn(List<String> values) {
            addCriterion("jgpd not in", values, "jgpd");
            return (Criteria) this;
        }

        public Criteria andJgpdBetween(String value1, String value2) {
            addCriterion("jgpd between", value1, value2, "jgpd");
            return (Criteria) this;
        }

        public Criteria andJgpdNotBetween(String value1, String value2) {
            addCriterion("jgpd not between", value1, value2, "jgpd");
            return (Criteria) this;
        }

        public Criteria andQksmIsNull() {
            addCriterion("qksm is null");
            return (Criteria) this;
        }

        public Criteria andQksmIsNotNull() {
            addCriterion("qksm is not null");
            return (Criteria) this;
        }

        public Criteria andQksmEqualTo(String value) {
            addCriterion("qksm =", value, "qksm");
            return (Criteria) this;
        }

        public Criteria andQksmNotEqualTo(String value) {
            addCriterion("qksm <>", value, "qksm");
            return (Criteria) this;
        }

        public Criteria andQksmGreaterThan(String value) {
            addCriterion("qksm >", value, "qksm");
            return (Criteria) this;
        }

        public Criteria andQksmGreaterThanOrEqualTo(String value) {
            addCriterion("qksm >=", value, "qksm");
            return (Criteria) this;
        }

        public Criteria andQksmLessThan(String value) {
            addCriterion("qksm <", value, "qksm");
            return (Criteria) this;
        }

        public Criteria andQksmLessThanOrEqualTo(String value) {
            addCriterion("qksm <=", value, "qksm");
            return (Criteria) this;
        }

        public Criteria andQksmLike(String value) {
            addCriterion("qksm like", value, "qksm");
            return (Criteria) this;
        }

        public Criteria andQksmNotLike(String value) {
            addCriterion("qksm not like", value, "qksm");
            return (Criteria) this;
        }

        public Criteria andQksmIn(List<String> values) {
            addCriterion("qksm in", values, "qksm");
            return (Criteria) this;
        }

        public Criteria andQksmNotIn(List<String> values) {
            addCriterion("qksm not in", values, "qksm");
            return (Criteria) this;
        }

        public Criteria andQksmBetween(String value1, String value2) {
            addCriterion("qksm between", value1, value2, "qksm");
            return (Criteria) this;
        }

        public Criteria andQksmNotBetween(String value1, String value2) {
            addCriterion("qksm not between", value1, value2, "qksm");
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(String value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(String value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(String value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(String value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(String value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(String value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLike(String value) {
            addCriterion("rid like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotLike(String value) {
            addCriterion("rid not like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<String> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<String> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(String value1, String value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(String value1, String value2) {
            addCriterion("rid not between", value1, value2, "rid");
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