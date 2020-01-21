package com.callcar.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReserveCarInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReserveCarInfoExample() {
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

        public Criteria andReserveIdIsNull() {
            addCriterion("reserve_id is null");
            return (Criteria) this;
        }

        public Criteria andReserveIdIsNotNull() {
            addCriterion("reserve_id is not null");
            return (Criteria) this;
        }

        public Criteria andReserveIdEqualTo(Integer value) {
            addCriterion("reserve_id =", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotEqualTo(Integer value) {
            addCriterion("reserve_id <>", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdGreaterThan(Integer value) {
            addCriterion("reserve_id >", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve_id >=", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdLessThan(Integer value) {
            addCriterion("reserve_id <", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdLessThanOrEqualTo(Integer value) {
            addCriterion("reserve_id <=", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdIn(List<Integer> values) {
            addCriterion("reserve_id in", values, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotIn(List<Integer> values) {
            addCriterion("reserve_id not in", values, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdBetween(Integer value1, Integer value2) {
            addCriterion("reserve_id between", value1, value2, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reserve_id not between", value1, value2, "reserveId");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(Integer value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(Integer value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(Integer value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(Integer value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<Integer> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<Integer> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameIsNull() {
            addCriterion("reserve_person_name is null");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameIsNotNull() {
            addCriterion("reserve_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameEqualTo(String value) {
            addCriterion("reserve_person_name =", value, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameNotEqualTo(String value) {
            addCriterion("reserve_person_name <>", value, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameGreaterThan(String value) {
            addCriterion("reserve_person_name >", value, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_person_name >=", value, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameLessThan(String value) {
            addCriterion("reserve_person_name <", value, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameLessThanOrEqualTo(String value) {
            addCriterion("reserve_person_name <=", value, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameLike(String value) {
            addCriterion("reserve_person_name like", value, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameNotLike(String value) {
            addCriterion("reserve_person_name not like", value, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameIn(List<String> values) {
            addCriterion("reserve_person_name in", values, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameNotIn(List<String> values) {
            addCriterion("reserve_person_name not in", values, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameBetween(String value1, String value2) {
            addCriterion("reserve_person_name between", value1, value2, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonNameNotBetween(String value1, String value2) {
            addCriterion("reserve_person_name not between", value1, value2, "reservePersonName");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneIsNull() {
            addCriterion("reserve_person_phone is null");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneIsNotNull() {
            addCriterion("reserve_person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneEqualTo(String value) {
            addCriterion("reserve_person_phone =", value, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneNotEqualTo(String value) {
            addCriterion("reserve_person_phone <>", value, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneGreaterThan(String value) {
            addCriterion("reserve_person_phone >", value, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_person_phone >=", value, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneLessThan(String value) {
            addCriterion("reserve_person_phone <", value, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("reserve_person_phone <=", value, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneLike(String value) {
            addCriterion("reserve_person_phone like", value, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneNotLike(String value) {
            addCriterion("reserve_person_phone not like", value, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneIn(List<String> values) {
            addCriterion("reserve_person_phone in", values, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneNotIn(List<String> values) {
            addCriterion("reserve_person_phone not in", values, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneBetween(String value1, String value2) {
            addCriterion("reserve_person_phone between", value1, value2, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonPhoneNotBetween(String value1, String value2) {
            addCriterion("reserve_person_phone not between", value1, value2, "reservePersonPhone");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumIsNull() {
            addCriterion("reserve_person_num is null");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumIsNotNull() {
            addCriterion("reserve_person_num is not null");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumEqualTo(Integer value) {
            addCriterion("reserve_person_num =", value, "reservePersonNum");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumNotEqualTo(Integer value) {
            addCriterion("reserve_person_num <>", value, "reservePersonNum");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumGreaterThan(Integer value) {
            addCriterion("reserve_person_num >", value, "reservePersonNum");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve_person_num >=", value, "reservePersonNum");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumLessThan(Integer value) {
            addCriterion("reserve_person_num <", value, "reservePersonNum");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumLessThanOrEqualTo(Integer value) {
            addCriterion("reserve_person_num <=", value, "reservePersonNum");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumIn(List<Integer> values) {
            addCriterion("reserve_person_num in", values, "reservePersonNum");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumNotIn(List<Integer> values) {
            addCriterion("reserve_person_num not in", values, "reservePersonNum");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumBetween(Integer value1, Integer value2) {
            addCriterion("reserve_person_num between", value1, value2, "reservePersonNum");
            return (Criteria) this;
        }

        public Criteria andReservePersonNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reserve_person_num not between", value1, value2, "reservePersonNum");
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

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
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