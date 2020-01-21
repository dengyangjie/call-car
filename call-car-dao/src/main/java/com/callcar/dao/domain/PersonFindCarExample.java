package com.callcar.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonFindCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonFindCarExample() {
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

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNull() {
            addCriterion("person_phone is null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNotNull() {
            addCriterion("person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneEqualTo(String value) {
            addCriterion("person_phone =", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotEqualTo(String value) {
            addCriterion("person_phone <>", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThan(String value) {
            addCriterion("person_phone >", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("person_phone >=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThan(String value) {
            addCriterion("person_phone <", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("person_phone <=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLike(String value) {
            addCriterion("person_phone like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotLike(String value) {
            addCriterion("person_phone not like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIn(List<String> values) {
            addCriterion("person_phone in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotIn(List<String> values) {
            addCriterion("person_phone not in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneBetween(String value1, String value2) {
            addCriterion("person_phone between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("person_phone not between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonSexIsNull() {
            addCriterion("person_sex is null");
            return (Criteria) this;
        }

        public Criteria andPersonSexIsNotNull() {
            addCriterion("person_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSexEqualTo(String value) {
            addCriterion("person_sex =", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotEqualTo(String value) {
            addCriterion("person_sex <>", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexGreaterThan(String value) {
            addCriterion("person_sex >", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexGreaterThanOrEqualTo(String value) {
            addCriterion("person_sex >=", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLessThan(String value) {
            addCriterion("person_sex <", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLessThanOrEqualTo(String value) {
            addCriterion("person_sex <=", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLike(String value) {
            addCriterion("person_sex like", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotLike(String value) {
            addCriterion("person_sex not like", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexIn(List<String> values) {
            addCriterion("person_sex in", values, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotIn(List<String> values) {
            addCriterion("person_sex not in", values, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexBetween(String value1, String value2) {
            addCriterion("person_sex between", value1, value2, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotBetween(String value1, String value2) {
            addCriterion("person_sex not between", value1, value2, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonWechatIsNull() {
            addCriterion("person_wechat is null");
            return (Criteria) this;
        }

        public Criteria andPersonWechatIsNotNull() {
            addCriterion("person_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andPersonWechatEqualTo(String value) {
            addCriterion("person_wechat =", value, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonWechatNotEqualTo(String value) {
            addCriterion("person_wechat <>", value, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonWechatGreaterThan(String value) {
            addCriterion("person_wechat >", value, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonWechatGreaterThanOrEqualTo(String value) {
            addCriterion("person_wechat >=", value, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonWechatLessThan(String value) {
            addCriterion("person_wechat <", value, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonWechatLessThanOrEqualTo(String value) {
            addCriterion("person_wechat <=", value, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonWechatLike(String value) {
            addCriterion("person_wechat like", value, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonWechatNotLike(String value) {
            addCriterion("person_wechat not like", value, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonWechatIn(List<String> values) {
            addCriterion("person_wechat in", values, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonWechatNotIn(List<String> values) {
            addCriterion("person_wechat not in", values, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonWechatBetween(String value1, String value2) {
            addCriterion("person_wechat between", value1, value2, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonWechatNotBetween(String value1, String value2) {
            addCriterion("person_wechat not between", value1, value2, "personWechat");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumIsNull() {
            addCriterion("person_reserve_num is null");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumIsNotNull() {
            addCriterion("person_reserve_num is not null");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumEqualTo(Integer value) {
            addCriterion("person_reserve_num =", value, "personReserveNum");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumNotEqualTo(Integer value) {
            addCriterion("person_reserve_num <>", value, "personReserveNum");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumGreaterThan(Integer value) {
            addCriterion("person_reserve_num >", value, "personReserveNum");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_reserve_num >=", value, "personReserveNum");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumLessThan(Integer value) {
            addCriterion("person_reserve_num <", value, "personReserveNum");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumLessThanOrEqualTo(Integer value) {
            addCriterion("person_reserve_num <=", value, "personReserveNum");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumIn(List<Integer> values) {
            addCriterion("person_reserve_num in", values, "personReserveNum");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumNotIn(List<Integer> values) {
            addCriterion("person_reserve_num not in", values, "personReserveNum");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumBetween(Integer value1, Integer value2) {
            addCriterion("person_reserve_num between", value1, value2, "personReserveNum");
            return (Criteria) this;
        }

        public Criteria andPersonReserveNumNotBetween(Integer value1, Integer value2) {
            addCriterion("person_reserve_num not between", value1, value2, "personReserveNum");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrIsNull() {
            addCriterion("person_send_addr is null");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrIsNotNull() {
            addCriterion("person_send_addr is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrEqualTo(String value) {
            addCriterion("person_send_addr =", value, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrNotEqualTo(String value) {
            addCriterion("person_send_addr <>", value, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrGreaterThan(String value) {
            addCriterion("person_send_addr >", value, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrGreaterThanOrEqualTo(String value) {
            addCriterion("person_send_addr >=", value, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrLessThan(String value) {
            addCriterion("person_send_addr <", value, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrLessThanOrEqualTo(String value) {
            addCriterion("person_send_addr <=", value, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrLike(String value) {
            addCriterion("person_send_addr like", value, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrNotLike(String value) {
            addCriterion("person_send_addr not like", value, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrIn(List<String> values) {
            addCriterion("person_send_addr in", values, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrNotIn(List<String> values) {
            addCriterion("person_send_addr not in", values, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrBetween(String value1, String value2) {
            addCriterion("person_send_addr between", value1, value2, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonSendAddrNotBetween(String value1, String value2) {
            addCriterion("person_send_addr not between", value1, value2, "personSendAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrIsNull() {
            addCriterion("person_arive_addr is null");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrIsNotNull() {
            addCriterion("person_arive_addr is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrEqualTo(String value) {
            addCriterion("person_arive_addr =", value, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrNotEqualTo(String value) {
            addCriterion("person_arive_addr <>", value, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrGreaterThan(String value) {
            addCriterion("person_arive_addr >", value, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrGreaterThanOrEqualTo(String value) {
            addCriterion("person_arive_addr >=", value, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrLessThan(String value) {
            addCriterion("person_arive_addr <", value, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrLessThanOrEqualTo(String value) {
            addCriterion("person_arive_addr <=", value, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrLike(String value) {
            addCriterion("person_arive_addr like", value, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrNotLike(String value) {
            addCriterion("person_arive_addr not like", value, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrIn(List<String> values) {
            addCriterion("person_arive_addr in", values, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrNotIn(List<String> values) {
            addCriterion("person_arive_addr not in", values, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrBetween(String value1, String value2) {
            addCriterion("person_arive_addr between", value1, value2, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonAriveAddrNotBetween(String value1, String value2) {
            addCriterion("person_arive_addr not between", value1, value2, "personAriveAddr");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusIsNull() {
            addCriterion("person_reserve_status is null");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusIsNotNull() {
            addCriterion("person_reserve_status is not null");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusEqualTo(String value) {
            addCriterion("person_reserve_status =", value, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusNotEqualTo(String value) {
            addCriterion("person_reserve_status <>", value, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusGreaterThan(String value) {
            addCriterion("person_reserve_status >", value, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("person_reserve_status >=", value, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusLessThan(String value) {
            addCriterion("person_reserve_status <", value, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusLessThanOrEqualTo(String value) {
            addCriterion("person_reserve_status <=", value, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusLike(String value) {
            addCriterion("person_reserve_status like", value, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusNotLike(String value) {
            addCriterion("person_reserve_status not like", value, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusIn(List<String> values) {
            addCriterion("person_reserve_status in", values, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusNotIn(List<String> values) {
            addCriterion("person_reserve_status not in", values, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusBetween(String value1, String value2) {
            addCriterion("person_reserve_status between", value1, value2, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonReserveStatusNotBetween(String value1, String value2) {
            addCriterion("person_reserve_status not between", value1, value2, "personReserveStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusIsNull() {
            addCriterion("person_status is null");
            return (Criteria) this;
        }

        public Criteria andPersonStatusIsNotNull() {
            addCriterion("person_status is not null");
            return (Criteria) this;
        }

        public Criteria andPersonStatusEqualTo(String value) {
            addCriterion("person_status =", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusNotEqualTo(String value) {
            addCriterion("person_status <>", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusGreaterThan(String value) {
            addCriterion("person_status >", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusGreaterThanOrEqualTo(String value) {
            addCriterion("person_status >=", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusLessThan(String value) {
            addCriterion("person_status <", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusLessThanOrEqualTo(String value) {
            addCriterion("person_status <=", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusLike(String value) {
            addCriterion("person_status like", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusNotLike(String value) {
            addCriterion("person_status not like", value, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusIn(List<String> values) {
            addCriterion("person_status in", values, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusNotIn(List<String> values) {
            addCriterion("person_status not in", values, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusBetween(String value1, String value2) {
            addCriterion("person_status between", value1, value2, "personStatus");
            return (Criteria) this;
        }

        public Criteria andPersonStatusNotBetween(String value1, String value2) {
            addCriterion("person_status not between", value1, value2, "personStatus");
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